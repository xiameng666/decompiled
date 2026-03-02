import java.util.Iterator;

final class atkl extends atjt {
    private final Iterator a;

    public atkl(Iterator iterator0) {
        gftb.check(iterator0);
        this.a = iterator0;
    }

    @Override  // atjt
    public final gfsx a() {
        Iterator iterator0 = this.a;
        gfsx gfsx0 = gfqx.a;
        if(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            return gfsx.m(((atjy)object0).a);
        }
        return gfsx0;
    }
}

