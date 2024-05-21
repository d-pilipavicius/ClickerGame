import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Clicker extends PApplet {

String money = "";
int monsh = 1;
boolean cheats = false;
double gpc = 1;
double mps = 0;
double cash = 0;
int cashtxt;
int mx,my;
int scr = 1;
boolean pr = true;
PImage clicked;
public void setup()
{
  
  frameRate(60);
  imageMode(CENTER);
  textSize(70);
  ellipseMode(CENTER);
  clicked = loadImage("clicked.png");
  gameDraw1();
  upg = new int[unr];
  for(int i = 0; i < unr; i++)
  {
    upg[i] = 0;
  }
}
public void draw()
{
  scrSwi();
  keySwi();
  if(frameCount%60==0)
  {
    cash += mps;
  }
}
boolean in = false;
public void screen1()
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
public void gameDraw1()
{
  background(0xff38ACEC);
  fill(0);
  textAlign(CENTER,CENTER);
  text(PApplet.parseInt(cash / monsh+"") + money,width / 2,height / 4);
  image(clicked,width/2,width/2); 
}
public void inc1()
{
  cash = cash + gpc;
}
public void circleCheck1()
{
  mx = mouseX;
  my = mouseY;
  if(PApplet.parseInt(sqrt(sq(mx - (width / 2)) + sq(my - (height / 2)))) <= 108)
  {
    in = true;
  }
  else
  {
    in = false; 
  }
}
public void testBound1()
{
  noFill();
  ellipse(width / 2,height / 2,216,216);
  text(PApplet.parseInt(sqrt(sq(mx - (width / 2)) + sq(my - (height / 2)))),0,100);
  line(width / 2,height / 2,mx,my);
}
int row2 = 5;
int col2 = 10;
int unr = (col2-1)*row2;
int rx,cy;
float pri = 0.5f;
int t;
public void screen2()
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
public void gameDraw2()
{
  background(0xff38ACEC);
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
  text(PApplet.parseInt(cash / monsh+"") + money,width/row2/4,height/col2/2);
  textSize(70);
}
public void rcCheck()
{
  if(mouseX > mouseY / col2)
  {
    rx = mouseX / (width / row2);
    cy = mouseY / (height / col2)-1;
  }
}
public void scrSwi()
{
  switch(scr)
  {
    case 1:
      screen1();
      break;
    case 2:
      screen2();
      break;
  }
}
public void keySwi()
{
  switch(key)
  {
    case '1':
      scr = 1;
      break;
    case '2':
      scr = 2;
      break;
    case 'c':
      cheats = true;
      break;
    case 'x':
      cheats = false;
      break;
  }
if(cash >= 1000000000)
{
  money = "B";
  monsh = 1000000000;
}
else if(cash >= 1000000 || (cash < 1000000000 && cash >= 1000000))
{
  money = "M";
  monsh = 1000000;
}
else if(cash >= 10000 || (cash < 1000000 && cash >= 10000)) 
{
  money = "K";
  monsh = 1000;
}
else if(cash < 10000)
{
  money = "";
  monsh = 1;
}
}
public void upgr2()
{
  t = cy*row2+rx;
  switch(t)
  {
    case 0:
      if(cash >= mr[t])
      {
        cash -= mr[t];
        mr[t] = mr[t]+ 50*pri*upg[t];
        upg[t]++;
        mps += 0.1f;
      }
      break;
    case 1:
      if(cash >= mr[t])
      {
        cash -= mr[t];
        mr[t] += 250*pri*upg[t];
        upg[t]++;
        mps += 0.6f;
      }
      break;
    case 2:
      if(cash >= mr[t])
      {
        cash -= mr[t];
        mr[t] += 1000*pri*upg[t];
        upg[t]++;
        mps += 2.6f;
      }
      break;
    case 3:
      if(cash >= mr[t])
      {
        cash -= mr[t];
        mr[t] += 5000*pri*upg[t];
        upg[t]++;
        mps += 12.5f;
      }
      break;
    case 4:
      if(cash >= mr[t])
      {
        cash -= mr[t];
        mr[t] += 10000*pri*upg[t];
        upg[t]++;
        mps += 36.5f;
      }
      break;
    case 5:
      if(cash >= mr[t])
      {
        cash -= mr[t];
        mr[t] += 25000*pri*upg[t];
        upg[t]++;
        mps += 85;
      }
      break;
    case 6:
      if(cash >= mr[t])
      {
        cash -= mr[t];
        mr[t] += 100000*pri*upg[t];
        upg[t]++;
        mps += 250;
      }
      break;
    case 7:
      if(cash >= mr[t])
      {
        cash -= mr[t];
        mr[t] += 500000*pri*upg[t];
        upg[t]++;
        mps += 1250; 
      }
      break;
    case 8:
      if(cash >= mr[t])
      {
        cash -= mr[t];
        mr[t] += 1000000*pri*upg[t];
        upg[t]++;
        mps += 3250;
      }
      break;
    case 9:
      if(cash >= mr[t])
      {
        cash -= mr[t];
        mr[t] += 5000000*pri*upg[t];
        upg[t]++;
        mps += 15000;
      }
      break;
    case 10:
      if(cash >= mr[t] && upg[t]==0 && gpc<2)
      {
        cash -= mr[t];
        upg[t]=1;
        gpc = 2;
      }
    case 11:
      if(cash >= mr[t] && upg[t]==0 && gpc<5)
      {
        cash -= mr[t];
        upg[t]=1;
        gpc = 5;
      }
    case 12:
      if(cash >= mr[t] && upg[t]==0 && gpc<10)
      {
        cash -= mr[t];
        upg[t]=1;
        gpc = 10;
      }
    case 13:
      if(cash >= mr[t] && upg[t]==0 && gpc<20)
      {
        cash -= mr[t];
        upg[t]=1;
        gpc = 20;
      }
    case 14:
      if(cash >= mr[t] && upg[t]==0 && gpc<50)
      {
        cash -= mr[t];
        upg[t]=1;
        gpc = 50;
      }
    case 15:
      if(cash >= mr[t] && upg[t]==0 && gpc<100)
      {
        cash -= mr[t];
        upg[t]=1;
        gpc = 100;
      }
    case 16:
      if(cash >= mr[t] && upg[t]==0 && gpc<200)
      {
        cash -= mr[t];
        upg[t]=1;
        gpc = 200;
      }
    case 17:
      if(cash >= mr[t] && upg[t]==0 && gpc<500)
      {
        cash -= mr[t];
        upg[t]=1;
        gpc = 500;
      }
    case 18:
      if(cash >= mr[t] && upg[t]==0 && gpc<1000)
      {
        cash -= mr[t];
        upg[t]=1;
        gpc = 1000;
      }
    case 19:
      if(cash >= mr[t] && upg[t]==0 && gpc<2000)
      {
        cash -= mr[t];
        upg[t]=1;
        gpc = 2000;
      }
  }
}
public void shopText()
{
  textSize(15);
  for(int i = 0; i < col2; i++)
  {
    for(int h = 0; h < row2; h++)
    {
      fill(0);
      text("Cost: " + mr[row2*i+h],80+(width/row2)*h,100+(height /row2/2)*i);
      if(row2*i+h<10)
      {
        if(upgval[row2*i+h]%1==0)
        {
          text("Upgr.: +" + PApplet.parseInt(upgval[row2*i+h])+"c/s",80+(width/row2)*h,140+(height /row2/2)*i);
        }
        else
        {
          text("Upgr.: +" + upgval[row2*i+h]+"c/s",80+(width/row2)*h,140+(height /row2/2)*i);
        }
      }
      else if(row2*i+h<20)
      {
        text("Upgr.: " + PApplet.parseInt(upgval[row2*i+h])+"c/c",80+(width/row2)*h,140+(height/row2/2)*i);
      }
    }
  }
  textSize(70);
}
public void maxed()
{
  for(int i = 2; i < 4; i++)
  {
    for(int j = 0; j < 5; j++)
    {
      if(i==3 && upg[row2*i+j] == 1)
      {
        stroke(0);
        fill(0,200,0);
        for(int y = 0; y < 5; y++)
        {
          rect(y*width/row2,(3)*height/col2,width/row2,height/col2);
        }
        for(int y = 0; y<=j; y++)
        {
          rect(y*width/row2,(i+1)*height/col2,width/row2,height/col2);
        }
      }
      else if(upg[row2*i+j] == 1)
      {
        stroke(0);
        fill(0,200,0);
        for(int y = 0; y<=j; y++)
        {
          rect(y*width/row2,(i+1)*height/col2,width/row2,height/col2);
        }
      }
    }
  }
}
float[] mr = 
{50,250,1000,5000,10000,25000,100000,500000,1000000,5000000,
500,1000,2500,5000,10000,37500,75000,400000,800000,2000000,
-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,
-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,
-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,
-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,
-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,
-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,
-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,
-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,};
int[] upg;
float upgval[] = 
{0.1f,0.6f,2.6f,12.5f,36.5f,85,250,1250,3250,15000,
2,5,10,20,50,100,200,500,1000,2000};
  public void settings() {  size (800,800); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Clicker" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
