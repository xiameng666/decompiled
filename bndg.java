import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fido.u2f.api.common.BrowserSignRequestParams;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;

public final class bndg implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        SignRequestParams signRequestParams0 = null;
        Uri uri0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    signRequestParams0 = (SignRequestParams)baua.m(parcel0, v1, SignRequestParams.CREATOR);
                    break;
                }
                case 3: {
                    uri0 = (Uri)baua.m(parcel0, v1, Uri.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new BrowserSignRequestParams(signRequestParams0, uri0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new BrowserSignRequestParams[v];
    }
}

