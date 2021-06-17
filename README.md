# HyperSkill-BattleShip
# Stage 1/5
# Description
Battleship (also called Battleships or Sea Battle) is a two-player strategy game 
whose history traces back to the First World War. It started off as a pencil and paper
 game, until Milton Bradley coined the rules and published the game. Fun fact: it 
 was one of the first games to be produced as a computer game in 1979! In this 
 project, we will recreate this timeless classic.

First off, brush up on the rules of the game. There are different variations of the
Battleship game, but we will stick to the original rules written by Milton Bradley.
You have a 10×10 game field and five ships to arrange on that field. The ships can 
be placed horizontally or vertically but not diagonally across the grid spaces;
the ships should not cross or touch each other. The goal is to sink all the ships of 
the opponent before your opponent does this to you.

Positioning the ships is exactly where we are going to start! The goal of this first 
stage is to place all the ships on the game field according to the rules.

# Objectives
In this stage, you should arrange your ships on the game field. Before you start, 
let's discuss the conventions of the game:

    On a 10x10 field, the first row should contain numbers from 1 to 10 indicating the column, and the first column should contain letters from A to J indicating the row.
    The symbol ~ denotes the fog of war: the unknown area on the opponent's field and the yet untouched area on your field.
    The symbol O denotes a cell with your ship, X denotes that the ship was hit, and M signifies a miss.
    You have 5 ships: Aircraft Carrier is 5 cells, Battleship is 4 cells, Submarine is 3 cells, Cruiser is also 3 cells, and Destroyer is 2 cells. Start placing your ships with the largest one.
    To place a ship, enter two coordinates: the beginning and the end of the ship.
    If an error occurs in the input coordinates, your program should report it. The message should contain the word Error.

Example

The greater-than symbol followed by a space (> ) represents the user input. Notice that it's not part of the input.

  1 2 3 4 5 6 7 8 9 10 <br>
A ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  <br>
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

  1 2 3 4 5 6 7 8 9 10 <br>
A ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ <br>
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

  1 2 3 4 5 6 7 8 9 10 <br>
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
<br>
