import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wallet.firstparty.pm.SecurePaymentsData;
import com.google.android.gms.wallet.firstparty.pm.SecurePaymentsPayload;

public final class fbjo implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        byte[] arr_b = null;
        SecurePaymentsData[] arr_securePaymentsData = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    arr_b = baua.E(parcel0, v1);
                    break;
                }
                case 3: {
                    arr_securePaymentsData = (SecurePaymentsData[])baua.J(parcel0, v1, SecurePaymentsData.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new SecurePaymentsPayload(arr_b, arr_securePaymentsData);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SecurePaymentsPayload[v];
    }
}

