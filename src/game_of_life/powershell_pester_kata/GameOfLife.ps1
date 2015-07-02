#  @package   GameOfLife
#  @file      GameOfLife.ps1
#  @brief     Powershell application "GameOfLife"
#  @author    Rolf Hemmerling <hemmerling@gmx.net>
#  @version   1.00
#  @date      2015-06-01
#  @copyright Apache License, Version 2.0
#
#  GameOfLife - Powershell application "GameOfLife"
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
# Created by the PS command "New-Fixture -Name GameOfLife"
# and then renamed to GameOfLife00
#
$NewCellArray    = @()
$EmptyArray      = @( $false, $false, $false, 
                      $false, $false, $false,
                      $false, $false, $false )

$CellArrayDead0Neighbours  = @( $false, $false, $false,  
                                $false, $false, $false,
                                $false, $false, $false )
$CellArrayAlive0Neighbours = @( $false, $false, $false, 
                                $false, $true, $false,
                                $false, $false, $false )
$CellArrayAlive1Neighbours = @( $false, $false, $false,
                                $false, $true, $true,
                                $false, $false, $false )
$CellArrayAlive2Neighbours = @( $false, $false, $false,
                                $true, $true, $true,
                                $false, $true, $false )  
$CellArrayAlive3Neighbours = @( $false, $true, $false,
                                $false, $true, $true,      
                                $false, $true, $false )
$CellArrayDead3Neighbours = @( $false, $true, $false,
                                $false, $false, $true,      
                                $false, $true, $false )
$CellArrayAlive4Neighbours = @( $false, $true, $false,
                                $false, $true, $true,
                                $false, $true, $true )


$CellArray = @( $CellArrayDead0Neighbours, 
                $CellArrayAlive0Neighbours,
                $CellArrayAlive1Neighbours,
                $CellArrayAlive2Neighbours,
                $CellArrayAlive3Neighbours,
                $CellArrayDead3Neighbours,
                $CellArrayAlive4Neighbours
              )

function CellArrayTests($CurrentCellArray) {
    Write-Verbose "Get-GameOfLife"
    foreach ($jj in $CurrentCellArray ) {
        CellIsAlive($jj)
    }
}

# 
# Cmdlet 
#  Get-GameOfLife
#
function Get-GameOfLife {
    [CmdletBinding()]
    param (
    )
    PROCESS {
       CellArrayTests($CellArray)
    }
}

function Get-CellIsAlive00 {
}

function Get-CellIsAlive01($CurrentCellArray) {
    return ($false)
}

function Get-CellIsAlive02($CurrentCellArray) {
    $counter = 0
    if ( $CurrentCellArray[4] ) {
        foreach ($jj in $CurrentCellArray) {
            if ( $jj ) {
                $counter += 1
            }
        }
        $counter -= 1
    }
    return $counter -eq 2
}

function Get-CellIsAlive03($CurrentCellArray) {
    $counter = 0
    if ( $CurrentCellArray[4] ) {
        foreach ($jj in $CurrentCellArray) {
            if ( $jj ) {
                $counter += 1
            }
        }
        $counter -= 1
    }
    return ($counter -ge 2)
}

function Get-CellIsAlive04($CurrentCellArray) {
    $counter = 0
    if ( $CurrentCellArray[4] ) {
        foreach ($jj in $CurrentCellArray) {
            if ( $jj ) {
                $counter += 1
            }
        }
        $counter -= 1
    }
    return ($counter -ge 2) -and ($counter -le 3) 
}

function Get-CellIsAlive($CurrentCellArray) {
    $counter = 0
    $isAlive = $false
    foreach ($jj in $CurrentCellArray) {
        if ( $jj ) {
            $counter += 1
        }
    }
    if ( $CurrentCellArray[4] ) {
        $counter -= 1
        $isAlive = ($counter -ge 2) -and ($counter -le 3)
    } elseif ( $isAlive = $counter -eq 3 ) { }
   return $isAlive
}

#Get-GameOfLife
