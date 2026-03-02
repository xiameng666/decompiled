import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.autofill.data.PaymentImeCacheEntry;
import com.google.android.gms.autofill.data.SensitiveStringForIme;

public final class amoe implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        boolean z = false;
        SensitiveStringForIme sensitiveStringForIme0 = null;
        SensitiveStringForIme sensitiveStringForIme1 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    z = baua.D(parcel0, v2);
                    break;
                }
                case 2: {
                    sensitiveStringForIme0 = (SensitiveStringForIme)baua.m(parcel0, v2, SensitiveStringForIme.CREATOR);
                    break;
                }
                case 3: {
                    sensitiveStringForIme1 = (SensitiveStringForIme)baua.m(parcel0, v2, SensitiveStringForIme.CREATOR);
                    break;
                }
                case 4: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new PaymentImeCacheEntry(z, sensitiveStringForIme0, sensitiveStringForIme1, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new PaymentImeCacheEntry[v];
    }
}

