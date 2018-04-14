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
    def __init__(self, neighbours, alive = True):
        self.neighbours = neighbours
        self.alive = alive
        #pass

    def survives(self):
        if self.neighbours <= 1:
            return False
        elif self.neighbours > 3:
            return False
        else:
            return True

    def born(self):
        return (self.neighbours == 3) and (self.alive == False)

    def is_alive(self):
        return self.born() or self.survives()

    def main(self):
        return

if __name__ == '__main__':
    #x = Gol01()
    #x.main()
    pass