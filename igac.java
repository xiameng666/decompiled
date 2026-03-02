import android.net.TrafficStats;
import android.os.Trace;
import android.util.Log;
import j..util.Objects;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.InlineExecutionProhibitedException;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest.Callback;
import org.chromium.net.UrlRequest.StatusListener;

final class igac extends ExperimentalUrlRequest {
    public static final String a = "igac";
    public final ifzz b;
    public final Executor c;
    public final String d;
    public final Map e;
    public final List f;
    public final AtomicInteger g;
    public final boolean h;
    public final String i;
    public final igar j;
    public final Executor k;
    public volatile int l;
    public String m;
    public ReadableByteChannel n;
    public igan o;
    public String p;
    public HttpURLConnection q;
    public final ifym r;
    public final int s;
    public final ifye t;
    public final long u;
    public int v;
    public int w;
    public boolean x;
    public ifyw y;
    private final AtomicBoolean z;

    static {
    }

    public igac(ifym ifym0, UrlRequest.Callback urlRequest$Callback0, Executor executor0, Executor executor1, String s, String s1, boolean z, boolean z1, int v, boolean z2, int v1, long v2, String s2, ArrayList arrayList0, UploadDataProvider uploadDataProvider0, Executor executor2) {
        igar igar0;
        this.e = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        this.f = new ArrayList();
        this.g = new AtomicInteger(0);
        this.z = new AtomicBoolean(false);
        this.l = -1;
        new ifvp("Cronet JavaUrlRequest#JavaUrlRequest");
        try {
            Objects.requireNonNull(s, "URL is required");
            Objects.requireNonNull(urlRequest$Callback0, "Listener is required");
            Objects.requireNonNull(executor0, "Executor is required");
            Objects.requireNonNull(executor1, "userExecutor is required");
            this.h = z;
            this.b = new ifzz(this, urlRequest$Callback0, executor1);
            this.c = new igab(new ifzb(executor0, (z1 ? v : TrafficStats.getThreadStatsTag()), z2, v1));
            this.r = ifym0;
            this.s = ifym0.a;
            this.t = ifym0.b;
            this.m = s;
            this.d = s1;
            this.u = v2;
            Objects.requireNonNull(s2, "Method is required.");
            if(!"OPTIONS".equalsIgnoreCase(s2) && !"GET".equalsIgnoreCase(s2) && !"HEAD".equalsIgnoreCase(s2) && !"POST".equalsIgnoreCase(s2) && !"PUT".equalsIgnoreCase(s2) && !"DELETE".equalsIgnoreCase(s2) && !"TRACE".equalsIgnoreCase(s2) && !"PATCH".equalsIgnoreCase(s2)) {
                throw new IllegalArgumentException("Invalid http method " + s2);
            }
            this.i = s2;
            int v3 = arrayList0.size();
            for(int v4 = 0; v4 < v3; ++v4) {
                Map.Entry map$Entry0 = (Map.Entry)arrayList0.get(v4);
                String s3 = (String)map$Entry0.getKey();
                int v5 = 0;
                while(v5 < s3.length()) {
                    int v6 = s3.charAt(v5);
                    if(v6 == 44 || v6 == 0x2F || v6 == 0x7B || v6 == 0x7D || (v6 == 39 || v6 == 40 || v6 == 41)) {
                        throw new IllegalArgumentException("Invalid header with headername: " + ((String)map$Entry0.getKey()));
                    }
                    switch(v6) {
                        case 58: 
                        case 59: 
                        case 60: 
                        case 61: 
                        case 62: 
                        case 0x3F: 
                        case 0x40: {
                            throw new IllegalArgumentException("Invalid header with headername: " + ((String)map$Entry0.getKey()));
                        }
                        default: {
                            if(v6 == 91 || v6 == 92 || v6 == 93 || Character.isISOControl(((char)v6)) || Character.isWhitespace(((char)v6))) {
                                throw new IllegalArgumentException("Invalid header with headername: " + ((String)map$Entry0.getKey()));
                            }
                            ++v5;
                        }
                    }
                }
                if(((String)map$Entry0.getValue()).contains("\r\n")) {
                    throw new IllegalArgumentException("Invalid header with headername: " + ((String)map$Entry0.getKey()));
                }
                String s4 = (String)map$Entry0.getKey();
                String s5 = (String)map$Entry0.getValue();
                this.e.put(s4, s5);
            }
            if(uploadDataProvider0 == null) {
                igar0 = null;
            }
            else {
                if(!this.e.containsKey("Content-Type")) {
                    throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
                }
                igar0 = new igar(uploadDataProvider0);
            }
            this.j = igar0;
            Executor executor3 = executor2 != null && !this.h ? new igaf(executor2) : executor2;
            this.k = executor3;
        }
        catch(Throwable throwable0) {
            try {
                Trace.endSection();
            }
            catch(Throwable throwable1) {
                throwable0.addSuppressed(throwable1);
            }
            throw throwable0;
        }
        Trace.endSection();
    }

    public final void a() {
        this.d(new ifzi(this), "closeResponseChannel");
    }

