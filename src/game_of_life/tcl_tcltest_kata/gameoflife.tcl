#!/usr/bin/env tclsh

#  @package   fizzBuzz
#  @file      fizzBuzz.test
#  @brief     Tcl/Tk application "FizzBuzz"
#  @author    Rolf Hemmerling <hemmerling@gmx.net>
#  @version   1.00
#  @date      2015-06-25
#  @copyright Apache License, Version 2.0
#
#  fizzBuzz - Tcl/Tk application "FizzBuzz"
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

#package require struct::list

set true 1
set false 0
set NewCellArray ()
set EmptyArray        { 0 0 0 \
                        0 0 0 \
                        0 0 0 }

set CellArrayDead0Neighbours  { 0 0 0 \  
                                0 0 0 \
                                0 0 0 }
set CellArrayAlive0Neighbours { 0 0 0 \ 
                                0 1 0 \
                                0 0 0 }
set CellArrayAlive1Neighbours { 0 0 0 \
                                0 1 1 \
                                0 0 0 }
set CellArrayAlive2Neighbours { 0 0 0 \
                                1 1 1 \
                                0 0 0 } 
set CellArrayAlive3Neighbours { 0 1 0 \
				0 1 1 \
				0 1 0 }
set CellArrayDead3Neighbours  { 0 1 0 \
				0 0 1 \
				0 1 0 }
set CellArrayAlive4Neighbours { 0 1 0 \
                                0 1 1 \
                                0 1 1 }              


set CellArray { $CellArrayDead0Neighbours \ 
                $CellArrayAlive0Neighbours \
                $CellArrayAlive1Neighbours \
                $CellArrayAlive2Neighbours \
                $CellArrayAlive3Neighbours \
                 $CellArrayDead3Neighbours \
                $CellArrayAlive4Neighbours \
              }


proc cellIsAlive01 {anInputArray} {
   return 0
}

proc cellIsAlive02 {anInputArray} {
    set counter 0
    if { [lindex $anInputArray 4] ne "0" } {
        foreach jj $anInputArray {
             if { $jj ne "0" } {
                incr counter
            }
        }
        incr counter -1
    }
    return [expr $counter eq "2"]
}

proc cellIsAlive03 {anInputArray} {
    set counter 0
    if { [lindex $anInputArray 4] ne "0" } {
        foreach jj $anInputArray {
             if { $jj ne "0" } {
                incr counter
            }
        }
        incr counter -1
    }
    return [expr $counter >= "2"]
}

proc cellIsAlive {anInputArray} {
    set counter 0
    set isAlive 0
    foreach jj $anInputArray {
    	if { $jj ne "0" } {
            incr counter
            # puts [format "counter= %s jj = %s" $counter $jj]
        }
    }
    if { [lindex $anInputArray 4] ne "0" } {
        incr counter -1
        set isAlive [expr [expr $counter >= "2"] && \
                          [expr $counter <= "3"]]
    } else {
    	set isAlive [expr $counter eq "3"]
    }
    return $isAlive
}

if {[info script] eq $argv0} {
    # called file so run dummy function calls   
    #puts $CellArrayAlive3Neighbours
    puts [cellIsAlive $CellArrayDead0Neighbours]
    puts [cellIsAlive $CellArrayAlive1Neighbours]
    puts [cellIsAlive $CellArrayAlive2Neighbours]
    puts [cellIsAlive $CellArrayAlive3Neighbours]
    puts [cellIsAlive $CellArrayDead3Neighbours]
    puts [cellIsAlive $CellArrayAlive4Neighbours]
}
