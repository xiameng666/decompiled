import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.GetTransitCardsRequest;
import com.google.android.gms.pay.GetTransitPassRequest;
import com.google.android.gms.pay.TransitAgency;

public final class dlfb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Account account0 = null;
        TransitAgency[] arr_transitAgency = null;
        String s = null;
        GetTransitPassRequest getTransitPassRequest0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    account0 = (Account)baua.m(parcel0, v1, Account.CREATOR);
                    break;
                }
                case 2: {
                    arr_transitAgency = (TransitAgency[])baua.J(parcel0, v1, TransitAgency.CREATOR);
                    break;
                }
                case 3: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 4: {
                    getTransitPassRequest0 = (GetTransitPassRequest)baua.m(parcel0, v1, GetTransitPassRequest.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new GetTransitCardsRequest(account0, arr_transitAgency, s, getTransitPassRequest0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetTransitCardsRequest[v];
    }
}

