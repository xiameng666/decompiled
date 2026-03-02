import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.instantapps.internal.ContentRating;
import com.google.android.gms.instantapps.internal.VisitedApplication;
import java.util.Collection;

public final class bzwm implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        BitmapTeleporter bitmapTeleporter0 = null;
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        Collection collection0 = null;
        ContentRating contentRating0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    bitmapTeleporter0 = (BitmapTeleporter)baua.m(parcel0, v1, BitmapTeleporter.CREATOR);
                    break;
                }
                case 3: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 4: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                case 5: {
                    s2 = baua.s(parcel0, v1);
                    break;
                }
                case 6: {
                    s3 = baua.s(parcel0, v1);
                    break;
                }
                case 7: {
                    collection0 = baua.x(parcel0, v1);
                    break;
                }
                case 8: {
                    contentRating0 = (ContentRating)baua.m(parcel0, v1, ContentRating.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new VisitedApplication(bitmapTeleporter0, s, s1, s2, s3, collection0, contentRating0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new VisitedApplication[v];
    }
}

