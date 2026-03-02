import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;

public final class dcpb implements Runnable {
    public final dcpn a;
    public final Account b;
    public final Context c;

    public dcpb(dcpn dcpn0, Account account0, Context context0) {
        this.a = dcpn0;
        this.b = account0;
        this.c = context0;
    }

    @Override
    public final void run() {
        dcpn dcpn0 = this.a;
        Account account0 = this.b;
        boolean z = false;
        if(account0 != null && !TextUtils.isEmpty(account0.name)) {
            String s = account0.name;
            if(dcpn0.b != null && s.equals(dcpn0.b.a.e)) {
                return;
            }
            dcpn0.j = account0;
            Context context0 = this.c.getApplicationContext();
            dcph dcph0 = new dcph();
            if(s == null) {
                z = true;
            }
            dcpn0.b = new cunr(context0, 5, dcph0, s, z);
            dcvz.a.a().h("Create Gaia ID logger, account=%s", s);
            return;
        }
        dcpn0.b = null;
        dcpn0.j = null;
        dcvz.a.b().p("Invalid account, clear Gaia ID logger.", new Object[0]);
    }
}

