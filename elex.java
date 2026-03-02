import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.search.queries.QueryCall.Request;

public final class elex implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        String[] arr_s = null;
        QuerySpecification querySpecification0 = null;
        Bundle bundle0 = null;
        int v1 = 0;
        int v2 = 0;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    s = baua.s(parcel0, v3);
                    break;
                }
                case 2: {
                    s1 = baua.s(parcel0, v3);
                    break;
                }
                case 3: {
                    arr_s = baua.K(parcel0, v3);
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
                case 6: {
                    querySpecification0 = (QuerySpecification)baua.m(parcel0, v3, QuerySpecification.CREATOR);
                    break;
                }
                case 7: {
                    bundle0 = baua.j(parcel0, v3);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new QueryCall.Request(s, s1, arr_s, v1, v2, querySpecification0, bundle0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new QueryCall.Request[v];
    }
}

