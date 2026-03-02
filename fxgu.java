import j..util.Objects;
import java.util.Locale;

public final class fxgu extends smz implements fxnv {
    public final long a;
    public final fxgy b;
    public final int c;
    private final gxnv d;

    public fxgu(long v, fxgy fxgy0, int v1, gxnv gxnv0) {
        this.a = v;
        this.b = fxgy0;
        this.c = v1;
        this.d = gxnv0;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof fxgu) && this.c == ((fxgu)object0).c && this.a == ((fxgu)object0).a && Objects.equals(this.b, ((fxgu)object0).b) && Objects.equals(this.d, ((fxgu)object0).d);
    }

    @Override
    public final int hashCode() {
        return ((this.c * 0x1F + ((int)(this.a ^ this.a >>> 0x20))) * 0x1F + Objects.hashCode(this.b)) * 0x1F + Objects.hashCode(this.d);
    }

    @Override
    public final String toString() {
        return String.format(Locale.getDefault(), "teNanos=%d svHints=%s svR=%d", ((long)this.a), this.b, ((int)this.c));
    }
}

