import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.ConnectionDelayFilters;
import com.google.android.gms.wearable.ConnectionRestrictions;
import java.util.List;

public final class fcel implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        int v2 = 0;
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        int v3 = 0;
        boolean z3 = false;
        int v4 = 0;
        int v5 = 0;
        boolean z4 = false;
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        List list0 = null;
        ConnectionRestrictions connectionRestrictions0 = null;
        ConnectionDelayFilters connectionDelayFilters0 = null;
        boolean z5 = true;
        boolean z6 = true;
        while(parcel0.dataPosition() < v) {
            int v6 = parcel0.readInt();
            switch(((char)v6)) {
                case 2: {
                    s = baua.s(parcel0, v6);
                    break;
                }
                case 3: {
                    s1 = baua.s(parcel0, v6);
                    break;
                }
                case 4: {
                    v1 = baua.f(parcel0, v6);
                    break;
                }
                case 5: {
                    v2 = baua.f(parcel0, v6);
                    break;
                }
                case 6: {
                    z = baua.D(parcel0, v6);
                    break;
                }
                case 7: {
                    z1 = baua.D(parcel0, v6);
                    break;
                }
                case 8: {
                    s2 = baua.s(parcel0, v6);
                    break;
                }
                case 9: {
                    z2 = baua.D(parcel0, v6);
                    break;
                }
                case 10: {
                    s3 = baua.s(parcel0, v6);
                    break;
                }
                case 11: {
                    s4 = baua.s(parcel0, v6);
                    break;
                }
                case 12: {
                    v3 = baua.f(parcel0, v6);
                    break;
                }
                case 13: {
                    list0 = baua.x(parcel0, v6);
                    break;
                }
                case 14: {
                    z3 = baua.D(parcel0, v6);
                    break;
                }
                case 15: {
                    z5 = baua.D(parcel0, v6);
                    break;
                }
                case 16: {
                    connectionRestrictions0 = (ConnectionRestrictions)baua.m(parcel0, v6, ConnectionRestrictions.CREATOR);
                    break;
                }
                case 17: {
                    z6 = baua.D(parcel0, v6);
                    break;
                }
                case 18: {
                    connectionDelayFilters0 = (ConnectionDelayFilters)baua.m(parcel0, v6, ConnectionDelayFilters.CREATOR);
                    break;
                }
                case 19: {
                    v4 = baua.f(parcel0, v6);
                    break;
                }
                case 20: {
                    v5 = baua.f(parcel0, v6);
                    break;
                }
                case 21: {
                    z4 = baua.D(parcel0, v6);
                    break;
                }
                default: {
                    baua.C(parcel0, v6);
                }
            }
        }
        baua.A(parcel0, v);
        return new ConnectionConfiguration(s, s1, v1, v2, z, z1, s2, z2, s3, s4, v3, list0, z3, z5, connectionRestrictions0, z6, connectionDelayFilters0, v4, v5, z4);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ConnectionConfiguration[v];
    }
}

