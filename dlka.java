import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.Transaction;
import com.google.android.gms.pay.TransactionDetailIntentArgs;

public final class dlka implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        String s = null;
        String s1 = null;
        Transaction transaction0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 2: {
                    s1 = baua.s(parcel0, v2);
                    break;
                }
                case 3: {
                    transaction0 = (Transaction)baua.m(parcel0, v2, Transaction.CREATOR);
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
        return new TransactionDetailIntentArgs(s, s1, transaction0, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new TransactionDetailIntentArgs[v];
    }
}

