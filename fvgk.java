import java.util.Locale;

public final class fvgk {
    public final fvgr a;
    public final fvgr b;
    public final double c;
    public final double d;

    public fvgk(fvgj fvgj0) {
        this.a = fvgj0.a;
        this.b = fvgj0.b;
        this.c = fvgj0.c;
        this.d = fvgj0.d;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("GnssSatellitePvt<\n");
        fvgr fvgr0 = this.a;
        if(fvgr0 != null) {
            stringBuilder0.append(String.format(Locale.US, "posEcefM: %s\n", fvgr0));
        }
        fvgr fvgr1 = this.b;
        if(fvgr1 != null) {
            stringBuilder0.append(String.format(Locale.US, "velEcefMps: %s\n", fvgr1));
        }
        stringBuilder0.append("clkBiasM: ");
        stringBuilder0.append(this.c);
        stringBuilder0.append("\nclkDriftMps: ");
        stringBuilder0.append(this.d);
        stringBuilder0.append("\n>");
        return stringBuilder0.toString();
    }
}

