import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.blindauth.services.BlindauthApiService;

public final class atpv extends ibsl implements ibtw {
    int a;
    final BlindauthApiService b;
    final hfkp c;
    final ifvu d;
    final ifvv e;
    private Object f;

    public atpv(BlindauthApiService blindauthApiService0, hfkp hfkp0, ifvu ifvu0, ifvv ifvv0, ibrl ibrl0) {
        this.b = blindauthApiService0;
        this.c = hfkp0;
        this.d = ifvu0;
        this.e = ifvv0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((atpv)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new atpv(this.b, this.c, this.d, this.e, ibrl0);
        ibrl1.f = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        hfkq hfkq0;
        Object object1 = ibrx.a;
        switch(this.a) {
            case 0: {
                ibnx.b(object0);
                this.f = (icck)this.f;
                this.a = 1;
                object0 = this.b.b(this);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                icck icck0 = (icck)this.f;
                ibnx.b(object0);
                break;
            }
            default: {
                try {
                    ibnx.b(object0);
                    goto label_26;
                }
                catch(iapl iapl0) {
                    goto label_29;
                }
            }
        }
        gphs gphs0 = (gphs)object0;
        if(gphs0 != null) {
            try {
                atqa atqa0 = this.b.a();
                this.f = null;
                this.a = 2;
                gsyp gsyp0 = (gsyp)atqa0.a.q(cmlp.a, ckbd.b);
                gpig gpig0 = gpig.b();
                gsyp gsyp1 = (gsyp)((gsyp)gsyp0.q(gpji.g, gpig0)).q(gphs.a, gphs0);
                String s = hqnj.d();
                gsyp gsyp2 = (gsyp)gsyp1.q(gpho.a, s);
                iaof_metadata iaof0 = new iaof_metadata();
                object0 = gsyp2.b(this.c, iaof0, this);
                if(object0 == object1) {
                    return object1;
                }
            label_26:
                hfkq0 = (hfkq)object0;
            }
            catch(iapl iapl0) {
            label_29:
                ibuq.e(iapl0.a, "getStatus(...)");
                int v = atpy.a(iapl0.a);
                ifvu.c(this.e, v);
                return ibom.a;
            }
            byte[] arr_b = hfkq0.toBytesArray();
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
        ifvu.c(this.e, 0);
        return ibom.a;
    }
}

