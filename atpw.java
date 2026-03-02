import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.blindauth.services.BlindauthApiService;

public final class atpw extends ibsl implements ibtw {
    int a;
    final BlindauthApiService b;
    final hfkr c;
    final ifvu d;
    final ifvw e;
    private Object f;

    public atpw(BlindauthApiService blindauthApiService0, hfkr hfkr0, ifvu ifvu0, ifvw ifvw0, ibrl ibrl0) {
        this.b = blindauthApiService0;
        this.c = hfkr0;
        this.d = ifvu0;
        this.e = ifvw0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((atpw)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new atpw(this.b, this.c, this.d, this.e, ibrl0);
        ibrl1.f = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        hfks hfks0;
        gsyp gsyp2;
        gphs gphs0;
        Object object1 = ibrx.a;
        switch(this.a) {
            case 0: {
                ibnx.b(object0);
                icck icck0 = (icck)this.f;
                if(hqnj.a.c().e()) {
                    this.f = icck0;
                    this.a = 1;
                    object0 = this.b.b(this);
                    if(object0 == object1) {
                        return object1;
                    }
                    goto label_16;
                }
                else {
                    gphs0 = null;
                }
                break;
            }
            case 1: {
                icck icck1 = (icck)this.f;
                ibnx.b(object0);
            label_16:
                gphs0 = (gphs)object0;
                if(gphs0 == null) {
                    ifvu.d(this.e, 0);
                    return ibom.a;
                }
                break;
            }
            default: {
                try {
                    ibnx.b(object0);
                    goto label_36;
                }
                catch(iapl iapl0) {
                    goto label_39;
                }
            }
        }
        try {
            atqa atqa0 = this.b.a();
            hfkr hfkr0 = this.c;
            this.f = null;
            this.a = 2;
            gsyp gsyp0 = (gsyp)atqa0.a.q(cmlp.a, ckbe.b);
            String s = hqnj.d();
            gsyp gsyp1 = (gsyp)gsyp0.q(gpho.a, s);
            if(gphs0 == null) {
                gpjh gpjh0 = gpjh.b(atqa0.b);
                gsyp2 = (gsyp)gsyp1.q(gpji.g, gpjh0);
            }
            else {
                gpig gpig0 = gpig.b();
                gsyp2 = (gsyp)((gsyp)gsyp1.q(gpji.g, gpig0)).q(gphs.a, gphs0);
            }
            object0 = gsyp2.c(hfkr0, new iaof_metadata(), this);
            if(object0 == object1) {
                return object1;
            }
        label_36:
            hfks0 = (hfks)object0;
        }
        catch(iapl iapl0) {
        label_39:
            ibuq.e(iapl0.a, "getStatus(...)");
            int v = atpy.a(iapl0.a);
            ifvu.d(this.e, v);
            return ibom.a;
        }
        byte[] arr_b = hfks0.toBytesArray();
        try {
            Parcel parcel0 = this.e.jo();
            parcel0.writeByteArray(arr_b);
            this.e.jq(1, parcel0);
        }
        catch(RemoteException remoteException0) {
            ((ggtj)((ggtj)((ggtj)BlindauthApiService.a.j()).s(remoteException0)).t(ggti.d)).x("Failed to report result via reportResult()");
        }
        return ibom.a;
    }
}

