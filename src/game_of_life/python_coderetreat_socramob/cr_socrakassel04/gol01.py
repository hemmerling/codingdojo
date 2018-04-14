#-------------------------------------------------------------------------------
# Name:        module1
# Purpose:
#
# Author:      Administrator
#
# Created:     08/10/2011
# Copyright:   (c) Administrator 2011
# Licence:     <your licence>
#-------------------------------------------------------------------------------
#!/usr/bin/env python

class Gol01:
    def __init__(self):
        pass

    def setelements(self, elements):
        self.elements = elements
        return

    def nextStep2(self):
        counter = 0
        myself = self.elements[4];
        for iii in self.elements:
            if iii:
                counter +=1
        if myself:
            counter -= 1
        return counter == 3

    def nextStep(self):
        counter = 0
        myself = self.elements[1][1];
        for jjj in self.elements:
            for iii in jjj:
                if iii:
                    counter +=1
        if myself:
            counter -= 1
        return counter == 3

    def set_field(self, x, y, elements):
        x -= 1
        y -= 1
        # you need to initalize a field
        self.field = 100*(100*())
        for jjj in elements:
            for iii in jjj:
                self.field[x][y] = iii
                y += 1
            x += 1
        return

    def get_field(self, x, y):
        x -= 1
        y -= 1
        for jjj in elements:
            for iii in jjj:
                iii = self.field[x][y]
                y += 1
            x += 1
        return elements

if __name__ == '__main__':
   pass