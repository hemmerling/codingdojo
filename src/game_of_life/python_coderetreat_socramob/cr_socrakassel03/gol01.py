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

    def setze_zelle_auf_lebendig(self):
        self.status = True
        return

    def setze_zelle_auf_tot(self):
        self.status = False
        return

    def naechste_generation(self):
        result = (self.anzahl_nachbarn == 3) or \
                 ((self.status == True) and (self.anzahl_nachbarn == 2))
        return result

    def zelle_hat_nachbarn(self, anzahl_nachbarn):
        self.anzahl_nachbarn = anzahl_nachbarn
        return

if __name__ == '__main__':
   pass