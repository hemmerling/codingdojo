from hamcrest import *
import unittest

class GameOfLifeTest(unittest.TestCase):

  def setUp(self):
    self.was_invoked = False

  def invoke(self):
    self.was_invoked = True

  def testDeadCellIsDead(self):
    DeadCell().executeIfDead(self.invoke)
    assert_that(self.was_invoked)

  def testDeadCellIsNotAlive(self):
    DeadCell().executeIfAlive(self.invoke)
    assert_that(is_not(self.was_invoked))

  def testLiveCellIsNotDead(self):
    LiveCell().executeIfDead(self.invoke)
    assert_that(is_not(self.was_invoked))

  def testLiveCellIsAlive(self):
    LiveCell().executeIfAlive(self.invoke)
    assert_that(is_(self.was_invoked))

class DeadCell:
  def executeIfDead(self, invokable):
    invokable()

  def executeIfAlive(self, invokable):
    pass

class LiveCell:
  def executeIfDead(self, invokable):
    pass

  def executeIfAlive(self, invokable):
    invokable()