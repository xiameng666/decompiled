import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public final class ekmo extends lqd {
    public final efou a;
    public final Context h;
    public final ejyv i;
    public boolean j;
    public final boolean k;
    private final ejyu l;
    private final ejyn m;
    private final ejyt n;
    private final boolean o;
    private gmcd p;
    private gmcd q;

    public ekmo(Context context0, ejyv ejyv0, ejyu ejyu0, ejyn ejyn0, efou efou0, ejyt ejyt0, boolean z, boolean z1) {
        this.a = efou0;
        this.l = ejyu0;
        this.h = context0;
        this.i = ejyv0;
        this.m = ejyn0;
        this.j = false;
        this.n = ejyt0;
        this.o = z;
        this.k = z1;
    }

    public final List b(String s, List list0) {
        List list1 = new ArrayList();
        ggqk ggqk0 = gged_interceptors.D(new ekmt(), list0).E();
        while(ggqk0.hasNext()) {
            Object object0 = ggqk0.next();
            ejyy ejyy0 = (ejyy)object0;
            if(bbqr.c(this.l.b(s)).equals(ejyy0.a)) {
                ejyy0.j = "Current device";
            }
            list1.add(ejyy0);
        }
        return list1;
    }

    @Override  // lqd
    protected final void c() {
        if(this.o) {
            if(!this.j) {
                ejyt ejyt0 = this.n;
                String s = this.i.i();
                if(!TextUtils.isEmpty(s)) {
                    gmcd gmcd0 = this.q;
                    if(gmcd0 != null) {
                        gmcd0.cancel(false);
                    }
                    gmcd gmcd1 = fhra.b(ekgr.a(this.h, s, ejyt0));
                    this.q = gmcd1;
                    gmbu.t(gmcd1, new ekml(this, s), gmap.a);
                    return;
                }
                Log.w("ContactsRestoreSourceLD", "No account selected when attempting to fetch backups.");
                ejze.a().d("CRBA.skip_fetch_backup_call_due_to_no_account");
                this.ii(new ArrayList());
            }
        }
        else if(!this.j) {
            String s1 = this.i.i();
            if(!TextUtils.isEmpty(s1)) {
                ejze.a().k(true, 0, 0);
                gmcd gmcd2 = this.p;
                if(gmcd2 != null) {
                    gmcd2.cancel(false);
                }
                gmcd gmcd3 = fhra.b(this.m.f(s1));
                this.p = gmcd3;
                gmbu.t(gmcd3, new ekmm(this, s1), gmap.a);
                return;
            }
            Log.w("ContactsRestoreSourceLD", String.format("No account selected when attempting to fetch backups."));
            ejze.a().d("CRBA.skip_fetch_backup_call_due_to_no_account");
            this.ii(new ArrayList());
        }
    }
}

