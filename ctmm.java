import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.multidevice.sync.appcast.service.aidl.DeviceMetadata;

public final class ctmm extends wbx implements ctmo {
    public ctmm(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.multidevice.sync.appcast.service.aidl.IAppCastDevice");
    }

    @Override  // ctmo
    public final DeviceMetadata a() {
        Parcel parcel0 = this.hM(1, this.jo());
        DeviceMetadata deviceMetadata0 = (DeviceMetadata)wbz.a(parcel0, DeviceMetadata.CREATOR);
        parcel0.recycle();
        return deviceMetadata0;
    }

    @Override  // ctmo
    public final ctna b(ctna ctna0) {
        ctna ctna1;
        Parcel parcel0 = this.jo();
        wbz.h(parcel0, ctna0);
        Parcel parcel1 = this.hM(6, parcel0);
        IBinder iBinder0 = parcel1.readStrongBinder();
        if(iBinder0 == null) {
            ctna1 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.multidevice.sync.appcast.service.aidl.ISignalingCallback");
            ctna1 = (iInterface0 instanceof ctna) ? ((ctna)iInterface0) : new ctmy(iBinder0);
        }
        parcel1.recycle();
        return ctna1;
    }

    @Override  // ctmo
    public final void c(String s, ctmx ctmx0) {
        Parcel parcel0 = this.jo();
        parcel0.writeString(s);
        wbz.h(parcel0, ctmx0);
        this.jp(5, parcel0);
    }

    @Override  // ctmo
    public final void d(ctmr ctmr0) {
        Parcel parcel0 = this.jo();
        wbz.h(parcel0, ctmr0);
        this.jp(2, parcel0);
    }

    @Override  // ctmo
    public final void e(ctmr ctmr0) {
        Parcel parcel0 = this.jo();
        wbz.h(parcel0, ctmr0);
        this.jp(3, parcel0);
    }
}

