import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.identitycredentials.ClearRegistryRequest.ClearTypedRegistryOption;
import com.google.android.gms.identitycredentials.ClearRegistryRequest;

public final class bxub implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        ClearRegistryRequest.ClearTypedRegistryOption clearRegistryRequest$ClearTypedRegistryOption0 = null;
        boolean z = true;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    z = baua.D(parcel0, v1);
                    break;
                }
                case 2: {
                    clearRegistryRequest$ClearTypedRegistryOption0 = (ClearRegistryRequest.ClearTypedRegistryOption)baua.m(parcel0, v1, ClearRegistryRequest.ClearTypedRegistryOption.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new ClearRegistryRequest(z, clearRegistryRequest$ClearTypedRegistryOption0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ClearRegistryRequest[v];
    }
}

