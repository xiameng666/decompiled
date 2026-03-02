import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.auth.api.fido.AuthenticationOptions;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;

public final class blma extends cjtm {
    public static final bboh a;
    static final gfsi b;
    public final bmnp c;
    private final PublicKeyCredentialRequestOptions d;
    private final String e;

    static {
        blma.a = bnaa.d("NativeAppSignOperation");
        blma.b = new blly();
    }

    public blma(bmnp bmnp0, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions0, String s, azug azug0) {
        super(0x94, "NativeAppSign", azug0);
        this.c = bmnp0;
        this.d = publicKeyCredentialRequestOptions0;
        this.e = s;
    }

    public static final void b(Context context0, boolean z) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)givx.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        givx givx0 = (givx)hftp0.b_message;
        givx0.b |= 1;
        givx0.c = z;
        givx givx1 = (givx)hftp0.N_build();
        bxod bxod0 = bxoc.a(context0, null);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gixr.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gixr)hftv0).d = 0x20;
        ((gixr)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        gixr gixr0 = (gixr)hftp1.b_message;
        givx1.getClass();
        gixr0.G = givx1;
        gixr0.b |= 0x80000000;
        bxod0.a(((gixr)hftp1.N_build()));
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions0 = this.d;
        PendingIntent pendingIntent0 = blyo.a(context0, bnaf.b, publicKeyCredentialRequestOptions0, gfqx.a, gfqx.a, gfqx.a);
        if(hpkt.f() && !new bmzk().a(publicKeyCredentialRequestOptions0, null, null, null).booleanValue()) {
            AuthenticationOptions authenticationOptions0 = (AuthenticationOptions)blwp.a(publicKeyCredentialRequestOptions0, this.e, bxnm.f, false);
            gmbu.t(fhra.b(((ahmb)blma.b.apply(context0)).c(authenticationOptions0)), new bllz(this, context0, pendingIntent0), gmap.a);
            return;
        }
        if(hpkt.f()) {
            blma.b(context0, false);
        }
        ApiMetadata apiMetadata0 = cckf.d(bbdp.bv);
        this.c.a(Status.b, pendingIntent0, apiMetadata0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.c.a(status0, null, ApiMetadata.b);
    }
}

