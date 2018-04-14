#!/usr/bin/env tclsh

#  @package   fizzbuzz
#  @file      fizzbuzz.test
#  @brief     Tcl/Tk application "FizzBuzz"
#  @author    Rolf Hemmerling <hemmerling@gmx.net>
#  @version   1.00
#  @date      2015-07-01
#  @copyright Apache License, Version 2.0
#
#  fizzbuzz - Tcl/Tk application "FizzBuzz"
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

package require struct::list

proc fizzbuzz00 {anInputValue} {
}

proc fizzbuzz01 {anInputValue} {
    return $anInputValue
}

proc fizzbuzz02 {anInputValue} {
    if {$anInputValue eq "3"} {
	return "Fizz"
    } else {
	return $anInputValue
    } 
}

proc fizzbuzz03 {anInputValue} {
    if {$anInputValue eq "3"} {
	return "Fizz"
    } else {
	if {$anInputValue eq "5"} {
	return "Buzz"
	} else {
	return $anInputValue
	}
    } 
}

proc fizzbuzz04 {anInputValue} {
   set result3 [expr $anInputValue % 3]
   if {$result3 eq "0"} {
	return "Fizz"
    } else {
	if {$anInputValue eq "5"} {
	return "Buzz"
	} else {
	return $anInputValue
	}
    } 
}

proc fizzbuzz05 {anInputValue} {
   set result3 [expr $anInputValue % 3]
   set result5 [expr $anInputValue % 5]
   if {$result3 eq "0"} {
	return "Fizz"
    } else {
	if {$result5 eq "0"} {
	return "Buzz"
	} else {
	return $anInputValue
	}
    } 
}

proc fizzbuzz {anInputValue} {
   set result3 [expr $anInputValue % 3]
   set result5 [expr $anInputValue % 5]
   set result35 [expr [expr $result3 == "0"] || \
                      [expr $result5 eq "0"]]
   set result ""
   if {$result35} {
   	if {$result3 eq "0"} {
		set result "Fizz"
    	}
   	if {$result5 eq "0"} {
		append result "Buzz"
	}
   } else {
	set result $anInputValue
   }
   return $result
}

set anOutputList { \
"1" "2" "Fizz" "4" "Buzz" "Fizz" "7" "8" "Fizz" "Buzz" \
"11" "Fizz" "13" "14" "FizzBuzz" "16" "17" "Fizz" "19" "Buzz" \
"Fizz" "22" "23" "Fizz" "Buzz" "26" "Fizz" "28" "29" "FizzBuzz" \
"31" "32" "Fizz" "34" "Buzz" "Fizz" "37" "38" "Fizz" "Buzz" \
"41" "Fizz" "43" "44" "FizzBuzz" "46" "47" "Fizz" "49" "Buzz" \
"Fizz" "52" "53" "Fizz" "Buzz" "56" "Fizz" "58" "59" "FizzBuzz" \
"61" "62" "Fizz" "64" "Buzz" "Fizz" "67" "68" "Fizz" "Buzz" \
"71" "Fizz" "73" "74" "FizzBuzz" "76" "77" "Fizz" "79" "Buzz" \
"Fizz" "82" "83" "Fizz" "Buzz" "86" "Fizz" "88" "89" "FizzBuzz" \
"91" "92" "Fizz" "94" "Buzz" "Fizz" "97" "98" "Fizz" "Buzz" }

if {[info script] eq $argv0} {
    # called file so run dummy function calls    
    #puts [fizzbuzz00]
    puts [fizzbuzz 1]
    puts [fizzbuzz 3]
    puts [fizzbuzz 5]
    puts [fizzbuzz 6]
    puts [fizzbuzz 10] 
    puts [fizzbuzz 15]
    #puts [strip $anOutputList]
}

   
