#  @package   FizzBuzz
#  @file      FizzBuzz.ps1
#  @brief     Powershell application "FizzBuzz"
#  @author    Rolf Hemmerling <hemmerling@gmx.net>
#  @version   1.00
#  @date      2015-06-01
#  @copyright Apache License, Version 2.0
#
#  FizzBuzz - Powershell application "FizzBuzz"
#
#  Copyright 2015 Rolf Hemmerling
#
#  Licensed under the Apache License, Version 2.0 (the "License");
#  you may not use this file except in compliance with the License.
#  You may obtain a copy of the License at
#
#  http://www.apache.org/licenses/LICENSE-2.0
#
#  Unless required by applicable law or agreed to in writing, software
#  distributed under the License is distributed on an "AS IS" BASIS,
#  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
#  See the License for the specific language governing permissions and
#  limitations under the License.

# 
# Created by the PS command "New-Fixture -Name FizzBuzz"
# and then renamed to FizzBuzz00
#
function FizzBuzz00 {

}

function FizzBuzz01($anInputValue) {
    return ($anInputValue)
}

function FizzBuzz02($anInputValue) {
    if ($anInputValue -eq "3") {
        return ("Fizz")
    }
    else {
        return($anInputValue)
    }
}

function FizzBuzz03($anInputValue) {
    if ($anInputValue -eq "3") {
        return ("Fizz")
    }
    else
    { 
      if ($anInputValue -eq "5") {
        return ("Buzz")
      }
      else {
        return($anInputValue)
      }
    }
}

function FizzBuzz04($anInputValue) {
    if (($anInputValue % 3) -eq 0) {
        return ("Fizz")
    }
    else
    { 
      if ($anInputValue -eq "5") {
        return ("Buzz")
      }
      else {
        return($anInputValue)
      }
    }
}

function FizzBuzz05($anInputValue) {
    if (($anInputValue % 3) -eq 0) {
        return ("Fizz")
    }
    else
    { 
      if (($anInputValue %5) -eq 0) {
        return ("Buzz")
      }
      else {
        return($anInputValue)
      }
    }
}

function FizzBuzz($anInputValue) {

    $aReturnValue="";
    if ((($anInputValue % 3) -eq 0) -or (($anInputValue %5) -eq 0)) {
        if (($anInputValue % 3) -eq 0) {
           $aReturnValue="Fizz";
        }
        if (($anInputValue %5) -eq 0) {
            $aReturnValue=$aReturnValue+"Buzz";
        }
     }
     else {
        $aReturnValue=$anInputValue;
     }
     return($aReturnValue);
}

