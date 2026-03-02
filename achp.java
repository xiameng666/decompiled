import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.appsearch.JoinSpec;
import com.google.android.gms.appsearch.SearchSpec;

public final class achp implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        int v2 = 0;
        String s = null;
        SearchSpec searchSpec0 = null;
        String s1 = null;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    s = baua.s(parcel0, v3);
                    break;
                }
                case 2: {
                    searchSpec0 = (SearchSpec)baua.m(parcel0, v3, SearchSpec.CREATOR);
                    break;
                }
                case 3: {
                    s1 = baua.s(parcel0, v3);
                    break;
                }
                case 4: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                case 5: {
                    v2 = baua.f(parcel0, v3);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new JoinSpec(s, searchSpec0, s1, v1, v2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new JoinSpec[v];
    }
}

