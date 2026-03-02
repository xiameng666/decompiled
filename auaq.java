import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.os.WorkSource;
import j..util.DesugarCollections;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import jeb.synthetic.FIN;
import jeb.synthetic.TWR;

public final class auaq {
    public static auaq a;
    public final avjh b;
    public volatile boolean c;
    public volatile Throwable d;
    public CountDownLatch e;
    private final List f;
    private List g;
    private List h;
    private final Map i;
    private Selector j;
    private volatile boolean k;
    private volatile Thread l;
    private final AtomicBoolean m;
    private final Intent n;
    private final esaa o;
    private final ScheduledExecutorService p;
    private final atxp q;
    private final Object r;
    private final Object s;
    private final gful_cronetEngineProvider t;
    private final gful_cronetEngineProvider u;
    private final AtomicBoolean v;

    public auaq(Context context0, atxp atxp0, ScheduledExecutorService scheduledExecutorService0) {
        this.r = new Object();
        this.s = new Object();
        this.t = gfus.a(((gful_cronetEngineProvider)new auam()));
        this.u = gfus.a(((gful_cronetEngineProvider)new auan()));
        this.v = new AtomicBoolean();
        this.b = new avjh("CastSocketMultiplexer");
        this.p = scheduledExecutorService0;
        this.q = atxp0;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.m = new AtomicBoolean(false);
        if(hqpo.c()) {
            Intent intent0 = new Intent("com.google.android.gms.cast.connector.CastSocketMultiplexerLifeCycleAction");
            this.n = intent0;
            intent0.setPackage("com.google.android.gms");
        }
        else {
            Intent intent1 = new Intent();
            this.n = intent1;
            intent1.setClassName(context0, "com.google.android.gms.cast.service.CastSocketMultiplexerLifeCycleService");
        }
        this.o = new esaa(context0, 1, "CastSocketMultiplexer_WakeLock", null, "com.google.android.gms");
        this.i = DesugarCollections.synchronizedMap(new HashMap());
    }

    public final void a(Context context0, auaf auaf0) {
        synchronized(this) {
            this.j();
            synchronized(this.r) {
                context0.startService(this.n);
                this.g.add(auaf0);
                this.b.n("added socket %s", auaf0);
                this.m.set(true);
            }
            this.n();
        }
    }

    public final void b() {
        if(this.o()) {
            this.b.d("disposeWakeLock: Unbalanced call in releasing the wake lock.", new Object[0]);
        }
    }

