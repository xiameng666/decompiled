import android.content.Context;
import android.content.Intent;
import com.google.android.gms.multidevice.sync.appcast.client.ui.RemoteAppListChimeraActivity;

public final class ctiw implements ibts {
    public final RemoteAppListChimeraActivity a;
    public final gui b;

    public ctiw(RemoteAppListChimeraActivity remoteAppListChimeraActivity0, gui gui0) {
        this.a = remoteAppListChimeraActivity0;
        this.b = gui0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((ctza)object0), "metadata");
        boolean z = hvnj.a.b().b();
        RemoteAppListChimeraActivity remoteAppListChimeraActivity0 = this.a;
        if(z) {
            Context context0 = remoteAppListChimeraActivity0.getApplicationContext();
            ibuq.e(context0, "getApplicationContext(...)");
            ctho ctho0 = RemoteAppListChimeraActivity.b(this.b);
            if(ctho0 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            String s = ctho0.c();
            String s1 = ((ctza)object0).c;
            ibuq.e(s1, "getPackageName(...)");
            ibuq.f(context0, "context");
            ibuq.f(s, "deviceId");
            ibuq.f(s1, "packageName");
            Intent intent0 = new Intent().setClassName(context0, "com.google.android.gms.multidevice.sync.appcast.client.ui.AppCastActivity").putExtra("deviceId", s).putExtra("packageName", s1).addFlags(0x18000000);
            ibuq.e(intent0, "addFlags(...)");
            remoteAppListChimeraActivity0.startActivity(intent0);
            return ibom.a;
        }
        icbb.b(lpt.a(remoteAppListChimeraActivity0), null, null, new ctiy(remoteAppListChimeraActivity0, ((ctza)object0), null), 3);
        return ibom.a;
    }
}

