import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.data.Application;
import com.google.android.gms.fitness.data.Session;

public final class bqvq implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        String s2 = null;
        Application application0 = null;
        Long long0 = null;
        int v1 = 0;
        long v2 = 0L;
        long v3 = 0L;
        while(parcel0.dataPosition() < v) {
            int v4 = parcel0.readInt();
            switch(((char)v4)) {
                case 1: {
                    v2 = baua.i(parcel0, v4);
                    break;
                }
                case 2: {
                    v3 = baua.i(parcel0, v4);
                    break;
                }
                case 3: {
                    s = baua.s(parcel0, v4);
                    break;
                }
                case 4: {
                    s1 = baua.s(parcel0, v4);
                    break;
                }
                case 5: {
                    s2 = baua.s(parcel0, v4);
                    break;
                }
                case 7: {
                    v1 = baua.f(parcel0, v4);
                    break;
                }
                case 8: {
                    application0 = (Application)baua.m(parcel0, v4, Application.CREATOR);
                    break;
                }
                case 9: {
                    long0 = baua.r(parcel0, v4);
                    break;
                }
                default: {
                    baua.C(parcel0, v4);
                }
            }
        }
        baua.A(parcel0, v);
        return new Session(v2, v3, s, s1, s2, v1, application0, long0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new Session[v];
    }
}

