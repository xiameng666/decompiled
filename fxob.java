import android.location.Location;
import java.util.Locale;

public final class fxob {
    public static final fxob a;
    public final fxoa b;
    public final int c;

    static {
        fxnz fxnz0 = new fxnz();
        fxnz0.a = new Location("none");
        fxnz0.b(-1);
        fxnz0.c(-1L);
        fxob.a = new fxob(0, fxnz0.a());
    }

    public fxob(int v, fxoa fxoa0) {
        this.c = v;
        this.b = fxoa0;
    }

    public final boolean a() {
        return this.c == 1;
    }

    public final boolean b() {
        return this.c == 2;
    }

    @Override
    public final String toString() {
        return String.format(Locale.getDefault(), "area: %s state: %d", this.b, ((int)this.c));
    }
}

