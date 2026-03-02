import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

public final class ftqg extends wby implements IInterface {
    public final ByteString a;
    public final evqp b;

    public ftqg() {
        super("com.google.android.libraries.tapandpay.protoservice.IProtoServiceCallback");
    }

    public ftqg(ByteString hfsf0, evqp evqp0) {
        super("com.google.android.libraries.tapandpay.protoservice.IProtoServiceCallback");
        this.a = hfsf0;
        this.b = evqp0;
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 2) {
            byte[] arr_b = parcel0.createByteArray();
            ftqg.gr(parcel0);
            if(arr_b == null) {
                aztb aztb0 = new aztb(Status.d);
                this.b.d(aztb0);
                return true;
            }
            ByteString hfsf0 = ByteString.copyFrom(arr_b);
            this.b.c(hfsf0);
            return true;
        }
        return false;
    }
}

