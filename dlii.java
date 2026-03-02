import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.GooglePaymentMethodId;
import com.google.android.gms.pay.SeCommuterPassDetailIntentArgs;
import com.google.android.gms.pay.SeServiceProvider;

public final class dlii implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        SeServiceProvider seServiceProvider0 = null;
        GooglePaymentMethodId googlePaymentMethodId0 = null;
        String s = null;
        byte[] arr_b = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    seServiceProvider0 = (SeServiceProvider)baua.m(parcel0, v2, SeServiceProvider.CREATOR);
                    break;
                }
                case 3: {
                    googlePaymentMethodId0 = (GooglePaymentMethodId)baua.m(parcel0, v2, GooglePaymentMethodId.CREATOR);
                    break;
                }
                case 5: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 6: {
                    arr_b = baua.E(parcel0, v2);
                    break;
                }
                case 7: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new SeCommuterPassDetailIntentArgs(seServiceProvider0, googlePaymentMethodId0, s, arr_b, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SeCommuterPassDetailIntentArgs[v];
    }
}

