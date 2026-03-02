import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.PassInstance;
import com.google.android.gms.pay.PassType;

public final class dlgr implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0xDADCE0;
        PassType passType0 = null;
        String s = null;
        String s1 = null;
        String s2 = null;
        Bitmap bitmap0 = null;
        String s3 = null;
        PendingIntent pendingIntent0 = null;
        String s4 = null;
        Bitmap bitmap1 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    passType0 = (PassType)baua.m(parcel0, v2, PassType.CREATOR);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 3: {
                    s1 = baua.s(parcel0, v2);
                    break;
                }
                case 4: {
                    s2 = baua.s(parcel0, v2);
                    break;
                }
                case 5: {
                    bitmap0 = (Bitmap)baua.m(parcel0, v2, Bitmap.CREATOR);
                    break;
                }
                case 6: {
                    s3 = baua.s(parcel0, v2);
                    break;
                }
                case 7: {
                    pendingIntent0 = (PendingIntent)baua.m(parcel0, v2, PendingIntent.CREATOR);
                    break;
                }
                case 8: {
                    s4 = baua.s(parcel0, v2);
                    break;
                }
                case 9: {
                    bitmap1 = (Bitmap)baua.m(parcel0, v2, Bitmap.CREATOR);
                    break;
                }
                case 10: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new PassInstance(passType0, s, s1, s2, bitmap0, s3, pendingIntent0, s4, bitmap1, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new PassInstance[v];
    }
}

