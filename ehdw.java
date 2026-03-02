import android.accounts.Account;
import android.content.Context;
import android.content.Intent;

public final class ehdw extends ehdv {
    public static final int a;
    private static final ggeo t;

    static {
        ehdw.t = ggeo.n(gjgi.c, gjhn.e, gjgi.b, gjhn.f, gjgi.d, gjhn.g);
    }

    public ehdw(Context context0, Account account0, efur efur0, ehim ehim0) {
        super(context0, account0, efur0, ehim0, 0x7F152562, 3, "FSA2_SyncUpProgressNotifier");  // string:people_fsa_progress_notification_format_for_sync_up_google_contacts_brand 
                                                                                                // "Google Contacts backing up %s"
    }

    @Override  // ehdv
    public final Intent f() {
        return hxdh.a.c().K() ? ehdn.b(this.e, this.j, "com.google.android.gms.people.notification") : null;
    }

    @Override  // ehdv
    protected final gjhn g(gjgi gjgi0) {
        return (gjhn)ehdw.t.getOrDefault(gjgi0, gjhn.a);
    }

    @Override  // ehdv
    public final String h() {
        return "com.google.android.gms.people.sync.focus.notification.DISMISSED_FOR_SYNC_UP";
    }

    @Override  // ehdv
    public final String i() {
        return "com.google.android.gms.people.sync.focus.notification.TAPPED_FOR_SYNC_UP";
    }

    @Override  // ehdv
    protected final void k(int v, boolean z) {
        if(hxdh.e() && z) {
            this.i.w(this.j, this.i.b(this.j) + 1);
        }
        if(this.o > 0 && this.p > 0) {
            this.q(false);
        }
        this.o();
    }

    @Override  // ehdv
    public final boolean l(int v, gjgi gjgi0) {
        if(v == 3) {
            switch(gjgi0.ordinal()) {
                case 1: {
                    egiv.R();
                    boolean z = hwzc.a.c().az();
                    Boolean.valueOf(z).getClass();
                    return z;
                }
                case 2: {
                    egiv.R();
                    boolean z1 = hwzc.a.c().aB();
                    Boolean.valueOf(z1).getClass();
                    return z1;
                }
                case 3: {
                    egiv.R();
                    boolean z2 = hwzc.a.c().aD();
                    Boolean.valueOf(z2).getClass();
                    return z2;
                }
                default: {
                    return false;
                }
            }
        }
        return false;
    }

    @Override  // ehdv
    protected final boolean m(int v) {
        return v == 3;
    }
}

