import java.text.DecimalFormat;

public class FlexBox extends BoxType {
  private  int gradeOfCard;
  private  int colourPrint;
  private  boolean reinforcedBottom;
  private  boolean reinforcedCorners;
  private  boolean sealableTops;
  private double price;


    public FlexBox(int g, int c, boolean rB, boolean rC, boolean sT) {
        super("Cardboard Box");
        gradeOfCard = g;
        colourPrint = c;
        reinforcedBottom = rB;
        reinforcedCorners = rC;
        sealableTops = sT;

    }
    
    public FlexBox()
    {
     super("Cardboard Box");// send string to super class BoxTypes.
    }

     public void initalise() // set values to 0.
    {
       super.initalise();
       gradeOfCard = 0;
       colourPrint = 0;
       reinforcedBottom = false;
       reinforcedBottom = false;
       sealableTops = false;

    }
 

    //public abstract void GOfCard(int GradeOfCard);
   // public abstract double Colour();
   // public abstract void STops();
   // public abstract void
   // RBottom(boolean ReinforcedBottom);
   // public abstract void RCorners(boolean ReinforcedCorners);
    // public abstract void MeterQuant(int MeterQuantity);
   // public abstract void Quant(int Quantity);


   public double meterArea() //work out area
   {
   	return((getWidth() * getLength())+(getWidth() * getHeight() * 2) + (getLength() * getHeight() * 2));
   }

    public double cardPrice()//work out basic cost.
    {
    
     if (gradeOfCard == 1)
     {
     	price += meterArea()*0.45;
     	setPrice(price);
      
     }
     
     if (gradeOfCard == 2)
     {
      price +=meterArea()*0.59;
     setPrice(price);
     
     }
     
     if (gradeOfCard == 3)
     {
       price +=meterArea()*0.68;
      setPrice(price);
      
     }
     
     if (gradeOfCard == 4)
     {
       price +=meterArea()*0.92;
     setPrice(price);
  
     }
     
     if (gradeOfCard == 5)
     {
     price +=meterArea()*1.30;
     setPrice(price);
      
     }
      return price;
    }
    
    public double additionalCosts() // work out additional cost.
    {
    	
     if (sealableTops == true)
     {
       price += price*0.05;
     }
     
     if (reinforcedBottom == true)
     {
      price += price*0.10;
      }
     
     if (reinforcedCorners == true)
     {
      price += price * 0.07;
     }
     
     if (colourPrint == 1)
     {
      price += price * 0.12;
     }
     
     if(colourPrint == 2)
     {
       price += price * 0.15;	
     }
     return price;
     
    }
    
   /* public double quantityPrice ()
    {
     return getQuantity()*cardPrice();
    }*/

  // set and get methods declared. 
    
    public void setGradeOfCard(int gradeOfCard)
    {
    
       this.gradeOfCard=gradeOfCard;
    }

    public int getGradeOfCard()
    {
     return gradeOfCard;
    }

     public void setColour(int colourPrint)
    {
    	
     this.colourPrint=colourPrint;
    }
    
    public int getColour()
    {
     return colourPrint;
    }
    
   
    public void setReinforcedCorners(boolean reinforcedCorners)
    {
     this.reinforcedCorners=reinforcedCorners;
    }
    
    public boolean getReinforcedCorners()
    {
     return reinforcedCorners;
    }
    
    public void setReinforcedBottom(boolean reinforcedBottom)
    {
     this.reinforcedBottom=reinforcedBottom;
    }
    
    public boolean getReinforcedBottom()
    {
     return reinforcedBottom;
    }
    
    public void setSealableTop(boolean sealableTops)
    {
     this.sealableTops=sealableTops;
    }
    
    public boolean getSealableTop()
    {
     return sealableTops;
    }
    
   
      public  double getLength() 
	  {
	  	
        return super.getLength();
    }
    
       public void setLength(double length) {
        super.setLength(length);
        //this.length = length;
    }
    
    
    public double getWidth() {
        return super.getWidth();
    }
    
      public void setWidth(double width)
      	 {
      	 super.setWidth(width);
       // this.width = width;
    }


    public double getHeight() {
        return super.getHeight();
    }

    public void setHeight(double height)
    {	
    	super.setHeight(height); 
     //   this.height = height;
    }
    
    
     public void setQuantity(int quantity)
    {
    super.setQuantity(quantity);
     //this.quantity=quantity;
    }
    
    public int getQuantity()
    {
     return super.getQuantity();
    }
    
    public double getPrice()
    {
     return price;
    }
    
   
    public void setPrice(double price)
    {
     this.price = price;
    }
 
    
    
    public String chooseBoxType()
    {
        if (gradeOfCard >= 1 && gradeOfCard<=3 && colourPrint == 0  &&  reinforcedBottom == false && reinforcedCorners == false) 
        {
         return "Card Type I (1) chosen";
        }
        
        if  (gradeOfCard >= 2 && gradeOfCard<=4  && colourPrint == 1  && reinforcedBottom == false && reinforcedCorners == false) 
        {
          return "Card Type II (2) chosen";
        }
        
        if (gradeOfCard >= 2 && gradeOfCard<=5 && colourPrint == 2 && reinforcedBottom == false && reinforcedCorners == false )
        {
         return "Card Type III (3) chosen";
        }
        
          
       if (gradeOfCard >= 2 && gradeOfCard<=5 && colourPrint == 2 && reinforcedBottom == true && reinforcedCorners == false)
        {
         return "Card Type IV (4) chosen";
        }
        
       if (gradeOfCard >= 2 && gradeOfCard<=5 && colourPrint == 2 && reinforcedBottom == true && reinforcedCorners == true)
        {
          return "Card Type V (5) chosen";
        }
        return "Box does not exist";
    }
     public String toString()
    {
     return "The length is: " +getLength()+" The Width is: "+getWidth()+" The Height is: "+getHeight()+"\n The grade of card is:"+getGradeOfCard()+"  The Colour print is: "+getColour()+" \n The quantity is:   "
     +getQuantity()+" Sealable top is:   "+getSealableTop()+ " \n Reinforced Bottom is:   "+ getReinforcedBottom()+"  Reinforced Corner is:   "+getReinforcedCorners() + "Price"+getPrice();
    }

}
