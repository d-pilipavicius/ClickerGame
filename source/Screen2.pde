int row2 = 5;
int col2 = 10;
int unr = (col2-1)*row2;
int rx,cy;
float pri = 0.5;
int t;
void screen2()
{
  gameDraw2();
  shopText();
  maxed();
  if(mousePressed && pr)
  {
    rcCheck();
    upgr2();
    pr = false;
  }
  else if(mousePressed != true && pr != true)
  {
    pr = true;
  }
}
void gameDraw2()
{
  background(#38ACEC);
  for(int i = 0; i < col2; i++)
  {
    for(int j = 0; j < row2; j++)
    {
      if(i == 0)
      {
        noStroke();
        fill(0,180,0);
        rect(0,0,width,height / col2);
        textAlign(CENTER,CENTER);
        fill(0);
        text("Upgrade shop",width / 2,height / col2 / 3);
        textSize(20);
        fill(0);
        text("Cpc: " + gpc,width / 10 * 9,height / col2 / 2);
        textSize(70);
      }
      else
      {
        fill(50,255,50);
        stroke(0);
        rect(j * width / row2,i * height / col2,width / row2,height / col2);
      }
    }
  }
  textSize(30);
  textAlign(CENTER,CENTER);
  fill(0);
  text(int(cash / monsh+"") + money,width/row2/4,height/col2/2);
  textSize(70);
}
void rcCheck()
{
  if(mouseX > mouseY / col2)
  {
    rx = mouseX / (width / row2);
    cy = mouseY / (height / col2)-1;
  }
}
