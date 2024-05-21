void scrSwi()
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
void keySwi()
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
