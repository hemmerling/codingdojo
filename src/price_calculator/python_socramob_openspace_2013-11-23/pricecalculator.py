#!/usr/bin/env python

#
#  @package   pricecalculator
#  @file      pricecalculator.py
#  @brief     Python application "Price Calculator",
#             an "Elephant Carpaccio Exercise",
#             according to the "Story Slicing" approach
#  @author    Rolf Hemmerling <hemmerling@gmx.net>
#  @version   1.00
#  @date      2015-06-01
#  @copyright Apache License, Version 2.0
#
#  FizzBuzz - Python application "Price Calculator",
#             an "Elephant Carpaccio Exercise",
#             according to the "Story Slicing" approach
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
#  Main development date: 2013-11-23
#

class PriceCalculator:

    umsatzsteuer = {'de':19, 'it':22, 'se':25, 'lu':15, 'mt':18}
    mengenrabatt = [ (1000, 0), (5000,3), (7000, 5), (10000, 7), (50000, 10)]

    def __init__(self):
        pass

    def data_input(self):
        print "Anzahl ="
        anzahl = raw_input()
        print "Preis ="
        preis = raw_input()
        print "Laendercode ="
        land = raw_input()
        return [ anzahl, preis, land ]

    def data_calculation(self, data):
        preis = int(data[0])*float(data[1])
        rabatt = 15
        for key in self.mengenrabatt:
            print "key", key
            if preis<key[0]:
                rabatt = key[1]
                break
        print "rabatt =", rabatt
        rabatt_preis = preis*( 1 - rabatt/100.0 )
        mwst = rabatt_preis*int(self.umsatzsteuer[data[2]])/100.0
        data.append(rabatt_preis+mwst)
        return data

    def data_output(self, data):
        print data

    def main(self):
        data = self.data_input()
        data2 = self.data_calculation(data)
        self.data_output(data2)
        pass

my_preis_rechner = PriceCalculator()
my_preis_rechner.main()

if __name__ == '__main__':
   pass
