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

    number_of_neighbours = 0
    coordinates = [0,0]

    def __init__(self, state, coordinates=[0,0]):
        self.state = state
        self.coordinates = coordinates
        pass

    def is_alive(self):
        return self.state

    def add_neighbour(self, neighbour_cell):
        self.neighbour = True;
        self.number_of_neighbours += 1

    def has_neighbour(self):
        return self.number_of_neighbours > 0

    def get_number_of_neighbours(self):
        return self.number_of_neighbours

    def get_x(self):
        return self.coordinates[0]

    def get_y(self):
        return self.coordinates[1]
