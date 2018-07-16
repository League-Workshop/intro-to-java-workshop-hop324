PImage mustache;
PImage Trump;
void setup(){
Trump = loadImage ("Trump.jpeg");
size(800,600);
Trump.resize(width,height);
mustache = loadImage("Smack.png");
}

void draw(){
background(Trump);
image(mustache, mouseX, mouseY);

}