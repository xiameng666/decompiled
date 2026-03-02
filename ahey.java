import android.content.Intent;
import com.google.android.gms.auth.api.credentials.nextgen.ui.GetVerifiableCredentialChimeraActivity;

public final class ahey implements lqj {
    public final GetVerifiableCredentialChimeraActivity a;

    public ahey(GetVerifiableCredentialChimeraActivity getVerifiableCredentialChimeraActivity0) {
        this.a = getVerifiableCredentialChimeraActivity0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        int v = ((aewc)object0).b();
        Intent intent0 = ((aewc)object0).d();
        GetVerifiableCredentialChimeraActivity getVerifiableCredentialChimeraActivity0 = this.a;
        getVerifiableCredentialChimeraActivity0.setResult(v, intent0);
        ProtoLiteBuilder hftp0 = ((aewc)object0).n();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gixp)hftp0.b_message).f = 0xD7;
        ((gixp)hftp0.b_message).b |= 8;
        bxod bxod0 = getVerifiableCredentialChimeraActivity0.k;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gixr.a).v_newBuilder();
        String s = getVerifiableCredentialChimeraActivity0.j;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        s.getClass();
        ((gixr)hftv0).b |= 2;
        ((gixr)hftv0).e = s;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((gixr)hftv1).d = 17;
        ((gixr)hftv1).b |= 1;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        gixr gixr0 = (gixr)hftp1.b_message;
        gixp gixp0 = (gixp)hftp0.N_build();
        gixp0.getClass();
        gixr0.s = gixp0;
        gixr0.b |= 0x10000;
        bxod0.a(((gixr)hftp1.N_build()));
        getVerifiableCredentialChimeraActivity0.finish();
    }
}

