import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;

final class ebth extends ibsl implements ibtw {
    final ebtm a;
    final String b;

    public ebth(ebtm ebtm0, String s, ibrl ibrl0) {
        this.a = ebtm0;
        this.b = s;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ebth)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ebth(this.a, this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        Account account0 = this.a.a();
        bblp bblp0 = new bblp(1, 10);
        AccountInfo accountInfo0 = this.a.d;
        Context context0 = this.a.c;
        dmet dmet0 = new dmet(context0, account0, accountInfo0.a, bblp0);
        String s = this.b;
        if(!dmet0.a(s).exists()) {
            dmet.d(context0, s, accountInfo0);
        }
        return ibom.a;
    }
}

