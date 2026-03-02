import android.os.SystemClock;
import android.util.Log;
import j..util.Objects;
import j..util.concurrent.ConcurrentLinkedQueue;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

public final class fdrx {
    public final ConcurrentLinkedQueue a;
    public final ConcurrentLinkedQueue b;
    final fdsh c;
    private final fdyc d;

    public fdrx(fdsh fdsh0, fdyc fdyc0) {
        Objects.requireNonNull(fdsh0);
        this.c = fdsh0;
        super();
        this.d = fdyc0;
        this.a = new ConcurrentLinkedQueue();
        this.b = new ConcurrentLinkedQueue();
    }

    public final boolean a(String s) {
        fdrx fdrx0 = this;
        fdsh fdsh0 = fdrx0.c;
        boolean z = fdsh0.r();
        fdrw fdrw0 = fdrx0.b(z);
        boolean z1 = false;
        if(fdrw0.a != null && Log.isLoggable("CloudNode", 2)) {
            Log.v("CloudNode", "processAssetUploads: there are assets to send, processing...");
        }
        for(fdrw fdrw1 = fdrw0; true; fdrw1 = fdrx0.b(z)) {
            fdty fdty0 = fdrw1.a;
            if(fdty0 == null || !fdsh0.s()) {
                break;
            }
            String s1 = fdty0.a;
            if(fdsh0.p() && fdso.n(s1)) {
                try {
                    s1 = fdsh0.m.d(s1);
                }
                catch(GeneralSecurityException generalSecurityException0) {
                    Log.w("CloudNode", "processAssetUploads: decrypting encrypted asset digest failed.", generalSecurityException0);
                }
            }
            File file0 = fdrx0.d.a(s1);
            if(file0 != null) {
                boolean z2 = fdty0.b;
                long v = file0.length();
                if(z2 && fdrx0.c.n() && v >= hzuz.c() && !z) {
                    Log.i("CloudNode", "Skipping upload of large asset " + s1 + " on metered network (" + v + " >= " + hzuz.c() + ")");
                    fdrx0.b.add(fdty0);
                }
                else {
                    if(z2) {
                        fdsh.i(fdrx0.c.z);
                        long v1 = SystemClock.elapsedRealtime();
                        try {
                            fdrx0.c.h.c(s1, fdty0.a);
                            fdsh.v(11, v1, 1);
                        }
                        catch(fdsp | IOException exception0) {
                            fdsh.w(11, v1, exception0);
                            throw exception0;
                        }
                    }
                    fdsh.i(fdrx0.c.z);
                    Set set0 = fdrx0.c.g.C(s1);
                    long v2 = SystemClock.elapsedRealtime();
                    try {
                        fdtx fdtx0 = fdrx0.c.H;
                        ggoh ggoh0 = new ggoh(new fdsi(fdty0.a, set0));
                        fdwc fdwc0 = fdtx0.b;
                        fdwc0.a(":putAssetAcls");
                        try {
                            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hlay.a).v_newBuilder();
                            long v3 = Long.parseLong(s);
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((hlay)hftp0.b_message).d = v3;
                            String s2 = fdtx0.f();
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            hlay hlay0 = (hlay)hftp0.b_message;
                            s2.getClass();
                            hlay0.e = s2;
                            for(ggqj ggqj0 = ggoh0.om(); ggqj0.hasNext(); ggqj0 = ggqj0) {
                                Object object0 = ggqj0.next();
                                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hlbh.a).v_newBuilder();
                                String s3 = ((fdsi)object0).a;
                                if(!hftp1.b_message.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                ((hlbh)hftp1.b_message).b = s3;
                                for(Iterator iterator0 = ((fdsi)object0).b.iterator(); iterator0.hasNext(); iterator0 = iterator0) {
                                    Object object1 = iterator0.next();
                                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hlbg.a).v_newBuilder();
                                    String s4 = ((fdpl)object1).b;
                                    if(!hftp2.b_message.isImmutable()) {
                                        hftp2.ensureMutable();
                                    }
                                    ProtoLiteMessage hftv0 = hftp2.b_message;
                                    s4.getClass();
                                    ((hlbg)hftv0).b = s4;
                                    String s5 = ((fdpl)object1).d;
                                    if(!hftv0.isImmutable()) {
                                        hftp2.ensureMutable();
                                    }
                                    hlbg hlbg0 = (hlbg)hftp2.b_message;
                                    s5.getClass();
                                    hlbg0.c = s5;
                                    if(!hftp1.b_message.isImmutable()) {
                                        hftp1.ensureMutable();
                                    }
                                    hlbh hlbh0 = (hlbh)hftp1.b_message;
                                    hlbg hlbg1 = (hlbg)hftp2.N_build();
                                    hlbg1.getClass();
                                    hfuo hfuo0 = hlbh0.c;
                                    if(!hfuo0.c()) {
                                        hlbh0.c = ProtoLiteMessage.E(hfuo0);
                                    }
                                    hlbh0.c.add(hlbg1);
                                    ggqj0 = ggqj0;
                                }
                                hlbh hlbh1 = (hlbh)hftp1.N_build();
                                if(!hftp0.b_message.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                hlay hlay1 = (hlay)hftp0.b_message;
                                hlbh1.getClass();
                                hfuo hfuo1 = hlay1.f;
                                if(!hfuo1.c()) {
                                    hlay1.f = ProtoLiteMessage.E(hfuo1);
                                }
                                hlay1.f.add(hlbh1);
                            }
                            hlay hlay2 = (hlay)hftp0.N_build();
                            fdst fdst0 = new fdst();
                            fdsu fdsu0 = new fdsu();
                            hlan hlan0 = fdtx0.e(clam.b);
                            Objects.requireNonNull(hlan0);
                            fdtx0.c("PutAssetAcls", ((MessageLite)hlay2), fdst0, fdsu0, new fdsv(hlan0));
                        }
                        catch(Throwable throwable0) {
                            fdtx0.b.c(":putAssetAcls", "");
                            throw throwable0;
                        }
                        fdwc0.c(":putAssetAcls", String.format(Locale.US, "numAcls: %d", ((int)1)));
                        fdsh.v(12, v2, 1);
                        z1 = true;
                    }
                    catch(fdsp | IOException exception1) {
                        fdsh.w(12, v2, exception1);
                        throw exception1;
                    }
                }
            }
            fdrw1.b.poll();
            fdrx0 = this;
        }
        return z1;
    }

    private final fdrw b(boolean z) {
        if(this.c.n() && z) {
            fdty fdty0 = (fdty)this.b.peek();
            return fdty0 == null ? new fdrw(this, ((fdty)this.a.peek()), this.a) : new fdrw(this, fdty0, this.b);
        }
        return new fdrw(this, ((fdty)this.a.peek()), this.a);
    }
}

