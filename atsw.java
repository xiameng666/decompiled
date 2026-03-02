import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.CredentialsData;
import com.google.android.gms.cast.LaunchOptions;

public final class atsw implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        boolean z = false;
        boolean z1 = false;
        CredentialsData credentialsData0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    z = baua.D(parcel0, v1);
                    break;
                }
                case 3: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 4: {
                    z1 = baua.D(parcel0, v1);
                    break;
                }
                case 5: {
                    credentialsData0 = (CredentialsData)baua.m(parcel0, v1, CredentialsData.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new LaunchOptions(z, s, z1, credentialsData0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new LaunchOptions[v];
    }
}

