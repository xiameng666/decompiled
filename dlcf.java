import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.CardIdFilter;
import com.google.android.gms.pay.CardStateFilter;
import com.google.android.gms.pay.ClosedLoopCardFilter;
import com.google.android.gms.pay.DisplayCardIdFilter;

public final class dlcf implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        CardIdFilter cardIdFilter0 = null;
        DisplayCardIdFilter displayCardIdFilter0 = null;
        CardStateFilter cardStateFilter0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    cardIdFilter0 = (CardIdFilter)baua.m(parcel0, v1, CardIdFilter.CREATOR);
                    break;
                }
                case 2: {
                    displayCardIdFilter0 = (DisplayCardIdFilter)baua.m(parcel0, v1, DisplayCardIdFilter.CREATOR);
                    break;
                }
                case 3: {
                    cardStateFilter0 = (CardStateFilter)baua.m(parcel0, v1, CardStateFilter.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new ClosedLoopCardFilter(cardIdFilter0, displayCardIdFilter0, cardStateFilter0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ClosedLoopCardFilter[v];
    }
}

