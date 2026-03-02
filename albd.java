import android.content.ComponentName;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import j..util.Objects;

final class albd extends clil {
    final albe a;

    public albd(albe albe0) {
        Objects.requireNonNull(albe0);
        this.a = albe0;
        super("auth_proximity");
    }

    @Override  // clil
    public final void a(ComponentName componentName0, IBinder iBinder0) {
        alfw alfw0;
        albe albe0 = this.a;
        Context context0 = albe0.j;
        if(context0 != null && albe0.l == 3) {
            albe.a.h("Service binding connected when unbinding, unbind again.", new Object[0]);
            context0.unbindService(this);
            return;
        }
        albe0.l = 2;
        if(iBinder0 == null) {
            alfw0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.auth.proximity.firstparty.IExoSignalingService");
            alfw0 = (iInterface0 instanceof alfw) ? ((alfw)iInterface0) : new alfw(iBinder0);
        }
        albe0.r = alfw0;
        albe.a.h("Service binding connected G->B", new Object[0]);
        gftb.z(albe0.k, "ExecutorService must not be null");
        albb albb0 = new albb(this);
        albe0.k.d(albb0);
    }

    @Override  // clil
    public final void b(ComponentName componentName0) {
        albe.a.h("Service binding disconnected G->B", new Object[0]);
        this.c();
    }

    private final void c() {
        this.a.l = 4;
        this.a.r = null;
        gmcg gmcg0 = this.a.k;
        if(gmcg0 != null) {
            gmcg0.d(new alba(this));
        }
    }

    @Override  // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName0) {
        albe.a.h("Service binding died G->B", new Object[0]);
        this.a.q = null;
        this.c();
    }
}

