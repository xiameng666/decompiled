import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;

public final class aztf implements Parcelable.Creator {
    public static final aztf a;

    static {
        aztf.a = new aztf();
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = parcel0.dataPosition();
        if(parcel0.readInt() == -204102970) {
            int v1 = baua.h(parcel0);
            boolean z = false;
            ComplianceOptions complianceOptions0 = null;
            while(parcel0.dataPosition() < v1) {
                int v2 = parcel0.readInt();
                switch(((char)v2)) {
                    case 1: {
                        complianceOptions0 = (ComplianceOptions)baua.m(parcel0, v2, ComplianceOptions.CREATOR);
                        break;
                    }
                    case 2: {
                        z = baua.D(parcel0, v2);
                        break;
                    }
                    default: {
                        baua.C(parcel0, v2);
                    }
                }
            }
            baua.A(parcel0, v1);
            return new ApiMetadata(complianceOptions0, z);
        }
        parcel0.setDataPosition(v - 4);
        return ApiMetadata.a;
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ApiMetadata[v];
    }
}

