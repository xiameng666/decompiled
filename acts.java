import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.aang.GetTokenResponse;
import com.google.android.gms.auth.aang.Oauth2TokenMetadata;

public final class acts implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        Oauth2TokenMetadata oauth2TokenMetadata0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 2: {
                    oauth2TokenMetadata0 = (Oauth2TokenMetadata)baua.m(parcel0, v1, Oauth2TokenMetadata.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new GetTokenResponse(s, oauth2TokenMetadata0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetTokenResponse[v];
    }
}

