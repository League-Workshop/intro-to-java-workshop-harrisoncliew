PImage mustache;
PImage superman;
void setup(){
  superman = loadImage("superman.jpg");
  size(1100,600);
  superman.resize(width,height);
  mustache = loadImage("mustache.png");
  mustache.resize(200,100);
  
}

void draw(){background(superman);
image(mustache, mouseX,mouseY);
  
}