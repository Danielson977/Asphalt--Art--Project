import org.code.neighborhood.*;

public class FacePainter extends PainterPlus {
public void paintface () {
// get to circle the starting position 
gettocircle();
// paint the whole circle
paintcircle();
// get to the eyes and mouth starting position
gettoeyesandmouth();
// paint eyes and mouth on the face
painteyesandmouth();
moveToCorner();
}
public void gettocircle() {
// move the painter from (0,0) facing east to the starting point for face
move();
move();
move();
move();
move();
move();
move();
move();
move();
move();
move();
move();
turnRight();
move();
move();
move();
move();
move();
move();
turnLeft();
}
public void paintcircle() {
// First Row of 5
for (int i = 0; i < 5; i++) {
paint("yellow");
move();
}
// turn down to next row (right side of circle)
move();
turnRight();
move();
turnRight();
  
// Second Row of 9  
for (int i = 0; i < 9; i++) {
paint("yellow");
move();
}
// turn down to next row (left side of circle)
turnLeft();
move();
turnLeft();
  
// Third Row of 11
for (int i = 0; i < 11; i++) {
paint("yellow");
move();
}
// turn down to next row (right side of circle)
turnRight();
move();
turnRight();

// 4th row of 13
for (int i = 0; i < 13; i++) {
paint("yellow");
move();
}
// turn down to next row (left side of circle)
turnLeft();
move();
turnLeft();
move();
  
// 5th row of 13
for (int i = 0; i < 13; i++) {
paint("yellow");
move();
}
turnRight();
move();
turnRight(); 

// 15 x5
for (int i = 0; i < 15; i++) {
paint("yellow");
move();
}
// turn down to next row (left side of circle)
turnLeft();
move();
turnLeft();
move();
for (int i = 0; i < 15; i++) {
paint("yellow");
move();
}
// turn down to next row (left side of circle)
turnRight();
move();
turnRight();
move();
for (int i = 0; i < 15; i++) {
paint("yellow");
move();
}
// turn down to next row (left side of circle)
turnLeft();
move();
turnLeft();
move();
for (int i = 0; i < 15; i++) {
paint("yellow");
move();
}
// turn down to next row (left side of circle)
turnRight();
move();
turnRight();
move();
for (int i = 0; i < 15; i++) {
paint("yellow");
move();
}
// turn down to next row (left side of circle)
turnLeft();
move();
turnLeft();
move();
move();
for (int i = 0; i < 13; i++) {
paint("yellow");
move();
}
turnRight();
move();
turnRight();
move();

for (int i = 0; i < 13; i++) {
paint("yellow");
move();
}
turnLeft();
move();
turnLeft();
move();
move();
for (int i = 0; i < 11; i++) {
paint("yellow");
move();
} 
turnRight();
move();
turnRight();
move();
for (int i = 0; i < 9; i++) {
paint("yellow");
move();
} 
turnLeft();
move();
turnLeft();
move();
move();
for (int i = 0; i < 5; i++) {
paint("yellow");
move();
}
}  
public void gettoeyesandmouth() {
// move the painter from the end position after painting the circle
turnLeft();
while(canMove()) {
  move();
}
turnLeft();
while(canMove()) {
  move();
}
turnLeft();
turnLeft();
  move();
  move();
  // checklater
  move();
  move();
  move();
  move();
  move();
  
  move();
  move();
  move();
  move();
turnRight();
  move();
  move();
  move();
  move();
  move();
  move();
  move();
  move();
}
public void painteyesandmouth() {
// paint eyes and the mouth in black
paint("black");
move();
turnRight();
move();
paint("black");
turnRight();
turnRight();
move();
move();
move();
move();
move();
move();
move();
turnLeft();
move();
paint("black");
turnRight();
move();
turnRight();
move();
paint("black");
move();
move();
turnLeft();
move();
turnRight();
turnRight();
move();
move();
paint("black");
move();
turnRight();
move();
paint("black");
turnLeft();
// move();
// paint("black");
move();
turnLeft();
move();
paint("black");
turnRight();
move();
move();
paint("black");
turnRight();
move();
turnLeft();
move();
paint("black");
move();
turnLeft();
move();
paint("black");
move();
move();
move();
move();
move();
turnLeft();
move();
move();
paint("black");
move();
paint("black");
move();
paint("black");
turnRight();
move();
turnRight();
paint("black");
move();
paint("black");
move();
paint("black");
}
public void moveToCorner() {
  while(canMove()) {
    move();
  }
  turnLeft();
  while(canMove()) {
    move();
  }
}
}