//define
int r,g,b;
float buttonX = 200, buttonY = 200, buttonW = 100, buttonH = 50;
int counter = 0;
boolean hit( float x1, float y1, float x2, float y2, float w, float h){
  boolean result;
  
  if ( abs(x1-x2) < w && abs(y1-y2)<h ){
  result = true;
  }
  else{
  result = false;
  }
  
  return result;
  
}

//set up size and color

void setup(){
  size (800, 400);
  home();
}

void home(){
  r = 245;
  g = 0;               // pink
  b = 231;
}

//button details
void draw(){  
  background( r,g,b);
  showButton( buttonX, buttonY, buttonW, buttonH);
  fill( 0, 242, 30); //baby blue
  text("hold H, has step 2", buttonX + buttonW / 4, buttonY + buttonH * 2/3);
}
//draw the button
void showButton( float x , float y , float w, float h){
  fill(0, 22, 242);// dark blue
  rect( x, y, w, h);
}

//action for key press

void keyPressed(){
  if ( key == 'q') exit();
  if ( key == 'r'){
    fill(255);
    text("press h", 50,50);
  };
 if (key == 'h'){
   counter = counter +1;
   if (counter % 2 > 0) {
      r = 0;
      g = 0;
      b = 227;
      fill(255);
      text("SQUEEZE THE BOX BOII", 100,100);
      } 
    else {
      home();
      }
 } 
}

// action for button press
void mousePressed(){
  if ( hit( mouseX, mouseY, buttonX, buttonY, buttonW, buttonH ) ){
    counter = counter +1;
    if (counter % 2 > 0) {
      r = 0;
      g = 229;
      b = 227;
    }
    else {
      home();
      }
  }
}
