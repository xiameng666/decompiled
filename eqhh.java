import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.smartdevice.d2d.data.AccountBootstrapPayload;
import com.google.android.gms.smartdevice.d2d.data.WorkProfilePayload;
import java.util.HashSet;

public final class eqhh implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        HashSet hashSet0 = new HashSet();
        AccountBootstrapPayload accountBootstrapPayload0 = null;
        String s = null;
        int v1 = 0;
        String s1 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 2: {
                    s1 = baua.s(parcel0, v2);
                    hashSet0.add(Integer.valueOf(2));
                    break;
                }
                case 3: {
                    v1 = baua.f(parcel0, v2);
                    hashSet0.add(Integer.valueOf(3));
                    break;
                }
                case 4: {
                    accountBootstrapPayload0 = (AccountBootstrapPayload)baua.m(parcel0, v2, AccountBootstrapPayload.CREATOR);
                    hashSet0.add(Integer.valueOf(4));
                    break;
                }
                case 5: {
                    s = baua.s(parcel0, v2);
                    hashSet0.add(Integer.valueOf(5));
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        if(parcel0.dataPosition() == v) {
            return new WorkProfilePayload(hashSet0, s1, v1, accountBootstrapPayload0, s);
        }
        throw new batz("Overread allowed size end=" + v, parcel0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new WorkProfilePayload[v];
    }
}

