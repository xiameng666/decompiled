import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.appdatasearch.CorpusId;
import com.google.android.gms.appdatasearch.PhraseAffinityResponse;

public final class abwc implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        CorpusId[] arr_corpusId = null;
        int[] arr_v = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 2: {
                    arr_corpusId = (CorpusId[])baua.J(parcel0, v1, CorpusId.CREATOR);
                    break;
                }
                case 3: {
                    arr_v = baua.H(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new PhraseAffinityResponse(s, arr_corpusId, arr_v);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new PhraseAffinityResponse[v];
    }
}

