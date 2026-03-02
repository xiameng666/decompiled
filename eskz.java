import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.GetAllCardsResponse;

public final class eskz implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        CardInfo[] arr_cardInfo = null;
        AccountInfo accountInfo0 = null;
        String s = null;
        String s1 = null;
        SparseArray sparseArray0 = null;
        byte[] arr_b = null;
        String s2 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    arr_cardInfo = (CardInfo[])baua.J(parcel0, v1, CardInfo.CREATOR);
                    break;
                }
                case 3: {
                    accountInfo0 = (AccountInfo)baua.m(parcel0, v1, AccountInfo.CREATOR);
                    break;
                }
                case 4: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 5: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                case 6: {
                    int v2 = baua.g(parcel0, v1);
                    int v3 = parcel0.dataPosition();
                    if(v2 == 0) {
                        sparseArray0 = null;
                        continue;
                    }
                    else {
                        SparseArray sparseArray1 = new SparseArray();
                        int v4 = parcel0.readInt();
                        for(int v5 = 0; v5 < v4; ++v5) {
                            sparseArray1.append(parcel0.readInt(), parcel0.readString());
                        }
                        parcel0.setDataPosition(v3 + v2);
                        sparseArray0 = sparseArray1;
                        break;
                    }
                    arr_b = baua.E(parcel0, v1);
                    break;
                }
                case 7: {
                    arr_b = baua.E(parcel0, v1);
                    break;
                }
                case 8: {
                    s2 = baua.s(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new GetAllCardsResponse(arr_cardInfo, accountInfo0, s, s1, sparseArray0, arr_b, s2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetAllCardsResponse[v];
    }
}

