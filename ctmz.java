import android.os.Parcel;

public abstract class ctmz extends wby implements ctna {
    public ctmz() {
        super("com.google.android.gms.multidevice.sync.appcast.service.aidl.ISignalingCallback");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                byte[] arr_b = parcel0.createByteArray();
                ctmz.gr(parcel0);
                this.c(arr_b);
                break;
            }
            case 2: {
                this.a();
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

