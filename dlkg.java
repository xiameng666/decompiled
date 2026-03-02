import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.Animation;
import com.google.android.gms.pay.TransitCardDialog;

public final class dlkg implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        String s2 = null;
        PendingIntent pendingIntent0 = null;
        String s3 = null;
        PendingIntent pendingIntent1 = null;
        Bitmap bitmap0 = null;
        Bitmap[] arr_bitmap = null;
        Animation animation0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 2: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                case 3: {
                    s2 = baua.s(parcel0, v1);
                    break;
                }
                case 4: {
                    pendingIntent0 = (PendingIntent)baua.m(parcel0, v1, PendingIntent.CREATOR);
                    break;
                }
                case 5: {
                    s3 = baua.s(parcel0, v1);
                    break;
                }
                case 6: {
                    pendingIntent1 = (PendingIntent)baua.m(parcel0, v1, PendingIntent.CREATOR);
                    break;
                }
                case 7: {
                    bitmap0 = (Bitmap)baua.m(parcel0, v1, Bitmap.CREATOR);
                    break;
                }
                case 8: {
                    arr_bitmap = (Bitmap[])baua.J(parcel0, v1, Bitmap.CREATOR);
                    break;
                }
                case 9: {
                    animation0 = (Animation)baua.m(parcel0, v1, Animation.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new TransitCardDialog(s, s1, s2, pendingIntent0, s3, pendingIntent1, bitmap0, arr_bitmap, animation0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new TransitCardDialog[v];
    }
}

