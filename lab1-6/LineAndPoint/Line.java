public class Line {
    private Point start;
    private Point end;
    private double length;

    public void setStart(int x, int y) {
        this.start=new Point();
        this.start.setPoint(x,y);
    }

    public void setEnd(int x, int y) {
        this.end=new Point();
        this.end.setPoint(x,y);

    }
    public void calculateLength(){
        this.length=Math.sqrt(Math.pow((start.getX()-end.getX()),2)+Math.pow((start.getY()-end.getY()),2));
    }
    public void displayLength(){
        System.out.println("The Length of the Line with points Start"+"("+start.getX()+" , "+start.getY()+")"+" and End("+end.getX()+" , "+end.getY()+") is "
                +this.length);
    }
}
