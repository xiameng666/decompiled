import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wallet.Cart;
import com.google.android.gms.wallet.WebPaymentDataRequest;

public final class faxw implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Cart cart0 = null;
        String s = null;
        String s1 = null;
        byte[] arr_b = null;
        Bundle bundle0 = null;
        boolean z = false;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    cart0 = (Cart)baua.m(parcel0, v1, Cart.CREATOR);
                    break;
                }
                case 3: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 4: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                case 5: {
                    bundle0 = baua.j(parcel0, v1);
                    break;
                }
                case 6: {
                    arr_b = baua.E(parcel0, v1);
                    break;
                }
                case 7: {
                    z = baua.D(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new WebPaymentDataRequest(cart0, s, s1, arr_b, z, bundle0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new WebPaymentDataRequest[v];
    }
}

