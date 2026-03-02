public final class fvgn {
    public final double a;
    public final double b;
    public final double c;

    public fvgn(double f, double f1, double f2) {
        boolean z = true;
        gftb.checkTrue(Double.compare(f, -3.2) > 0);
        gftb.checkTrue(f < 3.2);
        gftb.checkTrue(f1 > -3.2);
        if(f1 >= 3.2) {
            z = false;
        }
        gftb.checkTrue(z);
        this.a = f;
        this.b = f1;
        this.c = f2;
    }
}

