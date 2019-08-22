public class Point {
    private OrderedPair<Integer> orderedPair;

    public Point(Integer x, Integer y){
        this.orderedPair = new OrderedPair<>(x,y);
    }

    public int getX(){
        return this.orderedPair.getFirst().intValue();
    }

    public int getY(){
        return this.orderedPair.getSecond().intValue();
    }

    public void translate(Integer x, Integer y){
        this.orderedPair.setFirst(this.getX() + x);
        this.orderedPair.setSecond(this.getY() + y);
    }

    public double distance(Integer x, Integer y){
        return Math.sqrt( Math.pow(this.getX()-x,2) + Math.pow(this.getY()-y,2) );
    }

    public String toString(){
        return "("+this.getX()+","+this.getY()+")";
    }
}
