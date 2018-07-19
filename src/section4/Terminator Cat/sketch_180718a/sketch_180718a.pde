PImage catPic;
int x1 = 449;
int x2 = 599;
int y1 = 263;
int y2 = 255;
int acceleration = 5;
void setup(){
catPic = loadImage("cutcat.jpeg");
catPic.resize(width,height);
background(catPic);
size(800, 600);
}
void draw(){
if(mousePressed){
println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");
}
fill(#E83F3F);
noStroke();
ellipse(x1, y1, 50, 50);
ellipse(x2, y2, 50, 50);
}
void keyPressed() {
        x1++;
  y1++;
  x2++;
  y2++;
  if(x1 > width){
  background(catPic);
  x1 = 449;
 x2 = 599;
 y1 = 263;
 y2 = 255;
 acceleration = 1;
  }
}