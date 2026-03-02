import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.appdatasearch.CorpusId;
import com.google.android.gms.appdatasearch.PhraseAffinityCorpusSpec;

public final class abwb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        CorpusId corpusId0 = null;
        Bundle bundle0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    corpusId0 = (CorpusId)baua.m(parcel0, v1, CorpusId.CREATOR);
                    break;
                }
                case 2: {
                    bundle0 = baua.j(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new PhraseAffinityCorpusSpec(corpusId0, bundle0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new PhraseAffinityCorpusSpec[v];
    }
}

