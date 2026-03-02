import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.authzen.PermitAccess;
import com.google.android.gms.auth.authzen.gencode.server.api.BeaconSeedEntity;
import java.util.List;

public final class aihp implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        long v2 = 0L;
        String s = null;
        String s1 = null;
        byte[] arr_b = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        List list0 = null;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v3);
                    break;
                }
                case 3: {
                    s1 = baua.s(parcel0, v3);
                    break;
                }
                case 4: {
                    arr_b = baua.E(parcel0, v3);
                    break;
                }
                case 5: {
                    s2 = baua.s(parcel0, v3);
                    break;
                }
                case 6: {
                    z = baua.D(parcel0, v3);
                    break;
                }
                case 7: {
                    z1 = baua.D(parcel0, v3);
                    break;
                }
                case 8: {
                    z2 = baua.D(parcel0, v3);
                    break;
                }
                case 9: {
                    s3 = baua.s(parcel0, v3);
                    break;
                }
                case 10: {
                    s4 = baua.s(parcel0, v3);
                    break;
                }
                case 11: {
                    list0 = baua.y(parcel0, v3, BeaconSeedEntity.CREATOR);
                    break;
                }
                case 12: {
                    v2 = baua.i(parcel0, v3);
                    break;
                }
                case 13: {
                    z3 = baua.D(parcel0, v3);
                    break;
                }
                case 14: {
                    z4 = baua.D(parcel0, v3);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new PermitAccess(v1, s, s1, arr_b, s2, z, z1, z2, s3, s4, list0, v2, z3, z4);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new PermitAccess[v];
    }
}

