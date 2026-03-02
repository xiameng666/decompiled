import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;

public final class fcqp implements Runnable {
    public final fcrb a;
    public final String b;
    public final AtomicLong c;
    public final gmcd d;
    public final gmbt e;
    public final gmbt f;

    public fcqp(fcrb fcrb0, String s, AtomicLong atomicLong0, gmbt gmbt0, gmbt gmbt1, gmcd gmcd0) {
        this.a = fcrb0;
        this.b = s;
        this.c = atomicLong0;
        this.e = gmbt0;
        this.f = gmbt1;
        this.d = gmcd0;
    }

    @Override
    public final void run() {
        String s;
        int v1;
        try {
            fcrb fcrb0 = this.a;
            fcrb0.a(this.b);
            boolean z = ((Boolean)gmbu.r(this.e)).booleanValue();
            boolean z1 = ((Boolean)gmbu.r(this.f)).booleanValue();
            boolean z2 = ((Boolean)gmbu.r(this.d)).booleanValue();
            long v = System.currentTimeMillis() - this.c.get();
            if(!z || !z1) {
                v1 = z || z1 || z2 ? 3 : 4;
            }
            else if(z2) {
                v1 = 2;
            }
            else {
                v1 = z || z1 ? 3 : 4;
            }
            baun baun0 = fcrb.a;
            switch(v1) {
                case 2: {
                    s = "SUCCESS";
                    break;
                }
                case 3: {
                    s = "PARTIAL_SUCCESS";
                    break;
                }
                default: {
                    s = "FAILED";
                }
            }
            baun0.h("Watch restore %s: timeElapsedMs=%d", new Object[]{s, v});
            fcok fcok0 = fcrb0.j;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giav.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((giav)hftv0).c = v1 - 1;
            ((giav)hftv0).b |= 1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            giav giav0 = (giav)hftp0.b_message;
            giav0.b |= 2;
            giav0.d = v;
            giav giav1 = (giav)hftp0.N_build();
            ProtoLiteBuilder hftp1 = fcok.e();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ghys ghys0 = (ghys)hftp1.b_message;
            giav1.getClass();
            ghys0.z = giav1;
            ghys0.b |= 0x1000000;
            fcok0.g(hftp1, ghyr.t);
        }
        catch(ExecutionException executionException0) {
            fcrb.a.g("Wear services restore is done, but system restore or play reinstall aren\'t", executionException0, new Object[0]);
        }
    }
}

