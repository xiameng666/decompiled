import android.accounts.Account;

final class cbpa extends ibsl implements ibtw {
    final cbpb a;

    public cbpa(cbpb cbpb0, ibrl ibrl0) {
        this.a = cbpb0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cbpa)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cbpa(this.a, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        Account account0 = (Account)ibpo.ab(cbaz.a().b(this.a.c, "com.google.android.gms"));
        if(account0 != null) {
            Object object1 = account0.name;
            if(object1 != null) {
                return object1;
            }
        }
        return "";
    }
}

