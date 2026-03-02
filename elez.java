import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.appdatasearch.SuggestSpecification;
import com.google.android.gms.search.queries.QuerySuggestCall.Request;

public final class elez implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        String[] arr_s = null;
        SuggestSpecification suggestSpecification0 = null;
        Bundle bundle0 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 2: {
                    s1 = baua.s(parcel0, v2);
                    break;
                }
                case 3: {
                    arr_s = baua.K(parcel0, v2);
                    break;
                }
                case 4: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 5: {
                    suggestSpecification0 = (SuggestSpecification)baua.m(parcel0, v2, SuggestSpecification.CREATOR);
                    break;
                }
                case 6: {
                    bundle0 = baua.j(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new QuerySuggestCall.Request(s, s1, arr_s, v1, suggestSpecification0, bundle0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new QuerySuggestCall.Request[v];
    }
}

