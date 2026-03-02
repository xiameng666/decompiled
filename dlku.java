import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.BulkImportUcpMetadata;
import com.google.android.gms.pay.UserCreatedPassVerticalMetadata;

public final class dlku implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        BulkImportUcpMetadata bulkImportUcpMetadata0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            if(((char)v1) == 1) {
                bulkImportUcpMetadata0 = (BulkImportUcpMetadata)baua.m(parcel0, v1, BulkImportUcpMetadata.CREATOR);
            }
            else {
                baua.C(parcel0, v1);
            }
        }
        baua.A(parcel0, v);
        return new UserCreatedPassVerticalMetadata(bulkImportUcpMetadata0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new UserCreatedPassVerticalMetadata[v];
    }
}

