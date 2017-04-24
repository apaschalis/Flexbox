
import java.text.DecimalFormat;
import java.util.*;
import java.io.*;
class Order {
//declaring variables.

double area,price;
int gradeOfCard;
int quantity;
int colour;
boolean bottomReinforcement;
boolean cornerReinforcement;
boolean sealableTop;
DecimalFormat df = new DecimalFormat("#.##");

public Order (double a, int g,int q,int col,boolean b, boolean c, boolean s,double p)//constructor method
{
 a=area;
 g=gradeOfCard;
 q=quantity;
 col=colour;
 b=bottomReinforcement;
 c=cornerReinforcement;
 s=sealableTop; 
 p=price;

}



public String toString()// toString method
{
  return "Area" + "Grade Of Card: "+gradeOfCard+" Quantity: "+quantity+" Colour: "+colour+
 "BottomReinforcement: "+bottomReinforcement+" Corner Reinforcement: " + cornerReinforcement +" seaalableTop: "+sealableTop+" Price: "+df.format((price));
}









}