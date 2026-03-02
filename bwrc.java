import android.content.Context;
import com.google.android.gms.icing.nativeindex.NativeIndex;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.CRC32;

public final class bwrc {
    public final bwrb a;
    public final bwts b;
    public final cljp c;
    private final Context d;
    private final bwzn e;
    private final bwuj f;
    private final bwuc g;
    private final NativeIndex h;
    private final bwtl i;
    private final AtomicBoolean j;
    private final bwmx k;

    public bwrc(Context context0, bwmx bwmx0, bwzn bwzn0, bwrb bwrb0, bwuj bwuj0, bwuc bwuc0, NativeIndex nativeIndex0, bwts bwts0, bwtl bwtl0) {
        this.j = new AtomicBoolean(false);
        this.d = context0;
        this.k = bwmx0;
        this.e = bwzn0;
        this.a = bwrb0;
        this.f = bwuj0;
        this.g = bwuc0;
        this.h = nativeIndex0;
        this.b = bwts0;
        this.i = bwtl0;
        this.c = cljp.a(context0);
    }

    public final void a(bwlq bwlq0) {
        boolean z;
        byte[] arr_b = ((MessageLite)bwlq0).toBytesArray();
        CRC32 cRC320 = new CRC32();
        cRC320.update(arr_b);
        long v = cRC320.getValue();
        bwrb bwrb0 = this.a;
        synchronized(bwrb0.d) {
            if(bwrb0.f == null) {
                String s = String.format(Locale.ROOT, "%016x", ((long)bwrb0.e));
                ++bwrb0.e;
                bwrb0.j = s;
                bwrb0.f = new bwra((hrnt.i() ? new File(ccsb.a.b(bwrb0.a, s)) : new File(bwrb0.a, s)));
                bwrb0.f.b.q(1);
            }
            bwra bwra0 = bwrb0.f;
            batl.s(bwra0);
            bwra0.b.writeRawVarint64(v);
            bwra0.b.ag(arr_b);
            bwra0.b.flush();
            bwra0.a.flush();
            int v2 = bwra0.c + 1;
            bwra0.c = v2;
            if(Long.compare(v2, bwrb0.c.a) >= 0) {
                bwra0.close();
                bwrb0.f = null;
                bwrb0.j = null;
                z = true;
            }
            else {
                z = false;
            }
        }
        if(z) {
            ProtoLiteBuilder hftp0 = bwrb0.k;
            synchronized(hftp0) {
                ProtoLiteMessage hftv0 = hftp0.b_message;
                int v4 = ((glqk)hftv0).d + 1;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                glqk glqk0 = (glqk)hftp0.b_message;
                glqk0.b |= 1;
                glqk0.d = v4;
            }
        }
        if(!this.j.compareAndSet(false, true)) {
            return;
        }
        glnn glnn0 = bxgo.a(this.d);
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)glnn0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)glnn0));
        ProtoLiteMessage hftv1 = hftp1.b_message;
        if(((glnn)hftv1).h) {
            if(!hftv1.isImmutable()) {
                hftp1.ensureMutable();
            }
            glnn glnn1 = (glnn)hftp1.b_message;
            glnn1.c = glre.a(9);
            glnn1.b |= 1;
            glnn glnn2 = (glnn)hftp1.N_build();
            this.b.v(glnn2);
        }
        if(hubu.a.b().A()) {
            this.c();
            return;
        }
        clkn clkn0 = new clkn();
        clkn0.j = "com.google.android.gms.icing.service.IcingGcmTaskService";
        clkn0.t("drain-request-queue");
        clkn0.v(0);
        clkn0.e(hubx.a.c().d(), hubx.a.c().c());
        clkn0.i(false);
        clkn0.x(0, 1);
        clkn0.y(2, 2);
        clko clko0 = clkn0.a();
        this.c.f(clko0);
    }

    public final void b() {
        try {
            bwrb bwrb0 = this.a;
            if(bwrb0.i != null) {
                Object object0 = bwrb0.g;
                synchronized(object0) {
                    String s = bwrb0.i;
                    if(s != null) {
                        boolean z = false;
                        for(Object object1: bwrb0.b()) {
                            String s1 = (String)object1;
                            if(s1.compareTo(s) > 0) {
                                break;
                            }
                            File file0 = hrnt.i() ? new File(ccsb.a.b(bwrb0.a, s1)) : new File(bwrb0.a, s1);
                            if(!file0.delete()) {
                                bwne.t("Failed to delete file %s", file0);
                                bwrb0.d(4);
                                z = true;
                            }
                        }
                        bwrb0.i = null;
                        if(z) {
                            throw new IOException("failed to delete some shards");
                        }
                    }
                }
            }
        }
        catch(IOException iOException0) {
            this.b.d("rq_prune_shard_failure");
            bwne.j(iOException0, "Failed to prune from request queue", new Object[0]);
        }
    }

    public final void c() {
        bwvh bwvh0 = new bwvh(this.d, this, this.k, this.f, this.g, this.b, this.i, this.h, this.j);
        this.e.h(bwvh0);
    }
}

