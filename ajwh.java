import android.accounts.Account;
import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import java.io.IOException;

public final class ajwh extends cjtm {
    private static final bboh a;
    private final ajtc b;
    private final akba c;
    private final akef d;
    private final String e;
    private final String f;
    private final akbo g;
    private final long h;

    static {
        ajwh.a = akea.b("MarkLocalKeysAsStaleOperation");
    }

    public ajwh(ajtc ajtc0, String s, String s1, String s2, azug azug0) {
        super(0xAC, "MarkLocalKeysAsStale", azug0);
        this.b = ajtc0;
        this.h = SystemClock.elapsedRealtime();
        this.c = (akba)akba.b.b();
        this.d = new akef(s2);
        batl.q(s);
        this.e = s;
        batl.q(s1);
        this.f = s1;
        akbm akbm0 = new akbm();
        batl.q(s1);
        akbm0.a = new Account(s1, "com.google");
        akbm0.b(s);
        akbm0.b = akbn.d;
        akbm0.d = s2;
        this.g = akbm0.a();
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        ((ggtj)ajwh.a.h()).B("MarkLocalKeysAsStaleOperation: %s", this.g.e);
        akdz.a(this.g);
        try {
            if(!hpvv.a.g().H() || this.c.F(this.f, this.e) != 2) {
                this.c.I(this.f, this.e, 5);
                this.d.b(this.f);
            }
        }
        catch(acse | IOException unused_ex) {
            akbo akbo0 = this.g;
            akdz.j(akbo0, 13, akbo0.c.C);
            Status status0 = Status.d;
            long v = SystemClock.elapsedRealtime() - this.h;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghsq.a).v_newBuilder();
            int v1 = status0.i;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((ghsq)hftv0).b |= 1;
            ((ghsq)hftv0).c = v1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ghsq ghsq0 = (ghsq)hftp0.b_message;
            ghsq0.b |= 2;
            ghsq0.d = v;
            akdz.b(akbo0, ((ghsq)hftp0.N_build()));
            this.b.a(status0, ApiMetadata.b);
            return;
        }
        akbo akbo1 = this.g;
        new akbl(akbo1).t();
        akdz.j(akbo1, 17, akbo1.c.C);
        long v2 = SystemClock.elapsedRealtime() - this.h;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ghsq.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((ghsq)hftv1).b |= 1;
        ((ghsq)hftv1).c = 0;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        ghsq ghsq1 = (ghsq)hftp1.b_message;
        ghsq1.b |= 2;
        ghsq1.d = v2;
        akdz.b(akbo1, ((ghsq)hftp1.N_build()));
        this.b.a(Status.b, ApiMetadata.b);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.a(status0, ApiMetadata.b);
    }
}

