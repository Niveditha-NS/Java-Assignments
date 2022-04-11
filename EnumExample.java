import java.util.EnumSet;


class EnumExample{
    enum Size{
        FIVE,SIX,SEVEN,EIGHT
    }
    public static void main(String[] args) {
        EnumSet<Size> sizes=EnumSet.allOf(Size.class);
        System.out.println(sizes);
        EnumSet<Size> sizes2=EnumSet.noneOf(Size.class);
        sizes2.add(Size.SEVEN);
        System.out.println(sizes2);
        
    }
}