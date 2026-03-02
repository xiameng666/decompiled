import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.appdatasearch.DocumentResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.queries.GetDocumentsCall.Response;

public final class elen implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Status status0 = null;
        DocumentResults documentResults0 = null;
        Bundle bundle0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    status0 = (Status)baua.m(parcel0, v1, Status.CREATOR);
                    break;
                }
                case 2: {
                    documentResults0 = (DocumentResults)baua.m(parcel0, v1, DocumentResults.CREATOR);
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
        return new GetDocumentsCall.Response(status0, documentResults0, bundle0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetDocumentsCall.Response[v];
    }
}

