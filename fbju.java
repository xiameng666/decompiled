import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.wallet.firstparty.saveinstrument.Card;
import com.google.android.gms.wallet.firstparty.saveinstrument.SaveInstrumentRequest;
import java.util.ArrayList;

public final class fbju implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Card card0 = null;
        ArrayList arrayList0 = null;
        byte[] arr_b = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    card0 = (Card)baua.m(parcel0, v1, Card.CREATOR);
                    break;
                }
                case 2: {
                    arrayList0 = baua.y(parcel0, v1, UserAddress.CREATOR);
                    break;
                }
                case 3: {
                    arr_b = baua.E(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new SaveInstrumentRequest(card0, arrayList0, arr_b);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SaveInstrumentRequest[v];
    }
}

