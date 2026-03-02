import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.audiomodem.DecodedToken;
import j..util.Objects;
import java.util.ArrayList;

public final class acqg extends wby implements IInterface {
    final azyf a;

    public acqg() {
        super("com.google.android.gms.audiomodem.internal.ITokenReceiverListener");
    }

    public acqg(acpo acpo0, azyf azyf0) {
        this.a = azyf0;
        Objects.requireNonNull(acpo0);
        super("com.google.android.gms.audiomodem.internal.ITokenReceiverListener");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                ArrayList arrayList0 = parcel0.createTypedArrayList(DecodedToken.CREATOR);
                acqg.gr(parcel0);
                acpj acpj0 = new acpj(this, arrayList0);
                this.a.b(acpj0);
                break;
            }
            case 2: {
                parcel0.readInt();
                acqg.gr(parcel0);
                acpk acpk0 = new acpk(this);
                this.a.b(acpk0);
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }
}

