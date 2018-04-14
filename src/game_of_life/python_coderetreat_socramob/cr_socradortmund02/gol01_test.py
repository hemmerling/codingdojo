#This file was originally generated by PyScripter's unitest wizard

import unittest
from gol01 import Gol01

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
        setAlive = lambda x : x.state(True)
        setAlive = lambda x,y: x + y
        setAlive2 = lambda x,y: x.main() + y
        assert setAlive(2,3) == 5, 'Gol01.get_size() does not provide the right return value'
        assert setAlive2(self.gol,3) == 5, 'Gol01.get_size() does not provide the right return value'
        pass


# run all tests
if __name__ == "__main__":
    try:
        unittest.main()
    except SystemExit as inst:
        if inst.args[0] is True: # raised by sys.exit(True) when tests failed
            raise