    public final void c(Context context0) {
        int v4;
        boolean z;
        List list1;
        if(this.j != null) {
            ArrayList arrayList0 = new ArrayList();
            int v = 0;
            while(!this.k) {
                gdqs gdqs0 = ((brzb)this.t.mr()).a();
                try {
                    long v1 = SystemClock.elapsedRealtime();
                    if(this.m.getAndSet(false)) {
                        Object object0 = this.s;
                        __monitor_enter(object0);
                        int v2 = FIN.finallyOpen$NT();
                        __monitor_enter(this.r);
                        int v3 = FIN.finallyOpen$NT();
                        List list0 = this.h;
                        this.h = this.g;
                        this.g = list0;
                        list0.clear();
                        FIN.finallyCodeBegin$NT(v3);
                        __monitor_exit(this.r);
                        FIN.finallyCodeEnd$NT(v3);
                        Iterator iterator0 = this.h.iterator();
                        while(true) {
                            if(!iterator0.hasNext()) {
                                FIN.finallyCodeBegin$NT(v2);
                                goto label_37;
                            }
                            Object object1 = iterator0.next();
                            auaf auaf0 = (auaf)object1;
                            try {
                                auax auax0 = auaf0.g();
                                Selector selector0 = this.j;
                                batl.s(selector0);
                                auax0.register(selector0, 0).attach(auaf0);
                                context0.startService(this.n);
                                this.f.add(auaf0);
                            }
                            catch(Exception unused_ex) {
                                this.b.j("Error while connecting socket.", new Object[0]);
                                arrayList0.add(auaf0);
                            }
                        }
                    }
                    else {
                    label_37:
                        if(!arrayList0.isEmpty()) {
                            for(Object object2: arrayList0) {
                                ((auaf)object2).l(2);
                            }
                            arrayList0.clear();
                        }
                    }
                    list1 = this.f;
                    Iterator iterator2 = list1.iterator();
                    z = false;
                    while(true) {
                        v4 = 1;
                        if(!iterator2.hasNext()) {
                            break;
                        }
                        Object object3 = iterator2.next();
                        auaf auaf1 = (auaf)object3;
                        auax auax1 = auaf1.f();
                        if(auax1 != null) {
                            Selector selector1 = this.j;
                            batl.s(selector1);
                            if(auax1.keyFor(selector1) != null) {
                                Selector selector2 = this.j;
                                batl.s(selector2);
                                int v5 = auaf1.e(auax1.keyFor(selector2), v1);
                                if(v5 == -1) {
                                    if(!auaf1.o() && !auaf1.q()) {
                                        continue;
                                    }
                                    z = true;
                                }
                                else {
                                    this.b.n("*** removing socket %s", auaf1);
                                    iterator2.remove();
                                    this.k(auaf1);
                                    auaf1.l(v5);
                                }
                                continue;
                            }
                        }
                        iterator2.remove();
                        this.k(auaf1);
                    }
                    if(this.f()) {
                        context0.stopService(this.n);
                        auao auao0 = new auao(this);
                        this.p.execute(auao0);
                    }
                }
                catch(Throwable throwable0) {
                    TWR.safeClose$NT(gdqs0, throwable0);
                    throw throwable0;
                }
                if(gdqs0 != null) {
                    gdqs0.close();
                }
                long v6 = z ? 1000L : 0L;
                avjh avjh0 = this.b;
                esaa esaa0 = this.o;
                avjh0.c("Selector is sleeping for %d ms. isWakelockHeld: %b", new Object[]{v6, Boolean.valueOf(esaa0.l())});
                Selector selector3 = this.j;
                batl.s(selector3);
                int v7 = selector3.select(v6);
                gdqs gdqs1 = ((brzb)this.u.mr()).a();
                try {
                    if(!this.v.getAndSet(false) && v == 0 && this.f()) {
                        Selector selector4 = this.j;
                        batl.s(selector4);
                        avjh0.d("Selector.select() returns %d but isIdle() returns true. Keys size: %d", new Object[]{v7, selector4.keys().size()});
                        atvf atvf0 = new atvf(this.q);
                        this.q.e.execute(atvf0);
                    }
                    else {
                        v4 = v;
                    }
                    Boolean boolean0 = Boolean.valueOf(esaa0.l());
                    Selector selector5 = this.j;
                    batl.s(selector5);
                    avjh0.c("eventCount=%d, wakeLockHeld=%b, connectionActionsPending=%b, mSockets.size=%d, keys.size=%d", new Object[]{v7, boolean0, Boolean.valueOf(z), list1.size(), selector5.selectedKeys().size()});
                    Selector selector6 = this.j;
                    batl.s(selector6);
                    int v8 = 0;
                    for(Object object4: selector6.selectedKeys()) {
                        avjh0.c("%d %s", new Object[]{v8, auaq.i(((SelectionKey)object4))});
                        ++v8;
                    }
                }
                catch(Throwable throwable1) {
                    goto label_179;
                }
                if(v7 == 0) {
                    if(gdqs1 != null) {
                        gdqs1.close();
                    }
                    v = v4;
                    continue;
                }
                else if(!this.k) {
                    try {
                        Selector selector7 = this.j;
                        batl.s(selector7);
                        Iterator iterator4 = selector7.selectedKeys().iterator();
                        long v9 = SystemClock.elapsedRealtime();
                        while(iterator4.hasNext()) {
                            Object object5 = iterator4.next();
                            auaf auaf2 = (auaf)((SelectionKey)object5).attachment();
                            if(auaf2 == null || !auaf2.d) {
                                continue;
                            }
                            Map map0 = this.i;
                            if(map0.containsKey(auaf2)) {
                                continue;
                            }
                            WorkSource workSource0 = auaf2.c;
                            if(workSource0 != null) {
                                esaa0.f(workSource0);
                            }
                            avjh0.c("acquire wakelock for socket: %s", new Object[]{auaf2.b});
                            esaa0.d(auaf2.b);
                            __monitor_enter(map0);
                            int v10 = FIN.finallyOpen$NT();
                            map0.put(auaf2, Long.valueOf(v9));
                            FIN.finallyCodeBegin$NT(v10);
                            __monitor_exit(map0);
                            FIN.finallyCodeEnd$NT(v10);
                        }
                        Selector selector8 = this.j;
                        batl.s(selector8);
                        for(Object object6: selector8.selectedKeys()) {
                            SelectionKey selectionKey0 = (SelectionKey)object6;
                            try {
                                auaf auaf3 = (auaf)selectionKey0.attachment();
                                if(selectionKey0.isValid() && selectionKey0.isConnectable()) {
                                    int v11 = auaf3.b();
                                    if(v11 != -1) {
                                        avjh0.n("*** removing socket %s (onConnectable)", auaf3);
                                        this.l(auaf3);
                                        selectionKey0.cancel();
                                        auaf3.l(v11);
                                    }
                                }
                                if(selectionKey0.isValid() && selectionKey0.isReadable()) {
                                    int v12 = auaf3.c();
                                    if(v12 != -1) {
                                        avjh0.n("*** removing socket %s (onReadable)", auaf3);
                                        this.l(auaf3);
                                        selectionKey0.cancel();
                                        auaf3.l(v12);
                                    }
                                }
                                if(!selectionKey0.isValid() || !selectionKey0.isWritable()) {
                                    continue;
                                }
                                int v13 = auaf3.d();
                                if(v13 == -1) {
                                    continue;
                                }
                                avjh0.n("*** removing socket %s (onWritable)", auaf3);
                                this.l(auaf3);
                                selectionKey0.cancel();
                                auaf3.l(v13);
                            }
                            catch(CancelledKeyException cancelledKeyException0) {
                                this.b.g("Received a CancelledKeyException exception: %s", new Object[]{cancelledKeyException0.getMessage()});
                            }
                        }
                        Selector selector9 = this.j;
                        batl.s(selector9);
                        selector9.selectedKeys().clear();
                        this.o();
                    }
                    catch(Throwable throwable1) {
                    label_179:
                        TWR.safeClose$NT(gdqs1, throwable1);
                        throw throwable1;
                    }
                    if(gdqs1 != null) {
                        gdqs1.close();
                    }
                    v = v4;
                    continue;
                }
                else if(gdqs1 != null) {
                    gdqs1.close();
                    return;
                }
                break;
            }
        }
    }

