import com.google.android.gms.credential.manager.tasks.PasswordSharingSubscriptionTaskBoundService;

public final class bgkd extends ibsl implements ibtw {
    int a;
    final PasswordSharingSubscriptionTaskBoundService b;

    public bgkd(PasswordSharingSubscriptionTaskBoundService passwordSharingSubscriptionTaskBoundService0, ibrl ibrl0) {
        this.b = passwordSharingSubscriptionTaskBoundService0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bgkd)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bgkd(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ((ggtj)PasswordSharingSubscriptionTaskBoundService.a.h()).x("Running a task to subscribe to incoming password sharing invitations if needed.");
            bfec bfec0 = this.b.b;
            if(bfec0 == null) {
                ibuq.j("incomingPasswordSharingInvitationsSubscriber");
                bfec0 = null;
            }
            this.a = 1;
            if(bfec.b(bfec0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

