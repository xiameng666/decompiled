import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.OpenLoopMetadata;
import com.google.android.gms.pay.TicketOption;
import com.google.android.gms.pay.TransitPaymentOption;

public final class dlkl implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        TicketOption ticketOption0 = null;
        OpenLoopMetadata openLoopMetadata0 = null;
        int v1 = 0;
        boolean z = false;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 2: {
                    z = baua.D(parcel0, v2);
                    break;
                }
                case 3: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 4: {
                    s1 = baua.s(parcel0, v2);
                    break;
                }
                case 5: {
                    ticketOption0 = (TicketOption)baua.m(parcel0, v2, TicketOption.CREATOR);
                    break;
                }
                case 6: {
                    openLoopMetadata0 = (OpenLoopMetadata)baua.m(parcel0, v2, OpenLoopMetadata.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new TransitPaymentOption(v1, z, s, s1, ticketOption0, openLoopMetadata0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new TransitPaymentOption[v];
    }
}

