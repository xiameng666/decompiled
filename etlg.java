import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.tapandpay.issuer.PushProvisionSessionContext;
import com.google.android.gms.tapandpay.issuer.ServerPushProvisionRequest.ExtraOptions;
import com.google.android.gms.tapandpay.issuer.ServerPushProvisionRequest;
import com.google.android.gms.tapandpay.issuer.UserAddress;

public final class etlg implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        ServerPushProvisionRequest.ExtraOptions serverPushProvisionRequest$ExtraOptions0 = new ServerPushProvisionRequest.ExtraOptions(false, false);
        PushProvisionSessionContext pushProvisionSessionContext0 = null;
        String s = null;
        UserAddress userAddress0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    pushProvisionSessionContext0 = (PushProvisionSessionContext)baua.m(parcel0, v1, PushProvisionSessionContext.CREATOR);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 3: {
                    userAddress0 = (UserAddress)baua.m(parcel0, v1, UserAddress.CREATOR);
                    break;
                }
                case 4: {
                    serverPushProvisionRequest$ExtraOptions0 = (ServerPushProvisionRequest.ExtraOptions)baua.m(parcel0, v1, ServerPushProvisionRequest.ExtraOptions.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new ServerPushProvisionRequest(pushProvisionSessionContext0, s, userAddress0, serverPushProvisionRequest$ExtraOptions0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ServerPushProvisionRequest[v];
    }
}

