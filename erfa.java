import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.smartdevice.setup.accounts.DeviceRiskSignals;
import com.google.android.gms.smartdevice.setup.accounts.ScreenlockState;
import com.google.android.gms.smartdevice.setup.accounts.StarguardData;
import java.util.HashSet;

public final class erfa implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        HashSet hashSet0 = new HashSet();
        String s = null;
        String s1 = null;
        ScreenlockState screenlockState0 = null;
        StarguardData starguardData0 = null;
        long v1 = 0L;
        long v2 = 0L;
        int v3 = 0;
        long v4 = 0L;
        while(parcel0.dataPosition() < v) {
            int v5 = parcel0.readInt();
            switch(((char)v5)) {
                case 2: {
                    int v6 = baua.f(parcel0, v5);
                    hashSet0.add(Integer.valueOf(2));
                    v3 = v6;
                    break;
                }
                case 3: {
                    v4 = baua.i(parcel0, v5);
                    hashSet0.add(Integer.valueOf(3));
                    break;
                }
                case 4: {
                    String s2 = baua.s(parcel0, v5);
                    hashSet0.add(Integer.valueOf(4));
                    s = s2;
                    break;
                }
                case 5: {
                    String s3 = baua.s(parcel0, v5);
                    hashSet0.add(Integer.valueOf(5));
                    s1 = s3;
                    break;
                }
                case 6: {
                    v1 = baua.i(parcel0, v5);
                    hashSet0.add(Integer.valueOf(6));
                    break;
                }
                case 7: {
                    v2 = baua.i(parcel0, v5);
                    hashSet0.add(Integer.valueOf(7));
                    break;
                }
                case 8: {
                    ScreenlockState screenlockState1 = (ScreenlockState)baua.m(parcel0, v5, ScreenlockState.CREATOR);
                    hashSet0.add(Integer.valueOf(8));
                    screenlockState0 = screenlockState1;
                    break;
                }
                case 9: {
                    StarguardData starguardData1 = (StarguardData)baua.m(parcel0, v5, StarguardData.CREATOR);
                    hashSet0.add(Integer.valueOf(9));
                    starguardData0 = starguardData1;
                    break;
                }
                default: {
                    baua.C(parcel0, v5);
                }
            }
        }
        if(parcel0.dataPosition() == v) {
            return new DeviceRiskSignals(hashSet0, v3, v4, s, s1, v1, v2, screenlockState0, starguardData0);
        }
        throw new batz("Overread allowed size end=" + v, parcel0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DeviceRiskSignals[v];
    }
}

