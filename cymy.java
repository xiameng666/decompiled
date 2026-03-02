import java.text.SimpleDateFormat;
import java.util.Locale;

final class cymy {
    public static final SimpleDateFormat a;
    public final fgta b;
    public final long c;
    public long d;
    public final boolean e;
    public final cymw f;
    public final boolean g;
    private long h;

    static {
        cymy.a = new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);
    }

    public cymy(fgta fgta0, long v, float f, boolean z, cymw cymw0) {
        this.b = fgta0;
        this.c = v;
        this.d = v;
        this.e = z;
        this.f = cymw0;
        this.g = cymy.b(f);
        this.h = v;
    }

    public final boolean a(fgta fgta0, cymw cymw0, long v, float f, boolean z) {
        if(this.b.equals(fgta0) && this.e == z && this.f == cymw0 && (z || v - this.d <= hvpg.q())) {
            this.d = v;
            if(this.g) {
                return cymy.b(f);
            }
            if(cymy.b(f)) {
                return v - this.h < hvpg.a.aY().cv();
            }
            this.h = v;
            return true;
        }
        return false;
    }

    private static boolean b(float f) {
        return ((double)f) > hvpg.a.aY().l();
    }

    @Override
    public final String toString() {
        String s = cymy.a.format(Long.valueOf(this.c));
        String s1 = cymy.a.format(Long.valueOf(this.d));
        cymw cymw0 = this.f;
        cymw cymw1 = cymw.c;
        if(cymw0 != cymw1) {
            cymw1 = this.b.toString() + (this.g ? ", OutOfRange" : ", InRange") + (this.e ? ", fromEventStream" : "") + ", " + cymw0;
        }
        return s + " - " + s1 + ", " + cymw1;
    }
}

