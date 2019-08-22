class Main {
  public static void main(String[] args) {
    Point A= new Point(15,4);
    System.out.println("After constructor Point A is: "+A);
    A.translate(5,16);
    System.out.println("After translate Point A should be (20,20): "+A);
    Double theDistance= A.distance(40,30);
    System.out.println("The distance between Point A and (40,30) should be approx 22.36 "+theDistance);
  }
}