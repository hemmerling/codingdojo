class Cell:

    status = True;
    numberOfNeighbours = 0
    listOfNeighbours = []
    
    def __init__(self):
        pass

    def isAlive(self):
        return self.status

    def setStatus(self, status):
        self.status = status
        return self.status

    def countNumberOfNeighbours(self):
        return self.numberOfNeighbours

    def addNeighbour(self, neighbour):
        self.numberOfNeighbours +=1
        self.listOfNeighbours.append(neighbour)
        return self.numberOfNeighbours
    
if __name__ == '__main__':
   pass
