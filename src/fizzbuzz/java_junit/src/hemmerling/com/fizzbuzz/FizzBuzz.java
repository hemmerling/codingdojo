/**
 *  @package   hemmerling.com.fizzbuzz
 *  @file      FizzBuzz.java
 *  @brief     Java application "FizzBuzz"
 *  @author    Rolf Hemmerling <hemmerling@gmx.net>
 *  @version   1.00
 *  @date      2015-06-01
 *  @copyright Apache License, Version 2.0
 *
 *  FizzBuzz - Java application "FizzBuzz"
 *
 *  Copyright 2015 Rolf Hemmerling
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package hemmerling.com.fizzbuzz;

public class FizzBuzz {

	  public static void main(String[] args) {
		  System.out.println("FizzBuzz"); 
	  }
	 
	  public String fizzBuzz01( int anInputValue ) {
		  String aReturnValue;
	   	  aReturnValue = "" + 1;	
		  return ( aReturnValue );
	   }
	  
	  public String fizzBuzz02( int anInputValue ) {
		  String aReturnValue;
		  if ( anInputValue == 3 ) {
			   aReturnValue = "Fizz";		
			}
			else {
	 		   aReturnValue = "" + 1;	
			};
		  return ( aReturnValue );
	    }
	 
	  public String fizzBuzz03( int anInputValue ) {
		  String aReturnValue;
		  if ( anInputValue == 3 ) {
			   aReturnValue = "Fizz";		
			}
			else {
				if ( anInputValue == 5 ) {
					aReturnValue = "Buzz";
				}
				else {
					aReturnValue = "" + 1;	
				}
			};
		  return ( aReturnValue );
	    }
	 
	  public String fizzBuzz04( int anInputValue ) {
		  String aReturnValue;
		  if ( ( anInputValue % 3 ) == 0 ) {
			   aReturnValue = "Fizz";		
			}
			else {
				if ( anInputValue == 5 ) {
					aReturnValue = "Buzz";
				}
				else {
					aReturnValue = "" + 1;	
				}
			};
		  return ( aReturnValue );
	    }
	  
	  public String fizzBuzz05( int anInputValue ) {
		  String aReturnValue;
		  if ( ( anInputValue % 3 ) == 0 ) {
			   aReturnValue = "Fizz";		
			}
			else {
				if ( ( anInputValue % 5 ) == 0 ) {
					aReturnValue = "Buzz";
				}
				else {
					aReturnValue = "" + 1;	
				}
			};
		  return ( aReturnValue );
	    }
	 
	  public String fizzBuzz( int anInputValue ) {
		  String aReturnValue = "";
		  if ( ( ( anInputValue % 3 ) == 0 ) || ( ( anInputValue % 5 ) == 0 ) ) {
			  if ( ( anInputValue % 3 ) == 0 ) {
				  aReturnValue = "Fizz";		
			  };
			  if ( ( anInputValue % 5 ) == 0 ) {
				  aReturnValue = aReturnValue + "Buzz";
			  };
		  }	  
		  else {
			   aReturnValue = "" + anInputValue;	
		  };
		  return ( aReturnValue );
	    }
	  
	  public String[] fizzBuzzListe() {
		  String aListe[] = new String[100];
		  for (int aCounter=0; aCounter<100; aCounter++ ) {
			  aListe[aCounter] = fizzBuzz(aCounter+1);
			  //System.out.print(aCounter+1);
			  //System.out.print(" - "+aListe[aCounter]+"\n");
		  };
		  return ( aListe );
	  }
	
}
