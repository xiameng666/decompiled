import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

public final class acqc extends wby implements IInterface {
    private final azvd a;

    public acqc() {
        super("com.google.android.gms.audiomodem.internal.IAudioModemCallback");
    }

    private acqc(azvd azvd0) {
        super("com.google.android.gms.audiomodem.internal.IAudioModemCallback");
        this.a = azvd0;
    }

    public static acqc a(evqp evqp0) {
        return new acqc(new acqa(evqp0));
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            acqc.gr(parcel0);
            this.a.b(status0);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

