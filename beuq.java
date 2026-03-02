import com.google.android.gms.credential.manager.operations.PasswordChangesIntentOperation;

public final class beuq extends ibsl implements ibtw {
    int a;
    final String b;
    final PasswordChangesIntentOperation c;

    public beuq(String s, PasswordChangesIntentOperation passwordChangesIntentOperation0, ibrl ibrl0) {
        this.b = s;
        this.c = passwordChangesIntentOperation0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((beuq)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new beuq(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            String s = this.b;
            if(ibuq.m(s, "LOCAL_ACCOUNT")) {
                bevv bevv0 = this.c.a();
                this.a = 1;
                Object object2 = bevv0.a("pwm.constant.LocalAccount", bevv0.b.c(null), this);
                if(object2 != object1) {
                    object2 = ibom.a;
                }
                if(object2 == object1) {
                    return object1;
                }
            }
            else {
                bevv bevv1 = this.c.a();
                this.a = 2;
                Object object3 = bevv1.a(s, bevv1.a.a(s).c(null), this);
                if(object3 != object1) {
                    object3 = ibom.a;
                }
                if(object3 == object1) {
                    return object1;
                }
            }
        }
        return ibom.a;
    }
}

