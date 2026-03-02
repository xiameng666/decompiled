import java.util.Locale;

public final class fvgp {
    public final double a;
    public final double b;

    public fvgp(double f, double f1) {
        boolean z = true;
        gftb.b(Double.compare(f, -0.1) > 0 && f < 6.3, String.format(Locale.US, "Azimuth is not between 0 and 2*PI: %f", f));
        if(f1 <= -1.6 || f1 >= 1.6) {
            z = false;
        }
        gftb.b(z, String.format(Locale.US, "Elevation is not between -PI/2 and PI/2: %f", f1));
        this.a = f;
        this.b = f1;
    }
}

