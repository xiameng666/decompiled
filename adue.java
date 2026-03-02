import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorTransferInfo;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import java.util.HashSet;

public final class adue implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        HashSet hashSet0 = new HashSet();
        int v1 = 0;
        String s = null;
        byte[] arr_b = null;
        PendingIntent pendingIntent0 = null;
        DeviceMetaData deviceMetaData0 = null;
        int v2 = 0;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    v1 = baua.f(parcel0, v3);
                    hashSet0.add(Integer.valueOf(1));
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v3);
                    hashSet0.add(Integer.valueOf(2));
                    break;
                }
                case 3: {
                    v2 = baua.f(parcel0, v3);
                    hashSet0.add(Integer.valueOf(3));
                    break;
                }
                case 4: {
                    arr_b = baua.E(parcel0, v3);
                    hashSet0.add(Integer.valueOf(4));
                    break;
                }
                case 5: {
                    pendingIntent0 = (PendingIntent)baua.m(parcel0, v3, PendingIntent.CREATOR);
                    hashSet0.add(Integer.valueOf(5));
                    break;
                }
                case 6: {
                    deviceMetaData0 = (DeviceMetaData)baua.m(parcel0, v3, DeviceMetaData.CREATOR);
                    hashSet0.add(Integer.valueOf(6));
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        if(parcel0.dataPosition() == v) {
            return new AuthenticatorTransferInfo(hashSet0, v1, s, v2, arr_b, pendingIntent0, deviceMetaData0);
        }
        throw new batz("Overread allowed size end=" + v, parcel0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new AuthenticatorTransferInfo[v];
    }
}

