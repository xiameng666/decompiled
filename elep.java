import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.appdatasearch.PhraseAffinityCorpusSpec;
import com.google.android.gms.search.queries.GetPhraseAffinityCall.Request;

public final class elep implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String[] arr_s = null;
        PhraseAffinityCorpusSpec[] arr_phraseAffinityCorpusSpec = null;
        Bundle bundle0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    arr_s = baua.K(parcel0, v1);
                    break;
                }
                case 2: {
                    arr_phraseAffinityCorpusSpec = (PhraseAffinityCorpusSpec[])baua.J(parcel0, v1, PhraseAffinityCorpusSpec.CREATOR);
                    break;
                }
                case 3: {
                    bundle0 = baua.j(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new GetPhraseAffinityCall.Request(arr_s, arr_phraseAffinityCorpusSpec, bundle0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetPhraseAffinityCall.Request[v];
    }
}

