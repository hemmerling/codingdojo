#  @package   GameOfLife
#  @file      GameOfLife.Tests.ps1
#  @brief     The test class for the Powershell application "GameOfLife"
#  @author    Rolf Hemmerling <hemmerling@gmx.net>
#  @version   1.00
#  @date      2015-06-01
#  @copyright Apache License, Version 2.0
#
#  GameOfLife - Powershell application "GameOfLife"
#  		        The test class, using Pester
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
# Created by the PS command "New-Fixture -Name GameOfLife"
# and then 
# - Renamed to GameOfLife00
# - changed "Should be $false" to "Should be $true"
#
Describe "GameOfLife00" {
    It "does something useful" {
#       $true | Should Be $false
        $true | Should Be $true
    }
}

Describe "GameOfLife - Dead Cells with 0 Neighbours keeps dead" {
    It "GameOfLife - Dead Cells with 0 Neighbour keeps dead" {
        Get-CellIsAlive($CellArrayDead0Neighbours) | Should Be $false
    }
}

Describe "GameOfLife - Alive Cells with 0 Neighbours die" {
    It "GameOfLife - Alive Cells with 0 Neighbours die" {
        Get-CellIsAlive($CellArrayAlive0Neighbours) | Should Be $false
    }
}

Describe "GameOfLife - Alive Cells with 1 Neighbour die" {
    It "GameOfLife - Alive Cells with 1 Neighbour die" {
        Get-CellIsAlive($CellArrayAlive1Neighbours) | Should Be $false
    }
}

Describe "GameOfLife - Alive Cells with 2 Neighbours live" {
    It "GameOfLife - Alive Cells with 2 Neighbours live" {
        Get-CellIsAlive($CellArrayAlive2Neighbours) | Should Be $true
    }
}

Describe "GameOfLife - Alive Cells with 3 Neighbours live" {
    It "GameOfLife - Alive Cells with 3 Neighbours live" {
        Get-CellIsAlive($CellArrayAlive3Neighbours) | Should Be $true
    }
}

Describe "GameOfLife - Dead Cells with 3 Neighbours live" {
    It "GameOfLife - Dead Cells with 3 Neighbours live" {
        Get-CellIsAlive($CellArrayDead3Neighbours) | Should Be $true
    }
}

Describe "GameOfLife - Alive Cells with 4 Neighbours die" {
    It "GameOfLife - Alive Cells with 4 Neighbours die" {
        Get-CellIsAlive($CellArrayAlive4Neighbours) | Should Be $false
    }
}
