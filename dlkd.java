import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.Money;
import com.google.android.gms.pay.TransitAgency;

public final class dlkd implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        Money money0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 2: {
                    money0 = (Money)baua.m(parcel0, v1, Money.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new TransitAgency(s, money0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new TransitAgency[v];
    }
}

