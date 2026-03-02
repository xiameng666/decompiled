import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.SystemProperties;
import android.provider.Settings.Global;
import android.util.Log;
import java.util.List;

public final class bnmu implements bnni {
    public boolean a;
    public final ffsr b;
    private final ContentResolver c;

    static {
        bboh.b("GRilManagerWrapper", bbcu.eD);
    }

    public bnmu(Context context0) {
        ffsr ffsr0 = new ffsr(context0);
        super();
        this.a = false;
        this.b = ffsr0;
        this.c = context0.getContentResolver();
    }

    @Override  // bnni
    public final void a(List list0) {
        this.d(new bnms(this, ByteString.u(list0).toByteArray()));
    }

    @Override  // bnni
    public final void b(Boolean boolean0) {
        Settings.Global.putInt(this.c, "pof_active", ((int)boolean0.booleanValue()));
        this.d(new bnmr(this, boolean0));
    }

    @Override  // bnni
    public final boolean c() {
        return hsww.i() && hsww.j() && Boolean.parseBoolean(SystemProperties.get("ro.bluetooth.finder.supported"));
    }

    private final void d(Runnable runnable0) {
        if(this.a) {
            runnable0.run();
            return;
        }
        ffsr ffsr0 = this.b;
        ffsr0.e = new bnmt(this, runnable0);
        Intent intent0 = new Intent();
        intent0.setClassName("com.google.android.grilservice", "com.google.android.grilservice.GRilService");
        if(ffsr0.f == null) {
            Context context0 = ffsr0.a;
            ServiceConnection serviceConnection0 = ffsr0.d;
            if(!context0.bindService(intent0, serviceConnection0, 1)) {
                try {
                    context0.unbindService(serviceConnection0);
                }
                catch(Exception exception0) {
                    Log.e("GRIL-L", "Failed to unbind ", exception0);
                }
                bnmt bnmt0 = ffsr0.e;
                if(bnmt0 != null) {
                    bnmt0.a();
                }
            }
        }
    }
}

