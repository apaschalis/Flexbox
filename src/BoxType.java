

public abstract class BoxType {
	
  private double length;
  private double width;
  private double height;
  private int quantity;
  private String typeOfBox;
  private double price;
   
    public BoxType(String type) 
    {
     type=typeOfBox;
     	 	
    }
      public  double getLength() 
	  {
        return length;
    }
    
       public void setLength(double length) {
        this.length = length;
    }
    
    
    public double getWidth() {
        return width;
    }
    
      public void setWidth(double width) {
        this.width = width;
    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    
     public void setQuantity(int quantity)
    {
     this.quantity=quantity;
    }
    
    public int getQuantity()
    {
     return quantity;
    }
   public abstract double meterArea(); // declarations of abstract methods 
   public abstract double getPrice(); 
   public abstract void setPrice(double price);
   
   public void initalise()
   {
   	length = 0.0 ;
   	width = 0.0;
   	height = 0.0;
   	quantity = 1;
   }
    
    
}