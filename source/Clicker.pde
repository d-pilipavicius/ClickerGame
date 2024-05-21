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
void setup()
{
  size (800,800);
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
void draw()
{
  scrSwi();
  keySwi();
  if(frameCount%60==0)
  {
    cash += mps;
  }
}
