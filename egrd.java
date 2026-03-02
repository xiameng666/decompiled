import android.accounts.Account;

public final class egrd implements lqj {
    public final egrw a;

    public egrd(egrw egrw0) {
        this.a = egrw0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        Account account0 = egxj.a(((fntm)object0).c);
        egrw egrw0 = this.a;
        egrw0.a = account0;
        Account account1 = egrw0.a;
        if(account1 != null) {
            egrw0.am = true;
            egrw0.b.m(account1.name);
            egrw0.c.l(((fntm)object0));
            egrw0.c.setContentDescription(egrw0.getString(0x7F1507CE, new Object[]{egrw0.a.name}));  // string:common_account_spinner_a11y_description "Current account: %s"
            egrw0.B(true);
            egrw0.A(((egxb)egrw0.b.k.ij()));
            egrw0.getView().findViewById(0x7F0B0FD4).setVisibility(0);  // id:content
            if(egrw0.aj && !hxdo.c()) {
                eguv eguv0 = egrw0.b;
                eguv0.u = egyc.a(egrw0.a);
                eguv0.p.ii(Boolean.valueOf(false));
                egyc egyc0 = eguv0.u;
                if(egyc0 != null) {
                    gmbu.t(egyc0.b(), new egup(eguv0), gmap.a);
                }
            }
        }
    }
}

