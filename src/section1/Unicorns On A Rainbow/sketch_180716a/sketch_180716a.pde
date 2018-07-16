PImage rainbow;
PImage unicorn;
void setup(){
rainbow = loadImage("Wow.png");
size(800,600);
rainbow.resize(width,height);

unicorn = loadImage("Bat.png");
}
void draw(){
background(rainbow);
  image(unicorn, mouseX, mouseY);

}