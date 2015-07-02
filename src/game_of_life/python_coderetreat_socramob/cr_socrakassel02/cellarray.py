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

from cell import Cell
from livingcell import LivingCell
from deadcell import DeadCell

class CellArray:
    def __init__(self):
        pass

    def nextState(self, testcell_list):
        dead_cell = DeadCell()
        return dead_cell

if __name__ == '__main__':
   pass