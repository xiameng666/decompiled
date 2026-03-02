import android.accounts.Account;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import java.util.ArrayList;
import java.util.List;

final class eqch {
    public boolean a;
    public boolean b;
    private final eqgn c;
    private final Runnable d;
    private boolean e;
    private boolean f;
    private boolean g;

    public eqch(eqgn eqgn0, Runnable runnable0) {
        this.e = false;
        this.a = false;
        this.b = false;
        this.f = false;
        batl.s(eqgn0);
        this.c = eqgn0;
        this.d = runnable0;
    }

    public final void a() {
        synchronized(this) {
            if(!this.g && this.e && this.a && this.b && this.f) {
                this.g = true;
                this.c.c();
                eqck.h.j("Running success runnable.", new Object[0]);
                this.d.run();
            }
        }
    }

    public final void b(List list0, boolean z) {
        batl.s(list0);
        this.f = true;
        ArrayList arrayList0 = new ArrayList(list0.size());
        for(Object object0: list0) {
            arrayList0.add(new Account(((BootstrapAccount)object0).b, ((BootstrapAccount)object0).c));
        }
        boolean z1 = z ? this.c.f(arrayList0) : this.c.e(arrayList0);
        eqck.h.j("AuthZen re-enrollment forced: %s", new Object[]{Boolean.toString(z1)});
        eqck.h.h("%d accounts have been set in the condition latch. isFidoFlow: %b", new Object[]{list0.size(), Boolean.valueOf(z)});
        this.a();
    }

    public final void c() {
        eqck.h.h("User confirmed transfer.", new Object[0]);
        this.e = true;
        this.a();
    }
}

