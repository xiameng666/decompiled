import j..util.Objects;
import java.util.function.Function;

public final class ardq implements glzn {
    public final ardu a;
    public final long b;
    public final Function c;

    public ardq(ardu ardu0, long v, Function function0) {
        this.a = ardu0;
        this.b = v;
        this.c = function0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        long v = this.b;
        if(Long.compare(v, 0L) == 0) {
            return gmbx.a;
        }
        Function function0 = this.c;
        ardu ardu0 = this.a;
        if(((long)(((Long)object0))) == v) {
            Objects.requireNonNull(function0);
            ardr ardr0 = new ardr(function0);
            return ardu0.a.b(ardr0, gmap.a);
        }
        ards ards0 = new ards(function0);
        return ardu0.a.b(ards0, gmap.a);
    }
}

