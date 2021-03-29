package hust.soict.hedspi.lab01.Bai6.Bai6_3;
public class Calculate {
    public void cal(Double a, Double b, Double c) {
        Double delta = b*b - 4*a*c;
        if (delta == 0) {
            showResult opn = new showResult();
            opn.show(1, -b/2/a, 0d);
        } else if (delta < 0) {
            showResult opn = new showResult();
            opn.show(0, 0d, 0d);
        } else {
            showResult opn = new showResult();
            opn.show(2, (-b - Math.sqrt(delta))/2/a, (-b + Math.sqrt(delta))/2/a);
        }
    }
}
