import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.auth.api.credentials.HintRequest;

public final class adwp implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        CredentialPickerConfig credentialPickerConfig0 = null;
        String[] arr_s = null;
        String s = null;
        String s1 = null;
        int v1 = 0;
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            int v3 = (char)v2;
            if(v3 == 1000) {
                v1 = baua.f(parcel0, v2);
            }
            else {
                switch(v3) {
                    case 1: {
                        credentialPickerConfig0 = (CredentialPickerConfig)baua.m(parcel0, v2, CredentialPickerConfig.CREATOR);
                        break;
                    }
                    case 2: {
                        z = baua.D(parcel0, v2);
                        break;
                    }
                    case 3: {
                        z1 = baua.D(parcel0, v2);
                        break;
                    }
                    case 4: {
                        arr_s = baua.K(parcel0, v2);
                        break;
                    }
                    case 5: {
                        z2 = baua.D(parcel0, v2);
                        break;
                    }
                    case 6: {
                        s = baua.s(parcel0, v2);
                        break;
                    }
                    case 7: {
                        s1 = baua.s(parcel0, v2);
                        break;
                    }
                    default: {
                        baua.C(parcel0, v2);
                    }
                }
            }
        }
        baua.A(parcel0, v);
        return new HintRequest(v1, credentialPickerConfig0, z, z1, arr_s, z2, s, s1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new HintRequest[v];
    }
}

