#This file was originally generated by PyScripter's unitest wizard

import unittest
from gol04 import Gol04
from cell import Cell
from field import Field

def dummy():
    """ Dummy function for comparison of the return values """
    return

class Gol04Test(unittest.TestCase):

    field = None
    cell = None

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testIsCellCreated(self):
        self.cell = Cell()
        assert self.cell.exist() == True, 'Cell was not created'

    def testIsCellAlive(self):
        self.field = Field()
        self.coordinate = [0,0]
        self.field.is_cell_alive(self.coordinate) == False, 'Cell is not alive'

    def testSetACellAlive(self):
        self.field = Field()
        self.coordinate = [0,0]
        self.field.append(self.coordinate)
        self.field.is_cell_alive(self.coordinate) == True, 'Cell is not alive'

    def testDoWeNeedAnotherPeriod(self):
        field = Field()
        cell = Cell()
        cell2 = Cell()
        field.append(Cell)
        field.append(cell2)
        assert field.number_of_neighbours() == 2, 'Field cant count its neighbours'

# run all tests
if __name__ == "__main__":
    try:
        unittest.main()
    except SystemExit as inst:
        if inst.args[0] is True: # raised by sys.exit(True) when tests failed
            raise
