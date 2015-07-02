class Coordinate:
    coordX = 0
    coordY = 0

    def __init__(self, coordX=0, coordY=0):
        self.coordX = coordX
        self.coordY = coordY
        pass

    def set(self, coordX, coordY):
        self.coordX = coordX
        self.coordY = coordY
        return coordX, coordY

if __name__ == '__main__':
   pass
