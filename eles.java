import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification;
import com.google.android.gms.search.queries.GlobalQueryCall.Request;

public final class eles implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        GlobalSearchQuerySpecification globalSearchQuerySpecification0 = null;
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
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                case 3: {
                    v2 = baua.f(parcel0, v3);
                    break;
                }
                case 4: {
                    globalSearchQuerySpecification0 = (GlobalSearchQuerySpecification)baua.m(parcel0, v3, GlobalSearchQuerySpecification.CREATOR);
                    break;
                }
                case 5: {
                    bundle0 = baua.j(parcel0, v3);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new GlobalQueryCall.Request(s, v1, v2, globalSearchQuerySpecification0, bundle0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GlobalQueryCall.Request[v];
    }
}

