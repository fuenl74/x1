//////// What am I trying to do???
//////// What is my name?  (CST 112; today's date?)

//// GLOBALS:  coordinates, speed, etc.
float x, y;       // Position of creature.
float dx, dy;     // Speed.
float horizon;

//// SETUP:  window size, initialization (start in middle of screen).
void setup() {
  size( 640, 480);
  horizon=  height/4;
  x=  width/2;
  y=  height/2;
  dx=  3;
  dy=  2;
}

//// NEXT FRAME:  scene, action, show.
void draw() {
  //// SCENE:  sky, sun, tree, house, etc.
  background( 100, 150, 200 );                // sky
  fill( 255, 255, 0 );
  ellipse( width*3/7, height/16, 40, 40 );    // sun
  // Grass
  stroke(100,200,100);
  fill( 100, 200, 100 );
  rect( 0, horizon, width, height*3/4 );      // grass.

  /* INSERT YOUR CODE HERE! */

 stroke( 100, 200, 100 );
    triangle( 150, horizon-110, 130, horizon-20, 170, horizon -20 );//tree
    triangle( 150, horizon-110, 130, horizon-50, 170, horizon-50  );
    fill(85,15,0);
   stroke(85,15,0);
    rect(140,101,18,18);
  // tree

  fill(255, 155, 75);
  
stroke(0,0,0,0);

  rect(350, horizon-70, 100, horizon-50);
  fill(25, 100, 65);
  rect(393, horizon-25, 15, horizon-95);
  fill(50, 50, 100);
  rect(350, horizon-70, 100, horizon-80);
  
  fill(90, 100, 20);
  triangle(425, horizon-30, 400, horizon-69, 375, horizon-30  );
  fill(250, 25, 100);
  rect(360, horizon-25, 20, horizon-105);     
  rect(420, horizon-25, 20, horizon-105);  // house}
  stroke(0,0,0);
  strokeWeight(3);
  point(404,105);
  fill(0);
  text( "My name is Luis", 10, height-20 );                                          

  //// ACTION:  move (x,y) coordinates.
  x=  x + dx;
  y=  y + dy;

  //// SHOW:  display the creature at (x,y)

  /* INSERT YOUR CODE HERE! */
  strokeWeight(1);
  stroke(0, 100, 100);
  line(x, y, 10, horizon-100);
  fill(0, 100, 100); 
  ellipse( x, y, 90, 90 );   /* monster */
  fill(100, 100, 100); 
  ellipse(x,y-70,60,60);

  fill(10,10,10);
    ellipse(x+10,y-73,8,8);
  ellipse(x-10,y-73,8,8);
  fill(255, 255, 255);
  text( "James", x-10, y-20 );
}


//////// HANDLERS:  mouse clicks, keys
void mousePressed() {
  x=  mouseX;                             // Set (x,y) to mouse
  y=  mouseY;
  //
  dx=  random( -.3, +.2 );                  // random speed.
  dy=  random( -.3, +.1 );
}

void keyPressed() {
  if (key == 'q') {
    exit();                           // press 'q' key to QUIT.
  }
}






