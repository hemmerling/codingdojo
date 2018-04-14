#  @package   FizzBuzz
#  @file      FizzBuzz.Tests.ps1
#  @brief     The test class for the Powershell application "FizzBuzz"
#  @author    Rolf Hemmerling <hemmerling@gmx.net>
#  @version   1.00
#  @date      2015-06-01
#  @copyright Apache License, Version 2.0
#
#  FizzBuzz - Powershell application "FizzBuzz"
#  		      The test class, using PSTest and NUnit
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

Set-ExecutionPolicy -ExecutionPolicy remotesigned -Scope process

# Importing NUnit asserts.
Import-Module -Name NUnit -Force

(Get-Module -Name NUnit).ExportedVariables | Format-Table -AutoSize

# Import the PsTest unit testing framework.
Import-Module -Name PsTest

# Include the script to test.
.".\FizzBuzz.ps1"

(New-Test "FizzBuzz(1) should return '1'" {
    # Arrange.
    $expected = 1;
    # Act.
    $actual = FizzBuzz(1);
    # Assert.
    $Assert::That($actual, $Is::EqualTo($expected));
}),

(New-Test "FizzBuzz(3) should return 'Fizz'" {
    # Arrange.
    $expected = "Fizz";
    # Act.
    $actual = FizzBuzz(3);
    # Assert.
    $Assert::That($actual, $Is::EqualTo($expected));
}),

(New-Test "FizzBuzz(5) should return 'Buzz'" {
    # Arrange.
    $expected = "Buzz"
    # Act.
    $actual = FizzBuzz(5)
    # Assert.
    $Assert::That($actual, $Is::EqualTo($expected))
}),

(New-Test "FizzBuzz(6) should return 'Fizz'" {
    # Arrange.
    $expected = "Fizz"
    # Act.
    $actual = FizzBuzz(6)
    # Assert.
    $Assert::That($actual, $Is::EqualTo($expected))
}),

(New-Test "FizzBuzz(10) should return 'Buzz'" {
    # Arrange.
    $expected = "Buzz"
    # Act.
    $actual = FizzBuzz(10)
    # Assert.
    $Assert::That($actual, $Is::EqualTo($expected))
}),

(New-Test "FizzBuzz(15) should return 'FizzBuzz'" {
    # Arrange.
    $expected = "FizzBuzz"
    # Act.
    $actual = FizzBuzz(15)
    # Assert.
    $Assert::That($actual, $Is::EqualTo($expected))
}),

(New-Test "FizzBuzz(1..100) should return the right value each time" {
    # Arrange.
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
                #write-host $ii, $anArray[$ii-1], FizzBuzz($ii);
                # Arrange.
                $expected = $anArray[$ii-1];
                # Act.
                $actual = (FizzBuzz($ii)) -as [string];
                #$actual = [string](FizzBuzz($ii));
                # Assert.
                $Assert::That($actual, $Is::EqualTo($expected));
            }
        }

        function arrayCheck2($anArray) {
            $anInputList = (1..100);
            foreach ($jj in $anInputList) {
                $ii = $jj-1;
                #write-host $jj, $anArray[$ii], FizzBuzz($jj);
                # Arrange.
                $expected = $anArray[$ii];
                # Act.
                $actual = (FizzBuzz($jj)) -as [string];
                # Assert.
                $Assert::That($actual, $Is::EqualTo($expected));
            }
        }

        function arrayCheck4($anArray) {
            foreach ($jj in $anArray) {
                $ii = [array]::indexof($anArray,$jj)+1
                #write-host $jj, $ii, FizzBuzz($ii);
                # Arrange.
                $expected = $jj;
                # Act.
                $actual = (FizzBuzz($ii)) -as [string];
                # Assert.
                $Assert::That($actual, $Is::EqualTo($expected));
            }
       }

       arrayCheck1($anOutputList);
       arrayCheck2($anOutputList); 
       arrayCheck4($anOutputList); 

}) |

# Invoke the tests.
Invoke-Test |

# Format all test results.
Format-TestResult -All
