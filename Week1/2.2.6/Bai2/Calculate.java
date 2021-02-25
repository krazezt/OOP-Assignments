public class Calculate {
    public void start(Double a11, Double a12, Double b1, Double a21, Double a22, Double b2) {
        Double d0 = a11*a22 - a12*a21, d1 = b1*a22 - b2*a12, d2 = b2*a11 - b1*a21;
        if (d0 != 0)
            {
                showResult opn = new showResult();
                opn.show(1, d1/d0, d2/d0);
            } else {
                if (d1 == 0 && d2 == 0) {
                    showResult opn = new showResult();
                    opn.show(2, 0d, 0d);
                } else {
                    showResult opn = new showResult();
                    opn.show(0, 0d, 0d);
                }
            }
    }
}
