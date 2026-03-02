import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.internal.connection.ParcelByteArray;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import com.google.android.gms.nearby.sharing.internal.OnTransferUpdateParams;

public final class ddsp implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        ShareTarget shareTarget0 = null;
        TransferMetadata transferMetadata0 = null;
        ParcelByteArray parcelByteArray0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    shareTarget0 = (ShareTarget)baua.m(parcel0, v1, ShareTarget.CREATOR);
                    break;
                }
                case 2: {
                    transferMetadata0 = (TransferMetadata)baua.m(parcel0, v1, TransferMetadata.CREATOR);
                    break;
                }
                case 3: {
                    parcelByteArray0 = (ParcelByteArray)baua.m(parcel0, v1, ParcelByteArray.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new OnTransferUpdateParams(shareTarget0, transferMetadata0, parcelByteArray0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new OnTransferUpdateParams[v];
    }
}

