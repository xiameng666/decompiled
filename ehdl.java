import android.accounts.Account;
import android.content.Context;
import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.List;

public final class ehdl {
    private final boolean a;
    private final List b;

    public ehdl(Context context0, Account account0, efur efur0, ehim ehim0) {
        Context context1;
        ehim ehim1;
        efur efur1;
        ArrayList arrayList0 = new ArrayList();
        this.b = arrayList0;
        boolean z = ((ehiv)ehim0).y || hxbk.j() && ((ehiv)ehim0).A;
        this.a = z;
        String s = account0.name;
        hxcv hxcv0 = hxcv.a;
        if(!hxcv0.c().t() || !ehej.g(context0) && (hxcv.h() || !ehej.h(context0))) {
        label_28:
            context1 = context0;
            efur1 = efur0;
            ehim1 = ehim0;
            if(!z || !account0.name.equals(efur1.j())) {
                String s1 = account0.name;
                if(ehdv.u()) {
                    if(!z) {
                        if(hxdh.a.c().C() && (!hxdh.d() || ((ehiv)ehim0).j.size() == 0)) {
                        label_38:
                            ehdr ehdr0 = new ehdr(context1, account0, efur1, ehim1);
                            if(z) {
                                String s2 = account0.name;
                                efur1.a.edit().putBoolean("focus_initial_sync_progress_ever_shown_in_notification_" + s2, true).apply();
                            }
                            arrayList0.add(ehdr0);
                        }
                    }
                    else if(hxdh.a.c().A() && (hxdh.a.c().B() || !efur1.D(s1)) && (!hxdh.a.c().n() || ((long)efur1.a(s1)) < hxdh.a.c().b())) {
                        goto label_38;
                    }
                }
            }
        }
        else if(hxcv0.c().l()) {
            Account[] arr_account = cchj.b(context0).p("com.google");
            if(arr_account != null && arr_account.length > 0) {
                Account account1 = arr_account[0];
                if(account1 == null || !account1.name.equals(s) || efur0.a.getBoolean("focus_initial_sync_progress_ever_shown_in_notification_" + s, false)) {
                    goto label_13;
                }
                else {
                    goto label_14;
                }
            }
            else {
            label_13:
                if(s.equals(efur0.j())) {
                    goto label_14;
                }
                else {
                    goto label_28;
                }
            }
        }
        else {
        label_14:
            if(!hxcv.g() || z) {
                if((!hxcv0.c().b() || Build.VERSION.SDK_INT < 35 ? ehef.f(context0) : ehef.g(context0))) {
                    if(z) {
                        efur0.s(account0.name);
                    }
                    efur1 = efur0;
                    ehim1 = ehim0;
                    context1 = context0;
                    arrayList0.add(new ehej(context0, efur1, ehef.a, ehim1, account0.name));
                    goto label_43;
                }
            }
            else if(hxcv.f() && ehef.h(context0, s, ehef.a(context0, 0x7F15253F))) {  // string:people_contacts_sync_progress_title_in_portal "Syncing with Google Contacts"
                ehej.i(1, ehej.g(context0), ehim0);
                if(hxcv.i()) {
                    ehej.f(context0, s);
                }
            }
            goto label_28;
        }
    label_43:
        String s3 = account0.name;
        if(ehdv.u()) {
            hxdh hxdh0 = hxdh.a;
            if(hxdh0.c().D()) {
                hxdh0.c().M();
                if(((long)efur1.c(s3)) < hxdh0.c().d() && (!hxdh.e() || ((long)efur1.b(s3)) < hxdh0.c().f())) {
                    arrayList0.add(new ehdw(context1, account0, efur1, ehim1));
                }
            }
        }
        if(hxdl.e()) {
            arrayList0.add(new ehek(context1, account0, efur1));
        }
    }

    public final void a(boolean z, boolean z1) {
        for(Object object0: this.b) {
            ((ehdm)object0).d(this.f(z), z1);
        }
    }

    public final void b(boolean z) {
        for(Object object0: this.b) {
            ((ehdm)object0).a(z);
        }
    }

    public final void c() {
        for(Object object0: this.b) {
            ((ehdm)object0).b();
        }
    }

    public final void d(int v, boolean z) {
        for(Object object0: this.b) {
            ((ehdm)object0).c(v, z);
        }
    }

    public final void e(boolean z, gjgi gjgi0, int v) {
        for(Object object0: this.b) {
            ((ehdm)object0).e(this.f(z), gjgi0, v);
        }
    }

    private final int f(boolean z) {
        if(z) {
            return this.a ? 1 : 2;
        }
        return 3;
    }
}

