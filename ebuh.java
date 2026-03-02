import j..util.Collection.-EL;
import java.util.List;

public final class ebuh implements evqk {
    public final ebup a;
    public final List b;

    public ebuh(ebup ebup0, List list0) {
        this.a = ebup0;
        this.b = list0;
    }

    @Override  // evqk
    public final evql a(Object object0) {
        List list0 = (List)Collection.-EL.stream(this.b).map(new ebum(((dymo)object0))).collect(ggaf.a);
        this.a.d(list0);
        return evrg.d(null);
    }
}

