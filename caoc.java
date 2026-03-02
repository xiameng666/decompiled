import java.util.List;

public final class caoc implements glzn {
    public final caod a;
    public final boolean b;
    public final gops[] c;
    public final List d;

    public caoc(caod caod0, boolean z, gops[] arr_gops, List list0) {
        this.a = caod0;
        this.b = z;
        this.c = arr_gops;
        this.d = list0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        if(this.b && !((Boolean)object0).booleanValue()) {
            evql evql0 = this.a.b.g(this.c);
            return this.a.b(evql0, this.d, this.c, false);
        }
        return gmbu.i(((Boolean)object0));
    }
}

