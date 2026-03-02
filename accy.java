import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.appinvite.ui.context.SelectionFragmentOptions;
import java.util.ArrayList;

public final class accy implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        ArrayList arrayList0 = null;
        String[] arr_s = null;
        String s1 = null;
        String s2 = null;
        ArrayList arrayList1 = null;
        Bundle bundle0 = null;
        int v1 = 0;
        boolean z = false;
        int v2 = 0;
        int v3 = 0;
        boolean z1 = false;
        boolean z2 = false;
        boolean z3 = false;
        while(parcel0.dataPosition() < v) {
            int v4 = parcel0.readInt();
            switch(((char)v4)) {
                case 2: {
                    s = baua.s(parcel0, v4);
                    break;
                }
                case 3: {
                    v1 = baua.f(parcel0, v4);
                    break;
                }
                case 4: {
                    arrayList0 = baua.y(parcel0, v4, ContactPerson.CREATOR);
                    break;
                }
                case 5: {
                    z = baua.D(parcel0, v4);
                    break;
                }
                case 6: {
                    arr_s = baua.K(parcel0, v4);
                    break;
                }
                case 7: {
                    v2 = baua.f(parcel0, v4);
                    break;
                }
                case 8: {
                    v3 = baua.f(parcel0, v4);
                    break;
                }
                case 9: {
                    s1 = baua.s(parcel0, v4);
                    break;
                }
                case 10: {
                    s2 = baua.s(parcel0, v4);
                    break;
                }
                case 11: {
                    z1 = baua.D(parcel0, v4);
                    break;
                }
                case 12: {
                    arrayList1 = baua.y(parcel0, v4, Bundle.CREATOR);
                    break;
                }
                case 13: {
                    z2 = baua.D(parcel0, v4);
                    break;
                }
                case 14: {
                    z3 = baua.D(parcel0, v4);
                    break;
                }
                case 15: {
                    bundle0 = baua.j(parcel0, v4);
                    break;
                }
                default: {
                    baua.C(parcel0, v4);
                }
            }
        }
        baua.A(parcel0, v);
        return new SelectionFragmentOptions(s, v1, arrayList0, z, arr_s, v2, v3, s1, s2, z1, arrayList1, z2, z3, bundle0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SelectionFragmentOptions[v];
    }
}

