import android.app.PendingIntent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import com.google.android.gms.smartdevice.d2d.AccountTransferResult;
import java.util.Arrays;
import java.util.List;

public final class eqhz extends wby implements eqib {
    public final epyk a;
    protected final Handler b;

    public eqhz() {
        super("com.google.android.gms.smartdevice.d2d.internal.IDirectTransferListener");
    }

    public eqhz(Looper looper0, epyk epyk0) {
        super("com.google.android.gms.smartdevice.d2d.internal.IDirectTransferListener");
        this.a = epyk0;
        this.b = new eqhw(this, looper0);
    }

    @Override  // eqib
    public final void a(AccountTransferResult[] arr_accountTransferResult) {
        List list0 = Arrays.asList(arr_accountTransferResult);
        Message message0 = this.b.obtainMessage(0, list0);
        this.b.sendMessage(message0);
    }

    @Override  // eqib
    public final void b(int v, String s) {
        Message message0 = this.b.obtainMessage(2, v, 0, s);
        this.b.sendMessage(message0);
    }

    @Override  // eqib
    public final void c(PendingIntent pendingIntent0) {
        Message message0 = this.b.obtainMessage(1, pendingIntent0);
        this.b.sendMessage(message0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                AccountTransferResult[] arr_accountTransferResult = (AccountTransferResult[])parcel0.createTypedArray(AccountTransferResult.CREATOR);
                eqhz.gr(parcel0);
                this.a(arr_accountTransferResult);
                break;
            }
            case 2: {
                PendingIntent pendingIntent0 = (PendingIntent)wbz.a(parcel0, PendingIntent.CREATOR);
                eqhz.gr(parcel0);
                this.c(pendingIntent0);
                break;
            }
            case 3: {
                int v1 = parcel0.readInt();
                String s = parcel0.readString();
                eqhz.gr(parcel0);
                this.b(v1, s);
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

