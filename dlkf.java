import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.TransitCard;
import com.google.android.gms.pay.TransitCardDialog;

public final class dlkf implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        Bitmap bitmap0 = null;
        Bitmap bitmap1 = null;
        String s1 = null;
        String s2 = null;
        PendingIntent pendingIntent0 = null;
        TransitCardDialog transitCardDialog0 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 3: {
                    bitmap0 = (Bitmap)baua.m(parcel0, v2, Bitmap.CREATOR);
                    break;
                }
                case 4: {
                    bitmap1 = (Bitmap)baua.m(parcel0, v2, Bitmap.CREATOR);
                    break;
                }
                case 5: {
                    s1 = baua.s(parcel0, v2);
                    break;
                }
                case 6: {
                    s2 = baua.s(parcel0, v2);
                    break;
                }
                case 7: {
                    pendingIntent0 = (PendingIntent)baua.m(parcel0, v2, PendingIntent.CREATOR);
                    break;
                }
                case 8: {
                    transitCardDialog0 = (TransitCardDialog)baua.m(parcel0, v2, TransitCardDialog.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new TransitCard(v1, s, bitmap0, bitmap1, s1, s2, pendingIntent0, transitCardDialog0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new TransitCard[v];
    }
}

