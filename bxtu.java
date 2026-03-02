import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.identitycredentials.ClearCreationOptionsRequest.ClearTypedCreationOption;
import com.google.android.gms.identitycredentials.ClearCreationOptionsRequest;

public final class bxtu implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        ClearCreationOptionsRequest.ClearTypedCreationOption clearCreationOptionsRequest$ClearTypedCreationOption0 = null;
        boolean z = true;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    z = baua.D(parcel0, v1);
                    break;
                }
                case 2: {
                    clearCreationOptionsRequest$ClearTypedCreationOption0 = (ClearCreationOptionsRequest.ClearTypedCreationOption)baua.m(parcel0, v1, ClearCreationOptionsRequest.ClearTypedCreationOption.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new ClearCreationOptionsRequest(z, clearCreationOptionsRequest$ClearTypedCreationOption0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ClearCreationOptionsRequest[v];
    }
}