    final void d(Context context0) {
        synchronized(this) {
            if(this.l == null) {
                this.b.m("starting multiplexer");
                this.e = new CountDownLatch(1);
                this.c = false;
                this.k = false;
                this.j = Selector.open();
                this.l = new Thread(new auap(this, context0));
                this.l.setName("CastSocketMultiplexerThread");
                this.l.start();
                try {
                    if(!this.e.await(1L, TimeUnit.SECONDS)) {
                        throw new IOException("timed out or interrupted waiting for muxer thread to start");
                    }
                    goto label_13;
                }
                catch(InterruptedException unused_ex) {
                }
                throw new IOException("timed out or interrupted waiting for muxer thread to start");
            }
        label_13:
        }
    }

    public final void e() {
        synchronized(this) {
            this.j();
            this.n();
        }
    }

    public final boolean f() {
        boolean z = false;
        synchronized(this.s) {
            if(this.f.isEmpty() && this.g.isEmpty()) {
                z = true;
            }
        }
        return z;
    }

    static void g(auaq auaq0) {
        auaq0.l = null;
    }

    public final void h() {
        synchronized(this) {
            this.b.f("Stopping multiplexer...", new Object[0]);
            this.k = true;
            this.d = null;
            if(this.j != null) {
                this.n();
            }
            Thread thread0;
            while((thread0 = this.l) != null) {
                try {
                    thread0.join(2000L);
                    this.l = null;
                    break;
                }
                catch(InterruptedException unused_ex) {
                }
                finally {
                    this.b();
                }
            }
            Selector selector0 = this.j;
            if(selector0 != null) {
                try {
                    selector0.close();
                }
                catch(IOException iOException0) {
                    this.b.e(iOException0, "Error closing selector", new Object[0]);
                }
                this.j = null;
            }
        }
    }

