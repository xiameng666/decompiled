import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.view.autofill.AutofillId;
import com.google.android.gms.autofill.metrics.SafeFillContext;
import com.google.android.gms.autofill.metrics.SafeMetricsContext;
import java.util.List;

public final class aoau implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        byte[] arr_b = null;
        byte[] arr_b1 = null;
        List list0 = null;
        List list1 = null;
        List list2 = null;
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        while(parcel0.dataPosition() < v) {
            int v4 = parcel0.readInt();
            switch(((char)v4)) {
                case 1: {
                    v1 = baua.f(parcel0, v4);
                    break;
                }
                case 2: {
                    arr_b = baua.E(parcel0, v4);
                    break;
                }
                case 3: {
                    arr_b1 = baua.E(parcel0, v4);
                    break;
                }
                case 4: {
                    v2 = baua.f(parcel0, v4);
                    break;
                }
                case 5: {
                    v3 = baua.f(parcel0, v4);
                    break;
                }
                case 6: {
                    list0 = baua.y(parcel0, v4, AutofillId.CREATOR);
                    break;
                }
                case 7: {
                    list1 = baua.v(parcel0, v4);
                    break;
                }
                case 8: {
                    list2 = baua.y(parcel0, v4, SafeFillContext.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v4);
                }
            }
        }
        baua.A(parcel0, v);
        return new SafeMetricsContext(v1, arr_b, arr_b1, v2, v3, list0, list1, list2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SafeMetricsContext[v];
    }
}

