boolean in = false;
void screen1()
{
  circleCheck1();
  gameDraw1();
  //testBound1();
  text("V 1.01",100,height-60);
  if((mousePressed && pr && in)/* || (mousePressed && cheats)*/)
  {
    inc1();
    pr = false;
  }
  else if(mousePressed == false && pr == false)
  {
    pr = true;
  }
  if(cheats && mousePressed && in)
  {
    cash = 999999999;
  }
}
void gameDraw1()
{
  background(#38ACEC);
  fill(0);
  textAlign(CENTER,CENTER);
  text(int(cash / monsh+"") + money,width / 2,height / 4);
  image(clicked,width/2,width/2); 
}
void inc1()
{
  cash = cash + gpc;
}
void circleCheck1()
{
  mx = mouseX;
  my = mouseY;
  if(int(sqrt(sq(mx - (width / 2)) + sq(my - (height / 2)))) <= 108)
  {
    in = true;
  }
  else
  {
    in = false; 
  }
}
void testBound1()
{
  noFill();
  ellipse(width / 2,height / 2,216,216);
  text(int(sqrt(sq(mx - (width / 2)) + sq(my - (height / 2)))),0,100);
  line(width / 2,height / 2,mx,my);
}
