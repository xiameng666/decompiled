import android.util.Rational;
import android.util.Size;

final class bqr {
    public final Rational a;
    public final boolean b;
    private final int c;
    private final int d;

    public bqr(bik bik0, Rational rational0) {
        this.c = bik0.b();
        this.d = bik0.a();
        this.a = rational0;
        this.b = rational0 == null || rational0.getNumerator() >= rational0.getDenominator();
    }

    public final Size a(bko bko0) {
        int v = bko0.P();
        Size size0 = bko0.O();
        if(size0 != null) {
            switch(bnk.a(bnk.b(v), this.c, this.d == 1)) {
                case 90: 
                case 270: {
                    return new Size(size0.getHeight(), size0.getWidth());
                }
                default: {
                    return size0;
                }
            }
        }
        return null;
    }
}

