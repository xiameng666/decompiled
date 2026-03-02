import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.appdatasearch.Feature;
import com.google.android.gms.appdatasearch.GlobalSearchCorpusConfig;

public final class abvv implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int[] arr_v = null;
        Feature[] arr_feature = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    arr_v = baua.H(parcel0, v1);
                    break;
                }
                case 2: {
                    arr_feature = (Feature[])baua.J(parcel0, v1, Feature.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new GlobalSearchCorpusConfig(arr_v, arr_feature);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GlobalSearchCorpusConfig[v];
    }
}

