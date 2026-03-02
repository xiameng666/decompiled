import android.os.IInterface;
import android.os.Parcel;
import j..util.Objects;

public final class acqf extends wby implements IInterface {
    final azyf a;

    public acqf() {
        super("com.google.android.gms.audiomodem.internal.ITokenBroadcasterListener");
    }

    public acqf(acpo acpo0, azyf azyf0) {
        this.a = azyf0;
        Objects.requireNonNull(acpo0);
        super("com.google.android.gms.audiomodem.internal.ITokenBroadcasterListener");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            parcel0.readInt();
            acqf.gr(parcel0);
            acpn acpn0 = new acpn(this);
            this.a.b(acpn0);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

