interface Polygon{
    void getArea();
}

class Rectangle implements Polygon{
    public void getArea(){
        int length=10, breadth=10;
        int area=length*breadth;
        System.out.println(area);
    }
}

class Shape
{
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.getArea();
    }
}