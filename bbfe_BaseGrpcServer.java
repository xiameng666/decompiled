import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.android.volley.VolleyError;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;
import org.chromium.net.CronetEngine;

public class bbfe_BaseGrpcServer extends AbstractServer {
    public volatile ianj_grpcChannel grpcChannel;
    public volatile iaof_metadata metadata;
    public bbfn_channelFactory channelFactory;
    public boolean enableRetry;
    public final bbfg e;
    public String g;
    public volatile gged_interceptors interceptors;
    private String serverHost;
    private int serverPort;
    private SSLSocketFactory sslSocketFactory;
    private int callerUid;
    private int flags;
    private final Object channelLock;
    private final gful_cronetEngineProvider cronetEngineProvider;

    public bbfe_BaseGrpcServer(Context context0) {
        this(context0, hykz.a.d().h(), ((int)hykz.a.d().e()), -1, 0x2500);
        this.addHeader("X-Goog-Api-Key", "AIzaSyAP-gfH3qvi6vgHZbSYwQ_XHqV_mXHhzIk");
        this.addHeader("X-Android-Package", "com.google.android.gms");
        this.addHeader("X-Android-Cert", bbmq.l(context0, "com.google.android.gms"));
    }

    public bbfe_BaseGrpcServer(Context context0, aylr aylr0) {
        this(context0, hqyf.a.c().r(), ((int)hqyf.a.c().b()), -1, 0x1F05);
        Long long0 = aylr0.a();
        if(long0 != null) {
            this.addHeader("Gms-Core-Version", String.valueOf(long0.longValue()));
        }
    }

    public bbfe_BaseGrpcServer(Context context0, aylr aylr0, byte[] arr_b) {
        this(context0, hqyf.a.c().t(), ((int)hqyf.a.c().f()), -1, 0x1F06);
        Long long0 = aylr0.a();
        if(long0 != null) {
            this.addHeader("Gms-Core-Version", String.valueOf(long0.longValue()));
        }
    }

    public bbfe_BaseGrpcServer(Context context0, String s, int v) {
        this(context0, s, v, -1, 0x1A00);
        this.addHeader("X-Device-ID", Long.toHexString(bbmq.d(context0)));
        this.addHeader("User-Agent", bbfx.a(context0, "Family/1.0"));
        Locale locale0 = context0.getResources().getConfiguration().getLocales().get(0);
        String s1 = locale0 == null || TextUtils.isEmpty(locale0.toString()) ? "" : locale0.toLanguageTag();
        if(!TextUtils.isEmpty(s1)) {
            this.addHeader("Accept-Language", s1);
        }
    }

    public bbfe_BaseGrpcServer(Context context0, String s, int v, int v1) {
        this(context0, s, v, context0.getApplicationInfo().uid, v1);
        this.addHeader("X-Goog-Api-Key", "AIzaSyAP-gfH3qvi6vgHZbSYwQ_XHqV_mXHhzIk");
        this.addHeader("X-Android-Package", "com.google.android.gms");
        String s1 = bbmq.l(context0, "com.google.android.gms");
        batl.s(s1);
        this.addHeader("X-Android-Cert", s1);
    }

    public bbfe_BaseGrpcServer(Context context0, String s, int v, int v1, int v2) {
        this(context0, s, v, v1, v2, (hrsa.i() || hrsa.i() ? new bbez() : null));
    }

    public bbfe_BaseGrpcServer(Context context0, String s, int v, int v1, int v2, gful_cronetEngineProvider gful0) {
        super(context0);
        TimeUnit.SECONDS.toNanos(20L);
        this.channelLock = new Object();
        boolean z = true;
        this.enableRetry = true;
        this.interceptors = ggna.a;
        cmmd.a();
        this.serverHost = s;
        this.serverPort = v;
        if(clcf.j() && (v == 80 || v == 8080)) {
            clcf.i(v2);
        }
        if(bbfn_channelFactory.a == null) {
            synchronized(bbfn_channelFactory.class) {
                if(bbfn_channelFactory.a == null) {
                    bbfn_channelFactory.a = new bbfn_channelFactory();
                }
            }
        }
        this.channelFactory = bbfn_channelFactory.a;
        if(gful0 == null) {
            elgh elgh0 = new elgh(context0, 60000, true);
            elgh0.a(new byte[][]{"h2".getBytes()});
            this.sslSocketFactory = elgh0;
            this.cronetEngineProvider = null;
        }
        else {
            this.cronetEngineProvider = gfus.a(gful0);
        }
        this.callerUid = v1;
        this.flags = v2;
        if(hrsa.a.g().D()) {
            boolean z1 = bbpq.h(v2);
            ggdy ggdy0 = new ggdy();
            ggdy0.k(this.interceptors);
            ggdy0.i(new bbfd(z1));
            this.interceptors = ggdy0.h();
        }
        this.e = bbfg.a;
        if(gful0 == null && this.sslSocketFactory == null) {
            z = false;
        }
        batl.l(z);
    }

