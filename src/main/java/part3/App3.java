package part3;

public class App3 {
    public static void main(String[] args) {
        Shape[] a = new Shape[] {new Shape(), new Triangle(), new Circle(), new Rectangle()};

        for(int i = 0; i < a.length; i++) {
            a[i].draw();
        }
    }
}
