import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.PayCardArt;
import com.google.android.gms.pay.PayCardArtInfo;

public final class dlgz implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        PayCardArtInfo payCardArtInfo0 = null;
        Bitmap bitmap0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    payCardArtInfo0 = (PayCardArtInfo)baua.m(parcel0, v1, PayCardArtInfo.CREATOR);
                    break;
                }
                case 2: {
                    bitmap0 = (Bitmap)baua.m(parcel0, v1, Bitmap.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new PayCardArt(payCardArtInfo0, bitmap0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new PayCardArt[v];
    }
}

