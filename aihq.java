import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.authzen.Permit;
import com.google.android.gms.auth.authzen.PermitAccess;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public final class aihq implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        List list0 = null;
        String s = null;
        String s1 = null;
        String s2 = null;
        PermitAccess permitAccess0 = null;
        int v1 = 0;
        ArrayList arrayList0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 3: {
                    s1 = baua.s(parcel0, v2);
                    break;
                }
                case 5: {
                    s2 = baua.s(parcel0, v2);
                    break;
                }
                case 6: {
                    permitAccess0 = (PermitAccess)baua.m(parcel0, v2, PermitAccess.CREATOR);
                    break;
                }
                case 7: {
                    list0 = baua.y(parcel0, v2, PermitAccess.CREATOR);
                    break;
                }
                case 8: {
                    arrayList0 = baua.x(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        HashMap hashMap0 = new HashMap();
        for(Object object0: list0) {
            hashMap0.put(((PermitAccess)object0).b, ((PermitAccess)object0));
        }
        return new Permit(v1, s, s1, s2, permitAccess0, hashMap0, new HashSet(arrayList0));
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new Permit[v];
    }
}

