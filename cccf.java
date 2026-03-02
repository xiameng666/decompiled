import android.os.IInterface;
import android.os.Parcel;
import j..util.Objects;
import java.util.logging.Level;

public final class cccf extends wby implements IInterface {
    final gmcu a;
    final String b;
    final String c;
    final cccq d;
    final byte[] e;
    final ccco f;

    public cccf() {
        super("com.google.android.gms.learning.dynamite.training.IInAppTrainingResultCallback");
    }

    public cccf(ccco ccco0, gmcu gmcu0, String s, String s1, cccq cccq0, byte[] arr_b) {
        this.a = gmcu0;
        this.b = s;
        this.c = s1;
        this.d = cccq0;
        this.e = arr_b;
        Objects.requireNonNull(ccco0);
        this.f = ccco0;
        super("com.google.android.gms.learning.dynamite.training.IInAppTrainingResultCallback");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        grgx grgx0;
        ccco ccco0;
        grhi grhi0;
        boolean z = false;
        switch(v) {
            case 6: {
                byte[] arr_b = parcel0.createByteArray();
                int v1 = parcel0.readInt();
                cccf.gr(parcel0);
                switch(v1) {
                    case 0: {
                    label_10:
                        if(arr_b != null) {
                            z = true;
                        }
                        ccco.a.g("Training ended with success (hasRetryWindow=%s).", new Object[]{Boolean.valueOf(z)});
                        break;
                    }
                    case 1: {
                        if(arr_b != null) {
                            z = true;
                        }
                        ccco.a.c(Level.WARNING, ccco.a.a, null, "Training ended with error (hasRetryWindow=%s). ", new Object[]{Boolean.valueOf(z)});
                        break;
                    }
                    default: {
                        if(v1 != 2) {
                            ccco.a.e("Training ended in unknown state.");
                            break;
                        }
                        goto label_10;
                    }
                }
                this.a.q(new gfsz(arr_b, v1));
                break;
            }
            case 7: {
                byte[] arr_b1 = parcel0.createByteArray();
                cccf.gr(parcel0);
                if(this.f.g.S(this.b)) {
                    try {
                        hftc hftc0 = hftc.a();
                        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)grhi.a), arr_b1, 0, arr_b1.length, hftc0);
                        ProtoLiteMessage.P_makeImmutable(hftv0);
                        grhi0 = (grhi)hftv0;
                        ccco0 = this.f;
                        grgx0 = grhi0.c;
                    }
                    catch(hfur hfur0) {
                        ccco.a.f(hfur0, "Could not parse TaskResultInfo proto");
                        throw new IllegalStateException(hfur0);
                    }
                    if(grgx0 == null) {
                        grgx0 = grgx.a;
                    }
                    new cchb(ccco0.c, grgx0, ccco0.i, ccco0.g, ccco.a).a(this.c, this.d, this.e, grhi0.b);
                }
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

