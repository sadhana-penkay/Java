class Rectangle{
  int length;
  int bredth;

  public void setDimentions(int l, int b)
  {
    length=l;
    bredth=b;
  }
  public void area()
  {
    System.out.println("Area of Reactangle ="+ (length *bredth));
  }
  public void perimeter()
  {
    System.out.println("Perimeter of Reactangle = "+ 2*(length+bredth));
  }
}