import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.corpora.GetCorpusInfoCall.Response;

public final class elbi implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Status status0 = null;
        RegisterCorpusInfo registerCorpusInfo0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    status0 = (Status)baua.m(parcel0, v1, Status.CREATOR);
                    break;
                }
                case 2: {
                    registerCorpusInfo0 = (RegisterCorpusInfo)baua.m(parcel0, v1, RegisterCorpusInfo.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new GetCorpusInfoCall.Response(status0, registerCorpusInfo0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetCorpusInfoCall.Response[v];
    }
}

