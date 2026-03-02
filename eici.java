import android.accounts.Account;
import android.content.Context;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class eici {
    public final AtomicBoolean a;
    private static final Object b;
    private static eici c;
    private final ayud d;
    private final ayvm e;
    private final faik f;
    private final Object g;
    private boolean h;

    static {
        eici.b = new Object();
    }

    public eici(Context context0, ayud ayud0, faik faik0) {
        this.a = new AtomicBoolean(false);
        this.g = new Object();
        this.h = false;
        this.e = fhbe.b(context0, new gwii());
        this.d = ayud0;
        this.f = faik0;
    }

    public static eici a(Context context0) {
        ayud ayud0;
        synchronized(eici.b) {
            if(eici.c == null) {
                if(!hrtd.Z() && !hrto.s()) {
                    ayud0 = ayud.l(context0, "ACTIVITY_RECOGNITION");
                }
                else {
                    Account account0 = bbmn.a(context0);
                    if(account0 == null) {
                        List list0 = bbmn.h(context0, "com.google.android.gms");
                        if(!list0.isEmpty()) {
                            account0 = (Account)list0.get(0);
                        }
                    }
                    aytt aytt0 = new aytt(context0, "ACTIVITY_RECOGNITION");
                    aytt0.f = account0 == null ? null : account0.name;
                    ayud0 = aytt0.a();
                }
                eici.c = new eici(context0.getApplicationContext(), ayud0, faih.a(context0.getApplicationContext()));
            }
        }
        return eici.c;
    }

    public final void b() {
        synchronized(this.g) {
            if(!this.h) {
                eicg eicg0 = () -> synchronized(this) {
                    this.f.cp().b(new eich(this));
                };
                this.f.ct(eicg0);
                this.h = true;
            }
        }
    }

    public final void c(gwik gwik0, int v) {
        hrtd hrtd0 = hrtd.a;
        if(!hrtd0.I().bx() && !hrto.s()) {
            if(hrtd0.I().bv()) {
                this.d();
                cczb cczb0 = chli.v().c(((ProtoLiteMessage)gwik0));
                cczb0.c = v;
                cczb0.a();
                return;
            }
            ayuc ayuc0 = this.d.j(((MessageLite)gwik0), this.e);
            ayuc0.k(v);
            this.f.cp().b(new eicf(this, ayuc0));
            return;
        }
        cczb cczb1 = chlo.v().c(((ProtoLiteMessage)gwik0));
        cczb1.c = v;
        cczb1.a();
    }

    // Detected as a lambda impl.
    public final void d() {
        synchronized(this) {
            this.f.cp().b(new eich(this));
        }
    }
}

