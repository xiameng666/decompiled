import androidx.activity.result.ActivityResult;

final class dxxb extends ibsl implements ibtw {
    int a;
    final dxxk b;
    final ActivityResult c;

    public dxxb(dxxk dxxk0, ActivityResult activityResult0, ibrl ibrl0) {
        this.b = dxxk0;
        this.c = activityResult0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dxxb)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dxxb(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            if(this.b.d.a(this.c, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

