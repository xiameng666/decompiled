import com.google.android.gms.credential.manager.tasks.PasswordChangesSubscriptionTaskBoundService;

public final class bgka extends ibsl implements ibtw {
    int a;
    final PasswordChangesSubscriptionTaskBoundService b;

    public bgka(PasswordChangesSubscriptionTaskBoundService passwordChangesSubscriptionTaskBoundService0, ibrl ibrl0) {
        this.b = passwordChangesSubscriptionTaskBoundService0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bgka)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bgka(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ((ggtj)PasswordChangesSubscriptionTaskBoundService.a.h()).x("Running a task to subscribe to password changes if needed.");
            bevy bevy0 = this.b.b;
            if(bevy0 == null) {
                ibuq.j("passwordChangesSubscriber");
                bevy0 = null;
            }
            this.a = 1;
            if(bevy.b(bevy0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

