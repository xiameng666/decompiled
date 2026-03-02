import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.mdocstore.DocumentRequest;
import com.google.android.gms.mdocstore.NamespaceRequest;
import com.google.android.gms.mdocstore.ReaderVerification;

public final class cqwm implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        NamespaceRequest[] arr_namespaceRequest = null;
        ReaderVerification readerVerification0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 2: {
                    arr_namespaceRequest = (NamespaceRequest[])baua.J(parcel0, v1, NamespaceRequest.CREATOR);
                    break;
                }
                case 3: {
                    readerVerification0 = (ReaderVerification)baua.m(parcel0, v1, ReaderVerification.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new DocumentRequest(s, arr_namespaceRequest, readerVerification0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DocumentRequest[v];
    }
}

