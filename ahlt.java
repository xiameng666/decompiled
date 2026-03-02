import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.fido.BrowserOptions;
import com.google.android.gms.auth.api.identity.ChromeOptions;

public final class ahlt implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        ByteString hfsf0 = null;
        byte[] arr_b = null;
        String s = null;
        ChromeOptions chromeOptions0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 3: {
                    arr_b = baua.E(parcel0, v1);
                    break;
                }
                case 4: {
                    chromeOptions0 = (ChromeOptions)baua.m(parcel0, v1, ChromeOptions.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        if(arr_b != null) {
            hfsf0 = ByteString.copyFrom(arr_b);
        }
        return new BrowserOptions(s, hfsf0, chromeOptions0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new BrowserOptions[v];
    }
}

