#This file was originally generated by PyScripter's unitest wizard

import unittest
from gol05 import Gol01

def dummy():
    """ Dummy function for comparison of the return values """
    return

class Gol01Test(unittest.TestCase):

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testMain(self):
        self.gol = Gol01()
        assert self.gol.main() == dummy(), 'Gol01.get_size() does not provide the right return value'
        pass


# run all tests
if __name__ == "__main__":
    try:
        unittest.main()
    except SystemExit as inst:
        if inst.args[0] is True: # raised by sys.exit(True) when tests failed
            raise

