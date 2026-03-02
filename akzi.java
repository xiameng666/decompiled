import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.authzen.gencode.server.api.BeaconSeedEntity;
import com.google.android.gms.auth.proximity.AttestationVerifier;
import com.google.android.gms.auth.proximity.RemoteDevice;
import java.util.List;

public final class akzi implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        String s2 = null;
        byte[] arr_b = null;
        String s3 = null;
        List list0 = null;
        String s4 = null;
        AttestationVerifier attestationVerifier0 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            int v3 = (char)v2;
            if(v3 == 1000) {
                v1 = baua.f(parcel0, v2);
            }
            else {
                switch(v3) {
                    case 1: {
                        s = baua.s(parcel0, v2);
                        break;
                    }
                    case 2: {
                        s1 = baua.s(parcel0, v2);
                        break;
                    }
                    case 3: {
                        s2 = baua.s(parcel0, v2);
                        break;
                    }
                    case 4: {
                        arr_b = baua.E(parcel0, v2);
                        break;
                    }
                    case 5: {
                        s3 = baua.s(parcel0, v2);
                        break;
                    }
                    case 6: {
                        list0 = baua.y(parcel0, v2, BeaconSeedEntity.CREATOR);
                        break;
                    }
                    case 7: {
                        s4 = baua.s(parcel0, v2);
                        break;
                    }
                    case 8: {
                        attestationVerifier0 = (AttestationVerifier)baua.m(parcel0, v2, AttestationVerifier.CREATOR);
                        break;
                    }
                    default: {
                        baua.C(parcel0, v2);
                    }
                }
            }
        }
        baua.A(parcel0, v);
        return new RemoteDevice(v1, s, s1, s2, arr_b, s3, list0, s4, attestationVerifier0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new RemoteDevice[v];
    }
}

