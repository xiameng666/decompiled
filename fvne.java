import java.io.File;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor.AbortPolicy;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class fvne extends fvnq {
    public final byte[] a;
    public final fwyc b;
    public final fwzp c;
    volatile String d;
    public volatile boolean e;
    public volatile boolean f;
    public volatile fvkg g;
    private final Object m;
    private final ThreadPoolExecutor n;
    private volatile String o;

    public fvne(fwzp fwzp0, String s, byte[] arr_b, fvlt fvlt0, fybc fybc0, fvob fvob0, fwyc fwyc0) {
        super(fvlt0, fybc0, fvob0);
        this.m = new Object();
        this.e = false;
        this.f = false;
        this.o = null;
        if(!s.endsWith(File.separator)) {
            s = s + File.separator;
        }
        this.d = s;
        this.a = arr_b;
        this.b = fwyc0;
        this.c = fwzp0;
        ArrayBlockingQueue arrayBlockingQueue0 = new ArrayBlockingQueue(50);
        ThreadPoolExecutor.AbortPolicy threadPoolExecutor$AbortPolicy0 = new ThreadPoolExecutor.AbortPolicy();
        this.n = new fvnd(this, TimeUnit.SECONDS, arrayBlockingQueue0, threadPoolExecutor$AbortPolicy0);
    }

    @Override  // fvnq
    protected final void a() {
        this.n.shutdown();
    }

    @Override  // fvnq
    protected final boolean b(gwvh gwvh0, ProtoLiteBuilder hftp0) {
        gftb.q((((gwvj)hftp0.b_message).b & 4) != 0);
        gwvj gwvj0 = (gwvj)hftp0.N_build();
        if(!gwvh0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gwvh0).ensureMutable();
        }
        gwvi gwvi0 = (gwvi)gwvh0.b_message;
        gwvj0.getClass();
        gwvi0.g = gwvj0;
        gwvi0.b |= 4;
        return this.h(gwvh0);
    }

    public final fvnp c() {
        synchronized(this.m) {
            if(this.f) {
                return null;
            }
            fvnp fvnp0 = fvne.i(this.d);
            if(fvnp0 != null) {
                return fvnp0;
            }
            this.d = this.d + String.format(Locale.US, "%d-%d", System.currentTimeMillis(), ((int)(Math.random() * 1000000.0))) + File.separator;
            fvnp fvnp1 = fvne.i(this.d);
            if(fvnp1 != null) {
                return fvnp1;
            }
            this.f = true;
        }
        return null;
    }

    final void d(String s) {
        boolean z = true;
        synchronized(this) {
            if(s != null && s.length() != 0) {
                if(this.o != null && !this.o.equals(s)) {
                    z = false;
                }
                gftb.b(z, "sessionId in two writes should be consistent.");
                if(this.o == null) {
                    this.c();
                    if(fyba.a((huqs.c() ? new File(ccsb.a.d(this.d, "sessionId")) : new File(this.d, "sessionId")), s.getBytes()) == null) {
                        this.o = s;
                    }
                }
            }
        }
    }

    @Override
    protected final void finalize() {
        try {
            ThreadPoolExecutor threadPoolExecutor0 = this.n;
            if(!threadPoolExecutor0.isShutdown()) {
                threadPoolExecutor0.shutdown();
            }
        }
        finally {
            super.finalize();
        }
    }

    private final boolean g(String s, int v, byte[] arr_b) {
        try {
            fvnc fvnc0 = new fvnc(this, v, s, arr_b);
            this.n.execute(fvnc0);
            return true;
        }
        catch(RejectedExecutionException unused_ex) {
            fvlt fvlt0 = this.h;
            if(fvlt0 != null) {
                fvlt0.f(v, null, "Failed to write to file: work queue full.");
            }
            return false;
        }
    }

    private final boolean h(gwvh gwvh0) {
        boolean z = false;
        synchronized(this) {
            if(!this.j) {
                gwvi gwvi0 = (gwvi)gwvh0.b_message;
                if((gwvi0.b & 4) != 0 && ((gwvi0.g == null ? gwvj.a : gwvi0.g).b & 4) != 0) {
                    z = true;
                }
                gftb.r(z, "No sequence number specified!");
                gwvj gwvj0 = ((gwvi)gwvh0.b_message).g;
                if(gwvj0 == null) {
                    gwvj0 = gwvj.a;
                }
                return this.g(gwvj0.d, gwvj0.e, ((gwvi)((ProtoLiteBuilder)gwvh0).N_build()).toBytesArray());
            }
        }
        return false;
    }

    private static final fvnp i(String s) {
        File file0 = huqs.c() ? new File(ccsb.a.a(s)) : new File(s);
        if(!file0.exists()) {
            file0.getAbsolutePath();
            return file0.mkdir() ? null : new fvnp(false, null, String.format(Locale.US, "Failed to create dir: %s", s));
        }
        return null;
    }
}

