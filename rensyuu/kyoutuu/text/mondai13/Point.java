package text.mondai13;

public class Point extends shape {
    
    public Point() {
    }
    
        @Override public String toString() {
            return "Point";
        }

        @Override public void draw() {
            System.out.println('+');
        }
    }
