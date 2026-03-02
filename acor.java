import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.asterism.SetAsterismConsentRequest;
import com.google.android.gms.asterism.SetAsterismConsentResponse;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.UUID;

public final class acor extends cjtm {
    public static final baun a;
    public final acoy b;
    public final SetAsterismConsentRequest c;
    public final Context d;
    public final bcqx e;
    public final UUID f;
    public int g;
    public int h;
    public byte[] i;
    private final bcqh j;
    private final acoo n;

    static {
        acor.a = bcrh.a("api_set_asterism_consent");
    }

    public acor(Context context0, acoy acoy0, SetAsterismConsentRequest setAsterismConsentRequest0, azug azug0) {
        super(0xC7, "SetAsterismConsent", azug0);
        this.j = new acon(this, new bblf(new bblg(9)));
        this.d = context0;
        this.b = acoy0;
        this.c = setAsterismConsentRequest0;
        this.e = bcqx.a(context0);
        UUID uUID0 = UUID.randomUUID();
        this.f = uUID0;
        acor.a.h("Starting session. sessionId: %s for SetAsterismConsent API call", new Object[]{uUID0.toString()});
        this.n = new acoo(this);
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        int v10;
        int v9;
        acor acor0;
        gfsx gfsx0;
        boolean z;
        hodo hodo0;
        hobg hobg0;
        bcqx bcqx0 = this.e;
        UUID uUID0 = this.f;
        bcqx0.L(uUID0, 15);
        if(!hrcv.d()) {
            bcqx0.f(uUID0, gmfz.ba, gmfx.aN);
            this.j(new Status(34500));
            return;
        }
        SetAsterismConsentRequest setAsterismConsentRequest0 = this.c;
        if(setAsterismConsentRequest0 == null) {
            bcqx0.f(uUID0, gmfz.ba, gmfx.aO);
            this.j(new Status(34502));
            return;
        }
        this.g = setAsterismConsentRequest0.a;
        int v = setAsterismConsentRequest0.b;
        switch(v) {
            case 1: {
                hobg0 = hobg.b;
                break;
            }
            case 2: {
                hobg0 = hobg.c;
                break;
            }
            default: {
                this.e.f(this.f, gmfz.ba, gmfx.aP);
                this.j(new Status(34502));
                return;
            }
        }
        switch(setAsterismConsentRequest0.f) {
            case 1: {
                hodo0 = hodo.b;
                z = true;
                break;
            }
            case 2: 
            case 3: {
                hodo0 = hodo.c;
                z = false;
                break;
            }
            default: {
                this.e.f(this.f, gmfz.ba, gmfx.aQ);
                this.j(new Status(34502));
                return;
            }
        }
        hrcv hrcv0 = hrcv.a;
        if(hrcv0.b().d()) {
            bcpv.a(context0);
            if(!bcpv.b(context0)) {
                this.e.f(this.f, gmfz.ba, gmfx.aY);
                this.j(new Status(34505));
                return;
            }
        }
        this.h = setAsterismConsentRequest0.h;
        bcqh bcqh0 = this.j;
        Bundle bundle0 = setAsterismConsentRequest0.g;
        int v2 = setAsterismConsentRequest0.q;
        acoq acoq0 = new acoq(this, context0, bcqx0, hobg0, z, hodq.b(setAsterismConsentRequest0.q), bundle0, bcqh0);
        if(hrcv0.b().k() && SetAsterismConsentRequest.a(v, setAsterismConsentRequest0.s, setAsterismConsentRequest0.r)) {
            bbvl.h();
            hoea hoea0 = hoea.b(this.c.s);
            hofh hofh0 = hofh.b(this.c.r);
            Intent intent0 = bbvl.b(context0, this.f, hobg0, z, this.c.g, this.j);
            intent0.putExtra("eventmanager.audit_token", null);
            intent0.putExtra("eventmanager.device_verification_consent_version", hoea0.a());
            intent0.putExtra("eventmanager.device_verification_consent_source", hofh0.a());
            context0.startService(intent0);
            return;
        }
        int v3 = this.h;
        if(v3 != 1 && v3 != 2) {
            if(v3 == 3) {
                String s = setAsterismConsentRequest0.j;
                String s1 = setAsterismConsentRequest0.k;
                String s2 = setAsterismConsentRequest0.o;
                String s3 = setAsterismConsentRequest0.p;
                String s4 = setAsterismConsentRequest0.n;
                if(!gfta.c(s) && !gfta.c(s1) && !gfta.c(s2) && !gfta.c(s3) && !gfta.c(s4)) {
                    bcqe.h();
                    bcrd bcrd0 = new bcrd(uUID0.toString());
                    Bundle bundle1 = new Bundle();
                    try {
                        gfsx0 = gfsx.m(new bcqc(s4, acso.e(context0, s4), acso.h(context0, s4, hrfc.c(), bundle1)));
                    }
                    catch(IOException | acse exception0) {
                        bcqx.a(context0).e(bcrd0, gmfz.G, exception0);
                        bcqe.a.m("Account id cannot be obtained for account " + s4, new Object[0]);
                        gfsx0 = gfqx.a;
                    }
                    if(!gfsx0.i()) {
                        this.e.f(this.f, gmfz.ba, gmfx.aT);
                        this.j(new Status(34502));
                        return;
                    }
                    int v4 = this.h;
                    String s5 = ((bcqc)gfsx0.d()).a;
                    String s6 = ((bcqc)gfsx0.d()).b;
                    acop acop0 = new acop(this, context0, this.e, hobg0, z, this.c.g, this.j, s6, s2, s3);
                    acor0 = this;
                    SetAsterismConsentRequest setAsterismConsentRequest1 = this.n.a.c;
                    long v5 = (long)setAsterismConsentRequest1.e;
                    String s7 = gfta.b(setAsterismConsentRequest1.l);
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grke.a).v_newBuilder();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp0.b_message;
                    s.getClass();
                    ((grke)hftv0).b |= 8;
                    ((grke)hftv0).f = s;
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp0.b_message;
                    s1.getClass();
                    ((grke)hftv1).b |= 16;
                    ((grke)hftv1).g = s1;
                    if(!hftv1.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv2 = hftp0.b_message;
                    ((grke)hftv2).b |= 0x40;
                    ((grke)hftv2).i = s7;
                    if(!hftv2.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv3 = hftp0.b_message;
                    s2.getClass();
                    ((grke)hftv3).b |= 0x100;
                    ((grke)hftv3).k = s2;
                    if(!hftv3.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv4 = hftp0.b_message;
                    s3.getClass();
                    ((grke)hftv4).b |= 0x200;
                    ((grke)hftv4).l = s3;
                    int v6 = bcps.c(v4);
                    if(!hftv4.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv5 = hftp0.b_message;
                    ((grke)hftv5).c = v6 - 1;
                    ((grke)hftv5).b |= 1;
                    if(!hftv5.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv6 = hftp0.b_message;
                    setAsterismConsentRequest1.i.getClass();
                    ((grke)hftv6).b |= 2;
                    ((grke)hftv6).d = setAsterismConsentRequest1.i;
                    if(!hftv6.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    grke grke0 = (grke)hftp0.b_message;
                    grke0.b |= 4;
                    grke0.e = v5;
                    grke grke1 = (grke)hftp0.N_build();
                    String s8 = Long.toHexString(bapf.h(context0));
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grkr.a).v_newBuilder();
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)grkn.a).v_newBuilder();
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    grkn grkn0 = (grkn)hftp2.b_message;
                    s8.getClass();
                    grkn0.b |= 1;
                    grkn0.c = s8;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    grkr grkr0 = (grkr)hftp1.b_message;
                    grkn grkn1 = (grkn)hftp2.N_build();
                    grkn1.getClass();
                    grkr0.d = grkn1;
                    grkr0.b |= 4;
                    ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)grko.a).v_newBuilder();
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    grko grko0 = (grko)hftp3.b_message;
                    grko0.b = 1;
                    grko0.c = s5;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    grkr grkr1 = (grkr)hftp1.b_message;
                    grko grko1 = (grko)hftp3.N_build();
                    grko1.getClass();
                    grkr1.c = grko1;
                    grkr1.b |= 1;
                    grkr grkr2 = (grkr)hftp1.N_build();
                    acor0.i = bcps.b(context0, hobg0, setAsterismConsentRequest1.c, grke1, hodo0, grkr2, acop0);
                    goto label_270;
                }
                bcqx0.f(uUID0, gmfz.ba, gmfx.aT);
                this.j(new Status(34502));
                return;
            }
            acor0 = this;
            int[] arr_v = acor0.c.d;
            if(arr_v != null && arr_v.length != 0) {
                SetAsterismConsentRequest setAsterismConsentRequest2 = acor0.n.a.c;
                long v7 = (long)setAsterismConsentRequest2.e;
                grjx grjx0 = (grjx)((ProtoLiteMessage)grjy.a).v_newBuilder();
                for(int v1 = 0; v1 < arr_v.length; ++v1) {
                    grjx0.k(arr_v[v1]);
                }
                ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)grke.a).v_newBuilder();
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                grke grke2 = (grke)hftp4.b_message;
                grjy grjy0 = (grjy)((ProtoLiteBuilder)grjx0).N_build();
                grjy0.getClass();
                grke2.j = grjy0;
                grke2.b |= 0x80;
                int v8 = bcps.c(v3);
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                ProtoLiteMessage hftv7 = hftp4.b_message;
                ((grke)hftv7).c = v8 - 1;
                ((grke)hftv7).b |= 1;
                if(!hftv7.isImmutable()) {
                    hftp4.ensureMutable();
                }
                ProtoLiteMessage hftv8 = hftp4.b_message;
                setAsterismConsentRequest2.i.getClass();
                ((grke)hftv8).b |= 2;
                ((grke)hftv8).d = setAsterismConsentRequest2.i;
                if(!hftv8.isImmutable()) {
                    hftp4.ensureMutable();
                }
                grke grke3 = (grke)hftp4.b_message;
                grke3.b |= 4;
                grke3.e = v7;
                grke grke4 = (grke)hftp4.N_build();
                acor0.i = bcps.a(context0, hobg0, setAsterismConsentRequest2.c, grke4, hodo0, acoq0);
                goto label_270;
            }
            acor0.e.f(acor0.f, gmfz.ba, gmfx.aR);
            acor0.j(new Status(34502));
            return;
        }
        acor0 = this;
        if(hrcv0.b().j()) {
            if(hrcv.h()) {
                v9 = v2;
                if(SetAsterismConsentRequest.b(v, v9)) {
                    v10 = v9;
                    bbvl.h();
                    bbvl.f(context0, uUID0, hobg0, z, hodq.b(v10), bundle0, null, bcqh0);
                    return;
                }
            }
            else {
                v9 = v2;
            }
            if(v == 2 && v9 == 2) {
                v10 = 2;
                bbvl.h();
                bbvl.f(context0, uUID0, hobg0, z, hodq.b(v10), bundle0, null, bcqh0);
                return;
            }
        }
        String s9 = setAsterismConsentRequest0.j;
        String s10 = setAsterismConsentRequest0.k;
        if(!gfta.c(s9) && !gfta.c(s10)) {
            int v11 = acor0.h;
            SetAsterismConsentRequest setAsterismConsentRequest3 = acor0.n.a.c;
            long v12 = (long)setAsterismConsentRequest3.e;
            String s11 = gfta.b(setAsterismConsentRequest3.l);
            String s12 = gfta.b(setAsterismConsentRequest3.m);
            ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)grke.a).v_newBuilder();
            if(!hftp5.b_message.isImmutable()) {
                hftp5.ensureMutable();
            }
            ProtoLiteMessage hftv9 = hftp5.b_message;
            s9.getClass();
            ((grke)hftv9).b |= 8;
            ((grke)hftv9).f = s9;
            if(!hftv9.isImmutable()) {
                hftp5.ensureMutable();
            }
            ProtoLiteMessage hftv10 = hftp5.b_message;
            s10.getClass();
            ((grke)hftv10).b |= 16;
            ((grke)hftv10).g = s10;
            if(!hftv10.isImmutable()) {
                hftp5.ensureMutable();
            }
            ProtoLiteMessage hftv11 = hftp5.b_message;
            ((grke)hftv11).b |= 0x40;
            ((grke)hftv11).i = s11;
            if(!hftv11.isImmutable()) {
                hftp5.ensureMutable();
            }
            ProtoLiteMessage hftv12 = hftp5.b_message;
            ((grke)hftv12).b |= 0x20;
            ((grke)hftv12).h = s12;
            int v13 = bcps.c(v11);
            if(!hftv12.isImmutable()) {
                hftp5.ensureMutable();
            }
            ProtoLiteMessage hftv13 = hftp5.b_message;
            ((grke)hftv13).c = v13 - 1;
            ((grke)hftv13).b |= 1;
            if(!hftv13.isImmutable()) {
                hftp5.ensureMutable();
            }
            ProtoLiteMessage hftv14 = hftp5.b_message;
            setAsterismConsentRequest3.i.getClass();
            ((grke)hftv14).b |= 2;
            ((grke)hftv14).d = setAsterismConsentRequest3.i;
            if(!hftv14.isImmutable()) {
                hftp5.ensureMutable();
            }
            grke grke5 = (grke)hftp5.b_message;
            grke5.b |= 4;
            grke5.e = v12;
            grke grke6 = (grke)hftp5.N_build();
            acor0.i = bcps.a(context0, hobg0, setAsterismConsentRequest3.c, grke6, hodo0, acoq0);
        label_270:
            if(acor0.i == null) {
                acor0.e.f(acor0.f, gmfz.ba, gmfx.aU);
                acor0.j(new Status(34503));
            }
            return;
        }
        bcqx0.f(uUID0, gmfz.ba, gmfx.aS);
        acor0.j(new Status(34502));
    }

    @Override  // cjtm
    public final void j(Status status0) {
        SetAsterismConsentResponse setAsterismConsentResponse0 = new SetAsterismConsentResponse(this.g, "", "");
        ApiMetadata apiMetadata0 = cckf.d(bbdp.aK);
        this.b.c(status0, setAsterismConsentResponse0, apiMetadata0);
    }
}

