import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.SePrepaidMfiCardDetailIntentArgs;
import com.google.android.gms.pay.SeServiceProvider;

public final class dlim implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        SeServiceProvider seServiceProvider0 = null;
        String s = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    seServiceProvider0 = (SeServiceProvider)baua.m(parcel0, v1, SeServiceProvider.CREATOR);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new SePrepaidMfiCardDetailIntentArgs(seServiceProvider0, s);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SePrepaidMfiCardDetailIntentArgs[v];
    }
}

