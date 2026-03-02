import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import java.util.Objects;

public final class ctni extends clil {
    final icbi a;
    final bbic b;
    final Context c;
    final Intent d;
    final ibth e;

    public ctni(icbi icbi0, bbic bbic0, Context context0, Intent intent0, ibth ibth0) {
        this.a = icbi0;
        this.b = bbic0;
        this.c = context0;
        this.d = intent0;
        this.e = ibth0;
        super("multidevice_sync");
    }

    @Override  // clil
    public final void a(ComponentName componentName0, IBinder iBinder0) {
        ibuq.f(componentName0, "componentName");
        ibuq.f(iBinder0, "binder");
        ibns ibns0 = new ibns(iBinder0, this);
        this.a.w(ibns0);
    }

    @Override  // clil
    public final void b(ComponentName componentName0) {
        ibuq.f(componentName0, "componentName");
        if(this.a.h()) {
            this.b.b(this.c, this);
        }
        this.e.a();
    }

    @Override  // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName0) {
        ibuq.f(componentName0, "name");
        if(this.a.h()) {
            this.b.b(this.c, this);
        }
        this.e.a();
    }

    @Override  // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName0) {
        ibuq.f(componentName0, "name");
        this.b.b(this.c, this);
        Objects.toString(this.d);
        this.a.w(ibnx.a(new IllegalStateException("Null binding for " + this.d)));
    }
}

