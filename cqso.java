import java.util.Arrays;
import java.util.Locale;

public final class cqso extends cqsd {
    public int a;
    public String[] b;
    private int f;
    private int g;

    public cqso(String[] arr_s, cqrw cqrw0) {
        super(arr_s, 33, cqrw0);
    }

    @Override  // cqsd
    protected final void a(cqrw cqrw0) {
        this.f = cqrw0.b();
        this.g = cqrw0.b();
        this.a = cqrw0.b();
        this.b = cqrw0.f();
    }

    @Override  // cqsd
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof cqso) ? super.equals(object0) && this.f == ((cqso)object0).f && this.g == ((cqso)object0).g && bata.b(this.b, ((cqso)object0).b) && this.a == ((cqso)object0).a : false;
    }

    @Override  // cqsd
    public final int hashCode() {
        int v = Arrays.hashCode(new Object[]{((int)this.f), ((int)this.g), this.b, ((int)this.a)});
        return super.hashCode() * 0x1F + v;
    }

    @Override
    public final String toString() {
        return String.format(Locale.ROOT, "SRV: %s:%d (prio=%d, weight=%d)", cqso.d(this.b), ((int)this.a), ((int)this.f), ((int)this.g));
    }
}

