import unittest

class GameOfLifeTest(unittest.TestCase):

      public void eineTote_Zelle_Mit_Genau_Drei_Lebenden_Nachbarn_Wird_In_Der_Folgegeneration_Neu_Geboren():
#Given
      def setUp(self):

      Zustand meinZustand = Zustand.TOT;
      integer anzahlVonLebendenNachbarn = integer(3);
      private GameOfLifeZelle gameOfLifeZelle = new GameOfLifeZelle(meinZustand, anzahlVonLebendenNachbarn);
#When
     Zustand zustandInDerNechsteRunde = gameOfLifeZelle.getZustandInDerNechsteRunde();

#Then
     Assert.assertEquals(zustandInDerNechsteRunde, Zustand.LEBENDIG);
