import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.SecureElementPrepaidTosIntentArgs;
import com.google.android.gms.pay.SecureElementPrepaidTosSection;

public final class dlis implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        SecureElementPrepaidTosSection[] arr_secureElementPrepaidTosSection = null;
        String s = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    arr_secureElementPrepaidTosSection = (SecureElementPrepaidTosSection[])baua.J(parcel0, v1, SecureElementPrepaidTosSection.CREATOR);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new SecureElementPrepaidTosIntentArgs(arr_secureElementPrepaidTosSection, s);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SecureElementPrepaidTosIntentArgs[v];
    }
}

