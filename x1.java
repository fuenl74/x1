//////// What am I trying to do???
//////// What is my name?  (CST 112; today's date?)

//// GLOBALS:  coordinates, speed, etc.
float x, y;       // Position of creature.
float dx, dy;     // Speed.
float horizon;

//// SETUP:  window size, initialization (start in middle of screen).
void setup() {
  size( 740, 480);
  horizon=  height/4;
  x=  width/2;
  y=  height/2;
  dx=  3;
  dy=  2;
}

//// NEXT FRAME:  scene, action, show.
void draw() {
  //// SCENE:  sky, sun, tree, house, etc.
  background( 10, 50, 100 );                // sky
  fill( 200, 200, 200 );
  ellipse( width*3/7, height/16, 40, 40 );    // sun
  // Grass
  stroke(50,100,50);
  fill( 50, 100, 50 );
  rect( 0, horizon, width, height*3/4 );      // grass.

  /* INSERT YOUR CODE HERE! */

 stroke(50,100,50);
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
  
  ////street
  fill(150,150,200);
  rect(-100,170,1040,150);
  strokeWeight(0);
  fill(255,255,0);
  rect(-100,235,1040,15);
  fill(255,255,255);
  rect(100,235,100,15);
  rect(300,235,100,15);
  rect(500,235,100,15);
  
  // car
 
  stroke(255,255,255);
  fill(255,255,255);
  ellipse(119,220,25,25);
  ellipse(175,220,25,25);
  stroke(200,100,50);
  fill(200,100,50);
  rect(100,200,100,15);
  rect(100,180,80,35);
  triangle(180,192,199,200,180,200);
  fill(255,255,255);
  rect(110,187,20,15);
  rect(145,187,20,15);
  fill(100,100,100);
  ellipse(175,220,13,13);
  ellipse(119,220,13,13);
 
 //car 2
  stroke(255,255,255);
  fill(255,255,255);
  ellipse(519,220,25,25);
  ellipse(575,220,25,25);
  stroke(200,100,50);
  fill(200,100,50);
  rect(500,200,100,15);
  rect(500,180,80,35);
  triangle(580,192,599,200,580,200);
  fill(255,255,255);
  rect(510,187,20,15);
  rect(545,187,20,15);
  fill(100,100,100);
  ellipse(575,220,13,13);
  ellipse(519,220,13,13);
 
 //car 3
 stroke(255,255,255);
  fill(255,255,255);
  ellipse(319,220,25,25);
  ellipse(375,220,25,25);
  stroke(200,100,50);
  fill(200,100,50);
  rect(300,200,100,15);
  rect(300,180,80,35);
  triangle(380,192,399,200,380,200);
  fill(255,255,255);
  rect(310,187,20,15);
  rect(345,187,20,15);
  fill(100,100,100);
  ellipse(375,220,13,13);
  ellipse(319,220,13,13);
 


  //// ACTION:  move (x,y) coordinates.
  x=  x + dx;
  y=  y + dy;

  //// SHOW:  display the creature at (x,y)

  /* INSERT YOUR CODE HERE! */
  strokeWeight(1);
  stroke(0, 100, 100);
  fill(140,100,100);
  ellipse(x+50,y-29,60,15);
  ellipse(x-50,y-29,60,15);
  ellipse(x-15,y+60,20,70);
  ellipse(x+15,y+60,20,70);
  fill(0, 100, 100); 
  ellipse( x, y, 66, 90 );   /* monster */
  fill(100, 100, 100);
  ellipse(x,y-70,50,60);
  fill(0,0,0);
   arc(x, y-60, 25, 10, 0, PI+QUARTER_PI,CHORD);

  fill(10,10,10);
    ellipse(x+10,y-73,8,8);
  ellipse(x-10,y-73,8,8);
  fill(255, 255, 255);
  text( "James", x-10, y-20 );
  text(mouseX,50,50);
  text(mouseY,50,70);
}


//////// HANDLERS:  mouse clicks, keys
void mousePressed() {
  x=  mouseX;                             // Set (x,y) to mouse
  y=  mouseY;
  //
  dx=  random( -.6, +.5 );                  // random speed.
  dy=  random( -.6, +.5 );
}

void keyPressed() {
  if (key == 'q') {
    exit();                           // press 'q' key to QUIT.
  }
}










