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

    def getNeighbours_old(self, xCoordinate, yCoordinate):
        return 3

    def getNeighbours(self, xCoordinate, yCoordinate):
        anzahlNachbarn = 0
        for ii in range(3):
            for jj in range(3):
                try:
                    print ii, jj
                    if (self.field[ii][jj]):
                        anzahlNachbarn +=1
                    print "Field:", self.field[ii][jj]
                except:
                    pass

        if (self.field[xCoordinate][yCoordinate]):
            anzahlNachbarn -= 1
        print "Anzahl Nachbarn", anzahlNachbarn
        return anzahlNachbarn

    def isNextAlive(self, numberOfNeigbours):
        return True

if __name__ == '__main__':
   pass