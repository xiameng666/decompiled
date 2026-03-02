import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.userlocation.CheckInReport;
import com.google.android.gms.userlocation.Position;

public final class fala implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        Position position0 = null;
        byte[] arr_b = null;
        byte[][] arr2_b = null;
        int v1 = 0;
        long v2 = 0L;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    v2 = baua.i(parcel0, v3);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v3);
                    break;
                }
                case 3: {
                    position0 = (Position)baua.m(parcel0, v3, Position.CREATOR);
                    break;
                }
                case 5: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                case 6: {
                    arr_b = baua.E(parcel0, v3);
                    break;
                }
                case 7: {
                    arr2_b = baua.M(parcel0, v3);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new CheckInReport(v2, s, position0, v1, arr_b, arr2_b);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new CheckInReport[v];
    }
}

