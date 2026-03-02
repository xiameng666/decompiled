import android.content.Context;
import android.os.Trace;
import android.util.Log;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandlerFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.BidirectionalStream.Builder;
import org.chromium.net.BidirectionalStream.Callback;
import org.chromium.net.ExperimentalBidirectionalStream.Builder;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.NetworkQualityRttListener;
import org.chromium.net.NetworkQualityThroughputListener;
import org.chromium.net.RequestFinishedInfo.Listener;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest.Builder;
import org.chromium.net.UrlRequest.Callback;

public final class ifym extends ifxr {
    public final int a;
    public final ifye b;
    public final AtomicInteger c;
    public final Context d;
    private static final String e = "ifym";
    private final String f;
    private final ExecutorService g;
    private long h;

    static {
    }

    public ifym(ifxv ifxv0) {
        int v1;
        this.c = new AtomicInteger();
        this.h = -1L;
        new ifvp("JavaCronetEngine#JavaCronetEngine");
        try {
            this.d = ifxv0.c;
            int v = this.hashCode();
            this.a = v;
            this.f = ifxv0.e;
            this.g = new ThreadPoolExecutor(10, 10, 50L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ifyk());
            ifyb ifyb0 = ifyb.d;
            ifye ifye0 = ifyf.a(ifxv0.c, ifyb0);
            this.b = ifye0;
            try {
                boolean z = ifxv0.d;
                boolean z1 = ifxv0.g;
                boolean z2 = ifxv0.h;
                boolean z3 = ifxv0.i;
                switch(ifxv0.j.ordinal()) {
                    case 0: {
                        v1 = 0;
                        break;
                    }
                    case 1: {
                        v1 = 3;
                        break;
                    }
                    case 2: {
                        v1 = 2;
                        break;
                    }
                    case 3: {
                        v1 = 1;
                        break;
                    }
                    default: {
                        throw new IllegalArgumentException("Unknown internal builder cache mode");
                    }
                }
                String s = ifxv0.k;
                boolean z4 = ifxv0.l;
                ifyd ifyd0 = new ifyd(this.getVersionString().split("/")[1].split("@")[0]);
                ifye0.c(((long)v), new ifxz(z, z1, z2, z3, v1, s, z4, ifxv0.getLogCronetInitializationRef()), ifyd0, ifyb0);
            }
            catch(RuntimeException runtimeException0) {
                Log.e(ifym.e, "Error while trying to log JavaCronetEngine creation: ", runtimeException0);
            }
            Log.w("ifym", "using the fallback Cronet Engine implementation. Performance will suffer and many HTTP client features, including caching, will not work.");
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

    final void a() {
        this.c.decrementAndGet();
    }

    @Override  // org.chromium.net.CronetEngine
    public final void addRequestFinishedListener(RequestFinishedInfo.Listener requestFinishedInfo$Listener0) {
    }

    @Override  // org.chromium.net.CronetEngine
    public final void addRttListener(NetworkQualityRttListener networkQualityRttListener0) {
    }

    @Override  // org.chromium.net.CronetEngine
    public final void addThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener0) {
    }

    @Override  // ifxr
    protected final ExperimentalBidirectionalStream b(String s, BidirectionalStream.Callback bidirectionalStream$Callback0, Executor executor0, String s1, List list0, int v, boolean z, Collection collection0, boolean z1, int v1, boolean z2, int v2) {
        throw new UnsupportedOperationException("Can\'t create a bidi stream - httpurlconnection doesn\'t have those APIs");
    }

    @Override  // org.chromium.net.CronetEngine
    public final void bindToNetwork(long v) {
        this.h = v;
    }

    @Override  // ifxr
    public final ExperimentalUrlRequest c(String s, UrlRequest.Callback urlRequest$Callback0, Executor executor0, int v, Collection collection0, boolean z, boolean z1, boolean z2, int v1, boolean z3, int v2, RequestFinishedInfo.Listener requestFinishedInfo$Listener0, long v3, String s1, ArrayList arrayList0, UploadDataProvider uploadDataProvider0, Executor executor1) {
        if(v3 != -1L) {
            this.h = v3;
        }
        return new igac(this, urlRequest$Callback0, this.g, executor0, s, this.f, z1, z2, v1, z3, v2, this.h, s1, arrayList0, uploadDataProvider0, executor1);
    }

    @Override  // org.chromium.net.CronetEngine
    public final void configureNetworkQualityEstimatorForTesting(boolean z, boolean z1, boolean z2) {
    }

    @Override  // org.chromium.net.CronetEngine
    public final URLStreamHandlerFactory createURLStreamHandlerFactory() {
        return new ifyl();
    }

    @Override  // org.chromium.net.CronetEngine
    public final int getActiveRequestCount() {
        return this.c.get();
    }

    @Override  // org.chromium.net.CronetEngine
    public final int getDownstreamThroughputKbps() {
        return -1;
    }

    @Override  // org.chromium.net.CronetEngine
    public final int getEffectiveConnectionType() {
        return 0;
    }

    @Override  // org.chromium.net.CronetEngine
    public final byte[] getGlobalMetricsDeltas() {
        return new byte[0];
    }

    @Override  // org.chromium.net.CronetEngine
    public final int getHttpRttMs() {
        return -1;
    }

    @Override  // org.chromium.net.CronetEngine
    public final int getTransportRttMs() {
        return -1;
    }

    @Override  // org.chromium.net.CronetEngine
    public final String getVersionString() {
        return "CronetHttpURLConnection/140.0.7289.0@b9b67087";
    }

    @Override  // ifxr
    public final BidirectionalStream.Builder newBidirectionalStreamBuilder(String s, BidirectionalStream.Callback bidirectionalStream$Callback0, Executor executor0) {
        return this.newBidirectionalStreamBuilder(s, bidirectionalStream$Callback0, executor0);
    }

    @Override  // org.chromium.net.ExperimentalCronetEngine
    public final ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(String s, BidirectionalStream.Callback bidirectionalStream$Callback0, Executor executor0) {
        throw new UnsupportedOperationException("The bidirectional stream API is not supported by the Java implementation of Cronet Engine");
    }

    @Override  // ifxr
    public final UrlRequest.Builder newUrlRequestBuilder(String s, UrlRequest.Callback urlRequest$Callback0, Executor executor0) {
        return new igal(s, urlRequest$Callback0, executor0, this);
    }

    @Override  // org.chromium.net.CronetEngine
    public final URLConnection openConnection(URL uRL0) {
        return uRL0.openConnection();
    }

    @Override  // org.chromium.net.ExperimentalCronetEngine
    public final URLConnection openConnection(URL uRL0, Proxy proxy0) {
        return uRL0.openConnection(proxy0);
    }

    @Override  // org.chromium.net.CronetEngine
    public final void removeRequestFinishedListener(RequestFinishedInfo.Listener requestFinishedInfo$Listener0) {
    }

    @Override  // org.chromium.net.CronetEngine
    public final void removeRttListener(NetworkQualityRttListener networkQualityRttListener0) {
    }

    @Override  // org.chromium.net.CronetEngine
    public final void removeThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener0) {
    }

    @Override  // org.chromium.net.CronetEngine
    public final void shutdown() {
        this.g.shutdown();
    }

    @Override  // org.chromium.net.CronetEngine
    public final void startNetLogToDisk(String s, boolean z, int v) {
    }

    @Override  // org.chromium.net.CronetEngine
    public final void startNetLogToFile(String s, boolean z) {
    }

    @Override  // org.chromium.net.CronetEngine
    public final void stopNetLog() {
    }
}

