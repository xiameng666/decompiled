import android.accounts.Account;
import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import java.io.IOException;

public final class ajwk extends cjtm {
    private static final bboh a;
    private final azxs b;
    private final akbo c;
    private final long d;
    private final byte[] e;
    private final byte[] f;

    static {
        ajwk.a = akea.b("SetClaimantKeyOperation");
    }

    public ajwk(azxs azxs0, String s, String s1, byte[] arr_b, byte[] arr_b1, String s2, azug azug0) {
        super(0xAC, "SetClaimantKey", azug0);
        this.b = azxs0;
        this.d = SystemClock.elapsedRealtime();
        akbm akbm0 = new akbm();
        akbm0.a = new Account(s1, "com.google");
        akbm0.b(s);
        akbm0.b = akbn.x;
        akbm0.d = s2;
        this.c = akbm0.a();
        this.e = arr_b;
        this.f = arr_b1;
    }

    private final void b() {
        long v = SystemClock.elapsedRealtime() - this.d;
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
        akdz.b(this.c, ghsq1);
        this.b.a(Status.b);
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        if(!hpvs.c()) {
            this.b();
            return;
        }
        ((ggtj)ajwk.a.h()).B("SetClaimantKeyOperation: %s", this.c.e);
        akdz.a(this.c);
        akba akba0 = (akba)akba.b.b();
        long v = System.currentTimeMillis();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ajwq.a).v_newBuilder();
        ByteString hfsf0 = ByteString.copyFrom(this.e);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ajwq)hftp0.b_message).b = hfsf0;
        ByteString hfsf1 = ByteString.copyFrom(this.f);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((ajwq)hftv0).c = hfsf1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ajwq)hftp0.b_message).d = v;
        ajwq ajwq0 = (ajwq)hftp0.N_build();
        try {
            ajzz ajzz0 = new ajzz(ajwq0);
            akba.g(akba0.d.b(ajzz0, gmap.a));
        }
        catch(IOException | acse unused_ex) {
            Status status0 = Status.d;
            long v1 = SystemClock.elapsedRealtime() - this.d;
            akbo akbo0 = this.c;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ghsq.a).v_newBuilder();
            int v2 = status0.i;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp1.b_message;
            ((ghsq)hftv1).b |= 1;
            ((ghsq)hftv1).c = v2;
            if(!hftv1.isImmutable()) {
                hftp1.ensureMutable();
            }
            ghsq ghsq0 = (ghsq)hftp1.b_message;
            ghsq0.b |= 2;
            ghsq0.d = v1;
            akdz.b(akbo0, ((ghsq)hftp1.N_build()));
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

