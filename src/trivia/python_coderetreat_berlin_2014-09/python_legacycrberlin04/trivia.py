#!/usr/bin/env python
"""trivia.py"""

from random import randrange, seed

class SuperGame(object):
    """SuperGame"""
    pass

class Game(SuperGame):
    """Game"""
    def __init__(self):
        """__init__"""
        self.players = []
        self.places = [0] * 6
        self.purses = [0] * 6
        self.in_penalty_box = [0] * 6

        self.pop_questions = []
        self.science_questions = []
        self.sports_questions = []
        self.rock_questions = []

        self.current_player = 0
        self.is_getting_out_of_penalty_box = False

        for i in range(50):
            self.pop_questions.append("Pop Question %s" % i)
            self.science_questions.append("Science Question %s" % i)
            self.sports_questions.append("Sports Question %s" % i)
            self.rock_questions.append(create_rock_question(i)) ##

    def is_playable(self):
        """is_playable"""
        return self.how_many_players >= 2

    def add(self, player_name):
        """add"""
        self.players.append(player_name)
        self.places[self.how_many_players] = 0
        self.purses[self.how_many_players] = 0
        self.in_penalty_box[self.how_many_players] = False

        print player_name + " was added"
        print "They are player number %s" % len(self.players)

        return True

    @property
    def how_many_players(self):
        """how_many_players"""
        return len(self.players)

    def roll(self, roll):
        """roll"""
        print "%s is the current player" % self.players[self.current_player]
        print "They have rolled a %s" % roll

        if self.in_penalty_box[self.current_player]:
            if roll % 2 != 0:
                self.is_getting_out_of_penalty_box = True

                print "%s is getting out of the penalty box" % \
                                               self.players[self.current_player]
                self.places[self.current_player] = \
                                         self.places[self.current_player] + roll
                if self.places[self.current_player] > 11:
                    self.places[self.current_player] = \
                                           self.places[self.current_player] - 12

                print self.players[self.current_player] + \
                            '\'s new location is ' + \
                            str(self.places[self.current_player])
                print "The category is %s" % self._current_category
                self._ask_question()
            else:
                print "%s is not getting out of the penalty box" % \
                                               self.players[self.current_player]
                self.is_getting_out_of_penalty_box = False
        else:
            self.places[self.current_player] = \
                                         self.places[self.current_player] + roll
            if self.places[self.current_player] > 11:
                self.places[self.current_player] = \
                                           self.places[self.current_player] - 12

            print self.players[self.current_player] + \
                        '\'s new location is ' + \
                        str(self.places[self.current_player])
            print "The category is %s" % self._current_category
            self._ask_question()

    def _ask_question(self):
        """_ask_question"""
        if self._current_category == 'Pop':
            print self.pop_questions.pop(0)
        if self._current_category == 'Science':
            print self.science_questions.pop(0)
        if self._current_category == 'Sports':
            print self.sports_questions.pop(0)
        if self._current_category == 'Rock':
            print self.rock_questions.pop(0)

    @property
    def _current_category(self):
        """_current_category"""
        result = 'Rock'
        if self.places[self.current_player] == 0:
            result = 'Pop'
        if self.places[self.current_player] == 4:
            result = 'Pop'
        if self.places[self.current_player] == 8:
            result = 'Pop'
        if self.places[self.current_player] == 1:
            result = 'Science'
        if self.places[self.current_player] == 5:
            result = 'Science'
        if self.places[self.current_player] == 9:
            result = 'Science'
        if self.places[self.current_player] == 2:
            result = 'Sports'
        if self.places[self.current_player] == 6:
            result = 'Sports'
        if self.places[self.current_player] == 10:
            result = 'Sports'
        return result

    def was_correctly_answered(self):
        """was_correctly_answered"""
        if self.in_penalty_box[self.current_player]:
            if self.is_getting_out_of_penalty_box:
                print 'Answer was correct!!!!'
                self.purses[self.current_player] += 1
                print self.players[self.current_player] + \
                    ' now has ' + \
                    str(self.purses[self.current_player]) + \
                    ' Gold Coins.'

                winner = self._did_player_win()
                self.current_player += 1
                if self.current_player == len(self.players): \
                                                         self.current_player = 0

                return winner
            else:
                self.current_player += 1
                if self.current_player == len(self.players): \
                                                         self.current_player = 0
                return True



        else:

            print "Answer was corrent!!!!"
            self.purses[self.current_player] += 1
            print self.players[self.current_player] + \
                ' now has ' + \
                str(self.purses[self.current_player]) + \
                ' Gold Coins.'

            winner = self._did_player_win()
            self.current_player += 1
            if self.current_player == len(self.players):
                self.current_player = 0

            return winner

    def wrong_answer(self):
        """wrong_answer"""
        print 'Question was incorrectly answered'
        print self.players[self.current_player] + " was sent to the penalty box"
        self.in_penalty_box[self.current_player] = True

        self.current_player += 1
        if self.current_player == len(self.players):
            self.current_player = 0
        return True

    def _did_player_win(self):
        """ _did_player_win"""
        return not self.purses[self.current_player] == 6

def create_rock_question(index):
    """create_rock_question"""
    return "Rock Question %s" % index

##
#
#
def main():
    """ main"""
    seed(42)
    not_a_winner = False

    game = Game()

    game.add('Chet')
    game.add('Pat')
    game.add('Sue')

    while True:
        game.roll(randrange(5) + 1)

        if randrange(9) == 7:
            not_a_winner = game.wrong_answer()
        else:
            not_a_winner = game.was_correctly_answered()

        if not not_a_winner:
            break


if __name__ == '__main__':
    main()