    public bbfe_BaseGrpcServer(Context context0, String s, int v, int v1, byte[] arr_b) {
        this(context0, s, v, v1, 0x5300);
        this.addHeader("X-Goog-Api-Key", "AIzaSyAP-gfH3qvi6vgHZbSYwQ_XHqV_mXHhzIk");
        this.addHeader("X-Android-Package", "com.google.android.gms");
        this.addHeader("X-Android-Cert", bbmq.l(context0, "com.google.android.gms"));
    }

    public bbfe_BaseGrpcServer(Context context0, String s, int v, zed zed0) {
        this(context0, s, v, context0.getApplicationInfo().uid, 0x1006, new bbfa());
        this.addHeader("Accept-Language", aaus.a());
        if(!gfta.c(hojn.k())) {
            this.addHeader("X-Server-Token", hojn.k());
        }
        this.addInterceptor(new zek(zed0));
    }

    public static iakq applyDeadline(iakq iakq0, long v, TimeUnit timeUnit0) {
        return v < 0L || timeUnit0 == null ? iakq0 : iakq0.d(v, timeUnit0);
    }

    public final iakq configureCallOptions(iakq iakq0) {
        return iakq0.b(this.g).e(new bbft(this.callerUid, this.flags));
    }

    final iakr createClientCall(String s, baqr baqr0) {
        String s1;
        batl.t(this.grpcChannel, "grpc channel is null, cannot make grpc request");
        try {
            s1 = this.getAuthToken(baqr0);
        }
        catch(VolleyError volleyError0) {
            throw new iapl(iapk.q.f("IOException when getting auth token").e(volleyError0));
        }
        iaof_metadata iaof0 = this.buildMetadata(baqr0);
        return bbfn_channelFactory.c(this.context, this.grpcChannel, s1, s, iaof0, this.enableRetry, bbfe_BaseGrpcServer.mergeInterceptors(this.interceptors));
    }

    public final iaof_metadata buildMetadata(baqr baqr0) {
        ggeo ggeo0;
        Map map0;
        if(baqr0 != null) {
            Bundle bundle0 = baqr0.g.getBundle("binary_headers");
            if(bundle0 != null && !bundle0.keySet().isEmpty()) {
                map0 = new HashMap();
                for(Object object0: bundle0.keySet()) {
                    map0.put(((String)object0), ByteString.copyFrom(bundle0.getByteArray(((String)object0))));
                }
            }
            else {
                map0 = Collections.EMPTY_MAP;
            }
            Bundle bundle1 = baqr0.g.getBundle("ascii_headers");
            if(bundle1 != null && !bundle1.keySet().isEmpty()) {
                ggek ggek0 = new ggek();
                for(Object object1: bundle1.keySet()) {
                    ggek0.i(((String)object1), bundle1.getString(((String)object1)));
                }
                ggeo0 = ggek0.b();
            }
            else {
                ggeo0 = ggnf.a;
            }
            if(!map0.isEmpty() || !ggeo0.isEmpty()) {
                iaof_metadata iaof0 = new iaof_metadata();
                if(this.metadata != null) {
                    iaof0.h(this.metadata);
                }
                for(Object object2: map0.entrySet()) {
                    iaof0.i(new ianv(((String)((Map.Entry)object2).getKey()), iaof_metadata.b), ((ByteString)((Map.Entry)object2).getValue()).toByteArray());
                }
                for(Object object3: ggeo0.v()) {
                    iaof0.i(new iant(((String)((Map.Entry)object3).getKey()), iaof_metadata.c), ((String)((Map.Entry)object3).getValue()));
                }
                return iaof0;
            }
        }
        return this.metadata;
    }

