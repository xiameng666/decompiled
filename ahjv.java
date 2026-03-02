import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.auth.api.credentials.yolo.ui.CredentialPickerChimeraActivity;

public final class ahjv implements gful_cronetEngineProvider {
    public final CredentialPickerChimeraActivity a;

    public ahjv(CredentialPickerChimeraActivity credentialPickerChimeraActivity0) {
        this.a = credentialPickerChimeraActivity0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        CredentialPickerChimeraActivity credentialPickerChimeraActivity0 = this.a;
        if(credentialPickerChimeraActivity0.l.i()) {
            adwo adwo0 = credentialPickerChimeraActivity0.r;
            String s = credentialPickerChimeraActivity0.j;
            CredentialRequest credentialRequest0 = (CredentialRequest)credentialPickerChimeraActivity0.l.d();
            azzc azzc0 = new azzc();
            azzc0.d = 0x5F2;
            azzc0.a = new advy(s, credentialRequest0);
            return fhra.b(adwo0.iG(azzc0.a()));
        }
        Object object0 = credentialPickerChimeraActivity0.k.d();
        bxod bxod0 = credentialPickerChimeraActivity0.t;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gixr.a).v_newBuilder();
        String s1 = credentialPickerChimeraActivity0.s;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s1.getClass();
        ((gixr)hftv0).b |= 2;
        ((gixr)hftv0).e = s1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gixr)hftp0.b_message).d = 18;
        ((gixr)hftp0.b_message).b |= 1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giwx.a).v_newBuilder();
        boolean z = ((HintRequest)object0).c;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((giwx)hftv1).b |= 1;
        ((giwx)hftv1).c = z;
        boolean z1 = ((HintRequest)object0).d;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        ((giwx)hftv2).b |= 2;
        ((giwx)hftv2).d = z1;
        boolean z2 = ((HintRequest)object0).f;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        giwx giwx0 = (giwx)hftp1.b_message;
        giwx0.b |= 4;
        giwx0.e = z2;
        giwx giwx1 = (giwx)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gixr gixr0 = (gixr)hftp0.b_message;
        giwx1.getClass();
        gixr0.t = giwx1;
        gixr0.b |= 0x20000;
        bxod0.a(((gixr)hftp0.N_build()));
        adwo adwo1 = credentialPickerChimeraActivity0.r;
        Object object1 = credentialPickerChimeraActivity0.k.d();
        azzc azzc1 = new azzc();
        azzc1.d = 0x5F3;
        azzc1.a = new adwh(((HintRequest)object1));
        return glzd.f(fhra.b(adwo1.iG(azzc1.a())), new ahjs(), gmap.a);
    }
}

