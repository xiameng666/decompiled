import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;

public final class eqid extends wby implements eqie {
    public final epzm a;
    protected final Handler b;

    public eqid() {
        super("com.google.android.gms.smartdevice.d2d.internal.ISourceBootstrapListener");
    }

    public eqid(epzm epzm0) {
        super("com.google.android.gms.smartdevice.d2d.internal.ISourceBootstrapListener");
        this.b = new eqjd(this, Looper.getMainLooper());
        this.a = epzm0;
    }

    @Override  // eqie
    public final void a() {
        this.b.sendEmptyMessage(1);
    }

    @Override  // eqie
    public final void b(String s) {
        Message message0 = this.b.obtainMessage(2, s);
        this.b.sendMessage(message0);
    }

    @Override  // eqie
    public final void c(BootstrapProgressResult bootstrapProgressResult0) {
        Message message0 = this.b.obtainMessage(0, bootstrapProgressResult0);
        this.b.sendMessage(message0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                BootstrapProgressResult bootstrapProgressResult0 = (BootstrapProgressResult)wbz.a(parcel0, BootstrapProgressResult.CREATOR);
                eqid.gr(parcel0);
                this.c(bootstrapProgressResult0);
                break;
            }
            case 2: {
                this.a();
                break;
            }
            case 3: {
                String s = parcel0.readString();
                eqid.gr(parcel0);
                this.b(s);
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

