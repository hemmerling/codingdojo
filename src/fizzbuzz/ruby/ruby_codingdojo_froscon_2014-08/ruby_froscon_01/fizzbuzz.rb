class FizzBuzz
  def fizz?(number_to_be_tested)
   ( number_to_be_tested % 3 == 0 ) and not ( number_to_be_tested % 5 == 0 )
  end

def buzz?(number_to_be_tested)
  ( number_to_be_tested % 5 == 0 ) and not ( number_to_be_tested % 3 == 0 )
  end

def fizz_buzz?(number_to_be_tested)
  ( number_to_be_tested % 5 == 0  ) and ( number_to_be_tested % 3 == 0 )
  end

end

