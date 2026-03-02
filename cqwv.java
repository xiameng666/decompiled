import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.mdocstore.GetMdocInfoListRequest;
import com.google.android.gms.mdocstore.MobileDocumentRequest;

public final class cqwv implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Account account0 = null;
        MobileDocumentRequest mobileDocumentRequest0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    account0 = (Account)baua.m(parcel0, v1, Account.CREATOR);
                    break;
                }
                case 2: {
                    mobileDocumentRequest0 = (MobileDocumentRequest)baua.m(parcel0, v1, MobileDocumentRequest.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new GetMdocInfoListRequest(account0, mobileDocumentRequest0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetMdocInfoListRequest[v];
    }
}

