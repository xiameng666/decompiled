import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;

public final class cszd extends clil {
    final cszf a;
    final icbi b;
    final bbic c;
    final icck d;

    public cszd(cszf cszf0, icbi icbi0, bbic bbic0, icck icck0) {
        this.a = cszf0;
        this.b = icbi0;
        this.c = bbic0;
        this.d = icck0;
        super("multidevice");
    }

    @Override  // clil
    public final void a(ComponentName componentName0, IBinder iBinder0) {
        Object object0;
        ibuq.f(componentName0, "componentName");
        ibuq.f(iBinder0, "binder");
        if(iBinder0 == null) {
            object0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.auth.proximity.firstparty.IExoSignalingService");
            object0 = (iInterface0 instanceof alfw) ? ((alfw)iInterface0) : new alfw(iBinder0);
        }
        ibns ibns0 = new ibns(this, object0);
        this.b.w(ibns0);
    }

    @Override  // clil
    public final void b(ComponentName componentName0) {
        ibuq.f(componentName0, "componentName");
        icbi icbi0 = this.b;
        if(icbi0.h()) {
            this.c.b(this.a.b, this);
            icbi0.w(null);
            return;
        }
        iccl.i(this.d);
    }

    @Override  // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName0) {
        ibuq.f(componentName0, "name");
        icbi icbi0 = this.b;
        if(icbi0.h()) {
            this.c.b(this.a.b, this);
            icbi0.w(null);
            return;
        }
        iccl.i(this.d);
    }

    @Override  // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName0) {
        ibuq.f(componentName0, "name");
        this.c.b(this.a.b, this);
        this.b.w(null);
    }
}

