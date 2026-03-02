import com.google.android.gms.credential.manager.operations.PasswordSharingIntentOperation;

public final class beuw extends ibsl implements ibtw {
    int a;
    final PasswordSharingIntentOperation b;
    final String c;

    public beuw(PasswordSharingIntentOperation passwordSharingIntentOperation0, String s, ibrl ibrl0) {
        this.b = passwordSharingIntentOperation0;
        this.c = s;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((beuw)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new beuw(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            bfdz bfdz0 = this.b.a;
            if(bfdz0 == null) {
                ibuq.j("incomingPasswordSharingInvitationsProcessor");
                bfdz0 = null;
            }
            this.a = 1;
            bfdw bfdw0 = new bfdw(bfdz0, this.c, null);
            Object object2 = icbd.a(bfdz0.b, bfdw0, this);
            if(object2 != object1) {
                object2 = ibom.a;
            }
            if(object2 == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

