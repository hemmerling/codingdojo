#  @package   FizzBuzz
#  @file      FizzBuzz.Tests.ps1
#  @brief     The test class for the Powershell application "FizzBuzz"
#  @author    Rolf Hemmerling <hemmerling@gmx.net>
#  @version   1.00
#  @date      2015-06-01
#  @copyright Apache License, Version 2.0
#
#  FizzBuzz - Powershell application "FizzBuzz"
#  		      The test class, using Pester
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

$here = Split-Path -Parent $MyInvocation.MyCommand.Path
$sut = (Split-Path -Leaf $MyInvocation.MyCommand.Path).Replace(".Tests.", ".")
. "$here\$sut"

# 
# Created by the PS command "New-Fixture -Name FizzBuzz"
# and then 
# - Renamed to FizzBuzz00
# - changed "Should be $false" to "Should be $true"
#
Describe "FizzBuzz00" {
    It "does something useful" {
#       $true | Should Be $false
        $true | Should Be $true
    }
}

Describe "FizzBuzz(1)" {
    It "FizzBuzz(1) should return '1'" {
        FizzBuzz(1) | Should Be "1"
    }
}

Describe "FizzBuzz(3)" {
    It "FizzBuzz(3) should return 'Fizz'" {
        FizzBuzz(3) | Should Be "Fizz"
    }
}

Describe "FizzBuzz(5)" {
    It "FizzBuzz(5) should return 'Buzz'" {
        FizzBuzz(5) | Should Be "Buzz"
    }
}

Describe "FizzBuzz(6)" {
    It "FizzBuzz(6) should return 'Fizz'" {
        FizzBuzz(6) | Should Be "Fizz"
    }
}

Describe "FizzBuzz(10)" {
    It "FizzBuzz(10) should return 'Buzz'" {
        FizzBuzz(10) | Should Be "Buzz"
    }
}

Describe "FizzBuzz(15)" {
    It "FizzBuzz(15) should return 'FizzBuzz'" {
        FizzBuzz(15) | Should Be "FizzBuzz"
    }
}

Describe "FizzBuzz(1..100)" {
    It "FizzBuzz(1..100) should return the right value each time" {
        $anOutputList = @( 
	    		"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
	    		"11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz",
	    		"Fizz", "22", "23", "Fizz", "Buzz", "26", "Fizz", "28", "29", "FizzBuzz",
	    		"31", "32", "Fizz", "34", "Buzz", "Fizz", "37", "38", "Fizz", "Buzz",
	    		"41", "Fizz", "43", "44", "FizzBuzz", "46", "47", "Fizz", "49", "Buzz",
	    		"Fizz", "52", "53", "Fizz", "Buzz", "56", "Fizz", "58", "59", "FizzBuzz",
	    		"61", "62", "Fizz", "64", "Buzz", "Fizz", "67", "68", "Fizz", "Buzz",
	    		"71", "Fizz", "73", "74", "FizzBuzz", "76", "77", "Fizz", "79", "Buzz",
	    		"Fizz", "82", "83", "Fizz", "Buzz", "86", "Fizz", "88", "89", "FizzBuzz",
	    		"91", "92", "Fizz", "94", "Buzz", "Fizz", "97", "98", "Fizz", "Buzz");
        
        function arrayCheck1($anArray) {
            for ($ii=1; $ii -le @($anArray).length; $ii++) {
                #write-host $ii, $anOutputList[$ii-1], FizzBuzz($ii);
                FizzBuzz($ii) | Should Be $anArray[$ii-1]
            }
        }

        function arrayCheck2($anArray) {
            $anInputList = (1..100);
            foreach ($jj in $anInputList) {
                $ii = $jj-1;
                #write-host $jj, FizzBuzz($jj);
                FizzBuzz($jj) | ShouldBe $anArray[$ii]
            }
        }

        function arrayCheck3($anArray) {
            $anInputList = (1..100);
            foreach ($ii in $anInputList) {
                #write-host $ii, FizzBuzz($ii), $anArray($ii);
                FizzBuzz($ii) | Should Be $anArray($ii)
            }
        }

        function arrayCheck4($anArray) {
            foreach ($jj in $anArray) {
                $ii = [array]::indexof($anArray,$jj)+1
                #write-host $jj, $ii, FizzBuzz($ii);
                FizzBuzz($ii) | Should Be $jj
            }
       }

       arrayCheck1($anOutputList);
       arrayCheck2($anOutputList); 
       arrayCheck3($anOutputList); 
       arrayCheck4($anOutputList); 
    }
}
