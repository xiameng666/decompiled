import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fonts.FontFetchResult;
import com.google.android.gms.fonts.FontMatchSpec;

public final class brst implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Status status0 = null;
        String s = null;
        ParcelFileDescriptor parcelFileDescriptor0 = null;
        FontMatchSpec fontMatchSpec0 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 2: {
                    status0 = (Status)baua.m(parcel0, v2, Status.CREATOR);
                    break;
                }
                case 3: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 4: {
                    parcelFileDescriptor0 = (ParcelFileDescriptor)baua.m(parcel0, v2, ParcelFileDescriptor.CREATOR);
                    break;
                }
                case 5: {
                    fontMatchSpec0 = (FontMatchSpec)baua.m(parcel0, v2, FontMatchSpec.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new FontFetchResult(v1, status0, s, parcelFileDescriptor0, fontMatchSpec0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new FontFetchResult[v];
    }
}

