import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.appdatasearch.GlobalSearchAppCorpusFeatures;
import com.google.android.gms.appdatasearch.GlobalSearchApplication;
import com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo;

public final class abvs implements Parcelable.Creator {
    public static void a(GlobalSearchApplication globalSearchApplication0, Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, globalSearchApplication0.a, v, false);
        baub.J(parcel0, 2, globalSearchApplication0.b, v);
        baub.e(parcel0, 3, globalSearchApplication0.c);
        baub.c(parcel0, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        boolean z = false;
        GlobalSearchApplicationInfo globalSearchApplicationInfo0 = null;
        GlobalSearchAppCorpusFeatures[] arr_globalSearchAppCorpusFeatures = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    globalSearchApplicationInfo0 = (GlobalSearchApplicationInfo)baua.m(parcel0, v1, GlobalSearchApplicationInfo.CREATOR);
                    break;
                }
                case 2: {
                    arr_globalSearchAppCorpusFeatures = (GlobalSearchAppCorpusFeatures[])baua.J(parcel0, v1, GlobalSearchAppCorpusFeatures.CREATOR);
                    break;
                }
                case 3: {
                    z = baua.D(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new GlobalSearchApplication(globalSearchApplicationInfo0, arr_globalSearchAppCorpusFeatures, z);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GlobalSearchApplication[v];
    }
}

