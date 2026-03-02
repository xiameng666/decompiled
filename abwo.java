import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.appdatasearch.DocumentId;
import com.google.android.gms.appdatasearch.ResultClickInfo;

public final class abwo implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        String s = null;
        DocumentId[] arr_documentId = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 2: {
                    arr_documentId = (DocumentId[])baua.J(parcel0, v2, DocumentId.CREATOR);
                    break;
                }
                case 3: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new ResultClickInfo(s, arr_documentId, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ResultClickInfo[v];
    }
}

