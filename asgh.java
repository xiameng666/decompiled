import com.google.android.gms.backup.BackUpNowConfig;

final class asgh extends ibsl implements ibtw {
    final asgr a;
    final BackUpNowConfig b;

    public asgh(asgr asgr0, BackUpNowConfig backUpNowConfig0, ibrl ibrl0) {
        this.a = asgr0;
        this.b = backUpNowConfig0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((asgh)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new asgh(this.a, this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        this.a.b.b(this.b);
        return ibom.a;
    }
}

