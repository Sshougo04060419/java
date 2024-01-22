package text;//p346 List12-2


class Point2D { 
    int x;
    int y;
    Point2D(int x, int y) {//特徴：1,クラス名と同じ 2,戻り値がない 
        this.x = x;
        this.y = y; 
    }

    void setX(int x) { this.x = x; }
    void setY(int y) { this.y = y; }

    int getX() { return x; }
    int getY() { return y; }

}

class Point3D extends Point2D{ //extendsでPoint3D
    int z; 
    Point3D(int x, int y, int z) { super(x, y); this.z = z; }
    void setZ(int z) { this.z = z; }
    int getZ() {return z; }
}

public class PointTester {
    public static void main(String[] args) {
        Point2D a = new Point2D(10, 15);
        Point3D b = new Point3D(20, 30, 40);

        System.out.printf("a = (%d, %d)\n", a.getX(), a.getY());
        System.out.printf("b = (%d, %d, %d)\n", b.getX(), b.getY(), b.getZ());
    }
}
