import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.appdatasearch.Feature;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall.CorpusInfo;

public final class elcp implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        Bundle bundle0 = null;
        boolean z = false;
        Feature[] arr_feature = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 2: {
                    arr_feature = (Feature[])baua.J(parcel0, v1, Feature.CREATOR);
                    break;
                }
                case 3: {
                    z = baua.D(parcel0, v1);
                    break;
                }
                case 4: {
                    bundle0 = baua.j(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new GetGlobalSearchSourcesCall.CorpusInfo(s, arr_feature, z, bundle0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetGlobalSearchSourcesCall.CorpusInfo[v];
    }
}

