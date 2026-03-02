import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import java.util.List;

public final class bmim implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        byte[] arr_b = null;
        List list0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 3: {
                    arr_b = baua.E(parcel0, v1);
                    break;
                }
                case 4: {
                    list0 = baua.y(parcel0, v1, Transport.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new PublicKeyCredentialDescriptor(s, arr_b, list0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new PublicKeyCredentialDescriptor[v];
    }
}

