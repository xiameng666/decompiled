import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.appdatasearch.CacheSpec;
import com.google.android.gms.appdatasearch.CorpusId;
import com.google.android.gms.appdatasearch.CorpusScoringInfo;
import com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification;
import com.google.android.gms.appdatasearch.STSortSpec;

public final class abvw implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        CorpusId[] arr_corpusId = null;
        CorpusScoringInfo[] arr_corpusScoringInfo = null;
        String s = null;
        byte[] arr_b = null;
        int[] arr_v = null;
        byte[] arr_b1 = null;
        STSortSpec sTSortSpec0 = null;
        String s1 = null;
        CacheSpec cacheSpec0 = null;
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        boolean z = false;
        boolean z1 = false;
        boolean z2 = true;
        boolean z3 = true;
        while(parcel0.dataPosition() < v) {
            int v5 = parcel0.readInt();
            switch(((char)v5)) {
                case 1: {
                    arr_corpusId = (CorpusId[])baua.J(parcel0, v5, CorpusId.CREATOR);
                    break;
                }
                case 2: {
                    v1 = baua.f(parcel0, v5);
                    break;
                }
                case 3: {
                    arr_corpusScoringInfo = (CorpusScoringInfo[])baua.J(parcel0, v5, CorpusScoringInfo.CREATOR);
                    break;
                }
                case 4: {
                    v2 = baua.f(parcel0, v5);
                    break;
                }
                case 5: {
                    v3 = baua.f(parcel0, v5);
                    break;
                }
                case 6: {
                    v4 = baua.f(parcel0, v5);
                    break;
                }
                case 7: {
                    s = baua.s(parcel0, v5);
                    break;
                }
                case 8: {
                    z = baua.D(parcel0, v5);
                    break;
                }
                case 9: {
                    arr_b = baua.E(parcel0, v5);
                    break;
                }
                case 10: {
                    z2 = baua.D(parcel0, v5);
                    break;
                }
                case 11: {
                    z3 = baua.D(parcel0, v5);
                    break;
                }
                case 12: {
                    z1 = baua.D(parcel0, v5);
                    break;
                }
                case 13: {
                    arr_v = baua.H(parcel0, v5);
                    break;
                }
                case 14: {
                    arr_b1 = baua.E(parcel0, v5);
                    break;
                }
                case 15: {
                    sTSortSpec0 = (STSortSpec)baua.m(parcel0, v5, STSortSpec.CREATOR);
                    break;
                }
                case 16: {
                    s1 = baua.s(parcel0, v5);
                    break;
                }
                case 18: {
                    cacheSpec0 = (CacheSpec)baua.m(parcel0, v5, CacheSpec.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v5);
                }
            }
        }
        baua.A(parcel0, v);
        return new GlobalSearchQuerySpecification(arr_corpusId, v1, arr_corpusScoringInfo, v2, v3, v4, s, z, arr_b, z2, z3, z1, arr_v, arr_b1, sTSortSpec0, s1, cacheSpec0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GlobalSearchQuerySpecification[v];
    }
}

