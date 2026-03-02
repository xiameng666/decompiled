import java.util.List;

public final class blvu implements gfsi {
    public final blwa a;
    public final bnae b;

    public blvu(blwa blwa0, bnae bnae0) {
        this.a = blwa0;
        this.b = bnae0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        blwa blwa0 = this.a;
        List list0 = blwa0.h;
        list0.addAll(((List)object0));
        bnae bnae0 = this.b;
        if(list0.isEmpty()) {
            if(hsvd.l()) {
                blwa0.i.z(bnae0, blhl.e, Long.valueOf(blwa0.m));
            }
            return gfqx.a;
        }
        if(hsvd.l()) {
            blwa0.i.z(bnae0, blhl.d, Long.valueOf(blwa0.m));
        }
        return gfsx.m(((blpi)list0.get(0)));
    }
}

