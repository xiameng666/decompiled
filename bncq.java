import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;
import j..util.Objects;

public final class bncq extends wby implements bncr {
    final bncy a;

    public bncq() {
        super("com.google.android.gms.fido.u2f.api.ISignResponseHandler");
    }

    public bncq(bncl bncl0, bncy bncy0) {
        this.a = bncy0;
        Objects.requireNonNull(bncl0);
        super("com.google.android.gms.fido.u2f.api.ISignResponseHandler");
    }

    @Override  // bncr
    public final void a() {
        this.a.a();
    }

    @Override  // bncr
    public final void b(blyu blyu0, int v) {
        this.a.b(blyu0, v);
    }

    @Override  // bncr
    public final void c(ErrorResponseData errorResponseData0) {
        this.a.d(errorResponseData0);
    }

    @Override  // bncr
    public final void d(SignResponseData signResponseData0) {
        this.a.c(signResponseData0);
    }

    @Override  // bncr
    public final void e(String s) {
        this.a.e(s);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        blyu blyu0;
        switch(v) {
            case 1: {
                String s = parcel0.readString();
                bncq.gr(parcel0);
                this.e(s);
                return true;
            }
            case 2: {
                ErrorResponseData errorResponseData0 = (ErrorResponseData)wbz.a(parcel0, ErrorResponseData.CREATOR);
                bncq.gr(parcel0);
                this.c(errorResponseData0);
                return true;
            }
            case 3: {
                SignResponseData signResponseData0 = (SignResponseData)wbz.a(parcel0, SignResponseData.CREATOR);
                bncq.gr(parcel0);
                this.d(signResponseData0);
                return true;
            }
            case 4: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    blyu0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.fido.common.nfc.INfcReaderCallback");
                    blyu0 = (iInterface0 instanceof blyu) ? ((blyu)iInterface0) : new blys(iBinder0);
                }
                int v1 = parcel0.readInt();
                bncq.gr(parcel0);
                this.b(blyu0, v1);
                return true;
            }
            case 5: {
                this.a();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

