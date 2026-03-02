import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.appdatasearch.PhraseAffinityCorpusSpec;
import com.google.android.gms.appdatasearch.PhraseAffinitySpecification;

public final class abwd implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        PhraseAffinityCorpusSpec[] arr_phraseAffinityCorpusSpec = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            if(((char)v1) == 1) {
                arr_phraseAffinityCorpusSpec = (PhraseAffinityCorpusSpec[])baua.J(parcel0, v1, PhraseAffinityCorpusSpec.CREATOR);
            }
            else {
                baua.C(parcel0, v1);
            }
        }
        baua.A(parcel0, v);
        return new PhraseAffinitySpecification(arr_phraseAffinityCorpusSpec);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new PhraseAffinitySpecification[v];
    }
}

