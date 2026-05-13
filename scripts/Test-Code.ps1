[CmdletBinding()]
param()

Set-StrictMode -Version Latest
$ErrorActionPreference = 'Stop'

$repoRoot = Split-Path -Parent $PSScriptRoot
$srcRoot = Join-Path $repoRoot 'src'
$buildRoot = Join-Path $repoRoot 'build\classes'
$temurinBin = 'C:\Program Files\Eclipse Adoptium\jdk-21.0.11.10-hotspot\bin'

if (Test-Path -LiteralPath $temurinBin) {
    $env:PATH = "$temurinBin;$($env:PATH)"
}

if (-not (Get-Command javac -ErrorAction SilentlyContinue)) {
    throw 'Required command not found: javac'
}

if (-not (Test-Path -LiteralPath $srcRoot)) {
    Write-Host 'No source directory found. Nothing to compile.'
    return
}

$javaFiles = Get-ChildItem -LiteralPath $srcRoot -Recurse -Filter *.java -File
if (-not $javaFiles) {
    Write-Host 'No Java source files found. Nothing to compile.'
    return
}

if (Test-Path -LiteralPath $buildRoot) {
    Remove-Item -LiteralPath $buildRoot -Recurse -Force
}
New-Item -ItemType Directory -Path $buildRoot -Force | Out-Null

$filePaths = $javaFiles | ForEach-Object { $_.FullName }
& javac --release 21 -d $buildRoot @filePaths
if ($LASTEXITCODE -ne 0) {
    throw 'Java compilation failed.'
}

Write-Host 'Code validation completed successfully.'
