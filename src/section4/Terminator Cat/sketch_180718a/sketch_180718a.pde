PImage catPic;
void setup(){
catPic = loadImage("cutcat.jpeg");
catPic.resize(width,height);
background(catPic);
size(800, 600);
}
void draw(){
if(mousePressed){
println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");}
}