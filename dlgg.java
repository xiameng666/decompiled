import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.EncryptionParameters;
import com.google.android.gms.pay.MdocResult;

public final class dlgg implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        byte[] arr_b = null;
        EncryptionParameters encryptionParameters0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 2: {
                    arr_b = baua.E(parcel0, v1);
                    break;
                }
                case 3: {
                    encryptionParameters0 = (EncryptionParameters)baua.m(parcel0, v1, EncryptionParameters.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new MdocResult(s, arr_b, encryptionParameters0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new MdocResult[v];
    }
}