    private static String i(SelectionKey selectionKey0) {
        if(selectionKey0 == null) {
            return "null selection key";
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(String.format(Locale.ROOT, "isValid:%b ", Boolean.valueOf(selectionKey0.isValid())));
        try {
            stringBuilder0.append(selectionKey0.readyOps());
            stringBuilder0.append(": ");
            stringBuilder0.append(String.format(Locale.ROOT, "isAcceptable:%b ", Boolean.valueOf(selectionKey0.isAcceptable())));
            stringBuilder0.append(String.format(Locale.ROOT, "isConnectable:%b ", Boolean.valueOf(selectionKey0.isConnectable())));
            stringBuilder0.append(String.format(Locale.ROOT, "isReadable:%b ", Boolean.valueOf(selectionKey0.isReadable())));
            stringBuilder0.append(String.format(Locale.ROOT, "isWritable:%b ", Boolean.valueOf(selectionKey0.isWritable())));
        }
        catch(CancelledKeyException cancelledKeyException0) {
            stringBuilder0.append(String.format(Locale.ROOT, "Error calling readyOps(%s) ", cancelledKeyException0.getMessage()));
        }
        Object object0 = selectionKey0.attachment();
        if(object0 == null) {
            stringBuilder0.append("No attached cast socket. ");
            return stringBuilder0.toString();
        }
        if((object0 instanceof auaf)) {
            stringBuilder0.append(((auaf)object0));
            return stringBuilder0.toString();
        }
        stringBuilder0.append("Unknown attached object");
        return stringBuilder0.toString();
    }

    private final void j() {
        if(this.c) {
            StringBuilder stringBuilder0 = new StringBuilder("selector thread aborted ");
            if(this.d == null) {
                stringBuilder0.append("unknown condition");
            }
            else {
                stringBuilder0.append(String.format(Locale.ROOT, "\"%s\"", this.d.getMessage()));
                StringWriter stringWriter0 = new StringWriter();
                Throwable throwable0 = this.d;
                batl.s(throwable0);
                throwable0.printStackTrace(new PrintWriter(stringWriter0));
                stringBuilder0.append("Stack Trace: ");
                stringBuilder0.append(stringWriter0);
            }
            throw new IllegalStateException(stringBuilder0.toString());
        }
        if(this.l != null) {
            return;
        }
        throw new IllegalStateException("not started; call start()");
    }

    private final void k(auaf auaf0) {
        Map map0 = this.i;
        if(map0.containsKey(auaf0)) {
            this.m(auaf0);
            this.b.c("release wakelock for socket: %s", new Object[]{auaf0.b});
            this.o.n(auaf0.b);
            synchronized(map0) {
                map0.remove(auaf0);
            }
        }
    }

    private final void l(auaf auaf0) {
        this.f.remove(auaf0);
        if(auaf0.d) {
            this.m(auaf0);
            this.o.n(auaf0.b);
            synchronized(this.i) {
                this.i.remove(auaf0);
            }
        }
    }

    private final void m(auaf auaf0) {
        WorkSource workSource0 = auaf0.c;
        if(workSource0 != null) {
            this.o.i(workSource0);
        }
    }

    private final void n() {
        if(this.j != null) {
            this.b.m("waking up the selector.");
            this.v.set(true);
            Selector selector0 = this.j;
            batl.s(selector0);
            selector0.wakeup();
        }
    }

    private final boolean o() {
        boolean z;
        synchronized(this) {
            Map map0 = this.i;
            z = map0.isEmpty() ^ 1;
            esaa esaa0 = this.o;
            esaa0.k(null);
            for(Object object0: map0.keySet()) {
                this.b.c("release wakelock for all sockets including: %s", new Object[]{((auaf)object0).b});
                esaa0.n(((auaf)object0).b);
            }
            synchronized(map0) {
                map0.clear();
            }
        }
        return z;
    }
}

