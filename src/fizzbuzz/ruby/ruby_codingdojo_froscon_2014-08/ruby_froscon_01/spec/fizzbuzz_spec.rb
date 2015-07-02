require './fizzbuzz'

describe FizzBuzz do
  let(:fizz_buzz) { FizzBuzz.new }

  describe '#fizz?' do
    it 'returns true if number is multiply of three' do
      expect(fizz_buzz.fizz?(9)).to be true
    end

    it 'returns false if number is not multiply of three' do
      expect(fizz_buzz.fizz?(1)).to be false
    end
  end

  describe '#buzz?' do
    it 'returns true if number is multiply of five' do
      expect(fizz_buzz.buzz?(10)).to be true
    end

    it 'returns false if number is not multiply of five' do
      expect(fizz_buzz.buzz?(1)).to be false
    end
  end

  describe '#fizzbuzz?' do
    it 'returns true if number is multiply of five and three' do
      expect(fizz_buzz.fizz_buzz?(15)).to be true
    end

    it 'returns false if number is not multiply of five and three' do
      expect(fizz_buzz.fizz_buzz?(5)).to be false
    end
  end
end
