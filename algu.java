import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.proximity.AttestationVerifier;
import com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice;
import com.google.android.gms.auth.proximity.gencode.server.api.BeaconSeedEntity;
import java.util.List;

public final class algu implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        byte[] arr_b = null;
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        List list0 = null;
        List list1 = null;
        List list2 = null;
        AttestationVerifier attestationVerifier0 = null;
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        long v1 = 0L;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    arr_b = baua.E(parcel0, v2);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 3: {
                    s1 = baua.s(parcel0, v2);
                    break;
                }
                case 4: {
                    s2 = baua.s(parcel0, v2);
                    break;
                }
                case 5: {
                    z = baua.D(parcel0, v2);
                    break;
                }
                case 6: {
                    z1 = baua.D(parcel0, v2);
                    break;
                }
                case 7: {
                    v1 = baua.i(parcel0, v2);
                    break;
                }
                case 8: {
                    z2 = baua.D(parcel0, v2);
                    break;
                }
                case 9: {
                    s3 = baua.s(parcel0, v2);
                    break;
                }
                case 10: {
                    z3 = baua.D(parcel0, v2);
                    break;
                }
                case 11: {
                    z4 = baua.D(parcel0, v2);
                    break;
                }
                case 12: {
                    list0 = baua.x(parcel0, v2);
                    break;
                }
                case 13: {
                    list1 = baua.x(parcel0, v2);
                    break;
                }
                case 14: {
                    list2 = baua.y(parcel0, v2, BeaconSeedEntity.CREATOR);
                    break;
                }
                case 15: {
                    attestationVerifier0 = (AttestationVerifier)baua.m(parcel0, v2, AttestationVerifier.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new SyncedCryptauthDevice(arr_b, s, s1, s2, z, z1, v1, z2, s3, z3, z4, list0, list1, list2, attestationVerifier0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SyncedCryptauthDevice[v];
    }
}

