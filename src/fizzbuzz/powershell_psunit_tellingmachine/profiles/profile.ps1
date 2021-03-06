#PSUnit: Setting up PATH environment variable to point to PSUnit framework
$PSUnitPath = "C:\WINDOWS\system32\WindowsPowerShell\v1.0\Modules\PSUnit" #Modify this path to match your local PowerShell installation path
#Make sure to only append this path once
if (!($env:path -like "*$PSUnitPath*"))
{
    $env:path = $env:path + ";$PSUnitPath"
}
#PSUnit: Setting PSUNIT_HOME environment variable to point to PSUnit framework
If(! $(Test-Path -Path "env:PSUNIT_HOME"))
{
    New-Item -Path "env:" -Name "PSUNIT_HOME" -value $PSUnitPath
}

#PSUnit: Defining functions to set debug options
function Set-DebugMode()
{
    $Global:DebugPreference = "Continue"
    set-strictmode -version Latest
}

function Set-ProductionMode()
{
    $Global:DebugPreference = "SilentlyContinue"
    set-strictmode -Off
}
