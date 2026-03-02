import java.util.Map;

public final class eyab implements ibts {
    public final Map a;
    public final long b;

    public eyab(Map map0, long v) {
        this.a = map0;
        this.b = v;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        try(owg owg0 = ((oxi)object0).a("\n    UPDATE EnrolledDevice\n    SET pdRangingMethodStateMap = ?\n    WHERE id =?\n    ")) {
            owg0.h(1, exsy.d(this.a));
            owg0.f(2, this.b);
            owg0.k();
        }
        return ibom.a;
    }
}

