import com.google.android.gms.credential.manager.invocationparams.CredentialManagerAccount;

public final class bdfp implements bgoi {
    @Override  // bgoi
    public final evql a(CredentialManagerAccount credentialManagerAccount0) {
        graw graw0 = (graw)((ProtoLiteMessage)grbi.a).v_newBuilder();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grbh.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grbh grbh0 = (grbh)hftp0.b_message;
        grbh0.b |= 1;
        grbh0.c = 0x539;
        grbh grbh1 = (grbh)hftp0.N_build();
        if(!graw0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)graw0).ensureMutable();
        }
        grbi grbi0 = (grbi)graw0.b_message;
        grbh1.getClass();
        grbi0.c = grbh1;
        grbi0.b |= 1;
        graw0.k(bdfo.a(graz.b, "compromised"));
        graw0.k(bdfo.a(graz.c, "weak"));
        graw0.k(bdfo.a(graz.d, "reuse"));
        ProtoLiteMessage hftv0 = ((ProtoLiteBuilder)graw0).N_build();
        ibuq.e(hftv0, "build(...)");
        return evrg.d(((grbi)hftv0));
    }
}

