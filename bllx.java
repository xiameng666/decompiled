import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.auth.api.fido.RegistrationOptions;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;

public final class bllx extends cjtm {
    public static final bboh a;
    static final gfsi b;
    public final bmnp c;
    public final PublicKeyCredentialCreationOptions d;
    private final String e;

    static {
        bllx.a = bnaa.d("NativeAppRegisterOperation");
        bllx.b = new bllv();
    }

    public bllx(bmnp bmnp0, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions0, String s, azug azug0) {
        super(0x94, "NativeAppRegister", azug0);
        this.c = bmnp0;
        this.d = publicKeyCredentialCreationOptions0;
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
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions0 = this.d;
        PendingIntent pendingIntent0 = blyo.a(context0, bnaf.b, publicKeyCredentialCreationOptions0, gfqx.a, gfqx.a, gfqx.a);
        if(hpkt.f() && !new bmzk().a(publicKeyCredentialCreationOptions0, null, null, null).booleanValue()) {
            RegistrationOptions registrationOptions0 = (RegistrationOptions)blwp.a(publicKeyCredentialCreationOptions0, this.e, bxnm.e, false);
            gmbu.t(fhra.b(((ahmb)bllx.b.apply(context0)).d(registrationOptions0)), new bllw(this, context0, pendingIntent0), gmap.a);
            return;
        }
        if(hpkt.f()) {
            bllx.b(context0, false);
        }
        ApiMetadata apiMetadata0 = cckf.d(bbdp.bv);
        this.c.a(Status.b, pendingIntent0, apiMetadata0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.c.a(status0, null, ApiMetadata.b);
    }
}

