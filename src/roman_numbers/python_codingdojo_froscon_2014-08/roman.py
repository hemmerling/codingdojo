#! /usr/bin/python

einerliste = ['', 'I','II','III', 'IV', 'V', 'VI', 'VII', 'VIII', 'IX', 'X']
zehnerliste = ['','X','XX','XXX', 'XL', 'L', 'LX', 'LXX', 'LXXX', 'XC', 'C']
hunderterliste = ['','C','CC','CCC', 'CD', 'D', 'DC', 'DCC', 'DCCC', 'CM', 'M']

def ator2(arab):
    x = hunderterliste[ arab / 101 ]
    x = x + zehnerliste[ arab / 11 ]
    x = x + einerliste[ arab % 10 ]
    return x

# print ator2(9)
# print ator2(14)
# print einerliste

def check(a, r):
    if ator2( a ) != r: raise BaseException( str(a) + ": " + ator(a))
    
def ator( a ):
    """ Arabisch -> Roemisch
        0 -> None
        1 -> I
        5 -> V
        10 -> X
        50 -> L
        100 -> C
        500 -> D
        1000 -> M
    """
    if a == 0: return None          # 5-5
    if a == 1: return "I"        # 1    # 5-4
    if a == 2: return "II"       # 2    # 5-3
    if a == 3: return "III"      # 3    # 5-2
    if a == 4: return "IV"       # 1&5  # 5-1
    if a == 5: return "V"        # 5    # 5-0
    if a == 6: return "VI"       # 5&1  
    if a == 7: return "VII"      # 5&2
    if a == 8: return "VIII"     # 5&3
    if a == 9: return "IX"       # 1&10
    if a == 10: return "X"       # 10
    if a == 24: return "XXIV"    # X+check(24-10) 10&10&1&5
    if a == 1020: return "MXX"   # X+check(24-10) 10&10&1&5
    if a == 3999: return "MXX"   # X+check(24-10) 10&10&1&5
    raise NotImplementedError

def recursive_ator(number, result):
    if number == 1: return "I"       # 1    # 5-4
    if number == 2: return "II"      # 2    # 5-3
    if number == 3: return "III"         # 3    # 5-2
    if number == 4: return "IV"      # 1&5  # 5-1
    if number == 5: return "V"       # 5    # 5-0
    if number == 6: return "VI"      # 5&1  
    if number == 7: return "VII"         # 5&2
    if number == 8: return "VIII"    # 5&3
    if number == 9: return "IX"      # 1&10
    if number == 10: return "X"      # 10
    if number == 24: return "XXIV"   # X+check(24-10) 10&10&1&5
    
    return (numberleft, result + newresult)

    
if __name__ == '__main__':
    if ator(  0 ) != None: raise BaseException(str(0))
    check(1,"I")
    check(2,"II")
    check(3,"III")
    check(4,"IV")
    check(5,"V")
    check(24,"XXIV")
    check(124,"CXXIV")
    # if ator(  1 ) == None: raise BaseException('bla')

