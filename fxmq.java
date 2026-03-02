import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.location.quake.ealert.ux.EAlertUxArgs;
import java.util.List;

public final class fxmq implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        boolean z = false;
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        boolean z1 = false;
        boolean z2 = false;
        boolean z3 = false;
        LatLng latLng0 = null;
        LatLng latLng1 = null;
        List list0 = null;
        String s = null;
        List list1 = null;
        String s1 = null;
        long v4 = 0L;
        long v5 = 0L;
        long v6 = 0L;
        double f = 0.0;
        float f1 = 0.0f;
        while(parcel0.dataPosition() < v) {
            int v7 = parcel0.readInt();
            switch(((char)v7)) {
                case 1: {
                    v4 = baua.i(parcel0, v7);
                    break;
                }
                case 2: {
                    latLng0 = (LatLng)baua.m(parcel0, v7, LatLng.CREATOR);
                    break;
                }
                case 3: {
                    f1 = baua.c(parcel0, v7);
                    break;
                }
                case 4: {
                    latLng1 = (LatLng)baua.m(parcel0, v7, LatLng.CREATOR);
                    break;
                }
                case 5: {
                    f = baua.b(parcel0, v7);
                    break;
                }
                case 6: {
                    list0 = baua.y(parcel0, v7, LatLng.CREATOR);
                    break;
                }
                case 7: {
                    z = baua.D(parcel0, v7);
                    break;
                }
                case 8: {
                    s = baua.s(parcel0, v7);
                    break;
                }
                case 9: {
                    v5 = baua.i(parcel0, v7);
                    break;
                }
                case 10: {
                    v6 = baua.i(parcel0, v7);
                    break;
                }
                case 11: {
                    v1 = baua.f(parcel0, v7);
                    break;
                }
                case 12: {
                    list1 = baua.y(parcel0, v7, LatLng.CREATOR);
                    break;
                }
                case 13: {
                    v2 = baua.f(parcel0, v7);
                    break;
                }
                case 14: {
                    v3 = baua.f(parcel0, v7);
                    break;
                }
                case 15: {
                    s1 = baua.s(parcel0, v7);
                    break;
                }
                case 16: {
                    z1 = baua.D(parcel0, v7);
                    break;
                }
                case 17: {
                    z2 = baua.D(parcel0, v7);
                    break;
                }
                case 18: {
                    z3 = baua.D(parcel0, v7);
                    break;
                }
                default: {
                    baua.C(parcel0, v7);
                }
            }
        }
        baua.A(parcel0, v);
        return new EAlertUxArgs(v4, latLng0, f1, latLng1, f, list0, z, s, v5, v6, v1, list1, v2, v3, s1, z1, z2, z3);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new EAlertUxArgs[v];
    }
}

