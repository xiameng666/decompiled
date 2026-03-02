import java.util.List;

final class dmyg extends ibuo implements ibts {
    public dmyg(Object object0) {
        super(1, object0, dmyx.class, "onCalloutsChanged", "onCalloutsChanged(Ljava/util/List;)V", 0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        List list0 = (List)object0;
        ibuq.f(list0, "p0");
        ((dmyx)this.e).I().jQ(list0);
        return ibom.a;
    }
}

