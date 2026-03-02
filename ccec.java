import android.os.IInterface;
import android.os.Parcel;

public final class ccec extends wby implements IInterface {
    final enne a;

    public ccec() {
        super("com.google.android.gms.learning.internal.training.IBrellaInvocationCallback");
    }

    public ccec(enne enne0) {
        this.a = enne0;
        super("com.google.android.gms.learning.internal.training.IBrellaInvocationCallback");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        enne enne0;
        ccfo ccfo0;
        int v1 = 0;
        switch(v) {
            case 4: {
                byte[] arr_b = parcel0.createByteArray();
                ccec.gr(parcel0);
                try {
                    hftc hftc0 = hftc.a();
                    ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)ccfo.a), arr_b, 0, arr_b.length, hftc0);
                    ProtoLiteMessage.P_makeImmutable(hftv0);
                    ccfo0 = (ccfo)hftv0;
                    enne0 = this.a;
                    switch(ccfo0.b) {
                        case 0: {
                            break;
                        }
                        case 1: {
                            v1 = 3;
                            goto label_19;
                        }
                        case 2: {
                            goto label_18;
                        }
                        default: {
                            goto label_19;
                        }
                    }
                }
                catch(hfur hfur0) {
                    throw new gmdd(hfur0);
                }
                v1 = 2;
                goto label_19;
            label_18:
                v1 = 4;
            label_19:
                if(v1 == 3) {
                    enne0.a = gfsx.m(ccfo0);
                    enne0.d.f.e("FederatedAnalyticsBrellaInvocationSuccess");
                }
                break;
            }
            case 5: {
                byte[] arr_b1 = parcel0.createByteArray();
                ccec.gr(parcel0);
                try {
                    hftc hftc1 = hftc.a();
                    ProtoLiteMessage hftv1 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)ccfp.a), arr_b1, 0, arr_b1.length, hftc1);
                    ProtoLiteMessage.P_makeImmutable(hftv1);
                    ccfp ccfp0 = (ccfp)hftv1;
                }
                catch(hfur hfur1) {
                    throw new gmdd(hfur1);
                }
                synchronized(this.a.d.a) {
                    this.a.d.e.remove(this.a.b);
                }
                this.a.c.q(this.a.a);
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

