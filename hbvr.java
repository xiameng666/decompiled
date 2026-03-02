import java.util.Arrays;
import java.util.List;

public final class hbvr {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final int[] f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    private final List n;
    private final hbvq o;

    static {
        new hbvr(new hbvp());
    }

    public hbvr(hbvp hbvp0) {
        this.n = null;
        boolean z = true;
        this.a = 1;
        this.b = true;
        this.c = true;
        this.d = hbvp0.a;
        this.e = hbvp0.b;
        this.f = hbvp0.c;
        this.o = null;
        this.g = hbvp0.d;
        this.h = hbvp0.f;
        this.i = hbvp0.g;
        this.j = hbvp0.h;
        this.k = hbvp0.i;
        this.l = hbvp0.j;
        if(hbvp0.k.isPresent()) {
            z = ((Boolean)hbvp0.k.get()).booleanValue();
        }
        else if(hbvp0.e != 1) {
            z = false;
        }
        this.m = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof hbvr) ? bata.b(null, null) && this.d == ((hbvr)object0).d && this.e == ((hbvr)object0).e && Arrays.equals(this.f, ((hbvr)object0).f) && bata.b(null, null) && this.g.equals(((hbvr)object0).g) && this.h == ((hbvr)object0).h && this.i == ((hbvr)object0).i && this.j == ((hbvr)object0).j && this.k == ((hbvr)object0).k && this.l == ((hbvr)object0).l && this.m == ((hbvr)object0).m : false;
    }

    @Override
    public final int hashCode() {
        Boolean boolean0 = Boolean.valueOf(true);
        Integer integer0 = Arrays.hashCode(this.f);
        return Arrays.hashCode(new Object[]{0, ((int)1), boolean0, boolean0, Boolean.valueOf(this.d), ((int)this.e), integer0, 0, this.g, Boolean.valueOf(this.h), Boolean.valueOf(this.i), Boolean.valueOf(this.j), Boolean.valueOf(this.k), Boolean.valueOf(this.l), Boolean.valueOf(this.m)});
    }
}

