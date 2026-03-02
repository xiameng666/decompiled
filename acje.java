import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.appsearch.aidl.DocumentsParcel;
import com.google.android.gms.appsearch.safeparcel.GenericDocumentParcel;
import java.util.List;

public class acje implements Parcelable.Creator {
    public DocumentsParcel a(Parcel parcel0) {
        int v = baua.h(parcel0);
        List list0 = null;
        List list1 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    list0 = baua.y(parcel0, v1, GenericDocumentParcel.CREATOR);
                    break;
                }
                case 2: {
                    list1 = baua.y(parcel0, v1, GenericDocumentParcel.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new DocumentsParcel(list0, list1);
    }

    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel parcel0) {
        return this.a(parcel0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DocumentsParcel[v];
    }
}

