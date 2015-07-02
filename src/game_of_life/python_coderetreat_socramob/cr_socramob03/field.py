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

    field = []

    def __init__(self):
        self.field = []
        pass

    def is_cell_alive(self, coordinate):
        return True

    def append(self, coordinate):
        self.field.append(coordinate)
        return

    def number_of_neighbours(self):
        self.number = 2
        print len(self.field)
        self.number = len(self.field)
        return self.number

if __name__ == '__main__':
    main()
