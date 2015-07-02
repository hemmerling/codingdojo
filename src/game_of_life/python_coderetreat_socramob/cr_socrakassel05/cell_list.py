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

class CellList(list, object):
    def __init__(selfa):
        super(list, self)
        self.coordinateDict = dict()

    def append(self, aCell ):
        super(CellList, self).append(aCell)
        self.coordinateDict[tuple([aCell.x, aCell.y])] = aCell

    def exist(self, x, y):
        locationTuple = tuple([x, y])
        return self.coordinateDict.has_key(locationTuple)

    def main(self):
        return

if __name__ == '__main__':
   pass