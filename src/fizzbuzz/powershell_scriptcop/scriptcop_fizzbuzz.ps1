#
# ScriptCop - Checking the "FizzBuzz" module and its Cmdlets
#
Import-Module ScriptCop -Force
Import-Module FizzBuzz -Force
#. ".\FizzBuzz.ps1"
#Get-Module -Name FizzBuzz | Test-Module
#Get-Command -Name Get-FizzBuzz | Test-Command
#Get-Command -Name ConvertTo-FizzBuzz | Test-Command

Test-Command -ScriptBlock {

    function Function1{        
    }  

    <#
        .SYNOPSIS 
        Prints hello greetings.

        .DESCRIPTION
        Prints “Hello, $Name!”.

        .PARAMETER Name
        Specifies the name to be greeted.

        .INPUTS
        None. You cannot pipe objects to Test-Output.

        .OUTPUTS
        System.String. 
        Test-Output returns a string with 
        a greeting.

        .EXAMPLE
        C:\PS> Test-Output Jack

        .LINK
        http://www.github.com/hemmerling/fizzbuzz

        .LINK
        Test-Output
    #>          
    function Test-Output {
        [OutputType(‘System.String’)]
        #region Parameter Block
        param ($Name)
        #endregion Parameter Block
    } 

    <#
        .SYNOPSIS 
        Double a value.
        DESCRIPTION
        Double the input $Number ( return $Number * 2 )

        .PARAMETER Number
        Specifies the number to be doubled.

        .INPUTS
        None. You cannot pipe objects to Get-Double.

        .OUTPUTS
        System.String. 
        Get-Double returns a string with 
        the double of the input $Number.

        .EXAMPLE
        C:\PS> Get-Double -Number 2

        .LINK
        http://www.github.com/hemmerling/fizzbuzz

        .LINK
        Get-Double
    #>  
    function Get-Double {
        [OutputType(‘string’)]
        #region Parameter Block
        param ($Number)
        #endregion Parameter Block
     }            
}
