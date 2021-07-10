# HyperSkill-BattleShip
# Stage 5/5
# Description

Here is a good way to show off your new skills: offer a friend to play a computer game that you wrote yourself! Of course, it is much more fun to play Battleship with someone else: the possibility of winning or losing adds a thrill to the game!

Both players add the ships to their fields one by one (no peeking!), and then start shelling each other until one of them succeeds. To make the game fair and prevent the players from peeping at each other's fields, after each move add the message "Press Enter and pass the move to another player", which will clear the screen.
Objectives

To complete this stage and the entire project, add a PvP component to your game. Now the player will see not only the opponent's screen but their own as well. Place the opponent's screen at the top and your field at the bottom.
Example

The greater-than symbol followed by a space (> ) represents the user input. Notice that it's not part of the input.

Player 1, place your ships on the game field

  1 2 3 4 5 6 7 8 9 10<br>
A ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
B ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
C ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
D ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
F ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
J ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>

Enter the coordinates of the Aircraft Carrier (5 cells):

> F3 F7

  1 2 3 4 5 6 7 8 9 10<br>
A ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
B ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
C ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
D ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
F ~ ~ O O O O O ~ ~ ~<br>
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
J ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>

Enter the coordinates of the Battleship (4 cells):

> A1 D1

  1 2 3 4 5 6 7 8 9 10<br>
A O ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
B O ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
C O ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
D O ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
F ~ ~ O O O O O ~ ~ ~<br>
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
J ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>

Enter the coordinates of the Submarine (3 cells):

> J7 J10

Error! Wrong length of the Submarine! Try again:

> J10 J8

  1 2 3 4 5 6 7 8 9 10<br>
A O ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
B O ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
C O ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
D O ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
F ~ ~ O O O O O ~ ~ ~<br>
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
J ~ ~ ~ ~ ~ ~ ~ O O O<br>

Enter the coordinates of the Cruiser (3 cells):

> B9 D8

Error! Wrong ship location! Try again:

> B9 D9

  1 2 3 4 5 6 7 8 9 10<br>
A O ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
B O ~ ~ ~ ~ ~ ~ ~ O ~<br>
C O ~ ~ ~ ~ ~ ~ ~ O ~<br>
D O ~ ~ ~ ~ ~ ~ ~ O ~<br>
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
F ~ ~ O O O O O ~ ~ ~<br>
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
J ~ ~ ~ ~ ~ ~ ~ O O O<br>

Enter the coordinates of the Destroyer (2 cells):

> E6 D6

Error! You placed it too close to another one. Try again:

> I2 J2

  1 2 3 4 5 6 7 8 9 10<br>
A O ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
B O ~ ~ ~ ~ ~ ~ ~ O ~<br>
C O ~ ~ ~ ~ ~ ~ ~ O ~<br>
D O ~ ~ ~ ~ ~ ~ ~ O ~<br>
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
F ~ ~ O O O O O ~ ~ ~<br>
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
I ~ O ~ ~ ~ ~ ~ ~ ~ ~<br>
J ~ O ~ ~ ~ ~ ~ O O O<br>

Press Enter and pass the move to another player
...
Player 2, place your ships to the game field

  1 2 3 4 5 6 7 8 9 10<br>
A ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
B ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
C ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
D ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
F ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
J ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>

Enter the coordinates of the Aircraft Carrier (5 cells):

> H2 H6

  1 2 3 4 5 6 7 8 9 10<br>
A ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
B ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
C ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
D ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
F ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
H ~ O O O O O ~ ~ ~ ~<br>
I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
J ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>

Enter the coordinates of the Battleship (4 cells):

> F3 F6

  1 2 3 4 5 6 7 8 9 10<br>
A ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
B ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
C ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
D ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
F ~ ~ O O O O ~ ~ ~ ~<br>
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
H ~ O O O O O ~ ~ ~ ~<br>
I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
J ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>

Enter the coordinates of the Submarine (3 cells):

> H8 F8

  1 2 3 4 5 6 7 8 9 10<br>
A ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
B ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
C ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
D ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
F ~ ~ O O O O ~ O ~ ~<br>
G ~ ~ ~ ~ ~ ~ ~ O ~ ~<br>
H ~ O O O O O ~ O ~ ~<br>
I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
J ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>

...

  1 2 3 4 5 6 7 8 9 10<br>
A ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
B ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
C ~ ~ ~ ~ ~ ~ ~ O ~ ~<br>
D ~ ~ ~ O O O ~ O ~ ~<br>
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
F ~ ~ O O O O ~ O ~ ~<br>
G ~ ~ ~ ~ ~ ~ ~ O ~ ~<br>
H ~ O O O O O ~ O ~ ~<br>
I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
J ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>

Press Enter and pass the move to another player
...

  1 2 3 4 5 6 7 8 9 10<br>
A ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
B ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
C ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
D ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
F ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
J ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
---------------------<br>
  1 2 3 4 5 6 7 8 9 10<br>
A O ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
B O ~ ~ ~ ~ ~ ~ ~ O ~<br>
C O ~ ~ ~ ~ ~ ~ ~ O ~<br>
D O ~ ~ ~ ~ ~ ~ ~ O ~<br>
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
F ~ ~ O O O O O ~ ~ ~<br>
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
I ~ O ~ ~ ~ ~ ~ ~ ~ ~<br>
J ~ O ~ ~ ~ ~ ~ O O O<br>

Player 1, it's your turn:

> I3

You missed!
Press Enter and pass the move to another player
...

  1 2 3 4 5 6 7 8 9 10<br>
A ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
B ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
C ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
D ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
F ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
J ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
---------------------<br>
  1 2 3 4 5 6 7 8 9 10<br>
A ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
B ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
C ~ ~ ~ ~ ~ ~ ~ O ~ ~<br>
D ~ ~ ~ O O O ~ O ~ ~<br>
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
F ~ ~ O O O O ~ O ~ ~<br>
G ~ ~ ~ ~ ~ ~ ~ O ~ ~<br>
H ~ O O O O O ~ O ~ ~<br>
I ~ ~ M ~ ~ ~ ~ ~ ~ ~<br>
J ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>

Player 2, it's your turn:

> A1

You hit a ship!
Press Enter and pass the move to another player
...

