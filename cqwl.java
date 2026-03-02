import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.mdocstore.DocumentFilter;
import com.google.android.gms.mdocstore.DocumentSpecification;

public final class cqwl implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        DocumentSpecification[] arr_documentSpecification = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            if(((char)v1) == 1) {
                arr_documentSpecification = (DocumentSpecification[])baua.J(parcel0, v1, DocumentSpecification.CREATOR);
            }
            else {
                baua.C(parcel0, v1);
            }
        }
        baua.A(parcel0, v);
        return new DocumentFilter(arr_documentSpecification);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DocumentFilter[v];
    }
}

