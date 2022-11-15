# Paint-Calculator
This progarm take:-
Input:
1> Dimensions of the room with the Dimensions of the door and windows.

Output:
1> Area of the Floor
2> Amount of the paint required to paint the walls
3> Volume of the room

Assumtions:
1> There is only 1 Door and 2 Windows.
2> There is Rcommended Double Coating of the Paint which is Coats=2 is fixed.
3> There is 0.1 Liters of paint required per meter square of area is fixed.
4> There is no other Excluded area other than door and Windows.
5> The Inputs are in meters.
6> Assuming the Room is Cube or Cuboid so the number of the wall will be 4.

Testing:
1> testing is done for DimensionalCalculations Class which calculates Volume,Area,Floor by get parameters like Height,Width and length and also for the IllegalArgumentException.

Exception:
There are two Exceptions:
1>IOException which is when user gives a wrong input
2>IllegalArgumentException which is when user input height,width or length is less zero and equal to zero for height and width.

Exception Handelling:
Try and Catch is used in main class to handel the given Exceptions.


