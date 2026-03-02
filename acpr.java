import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.audiomodem.AdsrParams;
import com.google.android.gms.audiomodem.DtmfEncoding;

public final class acpr implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        AdsrParams adsrParams0 = null;
        float[] arr_f = null;
        int v1 = 0;
        boolean z = false;
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        int v5 = 0;
        float f = 0.0f;
        while(parcel0.dataPosition() < v) {
            int v6 = parcel0.readInt();
            switch(((char)v6)) {
                case 2: {
                    v1 = baua.f(parcel0, v6);
                    break;
                }
                case 3: {
                    z = baua.D(parcel0, v6);
                    break;
                }
                case 4: {
                    f = baua.c(parcel0, v6);
                    break;
                }
                case 5: {
                    v2 = baua.f(parcel0, v6);
                    break;
                }
                case 6: {
                    v3 = baua.f(parcel0, v6);
                    break;
                }
                case 7: {
                    v4 = baua.f(parcel0, v6);
                    break;
                }
                case 8: {
                    v5 = baua.f(parcel0, v6);
                    break;
                }
                case 9: {
                    adsrParams0 = (AdsrParams)baua.m(parcel0, v6, AdsrParams.CREATOR);
                    break;
                }
                case 10: {
                    arr_f = baua.G(parcel0, v6);
                    break;
                }
                default: {
                    baua.C(parcel0, v6);
                }
            }
        }
        baua.A(parcel0, v);
        return new DtmfEncoding(v1, z, f, v2, v3, v4, v5, adsrParams0, arr_f);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DtmfEncoding[v];
    }
}

