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

class Field:
    def __init__(self):
        self.cells = []
        pass

    def add(self, cell):
        self.cells.append(cell)

    def getNumberOfLivingCells(self):
        return len(self.cells)

    def main(self):
        return

if __name__ == '__main__':
   pass