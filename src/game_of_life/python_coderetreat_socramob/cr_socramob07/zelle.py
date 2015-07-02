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

class Zelle:

    def __init__(self, zelleLebt1=True):
        self.zelleLebt = zelleLebt1
        pass

    def ueberlebt_version1(self, anzahlNachbarn):
        hatUeberlebt = False
        return hatUeberlebt

    def ueberlebt_version2(self, anzahlNachbarn):
        hatUeberlebt = False
        if anzahlNachbarn < 2:
            hatUeberlebt = False
        else:
            if anzahlNachbarn > 3:
                hatUeberlebt = False
            else:
                hatUeberlebt = True
        return hatUeberlebt

    def ueberlebt(self, anzahlNachbarn):
        hatUeberlebt = False
        if anzahlNachbarn < 2:
            hatUeberlebt = False
        else:
            if anzahlNachbarn > 3:
                hatUeberlebt = False
            else:
                if anzahlNachbarn == 2:
                    if self.zelleLebt:
                        hatUeberlebt = True
                    else:
                        hatUeberlebt = False
                else:
                    hatUeberlebt = True
        return hatUeberlebt

    def main(self):
        return


if __name__ == '__main__':
   pass