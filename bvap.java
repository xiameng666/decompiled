import android.content.ComponentName;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;

public final class bvap extends clil {
    final jqt a;
    final Context b;

    public bvap(jqt jqt0, Context context0) {
        this.a = jqt0;
        this.b = context0;
        super("googlesettings");
    }

    @Override  // clil
    public final void a(ComponentName componentName0, IBinder iBinder0) {
        ibuq.f(componentName0, "name");
        ibuq.f(iBinder0, "binder");
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
        bask bask0 = iInterface0 != null && (iInterface0 instanceof bask) ? ((bask)iInterface0) : new basi(iBinder0);
        this.a.b(bask0);
    }

    @Override  // clil
    public final void b(ComponentName componentName0) {
        ibuq.f(componentName0, "componentName");
        try {
            bbic.a().b(this.b, this);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            a.ae(bvaq.a.j(), "Failed to unbind from service", illegalArgumentException0);
        }
        catch(IllegalStateException illegalStateException0) {
            a.ae(bvaq.a.j(), "Failed to unbind from service", illegalStateException0);
        }
    }
}

