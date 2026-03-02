import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.semanticlocation.Parking;
import com.google.android.gms.semanticlocation.PlaceCandidate.Point;

public final class elvq implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        float f = 0.0f;
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        PlaceCandidate.Point placeCandidate$Point0 = null;
        long v4 = 0L;
        long v5 = 0L;
        while(parcel0.dataPosition() < v) {
            int v6 = parcel0.readInt();
            switch(((char)v6)) {
                case 1: {
                    v4 = baua.i(parcel0, v6);
                    break;
                }
                case 2: {
                    v5 = baua.i(parcel0, v6);
                    break;
                }
                case 3: {
                    placeCandidate$Point0 = (PlaceCandidate.Point)baua.m(parcel0, v6, PlaceCandidate.Point.CREATOR);
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
                    v3 = baua.f(parcel0, v6);
                    break;
                }
                case 7: {
                    f = baua.c(parcel0, v6);
                    break;
                }
                default: {
                    baua.C(parcel0, v6);
                }
            }
        }
        baua.A(parcel0, v);
        return new Parking(v4, v5, placeCandidate$Point0, v1, v2, v3, f);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new Parking[v];
    }
}

