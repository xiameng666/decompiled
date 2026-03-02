import android.os.IBinder;
import android.os.Parcel;
import com.google.android.libraries.bluetooth.fastpair.fmd.FmdRequest;
import com.google.android.libraries.bluetooth.fastpair.fmd.FmdResponse;

public final class gxvz extends wbx implements gxwb {
    public gxvz(IBinder iBinder0) {
        super(iBinder0, "com.google.location.nearby.common.fastpair.fmd.IDeviceFmdService");
    }

    @Override  // gxwb
    public final FmdResponse a(FmdRequest fmdRequest0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, fmdRequest0);
        Parcel parcel1 = this.hM(2, parcel0);
        FmdResponse fmdResponse0 = (FmdResponse)wbz.a(parcel1, FmdResponse.CREATOR);
        parcel1.recycle();
        return fmdResponse0;
    }
}

