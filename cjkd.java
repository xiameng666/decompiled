import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

public abstract class cjkd extends wby implements cjke {
    public cjkd() {
        super("com.google.android.gms.libs.nativesandbox.isolation.IRemoteLibManager");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                this.d();
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                String s = parcel0.readString();
                ParcelFileDescriptor parcelFileDescriptor0 = (ParcelFileDescriptor)wbz.a(parcel0, ParcelFileDescriptor.CREATOR);
                String s1 = parcel0.readString();
                String s2 = parcel0.readString();
                IBinder iBinder0 = parcel0.readStrongBinder();
                cjkd.gr(parcel0);
                IBinder iBinder1 = this.a(s, parcelFileDescriptor0, s1, s2, iBinder0);
                parcel1.writeNoException();
                parcel1.writeStrongBinder(iBinder1);
                return true;
            }
            case 3: {
                String s3 = parcel0.readString();
                IBinder iBinder2 = parcel0.readStrongBinder();
                cjkd.gr(parcel0);
                this.c(s3, iBinder2);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

