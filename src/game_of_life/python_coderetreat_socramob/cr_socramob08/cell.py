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

class Cell:
    def __init__(self, coord):
        self.coord = coord
        self.alive = True
        pass

    def isAlive(self):
        return self.alive

    def nextStep(self, numberOfNeighbours):
        self.alive = (numberOfNeighbours > 1) & (numberOfNeighbours <=3)
        return

    def main(self):
        return

if __name__ == '__main__':
   pass