import android.content.ContentResolver;
import android.os.Bundle;

public final class egse implements lqj {
    public final egsq a;
    public final String b;
    public final int c;

    public egse(egsq egsq0, String s, int v) {
        this.a = egsq0;
        this.b = s;
        this.c = v;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        egsq egsq0 = this.a;
        egsq0.G(2, ((evql)object0));
        if(((evql)object0).n()) {
            String s = this.b;
            Bundle bundle0 = new Bundle();
            bundle0.putBoolean("force", true);
            bundle0.putString("REQUESTER", "SYNC_CORE_SHEEPDOG_UI");
            ContentResolver.requestSync(egxj.a(s), "com.android.contacts", bundle0);
            if(this.c == 1) {
                egsq0.H(5);
                if(egsq0.aq.i()) {
                    ((egik)egsq0.aq.d()).a.a(bbdg.fg);
                }
            }
            else {
                egsq0.I(10, true);
                if(egsq0.aq.i()) {
                    ((egik)egsq0.aq.d()).a.a(bbdg.ff);
                }
                if(egsq0.am.getVisibility() == 0) {
                    egsq0.am.setText(0x7F152512);  // string:people_backup_sync_will_sync_button "Contacts will start syncing soon"
                }
            }
            egsq0.c.a(s).g(egsq0, new egsg(egsq0));
            return;
        }
        egsq0.F();
        a.ae(egsq.a.i(), "Error opting into backup and sync", ((evql)object0).i());
    }
}

