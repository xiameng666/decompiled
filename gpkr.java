import android.content.Context;
import android.text.TextUtils;
import j..util.concurrent.ConcurrentHashMap;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.Executor;

final class gpkr extends iakr {
    private final String a;
    private final gpgx b;
    private final Object c;
    private final ConcurrentHashMap d;

    public gpkr(String s, gpgx gpgx0) {
        this.c = new Object();
        this.d = new ConcurrentHashMap();
        this.a = s;
        this.b = gpgx0;
    }

    @Override  // iakr
    public final iakv a(gRPCMethodDescriptor iaoj0, iakq iakq0) {
        Object object1;
        gful_cronetEngineProvider gful0;
        Executor executor5;
        Executor executor4;
        Executor executor3;
        URI uRI1;
        Context context1;
        cmlu cmlu0;
        gphq gphq0;
        String s = (String)iakq0.j(gpho.a);
        if(s == null) {
            s = this.a;
        }
        gpgx gpgx0 = this.b;
        URI uRI0 = gpkr.c(s);
        gftb.r(((boolean)(TextUtils.isEmpty(uRI0.getAuthority()) ^ 1)), "Could not parse channel authority");
        Integer integer0 = (Integer)iakq0.j(gpmo.a);
        Integer integer1 = (Integer)iakq0.j(gpmo.b);
        Integer integer2 = (Integer)iakq0.j(gphj.a);
        long v = (long)(((Long)gpgx0.i.mr()));
        long v1 = gpgx0.l;
        long v2 = gpgx0.m;
        gpkq gpkq0 = new gpkq(uRI0, v, v1, v2, integer0, integer1, integer2);
        ConcurrentHashMap concurrentHashMap0 = this.d;
        gpkp gpkp0 = (gpkp)concurrentHashMap0.get(gpkq0);
        if(gpkp0 == null) {
            Object object0 = this.c;
            __monitor_enter(object0);
            try {
                if(concurrentHashMap0.containsKey(gpkq0)) {
                    goto label_103;
                }
                else {
                    gphp gphp0 = new gphp();
                    gphq0 = new gphq();
                    gphq0.d(((gful_cronetEngineProvider)gphp0));
                    gphq0.c(0x400000);
                    gphq0.a(0x7FFFFFFFFFFFFFFFL);
                    gphq0.b(gphr.a);
                    Context context0 = gpgx0.a;
                    if(context0 != null) {
                        gphq0.a = context0;
                        gphq0.b = gpkq0.a;
                        gphq0.h = gpkq0.c;
                        gphq0.i = gpkq0.d;
                        gphq0.j = gpkq0.b;
                        gphq0.n = (byte)(gphq0.n | 1);
                        Executor executor0 = gpgx0.c;
                        if(executor0 != null) {
                            gphq0.c = executor0;
                            Executor executor1 = gpgx0.d;
                            if(executor1 != null) {
                                gphq0.d = executor1;
                                Executor executor2 = gpgx0.b;
                                if(executor2 != null) {
                                    gphq0.e = executor2;
                                    gphq0.d(gpgx0.f);
                                    gphq0.g = gpgx0.j;
                                    gphq0.a(v1);
                                    gphq0.b(v2);
                                    Integer integer3 = gpkq0.e;
                                    if(integer3 == null) {
                                        gphq0.c(gpgx0.k);
                                    }
                                    else {
                                        gphq0.c(integer3.intValue());
                                    }
                                    cmlu0 = gpgx0.n;
                                    if(gphq0.n == 15) {
                                        context1 = gphq0.a;
                                        if(context1 != null) {
                                            uRI1 = gphq0.b;
                                            if(uRI1 != null) {
                                                executor3 = gphq0.c;
                                                if(executor3 != null) {
                                                    executor4 = gphq0.d;
                                                    if(executor4 != null) {
                                                        executor5 = gphq0.e;
                                                        if(executor5 != null) {
                                                            gful0 = gphq0.f;
                                                            if(gful0 != null) {
                                                                object1 = object0;
                                                                goto label_70;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    goto label_72;
                                }
                                object1 = object0;
                                throw new NullPointerException("Null lightweightExecutor");
                            }
                            object1 = object0;
                            throw new NullPointerException("Null blockingExecutor");
                        }
                        object1 = object0;
                        throw new NullPointerException("Null backgroundExecutor");
                    }
                    object1 = object0;
                    throw new NullPointerException("Null applicationContext");
                }
                goto label_104;
            }
            catch(Throwable throwable0) {
                try {
                    object1 = object0;
                    goto label_107;
                label_70:
                    concurrentHashMap0.put(gpkq0, new gpkp(cmlu0, new gphr(context1, uRI1, executor3, executor4, executor5, gful0, gphq0.g, gphq0.h, gphq0.i, gphq0.j, gphq0.k, gphq0.l, gphq0.m)));
                    goto label_104;
                label_72:
                    object1 = object0;
                    StringBuilder stringBuilder0 = new StringBuilder();
                    if(gphq0.a == null) {
                        stringBuilder0.append(" applicationContext");
                    }
                    if(gphq0.b == null) {
                        stringBuilder0.append(" uri");
                    }
                    if(gphq0.c == null) {
                        stringBuilder0.append(" backgroundExecutor");
                    }
                    if(gphq0.d == null) {
                        stringBuilder0.append(" blockingExecutor");
                    }
                    if(gphq0.e == null) {
                        stringBuilder0.append(" lightweightExecutor");
                    }
                    if(gphq0.f == null) {
                        stringBuilder0.append(" recordNetworkMetricsToPrimes");
                    }
                    if((gphq0.n & 1) == 0) {
                        stringBuilder0.append(" grpcIdleTimeoutMillis");
                    }
                    if((gphq0.n & 2) == 0) {
                        stringBuilder0.append(" maxMessageSize");
                    }
                    if((gphq0.n & 4) == 0) {
                        stringBuilder0.append(" grpcKeepAliveTimeMillis");
                    }
                    if((gphq0.n & 8) == 0) {
                        stringBuilder0.append(" grpcKeepAliveTimeoutMillis");
                    }
                    throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
                label_103:
                    object1 = object0;
                label_104:
                    __monitor_exit(object1);
                    return ((gpkp)concurrentHashMap0.get(gpkq0)).a(iaoj0, iakq0);
                label_107:
                    __monitor_exit(object1);
                }
                catch(Throwable throwable0) {
                    goto label_107;
                }
            }
            throw throwable0;
        }
        return gpkp0.a(iaoj0, iakq0);
    }

    @Override  // iakr
    public final String b() {
        return this.a;
    }

    private static final URI c(String s) {
        try {
            URI uRI0 = new URI(null, s, null, null, null);
            return uRI0.getPort() == -1 ? new URI(uRI0.getScheme(), uRI0.getUserInfo(), uRI0.getHost(), 443, uRI0.getPath(), uRI0.getQuery(), uRI0.getFragment()) : uRI0;
        }
        catch(URISyntaxException uRISyntaxException0) {
            throw new IllegalStateException("Malformed endpoint authority", uRISyntaxException0);
        }
    }
}

