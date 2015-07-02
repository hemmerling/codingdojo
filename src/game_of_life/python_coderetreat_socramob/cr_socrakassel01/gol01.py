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
        self.feld(0,0,False)
        pass

    def feld(self, x, y, status):
        if ( x == 0) and ( y == 0) and (status == None):
            result = True
        else:
            result = False
        return result

    def nachbar00(self, xkoorinate, ykoordinate):
        result = False
        return result

    def setNachbar(self, xkoorinate, ykoordinate):
        self.feld(0,0, True)
        return

    def nachbar(self, xkoorinate, ykoordinate):
        #result = False
        # Wenn x == und y == 0, dann True, sonst False
        if ( xkoorinate == 0 ) and ( ykoordinate == 0) \
           and ( self.feld(0,0,None) == True ):
            result = True
        else:
            result = False
        return result

if __name__ == '__main__':
   pass