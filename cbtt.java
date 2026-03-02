import android.net.Uri;

final class cbtt extends ibsl implements ibtw {
    Object a;
    int b;
    final cbuo c;

    public cbtt(cbuo cbuo0, ibrl ibrl0) {
        this.c = cbuo0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cbtt)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cbtt(this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        if(this.b != 0) {
            object2 = this.a;
            ibnx.b(object0);
            ((cbhk)object2).al(((Uri)object0));
            return ibom.a;
        }
        ibnx.b(object0);
        cbuo cbuo0 = this.c;
        cbte cbte0 = cbuo0.y();
        String s = Uri.parse(hukf.a.c().i()).buildUpon().path(hukf.a.c().h()).build().toString();
        ibuq.e(s, "toString(...)");
        gvku gvku0 = cbuo0.M();
        this.a = cbuo0;
        this.b = 1;
        Object object3 = cbte0.f(s, gvku0, this);
        if(object3 != object1) {
            object0 = object3;
            object2 = cbuo0;
            ((cbhk)object2).al(((Uri)object0));
            return ibom.a;
        }
        return object1;
    }
}

