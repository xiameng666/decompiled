import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import java.util.ArrayList;
import java.util.Collections;

public final class ehdr extends ehdv {
    public static final int a;
    private static final ggeo t;
    private int u;

    static {
        ehdr.t = ggeo.n(gjgi.c, gjhn.b, gjgi.b, gjhn.c, gjgi.d, gjhn.d);
    }

    public ehdr(Context context0, Account account0, efur efur0, ehim ehim0) {
        super(context0, account0, efur0, ehim0, 0x7F152561, 2, "FSA2_SyncDownProgressNotifier");  // string:people_fsa_progress_notification_format_for_sync_down_google_contacts_brand 
                                                                                                  // "Google Contacts syncing %s"
        this.u = -1;
    }

    @Override  // ehdv
    public final Intent f() {
        return ehdn.a(this.e, this.j, "com.google.android.gms.people.notification");
    }

    @Override  // ehdv
    protected final gjhn g(gjgi gjgi0) {
        return (gjhn)ehdr.t.getOrDefault(gjgi0, gjhn.a);
    }

    @Override  // ehdv
    public final String h() {
        return "com.google.android.gms.people.sync.focus.notification.DISMISSED_FOR_SYNC_DOWN";
    }

    @Override  // ehdv
    public final String i() {
        return "com.google.android.gms.people.sync.focus.notification.TAPPED_FOR_SYNC_DOWN";
    }

    @Override  // ehdv
    public final void j(int v) {
        this.u = v;
        super.j(v);
    }

    @Override  // ehdv
    protected final void k(int v, boolean z) {
        if(this.u > 0) {
            if(v == 1) {
                if(!z) {
                    if(((ehiv)this.k).E) {
                        this.o();
                        return;
                    }
                    hxdh hxdh0 = hxdh.a;
                    if(hxdh0.c().o() && this.i.D(this.j)) {
                        this.o();
                        return;
                    }
                    efur efur0 = this.i;
                    String s = this.j;
                    int v1 = efur0.a(s);
                    long v2 = System.currentTimeMillis();
                    if(hxdh0.c().L()) {
                        ArrayList arrayList0 = new ArrayList(hxdh0.c().m().b);
                        Collections.sort(arrayList0);
                        if(v1 <= ((int)(((Integer)gggq.q(arrayList0, Integer.valueOf(-1)))))) {
                            if(!arrayList0.contains(Integer.valueOf(v1))) {
                                this.o();
                                return;
                            }
                            efur0.t(s, v2);
                        }
                        else {
                            goto label_18;
                        }
                    }
                    else {
                        if(((long)v1) <= hxdh0.c().e() || ((long)v1) >= hxdh0.c().c()) {
                            this.o();
                            return;
                        }
                    label_18:
                        if(((long)v1) > hxdh0.c().g()) {
                            long v3 = hxdh0.c().l() * 1000L;
                            if(v2 - efur0.a.getLong("focus_first_full_sync_failure_notification_last_show_timestamp_" + s, 0L) > v3) {
                                efur0.t(s, v2);
                                goto label_25;
                            }
                            this.o();
                            return;
                        }
                    }
                }
            label_25:
                if(!hxdh.a.c().G() && z) {
                    this.o();
                    return;
                }
                juo juo0 = this.c;
                Context context0 = this.e;
                juo0.D(context0.getResources().getString((z ? 0x7F15255C : 0x7F15255D)));  // string:people_fsa_notification_title_for_first_full_sync_complete_google_contacts_brand 
                                                                                           // "Google Contacts sync complete"
                String s1 = context0.getResources().getQuantityString(0x7F130053, this.u, new Object[]{((int)this.u)});  // plurals:people_fsa_progress_notification_format_for_contacts_sync
                if(z) {
                    juo0.k(context0.getResources().getString(0x7F152559, new Object[]{s1}));  // string:people_fsa_notification_text_for_first_full_sync_complete_google_contacts_brand 
                                                                                              // "%s added to device"
                    juo0.H(BitmapFactory.decodeResource(context0.getResources(), (hwym.c() ? 0x7F080A5A : 0x7F080A5B)));
                }
                else {
                    juo0.k("Google Contacts sync will continue soon");
                }
                this.o = 0;
                this.p = 0;
                this.q(true);
                return;
            }
            this.o();
        }
    }

    @Override  // ehdv
    public final boolean l(int v, gjgi gjgi0) {
        if(this.m(v)) {
            switch(gjgi0.ordinal()) {
                case 1: {
                    egiv.R();
                    boolean z = hwzc.a.c().ay();
                    Boolean.valueOf(z).getClass();
                    return z;
                }
                case 2: {
                    egiv.R();
                    boolean z1 = hwzc.a.c().aA();
                    Boolean.valueOf(z1).getClass();
                    return z1;
                }
                case 3: {
                    egiv.R();
                    boolean z2 = hwzc.a.c().aC();
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
        return v == 1 || v == 2;
    }
}

