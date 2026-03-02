import android.accounts.Account;
import android.content.Context;
import android.os.SystemClock;
import android.security.keystore.recovery.RecoveryController;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.List;

public final class ajwb extends cjtm {
    private static final bboh a;
    private final ajtl b;
    private final String c;
    private final String d;
    private final String e;
    private final akeh f;
    private final akbo g;
    private final long h;

    static {
        ajwb.a = akea.b("GetSyncStatusOperation");
    }

    public ajwb(ajtl ajtl0, String s, String s1, String s2, azug azug0) {
        super(0xAC, "GetSyncStatus", azug0);
        this.b = ajtl0;
        this.h = SystemClock.elapsedRealtime();
        batl.q(s);
        this.c = s;
        batl.q(s1);
        this.d = s1;
        this.e = s2;
        this.f = (akeh)akeh.a.b();
        akbm akbm0 = new akbm();
        akbm0.a = new Account(s1, "com.google");
        akbm0.b(s);
        akbm0.b = akbn.l;
        akbm0.d = s2;
        this.g = akbm0.a();
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
        this.b.a(status0, 0, apiMetadata0);
    }

    private final void c(int v) {
        akbo akbo0 = this.g;
        ProtoLiteBuilder hftp0 = akbo0.g;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghth ghth0 = (ghth)hftp0.b_message;
        ghth0.b |= 0x10000;
        ghth0.o = v;
        long v1 = SystemClock.elapsedRealtime() - this.h;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ghsq.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((ghsq)hftv0).b |= 1;
        ((ghsq)hftv0).c = 0;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ghsq ghsq0 = (ghsq)hftp1.b_message;
        ghsq0.b |= 2;
        ghsq0.d = v1;
        akdz.b(akbo0, ((ghsq)hftp1.N_build()));
        ApiMetadata apiMetadata0 = cckf.d(bbdp.T);
        this.b.a(Status.b, v, apiMetadata0);
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        ((ggtj)ajwb.a.h()).B("GetSyncStatusOperation: %s", this.e);
        if(!akdv.b) {
            this.c(1);
            return;
        }
        try {
            if(!RecoveryController.isRecoverableKeyStoreEnabled(context0)) {
                this.c(2);
                return;
            }
            akbl akbl0 = new akbl(this.g);
            try {
                akbq akbq0 = akbl0.d();
                akea.b("RecoveryControllerProxy");
                akem.c(akbq0);
            }
            catch(akbi akbi0) {
                switch(akbi0.a) {
                    case 0: {
                        throw null;
                    }
                    case 6: {
                        this.c(4);
                        return;
                    }
                    case 7: {
                        this.c(4);
                        return;
                    }
                    case 10: {
                        this.c(3);
                        return;
                    }
                    default: {
                        a.ae(ajwb.a.j(), "INTERNAL_ERROR during GetSyncStatusOperation call", akbi0);
                        this.b(Status.d);
                        return;
                    }
                }
            }
            if(!this.f.b(this.d, this.c, this.e)) {
                this.c(5);
                return;
            }
            akbl.a.h("Checking if synced for event: %s", new Object[]{akbl0.d.c.B});
            try {
                gfsx gfsx0 = akbl0.d.b;
                if(gfsx0.i()) {
                    akba akba0 = akbl0.c;
                    Account account0 = akbl0.e;
                    if(akba0.F(account0.name, ((String)gfsx0.d())) == 3) {
                        List list0 = akba0.i(account0.name, ((String)gfsx0.d()));
                        if(!list0.isEmpty() && ((ajxe)gggq.p(list0)).c != 0) {
                            goto label_39;
                        }
                    }
                }
            }
            catch(IOException | acse exception0) {
                akbl.a.e("Exception in checking if synced.", exception0, new Object[0]);
            }
            goto label_41;
        label_39:
            this.c(7);
            return;
        label_41:
            this.c(6);
        }
        catch(IOException | acse unused_ex) {
            this.b(Status.d);
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ApiMetadata apiMetadata0 = cckf.d(bbdp.T);
        this.b.a(status0, 0, apiMetadata0);
    }
}

