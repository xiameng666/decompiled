import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.data.SessionChange;

public final class bqvp implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Session session0 = null;
        long v1 = 0L;
        Session session1 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.i(parcel0, v2);
                    break;
                }
                case 2: {
                    session0 = (Session)baua.m(parcel0, v2, Session.CREATOR);
                    break;
                }
                case 3: {
                    session1 = (Session)baua.m(parcel0, v2, Session.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new SessionChange(v1, session0, session1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SessionChange[v];
    }
}