    public final Object callUnary(gRPCMethodDescriptor iaoj0, Object object0, long v, TimeUnit timeUnit0, iakq iakq0) {
        Object object1;
        iakq iakq1 = bbfe_BaseGrpcServer.applyDeadline(iakq0, v, timeUnit0);
        this.ensureChannelInitialized();
        batl.t(this.grpcChannel, "grpc channel is null, cannot make grpc request");
        iakr iakr0 = bbfn_channelFactory.c(this.context, this.grpcChannel, null, null, this.metadata, false, this.interceptors);
        iapk iapk0 = iapk.b;
        try {
            object1 = bbfn_channelFactory.d(iakr0, iaoj0, object0, this.configureCallOptions(iakq1));
        }
        catch(RuntimeException runtimeException0) {
            iapk.d(runtimeException0);
            throw bbfe_BaseGrpcServer.wrapException(runtimeException0);
        }
        finally {
            this.e.c(iaoj0, iapk0);
            this.e.a();
        }
        return object1;
    }

    public final Object callUnaryWithAuth(gRPCMethodDescriptor iaoj0, baqr baqr0, Object object0, long v, TimeUnit timeUnit0, iakq iakq0) {
        Object object2;
        Object object1;
        iakq iakq1 = bbfe_BaseGrpcServer.applyDeadline(iakq0, v, timeUnit0);
        this.ensureChannelInitialized();
        iapk iapk0 = iapk.b;
        String s = this.getAppCert(baqr0);
        iakr iakr0 = this.createClientCall(s, baqr0);
        iapk iapk1 = null;
        try {
            try {
                object1 = bbfn_channelFactory.d(iakr0, iaoj0, object0, this.configureCallOptions(iakq1));
                goto label_32;
            }
            catch(RuntimeException runtimeException0) {
            }
            try {
                if(!this.enableRetry) {
                    throw runtimeException0;
                }
                iaph iaph0 = iapk.d(runtimeException0).t;
                if(iapk.j.t != iaph0) {
                    throw runtimeException0;
                }
                iapk1 = iapk.d(runtimeException0);
                object2 = bbfn_channelFactory.d(this.createClientCall(s, baqr0), iaoj0, object0, this.configureCallOptions(iakq1));
            }
            catch(RuntimeException runtimeException1) {
                iapk0 = iapk.d(runtimeException1);
                throw bbfe_BaseGrpcServer.wrapException(runtimeException1);
            }
        }
        catch(Throwable throwable0) {
            goto label_26;
        }
        bbfg bbfg0 = this.e;
        bbfg0.c(iaoj0, iapk0);
        if(iapk1 != null) {
            bbfg0.c(iaoj0, iapk1);
        }
        bbfg0.a();
        return object2;
    label_26:
        bbfg bbfg1 = this.e;
        bbfg1.c(iaoj0, iapk0);
        if(iapk1 != null) {
            bbfg1.c(iaoj0, iapk1);
        }
        bbfg1.a();
        throw throwable0;
    label_32:
        this.e.c(iaoj0, iapk0);
        this.e.a();
        return object1;
    }

    public final void setContext(Context context0) {
        this.addInterceptor(new cmls(context0));
    }

    public final void addHeader(String s, String s1) {
        if(this.metadata == null) {
            synchronized(this) {
                if(this.metadata == null) {
                    this.metadata = new iaof_metadata();
                }
            }
        }
        synchronized(this) {
            this.metadata.i(new iant(s, iaof_metadata.c), s1);
        }
    }

    public final void addInterceptor(iakw iakw0) {
        synchronized(this) {
            ggdy ggdy0 = new ggdy();
            ggdy0.k(this.interceptors);
            ggdy0.i(iakw0);
            this.interceptors = ggdy0.h();
        }
    }

    @Deprecated
    public final void j() {
        if(hrsa.a.g().y()) {
            this.flags |= 0x4000000;
        }
    }

    public final void k() {
        if(hrsa.o()) {
            this.flags |= 0x4000000;
        }
    }

    public final void shutdownChannel() {
        if(this.grpcChannel != null) {
            this.grpcChannel.d();
        }
    }

    public final void shutdownChannelNow() {
        if(this.grpcChannel != null) {
            this.grpcChannel.e();
        }
    }

