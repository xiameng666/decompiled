import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import com.google.android.gms.smartdevice.d2d.D2DDevice;

public final class eqip extends wby implements eqiq {
    public final eqcr a;
    protected final Handler b;

    public eqip() {
        super("com.google.android.gms.smartdevice.d2d.internal.ISourceScanListener");
    }

    public eqip(eqcr eqcr0) {
        super("com.google.android.gms.smartdevice.d2d.internal.ISourceScanListener");
        this.b = new eqjf(this, Looper.getMainLooper());
        batl.t(eqcr0, "listener cannot be null.");
        this.a = eqcr0;
    }

    @Override  // eqiq
    public final void a(D2DDevice d2DDevice0) {
        Message message0 = this.b.obtainMessage(1, d2DDevice0);
        this.b.sendMessage(message0);
    }

    @Override  // eqiq
    public final void b(D2DDevice d2DDevice0) {
        Message message0 = this.b.obtainMessage(3, d2DDevice0);
        this.b.sendMessage(message0);
    }

    @Override  // eqiq
    public final void c(int v) {
        this.b.sendMessage(this.b.obtainMessage(2, Integer.valueOf(v)));
    }

    @Override  // eqiq
    public final void d() {
        this.b.sendEmptyMessage(0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                D2DDevice d2DDevice0 = (D2DDevice)wbz.a(parcel0, D2DDevice.CREATOR);
                eqip.gr(parcel0);
                this.a(d2DDevice0);
                return true;
            }
            case 2: {
                this.d();
                return true;
            }
            case 3: {
                int v1 = parcel0.readInt();
                eqip.gr(parcel0);
                this.c(v1);
                return true;
            }
            case 4: {
                D2DDevice d2DDevice1 = (D2DDevice)wbz.a(parcel0, D2DDevice.CREATOR);
                eqip.gr(parcel0);
                this.b(d2DDevice1);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

