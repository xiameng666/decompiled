import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.mdocstore.DataElement;
import com.google.android.gms.mdocstore.NamespaceRequest;

public final class cqxf implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String[] arr_s = null;
        DataElement[] arr_dataElement = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 2: {
                    arr_s = baua.K(parcel0, v1);
                    break;
                }
                case 3: {
                    arr_dataElement = (DataElement[])baua.J(parcel0, v1, DataElement.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new NamespaceRequest(s, arr_s, arr_dataElement);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new NamespaceRequest[v];
    }
}

