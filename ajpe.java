import android.content.Context;
import android.os.Parcel;

public final class ajpe extends wby implements ajpf {
    private final Context a;
    private final alws b;

    public ajpe() {
        super("com.google.android.gms.auth.firstparty.devicesignals.IDeviceSignalsService");
    }

    public ajpe(Context context0) {
        alws alws0 = alws.a(context0);
        super("com.google.android.gms.auth.firstparty.devicesignals.IDeviceSignalsService");
        this.a = context0.getApplicationContext();
        this.b = alws0;
    }

    @Override  // ajpf
    public final long a() {
        this.c();
        alws alws0 = this.b;
        synchronized(alws0.b) {
            if(alws0.c()) {
                return alws0.a.getLong("lastSecureUnlockTime", -1L);
            }
        }
        return -1L;
    }

    @Override  // ajpf
    public final long b() {
        this.c();
        alws alws0 = this.b;
        synchronized(alws0.b) {
            if(alws0.c()) {
                return alws0.a.getLong("lockScreenSecureDuration", -1L);
            }
        }
        return -1L;
    }

    private final void c() {
        if(bbmq.Y(this.a)) {
            return;
        }
        throw new SecurityException("Calling pkg not zero party.");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                long v1 = this.a();
                parcel1.writeNoException();
                parcel1.writeLong(v1);
                return true;
            }
            case 2: {
                long v2 = this.b();
                parcel1.writeNoException();
                parcel1.writeLong(v2);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

