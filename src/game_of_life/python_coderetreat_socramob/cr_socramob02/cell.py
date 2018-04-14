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
    def __init__(self):
        self.neighbour = 0
        pass

    def exist(self):
        return True

    def add(self, neighbour):
        self.neighbour +=1
        return self.neighbour

    def number_of_neighbours(self):
        return self.neighbour

if __name__ == '__main__':
   pass
