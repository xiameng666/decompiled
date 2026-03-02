import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.smartdevice.setup.accounts.DeviceSignals;
import com.google.android.gms.smartdevice.setup.accounts.UserPresence;
import java.util.HashSet;

public final class erfb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        HashSet hashSet0 = new HashSet();
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
        UserPresence userPresence0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    s = baua.s(parcel0, v1);
                    hashSet0.add(Integer.valueOf(2));
                    break;
                }
                case 3: {
                    s1 = baua.s(parcel0, v1);
                    hashSet0.add(Integer.valueOf(3));
                    break;
                }
                case 4: {
                    s2 = baua.s(parcel0, v1);
                    hashSet0.add(Integer.valueOf(4));
                    break;
                }
                case 5: {
                    s3 = baua.s(parcel0, v1);
                    hashSet0.add(Integer.valueOf(5));
                    break;
                }
                case 6: {
                    s4 = baua.s(parcel0, v1);
                    hashSet0.add(Integer.valueOf(6));
                    break;
                }
                case 7: {
                    s5 = baua.s(parcel0, v1);
                    hashSet0.add(Integer.valueOf(7));
                    break;
                }
                case 8: {
                    userPresence0 = (UserPresence)baua.m(parcel0, v1, UserPresence.CREATOR);
                    hashSet0.add(Integer.valueOf(8));
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        if(parcel0.dataPosition() == v) {
            return new DeviceSignals(hashSet0, s, s1, s2, s3, s4, s5, userPresence0);
        }
        throw new batz("Overread allowed size end=" + v, parcel0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DeviceSignals[v];
    }
}

