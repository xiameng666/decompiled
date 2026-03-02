import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.smartdevice.setup.accounts.Assertion;
import com.google.android.gms.smartdevice.setup.accounts.DeviceSignals;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;
import java.util.ArrayList;
import java.util.HashSet;

public final class erfd implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        HashSet hashSet0 = new HashSet();
        ArrayList arrayList0 = null;
        int v1 = 0;
        boolean z = false;
        int v2 = 0;
        DeviceSignals deviceSignals0 = null;
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 2: {
                    arrayList0 = baua.y(parcel0, v3, Assertion.CREATOR);
                    hashSet0.add(Integer.valueOf(2));
                    break;
                }
                case 3: {
                    deviceSignals0 = (DeviceSignals)baua.m(parcel0, v3, DeviceSignals.CREATOR);
                    hashSet0.add(Integer.valueOf(3));
                    break;
                }
                case 4: {
                    v1 = baua.f(parcel0, v3);
                    hashSet0.add(Integer.valueOf(4));
                    break;
                }
                case 5: {
                    s = baua.s(parcel0, v3);
                    hashSet0.add(Integer.valueOf(5));
                    break;
                }
                case 6: {
                    s1 = baua.s(parcel0, v3);
                    hashSet0.add(Integer.valueOf(6));
                    break;
                }
                case 7: {
                    s2 = baua.s(parcel0, v3);
                    hashSet0.add(Integer.valueOf(7));
                    break;
                }
                case 8: {
                    s3 = baua.s(parcel0, v3);
                    hashSet0.add(Integer.valueOf(8));
                    break;
                }
                case 9: {
                    z = baua.D(parcel0, v3);
                    hashSet0.add(Integer.valueOf(9));
                    break;
                }
                case 10: {
                    v2 = baua.f(parcel0, v3);
                    hashSet0.add(Integer.valueOf(10));
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        if(parcel0.dataPosition() == v) {
            return new ExchangeAssertionsForUserCredentialsRequest(hashSet0, arrayList0, deviceSignals0, v1, s, s1, s2, s3, z, v2);
        }
        throw new batz("Overread allowed size end=" + v, parcel0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ExchangeAssertionsForUserCredentialsRequest[v];
    }
}

