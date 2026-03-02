import j..util.Objects;
import java.util.Arrays;
import java.util.Locale;

public final class gpsa extends gprm {
    public int a;
    public String[] b;
    private int g;
    private int h;

    public gpsa(String[] arr_s, gprh gprh0, boolean z) {
        super(arr_s, 33, gprh0, z);
    }

    public gpsa(String[] arr_s, boolean z) {
        super(arr_s, 33, (z ? 0x8000 : 0) | 1, 0L, false, 0L);
    }

    @Override  // gprm
    protected final void a(gprh gprh0) {
        this.g = gprh0.b();
        this.h = gprh0.b();
        this.a = gprh0.b();
        this.b = gprh0.g();
    }

    @Override  // gprm
    protected final void b(gpri gpri0) {
        gpri0.d(this.g);
        gpri0.d(this.h);
        gpri0.d(this.a);
        gpri0.c(this.b);
    }

    @Override  // gprm
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof gpsa) ? super.equals(object0) && this.g == ((gpsa)object0).g && this.h == ((gpsa)object0).h && gpqj.b(this.b, ((gpsa)object0).b) && this.a == ((gpsa)object0).a : false;
    }

    @Override  // gprm
    public final int hashCode() {
        int v = Objects.hash(new Object[]{((int)this.g), ((int)this.h), Arrays.hashCode(gpqj.d(this.b)), ((int)this.a)});
        return super.hashCode() * 0x1F + v;
    }

    @Override
    public final String toString() {
        return String.format(Locale.ROOT, "SRV: %s:%d (prio=%d, weight=%d)", gpsa.e(this.b), ((int)this.a), ((int)this.g), ((int)this.h));
    }
}

