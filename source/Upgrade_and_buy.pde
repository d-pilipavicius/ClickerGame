void upgr2()
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
        mps += 0.1;
      }
      break;
    case 1:
      if(cash >= mr[t])
      {
        cash -= mr[t];
        mr[t] += 250*pri*upg[t];
        upg[t]++;
        mps += 0.6;
      }
      break;
    case 2:
      if(cash >= mr[t])
      {
        cash -= mr[t];
        mr[t] += 1000*pri*upg[t];
        upg[t]++;
        mps += 2.6;
      }
      break;
    case 3:
      if(cash >= mr[t])
      {
        cash -= mr[t];
        mr[t] += 5000*pri*upg[t];
        upg[t]++;
        mps += 12.5;
      }
      break;
    case 4:
      if(cash >= mr[t])
      {
        cash -= mr[t];
        mr[t] += 10000*pri*upg[t];
        upg[t]++;
        mps += 36.5;
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
void shopText()
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
          text("Upgr.: +" + int(upgval[row2*i+h])+"c/s",80+(width/row2)*h,140+(height /row2/2)*i);
        }
        else
        {
          text("Upgr.: +" + upgval[row2*i+h]+"c/s",80+(width/row2)*h,140+(height /row2/2)*i);
        }
      }
      else if(row2*i+h<20)
      {
        text("Upgr.: " + int(upgval[row2*i+h])+"c/c",80+(width/row2)*h,140+(height/row2/2)*i);
      }
    }
  }
  textSize(70);
}
void maxed()
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
