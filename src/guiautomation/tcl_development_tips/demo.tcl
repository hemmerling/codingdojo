bind all <Shift-F1> {console show}
set LabelText "Hello"
set Message "Hello World!"
pack [button .b -text $LabelText -command onButtonClick]
pack [button .c -text $LabelText -command onButtonClick]
proc onButtonClick {} {
puts "Start of Reaction to Buttonclick" 
    tk_messageBox -parent . -message $::Message
puts "End of Reaction to Buttonclick"
}
