import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.wallet.bender3.framework.client.CancelWidgetResult;
import com.google.android.wallet.bender3.framework.client.ErrorWidgetResult;
import com.google.android.wallet.bender3.framework.client.SuccessWidgetResult;
import com.google.android.wallet.bender3.framework.client.WidgetResult;

public final class gavh implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        SuccessWidgetResult successWidgetResult0 = null;
        CancelWidgetResult cancelWidgetResult0 = null;
        ErrorWidgetResult errorWidgetResult0 = null;
        Bundle bundle0 = null;
        byte[] arr_b = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 2: {
                    successWidgetResult0 = (SuccessWidgetResult)baua.m(parcel0, v2, SuccessWidgetResult.CREATOR);
                    break;
                }
                case 3: {
                    cancelWidgetResult0 = (CancelWidgetResult)baua.m(parcel0, v2, CancelWidgetResult.CREATOR);
                    break;
                }
                case 4: {
                    errorWidgetResult0 = (ErrorWidgetResult)baua.m(parcel0, v2, ErrorWidgetResult.CREATOR);
                    break;
                }
                case 5: {
                    bundle0 = baua.j(parcel0, v2);
                    break;
                }
                case 6: {
                    arr_b = baua.E(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new WidgetResult(v1, successWidgetResult0, cancelWidgetResult0, errorWidgetResult0, bundle0, arr_b);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new WidgetResult[v];
    }
}

