public class func1 {
    public static void main(String[] args){
        System.out.println(add(23,34));
        String RES = location("Assam");
        System.out.println(RES);
    }
    static int add(int x,int y){
        return x+y;
    }
    static String location(String location_name){
        return location_name+" Guwahati";
    }
}
