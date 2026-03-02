import android.accounts.Account;

public final class egtu implements lqj {
    public final egtw a;

    public egtu(egtw egtw0) {
        this.a = egtw0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        Account account0 = egxj.a(((fntm)object0).c);
        egtw egtw0 = this.a;
        egtw0.a = account0;
        Account account1 = egtw0.a;
        if(account1 != null) {
            egtw0.b.m(account1.name);
            egtw0.c.l(((fntm)object0));
            egtw0.c.setContentDescription(egtw0.getString(0x7F1507CE, new Object[]{egtw0.a.name}));  // string:common_account_spinner_a11y_description "Current account: %s"
            egtw0.d.i = egtw0.a;
        }
    }
}

