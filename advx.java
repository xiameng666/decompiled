import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.auth.api.credentials.CredentialRequest;

public final class advx implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        String[] arr_s = null;
        CredentialPickerConfig credentialPickerConfig0 = null;
        CredentialPickerConfig credentialPickerConfig1 = null;
        String s = null;
        String s1 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            int v3 = (char)v2;
            if(v3 == 1000) {
                v1 = baua.f(parcel0, v2);
            }
            else {
                switch(v3) {
                    case 1: {
                        z = baua.D(parcel0, v2);
                        break;
                    }
                    case 2: {
                        arr_s = baua.K(parcel0, v2);
                        break;
                    }
                    case 3: {
                        credentialPickerConfig0 = (CredentialPickerConfig)baua.m(parcel0, v2, CredentialPickerConfig.CREATOR);
                        break;
                    }
                    case 4: {
                        credentialPickerConfig1 = (CredentialPickerConfig)baua.m(parcel0, v2, CredentialPickerConfig.CREATOR);
                        break;
                    }
                    case 5: {
                        z1 = baua.D(parcel0, v2);
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
                    case 8: {
                        z2 = baua.D(parcel0, v2);
                        break;
                    }
                    default: {
                        baua.C(parcel0, v2);
                    }
                }
            }
        }
        baua.A(parcel0, v);
        return new CredentialRequest(v1, z, arr_s, credentialPickerConfig0, credentialPickerConfig1, z1, s, s1, z2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new CredentialRequest[v];
    }
}

