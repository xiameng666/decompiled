import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.smartdevice.d2d.data.AccountBootstrapPayload;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeSessionCheckpointsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo;
import com.google.android.gms.smartdevice.setup.accounts.UserCredential;
import java.util.ArrayList;
import java.util.HashSet;

public final class eqgp implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        HashSet hashSet0 = new HashSet();
        ArrayList arrayList0 = null;
        ArrayList arrayList1 = null;
        ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest0 = null;
        ArrayList arrayList2 = null;
        ExchangeSessionCheckpointsForUserCredentialsRequest exchangeSessionCheckpointsForUserCredentialsRequest0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    arrayList0 = baua.y(parcel0, v1, UserBootstrapInfo.CREATOR);
                    hashSet0.add(Integer.valueOf(2));
                    break;
                }
                case 3: {
                    arrayList1 = baua.y(parcel0, v1, Challenge.CREATOR);
                    hashSet0.add(Integer.valueOf(3));
                    break;
                }
                case 4: {
                    exchangeAssertionsForUserCredentialsRequest0 = (ExchangeAssertionsForUserCredentialsRequest)baua.m(parcel0, v1, ExchangeAssertionsForUserCredentialsRequest.CREATOR);
                    hashSet0.add(Integer.valueOf(4));
                    break;
                }
                case 5: {
                    arrayList2 = baua.y(parcel0, v1, UserCredential.CREATOR);
                    hashSet0.add(Integer.valueOf(5));
                    break;
                }
                case 6: {
                    exchangeSessionCheckpointsForUserCredentialsRequest0 = (ExchangeSessionCheckpointsForUserCredentialsRequest)baua.m(parcel0, v1, ExchangeSessionCheckpointsForUserCredentialsRequest.CREATOR);
                    hashSet0.add(Integer.valueOf(6));
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        if(parcel0.dataPosition() == v) {
            return new AccountBootstrapPayload(hashSet0, arrayList0, arrayList1, exchangeAssertionsForUserCredentialsRequest0, arrayList2, exchangeSessionCheckpointsForUserCredentialsRequest0);
        }
        throw new batz("Overread allowed size end=" + v, parcel0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new AccountBootstrapPayload[v];
    }
}

