import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.people.cpg.callingcard.CallingCardFontData;
import com.google.android.gms.people.cpg.callingcard.CallingCardFullScreenImageData;
import com.google.android.gms.people.cpg.callingcard.CallingCardMetadata;

public final class egcq implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        CallingCardFontData callingCardFontData0 = null;
        CallingCardFullScreenImageData callingCardFullScreenImageData0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    callingCardFontData0 = (CallingCardFontData)baua.m(parcel0, v1, CallingCardFontData.CREATOR);
                    break;
                }
                case 2: {
                    callingCardFullScreenImageData0 = (CallingCardFullScreenImageData)baua.m(parcel0, v1, CallingCardFullScreenImageData.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new CallingCardMetadata(callingCardFontData0, callingCardFullScreenImageData0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new CallingCardMetadata[v];
    }
}

