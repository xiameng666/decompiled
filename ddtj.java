import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.sharing.QrCodeMetadata;
import com.google.android.gms.nearby.sharing.internal.RegisterReceiveSurfaceParams;

public final class ddtj implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        IBinder iBinder0 = null;
        IBinder iBinder1 = null;
        QrCodeMetadata qrCodeMetadata0 = null;
        Integer integer0 = null;
        String s = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    iBinder0 = baua.k(parcel0, v2);
                    break;
                }
                case 2: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 3: {
                    iBinder1 = baua.k(parcel0, v2);
                    break;
                }
                case 4: {
                    qrCodeMetadata0 = (QrCodeMetadata)baua.m(parcel0, v2, QrCodeMetadata.CREATOR);
                    break;
                }
                case 5: {
                    integer0 = baua.q(parcel0, v2);
                    break;
                }
                case 6: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new RegisterReceiveSurfaceParams(iBinder0, v1, iBinder1, qrCodeMetadata0, integer0, s);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new RegisterReceiveSurfaceParams[v];
    }
}

