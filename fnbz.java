import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import j..util.concurrent.ConcurrentLinkedQueue;
import java.io.File;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import jeb.synthetic.FIN;

public final class fnbz {
    public static final String a = "fnbz";
    public final fnbu b;
    protected final List c;
    private static final Consumer d;
    private static final Consumer e;
    private static final Consumer f;
    private final Context g;
    private final Executor h;
    private final fnca i;
    private final ConnectivityManager j;
    private final Map k;
    private final Map l;
    private final Queue m;
    private boolean n;
    private final BroadcastReceiver o;

    static {
        fnbz.d = new fnbq();
        fnbz.e = new fnbr();
        fnbz.f = new fnbs();
    }

    public fnbz(fnca fnca0, Context context0, Executor executor0) {
        fnbu fnbu0 = new fnbu();
        super();
        this.k = new HashMap();
        this.l = new HashMap();
        this.m = new ConcurrentLinkedQueue();
        this.c = new ArrayList();
        this.n = false;
        this.o = new fnbt(this);
        this.g = context0;
        this.i = fnca0;
        this.h = executor0;
        this.b = fnbu0;
        this.j = (ConnectivityManager)context0.getSystemService("connectivity");
    }

    public static String a(File file0, String s) {
        return file0.getAbsolutePath() + "/" + s;
    }

    public final HttpURLConnection b(String s, String s1) {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        fnca fnca0 = this.i;
        fnca0.e();
        if(fnbz.o(this.g, "android.permission.INTERNET")) {
            gftb.q(((boolean)(((fnbp)this.k.get(s)).f() ^ 1)));
            HttpURLConnection httpURLConnection0 = fnca0.a(s1);
            this.l.put(s, httpURLConnection0);
            FIN.finallyCodeBegin$NT(v);
            return httpURLConnection0;
        }
        throw new IllegalStateException("Missing INTERNET permission, can\'t start download");
    }

