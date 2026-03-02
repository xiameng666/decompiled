import android.accounts.Account;
import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.home.matter.commissioning.CommissioningRequest;
import com.google.android.gms.home.matter.commissioning.DeviceInfo;

public final class bwhd implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Account account0 = null;
        String s = null;
        DeviceInfo deviceInfo0 = null;
        String s1 = null;
        String s2 = null;
        ComponentName componentName0 = null;
        Long long0 = null;
        String s3 = null;
        boolean z = false;
        boolean z1 = false;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    account0 = (Account)baua.m(parcel0, v1, Account.CREATOR);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 3: {
                    deviceInfo0 = (DeviceInfo)baua.m(parcel0, v1, DeviceInfo.CREATOR);
                    break;
                }
                case 4: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                case 5: {
                    s2 = baua.s(parcel0, v1);
                    break;
                }
                case 6: {
                    componentName0 = (ComponentName)baua.m(parcel0, v1, ComponentName.CREATOR);
                    break;
                }
                case 7: {
                    z = baua.D(parcel0, v1);
                    break;
                }
                case 8: {
                    long0 = baua.r(parcel0, v1);
                    break;
                }
                case 9: {
                    z1 = baua.D(parcel0, v1);
                    break;
                }
                case 10: {
                    s3 = baua.s(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new CommissioningRequest(account0, s, deviceInfo0, s1, s2, componentName0, z, long0, z1, s3);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new CommissioningRequest[v];
    }
}

