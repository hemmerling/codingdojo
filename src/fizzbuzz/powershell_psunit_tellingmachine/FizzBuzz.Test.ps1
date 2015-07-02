#  @package   FizzBuzz
#  @file      FizzBuzz.PSUnit.Tests.ps1
#  @brief     The test class for the Powershell application "FizzBuzz"
#  @author    Rolf Hemmerling <hemmerling@gmx.net>
#  @version   1.00
#  @date      2015-06-01
#  @copyright Apache License, Version 2.0
#
#  FizzBuzz - Powershell application "FizzBuzz"
#  		      The test class, using PSUnit by tellingmachine
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

CLS
. PSUnit.ps1

Function Test.FizzBuzz01()
{
    #Arrange
    $anInputValue = 1
    #Act
    $Actual = FizzBuzz($anInputValue) -as [string]
    #Assert
    Assert-That -ActualValue $Actual -Constraint {$ActualValue -eq "1"}
}

Function Test.FizzBuzz03()
{
    #Arrange
    $anInputValue = 3
    #Act
    $Actual = FizzBuzz($anInputValue) -as [string]
    #Assert
    Assert-That -ActualValue $Actual -Constraint {$ActualValue -eq "Fizz"}
}

Function Test.FizzBuzz05()
{
    #Arrange
    $anInputValue = 5
    #Act
    $Actual = FizzBuzz($anInputValue) -as [string]
    #Assert
    Assert-That -ActualValue $Actual -Constraint {$ActualValue -eq "Buzz"}
}

Function Test.FizzBuzz06()
{
    #Arrange
    $anInputValue = 6
    #Act
    $Actual = FizzBuzz($anInputValue) -as [string]
    #Assert
    Assert-That -ActualValue $Actual -Constraint {$ActualValue -eq "Fizz"}
}

Function Test.FizzBuzz10()
{
    #Arrange
    $anInputValue = 10
    #Act
    $Actual = FizzBuzz($anInputValue) -as [string]
    #Assert
    Assert-That -ActualValue $Actual -Constraint {$ActualValue -eq "Buzz"}
}

Function Test.FizzBuzz15()
{
    #Arrange
    $anInputValue = 15
    #Act
    $Actual = FizzBuzz($anInputValue) -as [string]
    #Assert
    Assert-That -ActualValue $Actual -Constraint {$ActualValue -eq "FizzBuzz"}
}

Function Test.FizzBuzz100()
{
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
                Assert-That -ActualValue $Actual -Constraint {$ActualValue -eq $expected}
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
                Assert-That -ActualValue $Actual -Constraint {$ActualValue -eq $expected}
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
                Assert-That -ActualValue $Actual -Constraint {$ActualValue -eq $expected}
            }
       }

       arrayCheck1($anOutputList);
       arrayCheck2($anOutputList); 
       arrayCheck4($anOutputList); 

}
