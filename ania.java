import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.view.autofill.AutofillId;
import com.google.android.gms.autofill.fill.SafeFillField.SafeFingerprint;
import com.google.android.gms.autofill.fill.SafeFillField;
import java.util.List;

public final class ania implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        List list0 = null;
        AutofillId autofillId0 = null;
        List list1 = null;
        List list2 = null;
        String s = null;
        List list3 = null;
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        int v5 = 0;
        while(parcel0.dataPosition() < v) {
            int v6 = parcel0.readInt();
            switch(((char)v6)) {
                case 1: {
                    list0 = baua.x(parcel0, v6);
                    break;
                }
                case 2: {
                    autofillId0 = (AutofillId)baua.m(parcel0, v6, AutofillId.CREATOR);
                    break;
                }
                case 3: {
                    v1 = baua.f(parcel0, v6);
                    break;
                }
                case 4: {
                    v2 = baua.f(parcel0, v6);
                    break;
                }
                case 5: {
                    v3 = baua.f(parcel0, v6);
                    break;
                }
                case 6: {
                    list1 = baua.v(parcel0, v6);
                    break;
                }
                case 7: {
                    list2 = baua.v(parcel0, v6);
                    break;
                }
                case 8: {
                    v4 = baua.f(parcel0, v6);
                    break;
                }
                case 9: {
                    v5 = baua.f(parcel0, v6);
                    break;
                }
                case 10: {
                    s = baua.s(parcel0, v6);
                    break;
                }
                case 11: {
                    list3 = baua.y(parcel0, v6, SafeFillField.SafeFingerprint.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v6);
                }
            }
        }
        baua.A(parcel0, v);
        return new SafeFillField(list0, autofillId0, v1, v2, v3, list1, list2, v4, v5, s, list3);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SafeFillField[v];
    }
}

