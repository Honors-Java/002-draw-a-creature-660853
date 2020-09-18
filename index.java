void setup() {
	size(400, 400);
}

void draw() {
  background(255);
  ellipseMode(CENTER);
  ellipse(mouseX, mouseY, 1, 1);
  println(mouseX, mouseY);
  rectMode(CENTER);
 
  //Make a creature!!! 
  //all of your programming should be after this 👍
fill(255);
ellipse(160,110,220,220);
//the face
fill(255,0,0);
ellipse(125,60,25,25);
ellipse(200,60,25,25);
//the eyes
fill(0);
rect(120,25,40,10);
rect(195,25,40,10);
//the eyebrows
fill(139,75,75);
rect(125,145,10,40);
rect(165,130,85,10);
rect(205,145,10,40);
//the mouth
fill(175,30,30);
ellipse(125,60,8,8);
ellipse(200,60,8,8);
//the pupils
fill(215,145,25);
ellipse(80,100,10,10);
ellipse(175,50,10,10);
ellipse(180,190,10,10);
ellipse(80,60,10,10);
ellipse(220,130,10,10);
//bumps on face
fill(140,75,75)
rect(160,240,60,55);
//the body
line(130,268,90,400);
line(190,268,350,500);
//the legs





  
 
  
  
 

  
 
	

}