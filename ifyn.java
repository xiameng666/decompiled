import android.content.Context;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import org.chromium.net.CronetEngine.Builder.LibraryLoader;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;
import org.chromium.net.ProxyOptions;

public final class ifyn extends ifxv {
    private static final AtomicLong m;

    static {
        ifyn.m = new AtomicLong(0L);
    }

    public ifyn(Context context0) {
        super(context0, ifyb.d);
    }

    @Override  // ifxv
    public final ICronetEngineBuilder addPublicKeyPins(String s, Set set0, boolean z, Date date0) {
        super.c(s, set0, date0);
        return this;
    }

    @Override  // ifxv
    public final ICronetEngineBuilder addQuicHint(String s, int v, int v1) {
        super.d(s);
        return this;
    }

    @Override  // org.chromium.net.ICronetEngineBuilder
    public final ExperimentalCronetEngine build() {
        if(this.e == null) {
            this.e = this.getDefaultUserAgent();
        }
        return new ifym(this);
    }

    @Override  // ifxv
    public final ICronetEngineBuilder enableBrotli(boolean z) {
        this.i = z;
        return this;
    }

    @Override  // ifxv
    public final ICronetEngineBuilder enableHttp2(boolean z) {
        this.h = z;
        return this;
    }

    @Override  // ifxv
    public final ICronetEngineBuilder enableHttpCache(int v, long v1) {
        super.a(v);
        return this;
    }

    @Override  // ifxv
    public final ICronetEngineBuilder enableNetworkQualityEstimator(boolean z) {
        this.l = z;
        return this;
    }

    @Override  // ifxv
    public final ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
        this.d = z;
        return this;
    }

    @Override  // ifxv
    public final ICronetEngineBuilder enableQuic(boolean z) {
        this.g = z;
        return this;
    }

    @Override  // ifxv
    public final ICronetEngineBuilder enableSdch(boolean z) {
        return this;
    }

    @Override  // ifxv
    protected final long getLogCronetInitializationRef() {
        long v = this.b.a();
        ifyn.m.compareAndSet(0L, v);
        return ifyn.m.get();
    }

    @Override  // ifxv
    public final ICronetEngineBuilder setExperimentalOptions(String s) {
        this.k = s;
        return this;
    }

    @Override  // ifxv
    public final ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader cronetEngine$Builder$LibraryLoader0) {
        return this;
    }

    @Override  // ifxv
    public final ICronetEngineBuilder setProxyOptions(ProxyOptions proxyOptions0) {
        ifxv.e(proxyOptions0);
        return this;
    }

    @Override  // ifxv
    public final ICronetEngineBuilder setStoragePath(String s) {
        super.b(s);
        return this;
    }

    @Override  // ifxv
    public final ICronetEngineBuilder setThreadPriority(int v) {
        return this;
    }

    @Override  // ifxv
    public final ICronetEngineBuilder setUserAgent(String s) {
        this.e = s;
        return this;
    }
}

