import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.credentials.CredentialRequest;

public final class ahia implements aerh {
    public final Context a;
    public final agpp b;
    public final String c;
    public final CredentialRequest d;
    public final String e;
    public final bxod f;
    public final agsh g;
    public final agqf h;

    public ahia(Context context0, String s, CredentialRequest credentialRequest0, String s1, bxod bxod0) {
        this.a = context0;
        this.g = agsh.a();
        this.h = agpq.b(context0);
        this.b = agpq.a(context0);
        this.c = s;
        this.d = credentialRequest0;
        this.e = s1;
        this.f = bxod0;
    }

    public final gmcd a(boolean z) {
        String s = axzh.b(this.c);
        Intent intent0 = new Intent("com.google.android.gms.auth.api.credentials.PICKER").setPackage("com.google.android.gms").putExtra("claimedCallingPackage", s).putExtra("firstTime", z).putExtra("logSessionId", this.e);
        bauc.l(this.d, intent0, "credentialRequest");
        bxly bxly0 = new bxly();
        bxly0.a = 0x6F06;
        bxly0.d = cjok.a(this.a, 0, intent0, 0xA000000);
        throw new gmdd(bxly0.a());
    }

    @Override  // aerh
    public final bxnj b() {
        return bxnj.s;
    }

    @Override  // aerh
    public final gmcd c(aerq aerq0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)givo.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        CredentialRequest credentialRequest0 = this.d;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((givo)hftv0).b |= 1;
        ((givo)hftv0).c = credentialRequest0.b;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((givo)hftv1).b |= 2;
        ((givo)hftv1).d = credentialRequest0.i;
        boolean z = credentialRequest0.f;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        givo givo0 = (givo)hftp0.b_message;
        givo0.b |= 4;
        givo0.e = z;
        String[] arr_s = credentialRequest0.c;
        for(int v = 0; v < arr_s.length; ++v) {
            if("https://accounts.google.com".equals(arr_s[v])) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                givo givo1 = (givo)hftp0.b_message;
                givo1.b |= 8;
                givo1.f = true;
            }
            else {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                givo givo2 = (givo)hftp0.b_message;
                givo2.b |= 16;
                givo2.g = true;
            }
        }
        bxod bxod0 = this.f;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gixr.a).v_newBuilder();
        String s = this.e;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        s.getClass();
        ((gixr)hftv2).b |= 2;
        ((gixr)hftv2).e = s;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp1.b_message;
        ((gixr)hftv3).d = 19;
        ((gixr)hftv3).b |= 1;
        if(!hftv3.isImmutable()) {
            hftp1.ensureMutable();
        }
        gixr gixr0 = (gixr)hftp1.b_message;
        givo givo3 = (givo)hftp0.N_build();
        givo3.getClass();
        gixr0.u = givo3;
        gixr0.b |= 0x40000;
        bxod0.a(((gixr)hftp1.N_build()));
        gmcd gmcd0 = new agzj(this.a).c(aerq0);
        return glzd.g(glzd.g(gmcd0, new ahhp(this, aerq0), gmap.a), new ahhr(this, gmcd0), gmap.a);
    }
}

