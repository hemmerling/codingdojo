#This file was originally generated by PyScripter's unitest wizard

import unittest
from cell import Cell

def dummy():
    """ Dummy function for comparison of the return values """
    return

class CellTest(unittest.TestCase):
    
    def setUp(self):
        pass

    def tearDown(self):
        pass

 
    def testIsAlive(self):
        self.cell = Cell()
        result = self.cell.isAlive()
        assert result == True, 'Cell is alive'

    def testIsDead(self):
        self.cell = Cell()
        self.cell.setStatus(False)
        result = self.cell.isAlive()
        assert result == False, 'Cell is dead'

    def testCountNeighbours(self):
        self.cell = Cell()
        self.neighbour = Cell()
        amount = self.cell.countNumberOfNeighbours()
        assert amount == 0, 'Number of Cell neighbours'

    def testAddNeighbour(self):
        self.cell = Cell()
        self.neighbour = Cell()
        self.cell.addNeighbour(self.neighbour)
        amount = self.cell.countNumberOfNeighbours()
        assert amount == 1, 'Neighbour is not added to the cell, amount ='+str(amount)

# run all tests
if __name__ == "__main__":
    try:
        unittest.main()
    except SystemExit as inst:
        if inst.args[0] is True: # raised by sys.exit(True) when tests failed
            raise