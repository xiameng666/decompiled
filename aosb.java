import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.autofill.fill.SafeFillField;
import com.google.android.gms.autofill.fill.SafeFillForm;
import com.google.android.gms.autofill.service.common.SafeDetectionHistory.SafeDetectionResult;
import java.util.List;

public final class aosb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        SafeFillForm safeFillForm0 = null;
        List list0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    safeFillForm0 = (SafeFillForm)baua.m(parcel0, v1, SafeFillForm.CREATOR);
                    break;
                }
                case 2: {
                    list0 = baua.y(parcel0, v1, SafeFillField.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new SafeDetectionHistory.SafeDetectionResult(safeFillForm0, list0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SafeDetectionHistory.SafeDetectionResult[v];
    }
}

