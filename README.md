# HyperSkill-BattleShip
# Stage 1/5
# Description

Description

The goal of this game is to sink all the ships of your opponent. Our fleet is not ready for a big battle yet, so let's practice shooting on our field. Place all your units on the battlefield and take a shot!

In this step, you need to develop a system of shooting with accompanying messages about hits and misses.
Objectives

Take a shot at a prepared game field. You need to indicate the coordinates of the target, and the program should then display a message about a hit or a miss. If the shell misses the target and falls in the water, this cell should be marked with an M, and a successful strike is marked by an X. After this shot, the game should be stopped.

If the player managed to hit a ship, the game should display a message You hit a ship!; otherwise, the message is You missed!
Examples

The greater-than symbol followed by a space (> ) represents the user input. Notice that it's not part of the input.

Example 1:

  1 2 3 4 5 6 7 8 9 10 <br>
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

The game starts!

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

Take a shot!

> A1

  1 2 3 4 5 6 7 8 9 10<br>
A X ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
B O ~ ~ ~ ~ ~ ~ ~ O ~<br>
C O ~ ~ ~ ~ ~ ~ ~ O ~<br>
D O ~ ~ ~ ~ ~ ~ ~ O ~<br>
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
F ~ ~ O O O O O ~ ~ ~<br>
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
I ~ O ~ ~ ~ ~ ~ ~ ~ ~<br>
J ~ O ~ ~ ~ ~ ~ O O O<br>

You hit a ship!

 

Example 2:

...
The game starts!

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

Take a shot!

> Z1

Error! You entered the wrong coordinates! Try again:

> A2

  1 2 3 4 5 6 7 8 9 10<br>
A O M ~ ~ ~ ~ ~ ~ ~ ~<br>
B O ~ ~ ~ ~ ~ ~ ~ O ~<br>
C O ~ ~ ~ ~ ~ ~ ~ O ~<br>
D O ~ ~ ~ ~ ~ ~ ~ O ~<br>
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
F ~ ~ O O O O O ~ ~ ~<br>
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~<br>
I ~ O ~ ~ ~ ~ ~ ~ ~ ~<br>
J ~ O ~ ~ ~ ~ ~ O O O<br>

You missed!
