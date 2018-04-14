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
        self.isCellAlive = False
        pass

    def setAlive(self, width,height):
        self.isCellAlive = True
        return True

    def isAlive(self):
        return self.isCellAlive

    def survives(self):
        return False

if __name__ == '__main__':
   pass