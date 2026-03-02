import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.mdocstore.DocumentFilter;
import com.google.android.gms.mdocstore.MobileDocumentRequest;

public final class cqxd implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        DocumentFilter documentFilter0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            if(((char)v1) == 1) {
                documentFilter0 = (DocumentFilter)baua.m(parcel0, v1, DocumentFilter.CREATOR);
            }
            else {
                baua.C(parcel0, v1);
            }
        }
        baua.A(parcel0, v);
        return new MobileDocumentRequest(documentFilter0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new MobileDocumentRequest[v];
    }
}

