import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.gms.auth.folsom.ui.GenericChimeraActivity;
import com.google.android.gms.chimera.modules.auth.folsom.AppContextProvider;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public final class ajwl extends cjtm {
    private static final bboh a;
    private final ajtf b;
    private final String c;
    private final String d;
    private final boolean e;
    private final akba f;
    private final akbo g;
    private final long h;
    private final akef i;
    private final boolean j;
    private int n;

    static {
        ajwl.a = akea.b("SetConsentOperation");
    }

    public ajwl(ajtf ajtf0, String s, String s1, boolean z, String s2, boolean z1, azug azug0) {
        super(0xAC, "SetConsent", azug0);
        this.n = 0;
        this.h = SystemClock.elapsedRealtime();
        this.b = ajtf0;
        batl.q(s);
        this.c = s;
        batl.q(s1);
        this.d = s1;
        this.f = (akba)akba.b.b();
        this.i = new akef(s2);
        this.e = z;
        akbm akbm0 = new akbm();
        akbm0.a = new Account(s1, "com.google");
        akbm0.b(s);
        akbm0.b = akbn.a;
        akbm0.c = gfsx.m(Boolean.valueOf(z));
        akbm0.d = s2;
        this.g = akbm0.a();
        this.j = z1;
    }

    private final void b(Status status0) {
        long v = SystemClock.elapsedRealtime() - this.h;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghsq.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((ghsq)hftv0).b |= 1;
        ((ghsq)hftv0).c = status0.i;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghsq ghsq0 = (ghsq)hftp0.b_message;
        ghsq0.b |= 2;
        ghsq0.d = v;
        ghsq ghsq1 = (ghsq)hftp0.N_build();
        akdz.b(this.g, ghsq1);
        ApiMetadata apiMetadata0 = cckf.d(bbdp.T);
        this.b.a(status0, false, apiMetadata0);
    }

    private final int c() {
        int v = this.n;
        if(v != 0) {
            return v;
        }
        hfuo hfuo0 = hpvl.b().b;
        String s = this.c;
        if(hfuo0.contains(s)) {
            try {
                return new akbl(this.g).G();
            }
            catch(akbi akbi0) {
                a.ae(ajwl.a.j(), "Error while syncing domain recoverability status.", akbi0);
                return 2;
            }
        }
        return this.i.h(this.d, s);
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        int v;
        ((ggtj)ajwl.a.h()).B("SetConsentOperation: %s", this.g.e);
        akdz.a(this.g);
        try {
            boolean z = this.f.x(this.d, this.c);
            ProtoLiteBuilder hftp0 = this.g.g;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ghth ghth0 = (ghth)hftp0.b_message;
            ghth0.b |= 16;
            ghth0.g = z;
            boolean z1 = this.e;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ghth ghth1 = (ghth)hftp0.b_message;
            ghth1.b |= 0x20;
            ghth1.h = z1;
        }
        catch(acse | IOException exception0) {
            a.ae(ajwl.a.j(), "Could not read consent", exception0);
        }
        try {
            v = 8;
            if(this.e) {
                String s = this.c;
                if(akbl.A(s)) {
                    akbq.a(this.d, s, this.g.e);
                }
            }
        }
        catch(akbi akbi0) {
            a.ae(ajwl.a.j(), "Could not generate shared key", akbi0);
            this.b(new Status(8, "Could not generate shared key"));
            return;
        }
        try {
            if(this.e && !akbl.A(this.c)) {
                AppContextProvider.a();
                new ccmp().a(bbdg.mO);
            }
            new akbl(this.g).s();
        }
        catch(akbi akbi1) {
            bboh bboh0 = ajwl.a;
            a.ae(bboh0.i(), "Set consent failed.", akbi1);
            String s1 = this.c;
            if("chromesync".equals(s1)) {
                if(hpvv.a.g().V()) {
                    a.ae(ajwl.a.h(), "Storing consent after sync error", akbi1);
                    goto label_64;
                }
                goto label_41;
            }
            else {
            label_41:
                if(s1.contains("finder") && hpvv.q() || s1.equals("messages-backup") && hpvv.r()) {
                    a.ae(ajwl.a.h(), "Storing consent after sync error", akbi1);
                    try {
                    label_64:
                        this.f.o(this.d, this.c, this.e);
                    }
                    catch(acse | IOException exception2) {
                        a.ae(ajwl.a.j(), "Failed to store consent", exception2);
                    }
                }
                else if(s1.equals("hw_protected")) {
                    akef akef0 = this.i;
                    String s2 = this.d;
                    if(akef0.f(s2, s1)) {
                        ((ggtj)bboh0.j()).x("Shared key is available locally; Should update local consent.");
                        a.ae(ajwl.a.h(), "Storing consent after sync error", akbi1);
                        goto label_64;
                    }
                    else {
                        this.n = this.c();
                        if(!hpvl.b().b.contains(s1) && this.n == 2) {
                            try {
                                new akbl(this.g).u(s1);
                                this.n = akef0.h(s2, s1);
                            }
                            catch(akbi | acse | IOException exception1) {
                                a.ae(ajwl.a.j(), "Error while syncing domain recoverability status.", exception1);
                                goto label_60;
                            }
                        }
                        if(this.n != 2 && this.n != 3) {
                            a.ae(ajwl.a.h(), "Storing consent after sync error", akbi1);
                            goto label_64;
                        }
                        goto label_60;
                    }
                }
                else {
                label_60:
                    if(hpvv.a.g().U() && !this.e) {
                        a.ae(ajwl.a.h(), "Storing consent after sync error", akbi1);
                        goto label_64;
                    }
                }
            }
            int v1 = akbi1.a;
            switch(v1) {
                case 0: {
                    throw null;
                }
                case 14: {
                    int v2 = this.c();
                    this.n = v2;
                    int v3 = ajxh.a(v2);
                    boolean z2 = this.i.f(this.d, this.c);
                    Intent intent0 = GenericChimeraActivity.l(this.d, this.c, v3, z2, this.g.e, this.j);
                    this.b(new Status(38500, "No shared keys available", cjok.a(AppContextProvider.a(), 0, intent0, 0x4C000000)));
                    return;
                }
                default: {
                    switch(v1 - 1) {
                        case 7: {
                            v = 7;
                            break;
                        }
                        case 5: 
                        case 6: 
                        case 8: 
                        case 9: {
                            v = 38501;
                            break;
                        }
                        case 10: {
                            a.ae(ajwl.a.j(), "MISSING_PUBLIC_KEY during setConsent call.", akbi1);
                            v = 38500;
                            break;
                        }
                        case 11: {
                            v = 38500;
                            break;
                        }
                        default: {
                            a.ae(ajwl.a.j(), "INTERNAL_ERROR during setConsent call.", akbi1);
                        }
                    }
                    this.b(new Status(v, "Could not sync consent."));
                    return;
                }
            }
        }
        try {
            boolean z3 = this.e;
            if(z3) {
                String s3 = this.c;
                if(akbl.A(s3)) {
                    akba akba0 = this.f;
                    String s4 = this.d;
                    List list0 = akba0.i(s4, s3);
                    if(list0.isEmpty()) {
                        ((ggtj)ajwl.a.j()).x("Shared key was not generated");
                        this.b(new Status(8, "Shared key was not generated"));
                        return;
                    }
                    ajxe ajxe0 = (ajxe)list0.get(0);
                    ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)ajxe0).jf(5, null);
                    hftp1.X(((ProtoLiteMessage)ajxe0));
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((ajxe)hftp1.b_message).c = 1;
                    akba0.u(s4, s3, Arrays.asList(new ajxe[]{((ajxe)hftp1.N_build())}), this.g.e);
                    akba0.I(s4, s3, 3);
                }
            }
            this.f.o(this.d, this.c, z3);
            long v4 = SystemClock.elapsedRealtime() - this.h;
            akbo akbo0 = this.g;
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)ghsq.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp2.b_message;
            ((ghsq)hftv0).b |= 1;
            ((ghsq)hftv0).c = 0;
            if(!hftv0.isImmutable()) {
                hftp2.ensureMutable();
            }
            ghsq ghsq0 = (ghsq)hftp2.b_message;
            ghsq0.b |= 2;
            ghsq0.d = v4;
            akdz.b(akbo0, ((ghsq)hftp2.N_build()));
            ApiMetadata apiMetadata0 = cckf.d(bbdp.T);
            this.b.a(Status.b, false, apiMetadata0);
        }
        catch(acse | IOException exception3) {
            a.ae(ajwl.a.j(), "Failed to store consent", exception3);
            this.b(new Status(8, "Could not save consent locally."));
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ApiMetadata apiMetadata0 = cckf.d(bbdp.T);
        this.b.a(status0, false, apiMetadata0);
    }
}