    public final void b(CronetException cronetException0) {
    alab1:
        while(true) {
            AtomicInteger atomicInteger0 = this.g;
            int v = atomicInteger0.get();
            switch(v) {
                case 0: {
                    throw new IllegalStateException("Can\'t enter error state before start");
                }
                case 6: 
                case 7: 
                case 8: {
                    return;
                }
                default: {
                    if(!atomicInteger0.compareAndSet(v, 6)) {
                        break;
                    }
                    break alab1;
                }
            }
        }
        this.f();
        this.e();
        ifzz ifzz0 = this.b;
        igan igan0 = this.o;
        ifzz0.d.a();
        ifzr ifzr0 = new ifzr(ifzz0, igan0, cronetException0);
        try {
            ifzz0.b(ifzr0, "onFailed");
        }
        catch(InlineExecutionProhibitedException unused_ex) {
            Executor executor0 = ifzz0.c;
            if(executor0 != null) {
                new ifvp("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnFallbackExecutor onFailed");
                try {
                    executor0.execute(new ifzq(ifzr0));
                }
                catch(Throwable throwable0) {
                    try {
                        Trace.endSection();
                    }
                    catch(Throwable throwable1) {
                        throwable0.addSuppressed(throwable1);
                    }
                    throw throwable0;
                }
                Trace.endSection();
            }
        }
    }

    public final void c(Throwable throwable0) {
        this.b(new ifxq("Exception received from UploadDataProvider", throwable0));
    }

    @Override  // org.chromium.net.UrlRequest
    public final void cancel() {
        switch(this.g.getAndSet(8)) {
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: {
                this.f();
                this.e();
                igan igan0 = this.o;
                this.b.d.a();
                ifzw ifzw0 = new ifzw(this.b, igan0);
                this.b.b(ifzw0, "onCanceled");
            }
        }
    }

    public final void d(Runnable runnable0, String s) {
        new ifvp("Cronet JavaUrlRequest#executeOnExecutor " + s);
        try {
            ifzl ifzl0 = new ifzl(s, runnable0);
            this.c.execute(ifzl0);
        }
        catch(Throwable throwable0) {
            try {
                Trace.endSection();
            }
            catch(Throwable throwable1) {
                throwable0.addSuppressed(throwable1);
            }
            throw throwable0;
        }
        Trace.endSection();
    }

    public final void e() {
        igar igar0 = this.j;
        if(igar0 != null && this.z.compareAndSet(false, true)) {
            try {
                Objects.requireNonNull(igar0);
                ifze ifze0 = new ifze(this, new ifyy(igar0));
                this.k.execute(ifze0);
            }
            catch(RejectedExecutionException rejectedExecutionException0) {
                Log.e(igac.a, "Exception when closing uploadDataProvider", rejectedExecutionException0);
            }
        }
    }

    public final void f() {
        this.d(new ifyz(this), "fireDisconnect");
    }

    @Override  // org.chromium.net.UrlRequest
    public final void followRedirect() {
        this.j(3, 1, new ifzo(this));
    }

    public final void g() {
        this.l = 13;
        this.d(new ifza(this, new ifzg(this)), "fireGetHeaders");
    }

    @Override  // org.chromium.net.UrlRequest
    public final void getStatus(UrlRequest.StatusListener urlRequest$StatusListener0) {
        int v = this.g.get();
        int v1 = this.l;
        switch(v) {
            case 1: {
                break;
            }
            case 2: 
            case 3: 
            case 4: {
                v1 = 0;
                break;
            }
            case 5: {
                v1 = 14;
                break;
            }
            case 0: 
            case 6: 
            case 7: 
            case 8: {
                v1 = -1;
                break;
            }
            default: {
                throw new IllegalStateException("Switch is exhaustive: " + v);
            }
        }
        ifzu ifzu0 = new ifzu(new igat(urlRequest$StatusListener0), v1);
        this.b.b(ifzu0, "sendStatus");
    }

    public final void h() {
        this.d(new ifza(this, new ifzf(this)), "fireOpenConnection");
    }

    public final void i(String s, Exception exception0) {
        Log.e(igac.a, a.a(s, "Exception in ", " method"), exception0);
        this.x = true;
    }

    @Override  // org.chromium.net.UrlRequest
    public final boolean isDone() {
        switch(this.g.get()) {
            case 6: 
            case 7: 
            case 8: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public final void j(int v, int v1, Runnable runnable0) {
        AtomicInteger atomicInteger0 = this.g;
        if(!atomicInteger0.compareAndSet(v, v1)) {
            int v2 = atomicInteger0.get();
            if(v2 != 6 && v2 != 8) {
                throw new IllegalStateException("Invalid state transition - expected " + igag.a(v) + " but was " + igag.a(v2));
            }
            return;
        }
        new ifvp("Cronet JavaUrlRequest#transitionStates " + igag.a(v) + " -> " + igag.a(v1));
        try {
            runnable0.run();
        }
        catch(Throwable throwable0) {
            try {
                Trace.endSection();
            }
            catch(Throwable throwable1) {
                throwable0.addSuppressed(throwable1);
            }
            throw throwable0;
        }
        Trace.endSection();
    }

    @Override  // org.chromium.net.UrlRequest
    public final void read(ByteBuffer byteBuffer0) {
        igaj.a(byteBuffer0);
        if(!byteBuffer0.hasRemaining()) {
            throw new IllegalArgumentException("ByteBuffer is already full.");
        }
        this.j(4, 5, new ifzn(this, new ifzm(this, byteBuffer0)));
    }

    @Override  // org.chromium.net.UrlRequest
    public final void start() {
        this.l = 10;
        this.r.c.incrementAndGet();
        this.j(0, 1, new ifzc(this));
    }
}

