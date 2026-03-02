import android.os.IInterface;
import android.os.Parcel;
import com.google.android.libraries.tapandpay.riker.aidl.GetRikerProvisionPayloadResponseParcelable;

public final class ftqr extends wby implements IInterface {
    final icbi a;

    public ftqr() {
        super("com.google.android.libraries.tapandpay.riker.aidl.IRikerIsolatedResultCallback");
    }

    public ftqr(icbi icbi0) {
        this.a = icbi0;
        super("com.google.android.libraries.tapandpay.riker.aidl.IRikerIsolatedResultCallback");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        Object object0;
        if(v == 2) {
            GetRikerProvisionPayloadResponseParcelable getRikerProvisionPayloadResponseParcelable0 = (GetRikerProvisionPayloadResponseParcelable)wbz.a(parcel0, GetRikerProvisionPayloadResponseParcelable.CREATOR);
            ftqr.gr(parcel0);
            ibuq.f(getRikerProvisionPayloadResponseParcelable0, "response");
            icbi icbi0 = this.a;
            try {
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)ftrc.a), getRikerProvisionPayloadResponseParcelable0.a, 0, getRikerProvisionPayloadResponseParcelable0.a.length, hftc.a);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                object0 = (ftrc)hftv0;
                ibuq.e(object0, "parseFrom(...)");
            }
            catch(Throwable throwable0) {
                object0 = ibnx.a(throwable0);
            }
            icbi0.w(object0);
            return true;
        }
        return false;
    }
}

