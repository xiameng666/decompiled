import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.VerificationInfo;

public final class eqig extends wby implements eqih {
    public final epzo a;
    protected final Handler b;

    public eqig() {
        super("com.google.android.gms.smartdevice.d2d.internal.ISourceConnectionListener");
    }

    public eqig(epzo epzo0) {
        super("com.google.android.gms.smartdevice.d2d.internal.ISourceConnectionListener");
        this.b = new eqje(this, Looper.getMainLooper());
        this.a = epzo0;
    }

    @Override  // eqih
    public final void a(BootstrapOptions bootstrapOptions0) {
        Message message0 = this.b.obtainMessage(0, bootstrapOptions0);
        this.b.sendMessage(message0);
    }

    @Override  // eqih
    public final void b() {
        this.b.sendEmptyMessage(1);
    }

    @Override  // eqih
    public final void c(int v) {
        this.b.sendMessage(this.b.obtainMessage(3, Integer.valueOf(v)));
    }

    @Override  // eqih
    public final void d(VerificationInfo verificationInfo0) {
        Message message0 = this.b.obtainMessage(4, verificationInfo0);
        this.b.sendMessage(message0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                BootstrapOptions bootstrapOptions0 = (BootstrapOptions)wbz.a(parcel0, BootstrapOptions.CREATOR);
                eqig.gr(parcel0);
                this.a(bootstrapOptions0);
                break;
            }
            case 2: {
                this.b();
                break;
            }
            case 3: {
                String s = parcel0.readString();
                eqig.gr(parcel0);
                Message message0 = this.b.obtainMessage(2, s);
                this.b.sendMessage(message0);
                break;
            }
            case 4: {
                int v1 = parcel0.readInt();
                eqig.gr(parcel0);
                this.c(v1);
                break;
            }
            case 5: {
                VerificationInfo verificationInfo0 = (VerificationInfo)wbz.a(parcel0, VerificationInfo.CREATOR);
                eqig.gr(parcel0);
                this.d(verificationInfo0);
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }
}

