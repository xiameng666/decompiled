import android.accounts.Account;
import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;

public final class ajwc extends cjtm {
    private static final bboh a;
    private final azxs b;
    private final String c;
    private final byte[] d;
    private final int e;
    private final akbo f;
    private final long g;

    static {
        ajwc.a = akea.b("JoinSecurityDomainOperation");
    }

    public ajwc(azxs azxs0, String s, String s1, byte[] arr_b, int v, String s2, int v1, azug azug0) {
        super(0xAC, "JoinSecurityDomain", azug0);
        this.b = azxs0;
        this.g = SystemClock.elapsedRealtime();
        batl.q(s);
        this.c = s;
        batl.q(s1);
        batl.s(arr_b);
        this.d = arr_b;
        this.e = v;
        akbm akbm0 = new akbm();
        akbm0.a = new Account(s1, "com.google");
        akbm0.b(s);
        akbm0.b = akbn.m;
        akbm0.d = s2;
        akbm0.e = v1;
        this.f = akbm0.a();
    }

    private final void b() {
        long v = SystemClock.elapsedRealtime() - this.g;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghsq.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((ghsq)hftv0).b |= 1;
        ((ghsq)hftv0).c = 0;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghsq ghsq0 = (ghsq)hftp0.b_message;
        ghsq0.b |= 2;
        ghsq0.d = v;
        ghsq ghsq1 = (ghsq)hftp0.N_build();
        akdz.b(this.f, ghsq1);
        this.b.a(Status.b);
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        ggtj ggtj0 = (ggtj)ajwc.a.h();
        akbo akbo0 = this.f;
        ggtj0.B("JoinSecurityDomainOperation: %s", akbo0.e);
        int v = this.e;
        if(v == 3) {
            if(!akbl.x(this.c)) {
                v = 3;
                goto label_10;
            }
            this.b();
            return;
        }
    label_10:
        akdz.a(akbo0);
        try {
            new akbl(akbo0).q(this.d, v);
        }
        catch(akbi unused_ex) {
            int v1 = 7;
            int v2 = akbi0.a;
            if(v2 == 0) {
                throw null;
            }
            switch(v2 - 1) {
                case 7: {
                    break;
                }
                case 13: {
                    v1 = 38500;
                    break;
                }
                default: {
                    v1 = 8;
                }
            }
            Status status0 = new Status(v1, "Can\'t join security domain.");
            long v3 = SystemClock.elapsedRealtime() - this.g;
            akbo akbo1 = this.f;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghsq.a).v_newBuilder();
            int v4 = status0.i;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((ghsq)hftv0).b |= 1;
            ((ghsq)hftv0).c = v4;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ghsq ghsq0 = (ghsq)hftp0.b_message;
            ghsq0.b |= 2;
            ghsq0.d = v3;
            akdz.b(akbo1, ((ghsq)hftp0.N_build()));
            this.b.a(status0);
            return;
        }
        this.b();
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.a(status0);
    }
}

