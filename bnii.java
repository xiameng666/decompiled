import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.findmydevice.spot.FindMyDeviceNetworkSettings;
import com.google.android.gms.findmydevice.spot.GetFindMyDeviceSettingsResponse;

public final class bnii implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        FindMyDeviceNetworkSettings findMyDeviceNetworkSettings0 = null;
        Account account0 = null;
        Long long0 = null;
        FindMyDeviceNetworkSettings findMyDeviceNetworkSettings1 = null;
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int v1 = 0;
        long v2 = 0L;
        long v3 = 0L;
        while(parcel0.dataPosition() < v) {
            int v4 = parcel0.readInt();
            switch(((char)v4)) {
                case 5: {
                    v2 = baua.i(parcel0, v4);
                    break;
                }
                case 6: {
                    z = baua.D(parcel0, v4);
                    break;
                }
                case 7: {
                    z1 = baua.D(parcel0, v4);
                    break;
                }
                case 8: {
                    z2 = baua.D(parcel0, v4);
                    break;
                }
                case 9: {
                    z3 = baua.D(parcel0, v4);
                    break;
                }
                case 10: {
                    findMyDeviceNetworkSettings0 = (FindMyDeviceNetworkSettings)baua.m(parcel0, v4, FindMyDeviceNetworkSettings.CREATOR);
                    break;
                }
                case 11: {
                    v3 = baua.i(parcel0, v4);
                    break;
                }
                case 12: {
                    account0 = (Account)baua.m(parcel0, v4, Account.CREATOR);
                    break;
                }
                case 13: {
                    z4 = baua.D(parcel0, v4);
                    break;
                }
                case 14: {
                    v1 = baua.f(parcel0, v4);
                    break;
                }
                case 15: {
                    long0 = baua.r(parcel0, v4);
                    break;
                }
                case 16: {
                    findMyDeviceNetworkSettings1 = (FindMyDeviceNetworkSettings)baua.m(parcel0, v4, FindMyDeviceNetworkSettings.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v4);
                }
            }
        }
        baua.A(parcel0, v);
        return new GetFindMyDeviceSettingsResponse(z, z1, findMyDeviceNetworkSettings0, v2, v3, z2, z3, account0, z4, v1, long0, findMyDeviceNetworkSettings1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetFindMyDeviceSettingsResponse[v];
    }
}

