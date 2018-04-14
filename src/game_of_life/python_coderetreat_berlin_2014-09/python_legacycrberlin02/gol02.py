2#-------------------------------------------------------------------------------
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

class Gol02:
    def __init__(self):
        self.numberOfNeighbors = 0
        self.isAlive = False
        self.board = []
        pass

    def evolve(self):
        return

    def setAlive(self):
        self.isAlive = True

    def isLiving(self):
        result = ( self.numberOfNeighbors == 3 ) or \
                                (self.isAlive and self.numberOfNeighbors == 2)
        return result

    def addNeigbors(self, numberOfNeighbors):
        self.numberOfNeighbors = numberOfNeighbors
        return

    def appendNeigbors(neighbor):
        self.board.append(neighbor)
        self.numberOfNeighbors +=1

if __name__ == '__main__':
   pass