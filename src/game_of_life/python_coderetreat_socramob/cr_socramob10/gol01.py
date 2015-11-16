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

    def __init__(self, size):
        self.size = size
        # noch nie gesehen :-(:
        self.field = [[0] * size for _ in range(size) ]
        pass

    def initField(self, a):
        self.field = a

    def num_neighbours_old(self, x, y):
        return 3 if x != 0 else 1

    def num_neighbours(self, x, y):
        neighbourCount = 0
        for ii in range(len(self.field)):
            for jj in range(len(self.field[ii])):
                try:
                   #print ii, jj, self.field[ii][jj]
                   if ( self.field[ii][jj] and abs(x-ii) <= 1 and abs(y-jj) <=1 ):
                       neighbourCount +=1
                except:
                   pass
        if (self.field[x][y]):
            neighbourCount -=1
        return neighbourCount

    def test(self):
        pass


if __name__ == '__main__':
   pass