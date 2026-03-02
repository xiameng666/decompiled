import java.util.List;

final class dndg extends ibuo implements ibts {
    public dndg(Object object0) {
        super(1, object0, dndr.class, "onCalloutsChanged", "onCalloutsChanged(Ljava/util/List;)V", 0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        List list0 = (List)object0;
        ibuq.f(list0, "p0");
        ((dndr)this.e).ac().jQ(ibpo.ar(list0));
        return ibom.a;
    }
}