    protected final List c() {
        List list0;
        synchronized(this) {
            ggdy ggdy0 = new ggdy();
            Iterator iterator0 = this.c.iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                fnbw fnbw0 = (fnbw)((WeakReference)object0).get();
                if(fnbw0 == null) {
                    iterator0.remove();
                }
                else {
                    ggdy0.i(fnbw0);
                }
            }
            list0 = ggdy0.h();
        }
        return list0;
    }

    public final void d(File file0, String s) {
        synchronized(this) {
            String s1 = fnbz.a(file0, s);
            fnbp fnbp0 = (fnbp)this.k.get(s1);
            if(fnbp0 != null) {
                fnbp0.d();
            }
            fnbz.k(((HttpURLConnection)this.l.get(s1)));
            if(fnbp0 != null) {
                this.g();
            }
        }
    }

    public final void e() {
        synchronized(this) {
            this.i.b();
            this.i.c();
        }
    }

    public final void f(fnbp fnbp0) {
        List list0;
        synchronized(this) {
            Queue queue0 = this.m;
            queue0.add(fnbp0);
            if(queue0.isEmpty()) {
                IntentFilter intentFilter0 = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
                this.g.registerReceiver(this.o, intentFilter0);
                this.n = true;
                this.g();
            }
            list0 = queue0.containsAll(this.k.values()) ? this.c() : null;
        }
        if(list0 != null) {
            fnbz.p(list0, fnbz.d);
        }
    }

    public final void g() {
        synchronized(this) {
            Queue queue0 = this.m;
            Iterator iterator0 = queue0.iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                fnbp fnbp0 = (fnbp)object0;
                if(fnbp0.f() || this.l(fnbp0.a())) {
                    iterator0.remove();
                    this.j(fnbp0);
                }
            }
            if(queue0.isEmpty() && this.n) {
                this.g.unregisterReceiver(this.o);
                this.n = false;
            }
        }
    }

    public final void h(File file0, String s, fnbm fnbm0, fnbl fnbl0, File file1, long v) {
        List list0;
        List list1;
        String s1 = fnbz.a(file0, s);
        synchronized(this) {
            Map map0 = this.k;
            map0.remove(s1);
            this.l.remove(s1);
            list0 = null;
            if(map0.isEmpty()) {
                list0 = this.c();
                list1 = null;
            }
            else {
                Collection collection0 = map0.values();
                list1 = this.m.containsAll(collection0) ? this.c() : null;
            }
        }
        if(fnbl0 == null) {
            fnbm0.a(file1, v);
        }
        else {
            fnbm0.b(file1, fnbl0);
        }
        if(list0 != null) {
            fnbz.p(list0, fnbz.f);
            return;
        }
        if(list1 != null) {
            fnbz.p(list1, fnbz.d);
        }
    }

    public final void i(fnbw fnbw0) {
        synchronized(this) {
            WeakReference weakReference0 = new WeakReference(fnbw0);
            this.c.add(weakReference0);
        }
    }

    public final void j(fnbp fnbp0) {
        fnbz.p(this.c(), fnbz.e);
        fnbv fnbv0 = new fnbv(this, fnbp0);
        this.h.execute(fnbv0);
    }

    public static void k(HttpURLConnection httpURLConnection0) {
        if(httpURLConnection0 != null) {
            try {
                httpURLConnection0.disconnect();
            }
            catch(IllegalStateException | NullPointerException unused_ex) {
            }
        }
    }

    public final boolean l(fnbo fnbo0) {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        if(fnbo0 == fnbo.c) {
            FIN.finallyCodeBegin$NT(v);
            return true;
        }
        if(fnbz.o(this.g, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager0 = this.j;
            NetworkInfo networkInfo0 = connectivityManager0.getActiveNetworkInfo();
            if(networkInfo0 != null && networkInfo0.isAvailable()) {
                this.i.e();
                if(networkInfo0.isConnected()) {
                alab1:
                    switch(fnbo0.ordinal()) {
                        case 0: {
                            if(connectivityManager0.isActiveNetworkMetered()) {
                                switch(networkInfo0.getType()) {
                                    case 1: 
                                    case 9: {
                                        break;
                                    }
                                    default: {
                                        if(networkInfo0.getType() != 17) {
                                            FIN.finallyExec$NT(v);
                                            return false;
                                        }
                                    }
                                }
                            }
                            break;
                        }
                        case 1: {
                            switch(networkInfo0.getType()) {
                                case 0: 
                                case 1: 
                                case 4: 
                                case 6: 
                                case 7: 
                                case 9: 
                                case 16: {
                                    break alab1;
                                }
                                default: {
                                    if(networkInfo0.getType() != 17) {
                                        FIN.finallyExec$NT(v);
                                        return false;
                                    }
                                    break alab1;
                                }
                            }
                        }
                        default: {
                            Log.e(fnbz.a, "Unknown connectivity type checked: " + fnbo0.name());
                        }
                    }
                    FIN.finallyExec$NT(v);
                    return true;
                }
                FIN.finallyExec$NT(v);
                return false;
            }
            FIN.finallyExec$NT(v);
            return false;
        }
        throw new IllegalStateException("Attempting to determine connectivity without the ACCESS_NETWORK_STATE permission.");
    }

    final boolean m(fnbp fnbp0) {
        synchronized(this) {
            Map map0 = this.k;
            String s = fnbz.a(fnbp0.b, fnbp0.c);
            if(map0.containsKey(s)) {
                Log.i(fnbz.a, "Request is already being executed for key: " + s);
                return false;
            }
            map0.put(s, fnbp0);
            this.j(fnbp0);
        }
        return true;
    }

    public final void n(HttpURLConnection httpURLConnection0, int v) {
        synchronized(this) {
            if(v != -1) {
                this.i.d(httpURLConnection0, v);
            }
        }
    }

    private static boolean o(Context context0, String s) {
        return jwe.a(context0, s) == 0;
    }

    private static final void p(List list0, Consumer consumer0) {
        ggqk ggqk0 = ((gged_interceptors)list0).E();
        while(ggqk0.hasNext()) {
            Object object0 = ggqk0.next();
            consumer0.accept(((fnbw)object0));
        }
    }
}