    public static bbfe_BaseGrpcServer createWithSharing(Context context0, String s, int v, int v1, int v2) {
        bbfe_BaseGrpcServer bbfe0 = new bbfe_BaseGrpcServer(context0, s, v, v1, v2);
        bbfe0.addHeader("X-Goog-Api-Key", "AIzaSyAP-gfH3qvi6vgHZbSYwQ_XHqV_mXHhzIk");
        bbfe0.addHeader("X-Android-Package", "com.google.android.gms");
        String s1 = bbmq.l(context0, "com.google.android.gms");
        batl.t(s1, "ANDROID_CERT_HEADER is null.");
        bbfe0.addHeader("X-Android-Cert", s1);
        bbfe0.addHeader("X-Sharing-Platform-Type", gzad.b.name());
        return bbfe0;
    }

    public static bbfe_BaseGrpcServer createWithApiKey(Context context0, String s, String s1, String s2, int v, int v1) {
        bbfe_BaseGrpcServer bbfe0 = new bbfe_BaseGrpcServer(context0, hxzi.a.g().p(), ((int)hxzi.a.g().l()), v, v1);
        bbfe0.addHeader("X-Goog-Api-Key", s);
        bbfe0.addHeader("X-Android-Package", s1);
        bbfe0.addHeader("X-Android-Cert", s2);
        if(hxzi.a.g().q()) {
            bbfe0.addHeader("x-response-encoding", "gzip");
        }
        if(!gfta.c(hxzi.h())) {
            bbfe0.g = hxzi.h();
        }
        return bbfe0;
    }

    public static baqr createAuthRequest(String s) {
        Account account0 = new Account(s, "com.google");
        baqr baqr0 = new baqr();
        baqr0.d = "com.google.android.gms";
        baqr0.e = "com.google.android.gms";
        baqr0.a = Process.myUid();
        baqr0.c = account0;
        baqr0.b = account0;
        baqr0.l(hqqv.a.c().e());
        return baqr0;
    }

    public static final iapl wrapException(Exception exception0) {
        if(Log.isLoggable("BaseGrpcServer", 3)) {
            Log.d("BaseGrpcServer", "Exception for gRPC call", exception0);
        }
        iapk iapk0 = iapk.d(exception0);
        return hrpw.d() ? new iapl(iapk0, iapk.a(exception0)) : new iapl(iapk0);
    }

    public static final gged_interceptors mergeInterceptors(gged_interceptors gged0) {
        gged_interceptors gged1 = ggna.a;
        if(gged1.isEmpty()) {
            return gged0;
        }
        ggdy ggdy0 = new ggdy();
        ggdy0.k(gged0);
        ggdy0.k(gged1);
        return ggdy0.h();
    }

    public final void ensureChannelInitialized() {
        if(this.grpcChannel == null) {
            Object object0 = this.channelLock;
            synchronized(object0) {
                if(this.grpcChannel == null) {
                    if(hrsa.a.g().p()) {
                        gful_cronetEngineProvider gful0 = this.cronetEngineProvider;
                        if(gful0 == null) {
                        label_12:
                            if(gful0 != null) {
                                elgh elgh0 = new elgh(this.context, 60000, true);
                                elgh0.a(new byte[][]{"h2".getBytes()});
                                this.sslSocketFactory = elgh0;
                                Log.w("BaseGrpcServer", "Cronet is not supported for this gRPC service");
                            }
                            this.grpcChannel = this.channelFactory.a(this.context, this.serverHost, this.serverPort, this.callerUid, this.flags, this.sslSocketFactory);
                        }
                        else {
                            CronetEngine cronetEngine0 = (CronetEngine)gful0.mr();
                            if(cmln.a.a(cronetEngine0)) {
                                this.grpcChannel = this.channelFactory.b(this.serverHost, this.serverPort, this.callerUid, cjxb.a(this.flags), ((CronetEngine)gful0.mr()));
                                goto label_24;
                            }
                            goto label_12;
                        }
                    }
                    else {
                        gful_cronetEngineProvider gful1 = this.cronetEngineProvider;
                        this.grpcChannel = gful1 == null ? this.channelFactory.a(this.context, this.serverHost, this.serverPort, this.callerUid, this.flags, this.sslSocketFactory) : this.channelFactory.b(this.serverHost, this.serverPort, this.callerUid, cjxb.a(this.flags), ((CronetEngine)gful1.mr()));
                    }
                }
            label_24:
            }
        }
    }
}

