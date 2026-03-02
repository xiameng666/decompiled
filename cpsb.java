import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public final class cpsb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        LatLng latLng0 = null;
        String s = null;
        String s1 = null;
        IBinder iBinder0 = null;
        IBinder iBinder1 = null;
        String s2 = null;
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        int v1 = 0;
        int v2 = 0;
        float f = 0.0f;
        float f1 = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 1.0f;
        float f6 = 0.5f;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 2: {
                    latLng0 = (LatLng)baua.m(parcel0, v3, LatLng.CREATOR);
                    break;
                }
                case 3: {
                    s = baua.s(parcel0, v3);
                    break;
                }
                case 4: {
                    s1 = baua.s(parcel0, v3);
                    break;
                }
                case 5: {
                    iBinder0 = baua.k(parcel0, v3);
                    break;
                }
                case 6: {
                    f = baua.c(parcel0, v3);
                    break;
                }
                case 7: {
                    f1 = baua.c(parcel0, v3);
                    break;
                }
                case 8: {
                    z = baua.D(parcel0, v3);
                    break;
                }
                case 9: {
                    z1 = baua.D(parcel0, v3);
                    break;
                }
                case 10: {
                    z2 = baua.D(parcel0, v3);
                    break;
                }
                case 11: {
                    f2 = baua.c(parcel0, v3);
                    break;
                }
                case 12: {
                    f6 = baua.c(parcel0, v3);
                    break;
                }
                case 13: {
                    f3 = baua.c(parcel0, v3);
                    break;
                }
                case 14: {
                    f5 = baua.c(parcel0, v3);
                    break;
                }
                case 15: {
                    f4 = baua.c(parcel0, v3);
                    break;
                }
                case 17: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                case 18: {
                    iBinder1 = baua.k(parcel0, v3);
                    break;
                }
                case 19: {
                    v2 = baua.f(parcel0, v3);
                    break;
                }
                case 20: {
                    s2 = baua.s(parcel0, v3);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new MarkerOptions(latLng0, s, s1, iBinder0, f, f1, z, z1, z2, f2, f6, f3, f5, f4, v1, iBinder1, v2, s2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new MarkerOptions[v];
    }
}

