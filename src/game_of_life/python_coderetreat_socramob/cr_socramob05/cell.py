class Cell:

    value = False
    neighbourListe = [(0,0), (0,1), (0,2), (1,0), (1,2), (2,0), (2,1), (2,2)] # fuer (1,1)
   
    def __init__(self, coordinate):
        self.coordinate = coordinate
        neighbourListe = [(0,0), (0,1), (0,2), (1,0), (1,2), (2,0), (2,1), (2,2)] # fuer (1,1)

    def exists(self):
        return self.value

    def setValue(self, value):
        self.value = value
        return self.value

    def getNeighbours(self):
        # calculate neighbours, generate neighbourListe
        return self.neighbourListe

if __name__ == '__main__':
   pass
