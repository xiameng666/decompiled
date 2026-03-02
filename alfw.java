import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class alfw extends wbx implements IInterface {
    public alfw(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.auth.proximity.firstparty.IExoSignalingService");
    }

    public final void a(String s) {
        Parcel parcel0 = this.jo();
        parcel0.writeString(s);
        this.jp(7, parcel0);
    }

    public final void b(String s, byte[] arr_b) {
        Parcel parcel0 = this.jo();
        parcel0.writeString(s);
        parcel0.writeByteArray(arr_b);
        this.jp(3, parcel0);
    }

    public final void c(alfv alfv0) {
        Parcel parcel0 = this.jo();
        wbz.h(parcel0, alfv0);
        this.jp(2, parcel0);
    }

    public final void d(String s, String s1) {
        Parcel parcel0 = this.jo();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        this.jp(8, parcel0);
    }

    public final void e(String s) {
        Parcel parcel0 = this.jo();
        parcel0.writeString(s);
        this.jp(4, parcel0);
    }
}

