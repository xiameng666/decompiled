import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall.CorpusInfo;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall.GlobalSearchSource;

public final class elcq implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        boolean z = false;
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        GetGlobalSearchSourcesCall.CorpusInfo[] arr_getGlobalSearchSourcesCall$CorpusInfo = null;
        while(parcel0.dataPosition() < v) {
            int v4 = parcel0.readInt();
            switch(((char)v4)) {
                case 1: {
                    s = baua.s(parcel0, v4);
                    break;
                }
                case 2: {
                    v1 = baua.f(parcel0, v4);
                    break;
                }
                case 3: {
                    v2 = baua.f(parcel0, v4);
                    break;
                }
                case 4: {
                    v3 = baua.f(parcel0, v4);
                    break;
                }
                case 5: {
                    s2 = baua.s(parcel0, v4);
                    break;
                }
                case 6: {
                    s3 = baua.s(parcel0, v4);
                    break;
                }
                case 7: {
                    s4 = baua.s(parcel0, v4);
                    break;
                }
                case 8: {
                    arr_getGlobalSearchSourcesCall$CorpusInfo = (GetGlobalSearchSourcesCall.CorpusInfo[])baua.J(parcel0, v4, GetGlobalSearchSourcesCall.CorpusInfo.CREATOR);
                    break;
                }
                case 9: {
                    z = baua.D(parcel0, v4);
                    break;
                }
                case 10: {
                    s1 = baua.s(parcel0, v4);
                    break;
                }
                default: {
                    baua.C(parcel0, v4);
                }
            }
        }
        baua.A(parcel0, v);
        return new GetGlobalSearchSourcesCall.GlobalSearchSource(s, s1, v1, v2, v3, s2, s3, s4, arr_getGlobalSearchSourcesCall$CorpusInfo, z);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetGlobalSearchSourcesCall.GlobalSearchSource[v];
    }
}

