import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.quickstart.RestoreAnytimeContext;
import java.util.ArrayList;
import java.util.HashSet;

public final class eqxv implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        HashSet hashSet0 = new HashSet();
        String s = null;
        int v1 = 0;
        boolean z = false;
        int v2 = 0;
        String s1 = null;
        ArrayList arrayList0 = null;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    s = baua.s(parcel0, v3);
                    hashSet0.add(Integer.valueOf(1));
                    break;
                }
                case 2: {
                    s1 = baua.s(parcel0, v3);
                    hashSet0.add(Integer.valueOf(2));
                    break;
                }
                case 3: {
                    v1 = baua.f(parcel0, v3);
                    hashSet0.add(Integer.valueOf(3));
                    break;
                }
                case 4: {
                    arrayList0 = baua.y(parcel0, v3, BootstrapAccount.CREATOR);
                    hashSet0.add(Integer.valueOf(4));
                    break;
                }
                case 5: {
                    z = baua.D(parcel0, v3);
                    hashSet0.add(Integer.valueOf(5));
                    break;
                }
                case 6: {
                    v2 = baua.f(parcel0, v3);
                    hashSet0.add(Integer.valueOf(6));
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        if(parcel0.dataPosition() == v) {
            return new RestoreAnytimeContext(hashSet0, s, s1, v1, arrayList0, z, v2);
        }
        throw new batz("Overread allowed size end=" + v, parcel0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new RestoreAnytimeContext[v];
    }
}

