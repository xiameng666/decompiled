import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.ApiLoaderConfig;
import com.google.android.gms.pay.ClosedLoopCardsConfig;
import com.google.android.gms.pay.PaymentMethodsConfig;
import com.google.android.gms.pay.ValuablesConfig;

public final class dlbq implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        PaymentMethodsConfig paymentMethodsConfig0 = null;
        ClosedLoopCardsConfig closedLoopCardsConfig0 = null;
        int v1 = 0;
        ValuablesConfig valuablesConfig0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 2: {
                    paymentMethodsConfig0 = (PaymentMethodsConfig)baua.m(parcel0, v2, PaymentMethodsConfig.CREATOR);
                    break;
                }
                case 3: {
                    valuablesConfig0 = (ValuablesConfig)baua.m(parcel0, v2, ValuablesConfig.CREATOR);
                    break;
                }
                case 4: {
                    closedLoopCardsConfig0 = (ClosedLoopCardsConfig)baua.m(parcel0, v2, ClosedLoopCardsConfig.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new ApiLoaderConfig(v1, paymentMethodsConfig0, valuablesConfig0, closedLoopCardsConfig0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ApiLoaderConfig[v];
    }
}

