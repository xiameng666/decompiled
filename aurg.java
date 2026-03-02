import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.EqualizerSettings;
import com.google.android.gms.cast.internal.DeviceStatus;

public final class aurg implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        double f = 0.0;
        double f1 = 0.0;
        ApplicationMetadata applicationMetadata0 = null;
        EqualizerSettings equalizerSettings0 = null;
        boolean z = false;
        int v1 = 0;
        int v2 = 0;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 2: {
                    f = baua.b(parcel0, v3);
                    break;
                }
                case 3: {
                    z = baua.D(parcel0, v3);
                    break;
                }
                case 4: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                case 5: {
                    applicationMetadata0 = (ApplicationMetadata)baua.m(parcel0, v3, ApplicationMetadata.CREATOR);
                    break;
                }
                case 6: {
                    v2 = baua.f(parcel0, v3);
                    break;
                }
                case 7: {
                    equalizerSettings0 = (EqualizerSettings)baua.m(parcel0, v3, EqualizerSettings.CREATOR);
                    break;
                }
                case 8: {
                    f1 = baua.b(parcel0, v3);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new DeviceStatus(f, z, v1, applicationMetadata0, v2, equalizerSettings0, f1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DeviceStatus[v];
    }
}

