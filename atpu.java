import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.blindauth.services.BlindauthApiService;
import j..util.DesugarCollections;
import java.util.List;

public final class atpu extends ibsl implements ibtw {
    int a;
    final BlindauthApiService b;
    final hfkn c;
    final String d;
    final ifvu e;
    final ifvt f;
    private Object g;

    public atpu(BlindauthApiService blindauthApiService0, hfkn hfkn0, ifvu ifvu0, ifvt ifvt0, String s, ibrl ibrl0) {
        this.b = blindauthApiService0;
        this.c = hfkn0;
        this.e = ifvu0;
        this.f = ifvt0;
        this.d = s;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((atpu)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new atpu(this.b, this.c, this.e, this.f, this.d, ibrl0);
        ibrl1.g = object0;
        return ibrl1;
    }

    private static final void e(BlindauthApiService blindauthApiService0, String s, long v, long v1) {
        geap geap0 = (geap)((ProtoLiteMessage)geaq.a).v_newBuilder();
        ibuq.f(geap0, "builder");
        List list0 = DesugarCollections.unmodifiableList(((geaq)geap0.b_message).b);
        ibuq.e(list0, "getTokenRequestEventList(...)");
        new hfxu(list0);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)geao.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        ibuq.c(s);
        ibuq.f(s, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s.getClass();
        ((geao)hftv0).b |= 1;
        ((geao)hftv0).c = s;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((geao)hftv1).b |= 2;
        ((geao)hftv1).d = v;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        geao geao0 = (geao)hftp0.b_message;
        geao0.b |= 4;
        geao0.e = v1;
        ProtoLiteMessage hftv2 = hftp0.N_build();
        ibuq.e(hftv2, "build(...)");
        ibuq.f(((geao)hftv2), "value");
        geap0.a(((geao)hftv2));
        ProtoLiteMessage hftv3 = ((ProtoLiteBuilder)geap0).N_build();
        ibuq.e(hftv3, "build(...)");
        blindauthApiService0.d.j(((ProtoLiteMessage)(((geaq)hftv3))));
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        hfko hfko0;
        Object object1 = ibrx.a;
        switch(this.a) {
            case 0: {
                ibnx.b(object0);
                this.g = (icck)this.g;
                this.a = 1;
                object0 = this.b.b(this);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                icck icck0 = (icck)this.g;
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
                this.g = null;
                this.a = 2;
                gsyp gsyp0 = (gsyp)atqa0.a.q(cmlp.a, ckbc.b);
                gpig gpig0 = gpig.b();
                gsyp gsyp1 = (gsyp)((gsyp)gsyp0.q(gpji.g, gpig0)).q(gphs.a, gphs0);
                String s = hqnj.d();
                gsyp gsyp2 = (gsyp)gsyp1.q(gpho.a, s);
                iaof_metadata iaof0 = new iaof_metadata();
                object0 = gsyp2.a(this.c, iaof0, this);
                if(object0 == object1) {
                    return object1;
                }
            label_26:
                hfko0 = (hfko)object0;
            }
            catch(iapl iapl0) {
            label_29:
                ibuq.e(iapl0.a, "getStatus(...)");
                int v = atpy.a(iapl0.a);
                atpu.e(this.b, this.d, ((long)this.c.b.size()), 0L);
                ifvu.a(this.f, v);
                return ibom.a;
            }
            atpu.e(this.b, this.d, ((long)this.c.b.size()), ((long)hfko0.b.size()));
            byte[] arr_b = hfko0.toBytesArray();
            try {
                Parcel parcel0 = this.f.jo();
                parcel0.writeByteArray(arr_b);
                this.f.jq(1, parcel0);
            }
            catch(RemoteException remoteException0) {
                ((ggtj)((ggtj)((ggtj)BlindauthApiService.a.j()).s(remoteException0)).t(ggti.d)).x("Failed to report result via reportResult()");
            }
            return ibom.a;
        }
        ifvu.a(this.f, 0);
        return ibom.a;
    }
}

