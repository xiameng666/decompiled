import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.GooglePaymentMethodId;
import com.google.android.gms.pay.IntentSource;
import com.google.android.gms.pay.LowBalanceNotificationSettingsIntentArgs;

public final class dlfz implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        GooglePaymentMethodId googlePaymentMethodId0 = null;
        IntentSource intentSource0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    googlePaymentMethodId0 = (GooglePaymentMethodId)baua.m(parcel0, v1, GooglePaymentMethodId.CREATOR);
                    break;
                }
                case 2: {
                    intentSource0 = (IntentSource)baua.m(parcel0, v1, IntentSource.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new LowBalanceNotificationSettingsIntentArgs(googlePaymentMethodId0, intentSource0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new LowBalanceNotificationSettingsIntentArgs[v];
    }
}

