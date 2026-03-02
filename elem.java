import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.search.queries.GetDocumentsCall.Request;

public final class elem implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        String[] arr_s = null;
        QuerySpecification querySpecification0 = null;
        Bundle bundle0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 2: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                case 3: {
                    arr_s = baua.K(parcel0, v1);
                    break;
                }
                case 4: {
                    querySpecification0 = (QuerySpecification)baua.m(parcel0, v1, QuerySpecification.CREATOR);
                    break;
                }
                case 5: {
                    bundle0 = baua.j(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new GetDocumentsCall.Request(s, s1, arr_s, querySpecification0, bundle0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetDocumentsCall.Request[v];
    }
}

