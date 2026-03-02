import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.findmydevice.spot.FastPairDeviceMetadata;
import com.google.android.gms.findmydevice.spot.UpdateFastPairDeviceRequest;

public final class bnju implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Account account0 = null;
        byte[] arr_b = null;
        FastPairDeviceMetadata fastPairDeviceMetadata0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    account0 = (Account)baua.m(parcel0, v1, Account.CREATOR);
                    break;
                }
                case 2: {
                    arr_b = baua.E(parcel0, v1);
                    break;
                }
                case 3: {
                    fastPairDeviceMetadata0 = (FastPairDeviceMetadata)baua.m(parcel0, v1, FastPairDeviceMetadata.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new UpdateFastPairDeviceRequest(account0, arr_b, fastPairDeviceMetadata0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new UpdateFastPairDeviceRequest[v];
    }
}

