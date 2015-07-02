# file: test_minicalc.ps1

function main
{
  write-host "`nBegin test automation using Windows PowerShell`n"
  
  write-host 'Launching IE'
  $ie = new-object -com "InternetExplorer.Application"
  $ie.navigate("about:blank")
  $ie.visible = $true
  [System.Threading.Thread]::Sleep(2000)

  write-host "`nResizing IE to 425 x 535"
  $ie.height = 535
  $ie.width = 425

  write-host "`nNavigating to MiniCalc Web application"
  navigateToApp $ie "http://localhost/MiniCalc/Default.aspx" "TextBox1" 100 2

  write-host "`nGetting input controls"
  $doc = $ie.document
  $tb1 = $doc.getElementByID("TextBox1")
  $tb2 = $doc.getElementByID("TextBox2")
  $add = $doc.getElementByID("RadioButton1")
  $btn = $doc.getElementByID("Button1")

  if ($tb1 -eq $null -or $tb2 -eq $null -or $add -eq $null -or $btn -eq $null) {
    write-host "One or more controls are null" -backgroundcolor "red" -foregroundcolor "yellow"
  }
  else {
    write-host "All controls found"
  }
    

  write-host "`nSetting TextBox1 to 5"
  $tb1.value = 5
  write-host "Setting TextBox2 to 7"
  $tb2.value = 7

  write-host "Selecting 'Addition' operation"
  $add.checked = $true

  write-host "`nClicking 'Calculate' button"
  
  $tb3 = $doc.getElementByID("TextBox3") # get an initial value
  $old = $tb3.value
  $btn.click()                           # trigger HTTP request
  $wait = $true                          # delay until value has changed
  $numWaits = 0
  while ($wait -and $numWaits -lt 100) {
    $numWaits++
    [System.Threading.Thread]::Sleep(50)
    $tb3 = $doc.getElementByID("TextBox3")
    if ($tb3.value -ne $old) {
      $wait = $false
    }
    else {
      write-host "Waiting for app to respond $numWaits . . ."
    }
  }
  if ($numWaits -eq 100) {
    throw "Application did not respond after 100 delays"
  }
  else {
    write-host "Application has responded"
  }

  write-host "`nChecking for 12.0000"
  $tb3 = $doc.getElementByID("TextBox3")
  $ans = $tb3.value

  if ($ans -eq '12.0000') {
    write-host "Target value found"
    write-host "`nTest scenario: Pass" -foregroundcolor 'green'
  }
  else {
    write-host "Target value not found"
    write-host "`nTest scenario: *FAIL*" -foregroundcolor 'red'
  }

  trap {
    write-host "Fatal error: " $_.exception.message -backgroundcolor red -foregroundcolor yellow
  }

  write-host "`nEnd test automation`n"
} # main



function navigateToApp($browser, [string] $url, [string] $controlID, [int] $maxDelays, [int] $delayTime)
{
  $numDelays = 0
  $loaded = $false
  $browser.navigate($url)
  while ($loaded -eq $false -and $numDelays -lt $maxDelays) {
    $numDelays++
    [System.Threading.Thread]::Sleep($delayTime)
    $doc = $browser.document
    if ($doc -eq $null) {
      continue
    }
    $controlRef = $doc.getElementByID($controlID)
    if ($controlRef -eq $null) {
      write-host "Waiting for Web app to load $numDelays . . ."
    }
    else {
      write-host "Web app loaded after $numDelays pauses"
      $loaded = $true
    }
  }

  if ($numDelays -eq $maxDelays) {
    throw "Browser not loaded after $maxDelays delays"
  }
}


main
# end script
