void setup(){
  size(800,800);
}
void draw(){
  fill(#08FAF8);
  if(mousePressed){
    fill(#6B3CF0);
  }
  ellipse(mouseX,mouseY,20,20);
}