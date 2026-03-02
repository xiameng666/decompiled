import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.text.format.DateUtils;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.wearable.node.TransportWriter.FlushAlarmBroadcastReceiver;
import j..time.Duration;
import j..time.Instant;
import j..util.concurrent.ConcurrentLinkedQueue;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.TWR;

public final class fdzb implements fdwy, ffmj, Runnable {
    private final ffml A;
    private final TransportWriter.FlushAlarmBroadcastReceiver B;
    public final fdxn a;
    public final boolean b;
    final int c;
    final ayux d;
    final ayux e;
    public volatile boolean f;
    private static final Boolean g;
    private static final ffav h;
    private static final fdvw i;
    private final Context j;
    private final int k;
    private final fdvx l;
    private volatile OutputStream m;
    private final feyl n;
    private final fdpd o;
    private final fdzr p;
    private final Object q;
    private final fens r;
    private boolean s;
    private long t;
    private PendingIntent u;
    private final fdzw v;
    private final SparseArray w;
    private final boolean x;
    private final brzr y;
    private final gfuv z;

    static {
        fdzb.g = Boolean.valueOf(false);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ffau.a).v_newBuilder();
        fezw fezw0 = fezw.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffau ffau0 = (ffau)hftp0.b_message;
        fezw0.getClass();
        ffau0.m = fezw0;
        ffau0.b |= 0x400;
        ffau ffau1 = (ffau)hftp0.N_build();
        fdzb.h = feaa.e(ffau1);
        fdzb.i = feaa.b(ffau1);
    }

    public fdzb(Context context0, fdvx fdvx0, OutputStream outputStream0, feyl feyl0, fdzr fdzr0, int v, boolean z, fdpd fdpd0, fens fens0, int v1, brzr brzr0, gfuv gfuv0, ffml ffml0) {
        this.q = new Object();
        boolean z1 = false;
        this.s = false;
        this.t = 0x7FFFFFFFFFFFFFFFL;
        this.u = null;
        this.v = new fdzw();
        this.w = new SparseArray();
        this.j = context0;
        this.l = fdvx0;
        this.m = outputStream0;
        this.n = feyl0;
        this.a = new fdxn(feyl0.c, feyl0.d);
        this.b = z;
        this.p = fdzr0;
        this.f = false;
        if(!z && feaa.h(Build.VERSION.SDK_INT, feyl0.m)) {
            z1 = true;
        }
        this.x = z1;
        this.k = v;
        this.o = fdpd0;
        this.r = fens0;
        this.c = v1;
        this.d = fdob.b().a(fdnx.o);
        this.e = fdob.b().a(fdnx.q);
        this.y = brzr0;
        this.z = gfuv0;
        this.A = ffml0;
        this.B = new TransportWriter.FlushAlarmBroadcastReceiver(this);
    }

    @Override  // fdwy
    public final int a() {
        return this.n.f;
    }

    @Override  // fdwy
    public final fdxn b() {
        return this.a;
    }

    @Override  // fdwy
    public final void c(int v, long v1, ffau ffau0, fdwt fdwt0) {
        Queue queue0;
        fdyf fdyf0;
        int v2;
        batl.t(ffau0, "message was null");
        fdzb.j(this.m);
        fens fens0 = this.r;
        if(fens0 != null) {
            ayuy ayuy0 = ayvf.b;
            this.e.a(0L, 1L, ayuy0);
            if(fens0.b(ffau0)) {
                this.d.a(0L, 1L, ayuy0);
                return;
            }
            ffau0 = fens0.a(ffau0);
            if(ffau0 == null) {
                Log.d("Wear_TransportWriter", "Filtering out message");
                return;
            }
        }
        if(hzzc.c()) {
            v2 = v;
            fdyf0 = fdyg.a(this.n.f, v2, ffau0, fdwt0, this.k, this.z);
        }
        else {
            v2 = v;
            fdyf0 = fdyg.a(this.n.f, v2, ffau0, fdwt0, this.k, gfqs.a);
        }
        if(!fdyf0.i()) {
            SparseArray sparseArray0 = this.w;
            synchronized(sparseArray0) {
                queue0 = (Queue)sparseArray0.get(v2);
                if(queue0 == null) {
                    long v4 = v2 == 4 || v2 == 8 ? hzzi.a.i().w() : hzzi.e();
                    queue0 = ((int)v4) > 0 ? new LinkedBlockingQueue(((int)v4)) : new ConcurrentLinkedQueue();
                    sparseArray0.put(v2, queue0);
                }
            }
            if((queue0 instanceof BlockingQueue)) {
                while(!((BlockingQueue)queue0).offer(fdyf0, 10L, TimeUnit.SECONDS)) {
                    Log.w("Wear_TransportWriter", a.f(v2, " queue writer failed to queue message in queue ", " because it was full. Triggering queue flush."));
                    this.f();
                }
            }
            else {
                queue0.add(fdyf0);
            }
            long v5 = hzzi.e();
            if(v1 > SystemClock.elapsedRealtime() + 2000L && (v5 <= 0L || ((long)queue0.size()) <= v5 - 2L)) {
                synchronized(this.q) {
                    if(!this.s && v1 < this.t) {
                        fdzb.g("scheduling delayed message alarm");
                        long v7 = Math.round(((double)(v1 - SystemClock.elapsedRealtime())) * 0.1);
                        Intent intent0 = new Intent("TransportWriter::QueueFlush");
                        Class class0 = this.B.getClass();
                        Intent intent1 = intent0.setClass(this.j, class0);
                        PendingIntent pendingIntent0 = PendingIntent.getBroadcast(this.j, 0, intent1, 0xA000000);
                        new bbib(this.j).o("AlarmHelper", v1 - v7, v7, pendingIntent0, null);
                        this.u = pendingIntent0;
                        this.t = v1;
                    }
                    else {
                        fdzb.g("not scheduling wakeup as a more urgent transfer already exists.");
                    }
                    if(hzzc.c()) {
                        fdyf0.j();
                    }
                }
                return;
            }
            fdzb.g("writing immediate message");
            this.f();
            return;
        }
        Log.w("Wear_TransportWriter", "dropping message from queue because the target node cannot read it: " + ffau0);
    }

    public final void d() {
        int v3;
        this.m = null;
        SparseArray sparseArray0 = this.w;
        synchronized(sparseArray0) {
            int v1 = sparseArray0.size();
            v3 = 0;
            for(int v2 = 0; v2 < v1; ++v2) {
                Queue queue0 = (Queue)sparseArray0.valueAt(v2);
                for(fdyf fdyf0 = (fdyf)queue0.poll(); fdyf0 != null; fdyf0 = (fdyf)queue0.poll()) {
                    ++v3;
                    fdyf0.f();
                }
            }
        }
        fdzb.g(a.f(v3, "purged ", " messages from writer"));
    }

    public final void f() {
        Object object0 = this.q;
        synchronized(object0) {
            PendingIntent pendingIntent0 = this.u;
            fdzb.g("flush triggered");
            if(pendingIntent0 != null) {
                fdzb.g("cancelling alarm");
                new bbib(this.j).a(pendingIntent0);
                this.u = null;
            }
            this.t = 0x7FFFFFFFFFFFFFFFL;
            this.s = true;
            object0.notifyAll();
        }
    }

    public static void g(String s) {
        if(Log.isLoggable("Wear_TransportWriter", 2)) {
            Log.v("Wear_TransportWriter", s);
        }
    }

    public static fdpz h() {
        fdpz fdpz0 = new fdpz();
        gfuv gfuv0 = gfqs.a;
        if(gfuv0 == null) {
            throw new NullPointerException("Null ticker");
        }
        fdpz0.g = gfuv0;
        return fdpz0;
    }

    private final int i(Queue queue0, fdzf fdzf0) {
        String s;
        int v;
        if(queue0 == null) {
            return -1;
        }
        fdyf fdyf0 = (fdyf)queue0.peek();
        if(fdyf0 == null) {
            return -1;
        }
        this.f = false;
        fdvw fdvw0 = feaa.b(fdyf0.c());
        if(hzzc.d()) {
            OutputStream outputStream0 = this.m;
            fdzb.j(outputStream0);
            ffav ffav0 = fdyf0.d();
            v = feaa.a(this.l, this.v, outputStream0, ffav0, this.p, fdvw0, this.o, this.c);
        }
        else {
            OutputStream outputStream1 = this.m;
            ffav ffav1 = fdyf0.d();
            v = feaa.a(this.l, this.v, outputStream1, ffav1, this.p, fdvw0, this.o, this.c);
        }
        fdyf0.g(v);
        if(fdyf0.i()) {
            if(hzvy.d()) {
                Log.d("Wear_TransportWriter", "message sent:" + fdyf0.b() + " message pieces, " + fdyf0.a() + " bytes in total, " + fdvw0.toString());
            }
            if(fdzf0 != null && fdyf0.h()) {
                Duration duration0 = fdyf0.e().d();
                if((fdyf0.c().b & 0x80) != 0) {
                    ffby ffby0 = fdyf0.c().j;
                    if(ffby0 == null) {
                        ffby0 = ffby.a;
                    }
                    s = ffby0.c;
                }
                else if((fdyf0.c().b & 0x100) == 0) {
                    s = null;
                }
                else {
                    ffbw ffbw0 = fdyf0.c().k;
                    if(ffbw0 == null) {
                        ffbw0 = ffbw.a;
                    }
                    s = ffbw0.d;
                }
                fdzc fdzc0 = new fdzc(duration0, s);
                fdzf0.c.add(fdzc0);
            }
            queue0.poll();
        }
        return v;
    }

    private static void j(OutputStream outputStream0) {
        if(outputStream0 != null) {
            return;
        }
        throw new IOException("TransportWriter is shutdown.");
    }

    @Override  // ffmj
    public final void md(bbpd bbpd0, boolean z, boolean z1) {
        String s;
        synchronized(this.q) {
            if(this.t < 0x7FFFFFFFFFFFFFFFL) {
                long v1 = Instant.now().plusMillis(this.t - SystemClock.elapsedRealtime()).toEpochMilli();
                s = DateUtils.formatDateTime(this.j, v1, 1);
            }
            else {
                s = "No deadline";
            }
        }
        bbpd0.println("Flush deadline: " + s);
        bbpd0.println(a.an(hzzc.c(), "Delayed transport telemetry enabled: "));
        bbpd0.println();
        bbpd0.println("Max sync delay: " + (this.A == null ? Duration.ofMillis(hzzi.d()) : this.A.a()));
        bbpd0.println();
        SparseArray sparseArray0 = this.w;
        synchronized(sparseArray0) {
            bbpd0.println("message queues: " + sparseArray0.size());
            bbpd0.b();
            int v3 = sparseArray0.size();
            for(int v4 = 0; v4 < v3; ++v4) {
                int v5 = sparseArray0.keyAt(v4);
                Queue queue0 = (Queue)sparseArray0.valueAt(v4);
                if(!queue0.isEmpty()) {
                    bbpd0.println(v5 + ": size=" + queue0.size());
                    if(z1) {
                        bbpd0.b();
                        fdyf[] arr_fdyf = (fdyf[])queue0.toArray(new fdyf[0]);
                        for(int v6 = 0; v6 < arr_fdyf.length; ++v6) {
                            bbpd0.println(ffax.a(arr_fdyf[v6].c()).o);
                        }
                        bbpd0.a();
                    }
                }
            }
            bbpd0.a();
        }
    }

    @Override
    public final void run() {
        ArrayList arrayList0;
        SparseArray sparseArray0;
        fdzf fdzf0;
        try {
            Thread.currentThread().setName("Wear:Writer-" + this.n.c);
            if(hzzc.c()) {
                fdzb.g("Delayed transport stats enabled");
                fdzf0 = new fdzf(this.A);
            }
            else {
                fdzb.g("Delayed transport stats disabled");
                fdzf0 = null;
            }
            while(true) {
                if(Thread.interrupted()) {
                    this.p.f("writer was stopped");
                    return;
                }
                try {
                    fdzb.g("waiting for change");
                    Object object0 = this.q;
                    synchronized(object0) {
                        while(!this.s) {
                            object0.wait();
                        }
                        this.s = false;
                    }
                    fdzb.g("change signalled");
                }
                catch(InterruptedException unused_ex) {
                    this.p.f("writer thread interrupted");
                    return;
                }
                gdqs gdqs0 = brzr.o(this.y, "writeMessages");
                try {
                    do {
                        do {
                            do {
                                do {
                                    sparseArray0 = this.w;
                                    synchronized(sparseArray0) {
                                        Queue queue0 = (Queue)sparseArray0.get(8);
                                    }
                                }
                                while(this.i(queue0, fdzf0) > 0);
                                synchronized(sparseArray0) {
                                    Queue queue1 = (Queue)sparseArray0.get(10);
                                }
                            }
                            while(this.i(queue1, fdzf0) > 0);
                            synchronized(sparseArray0) {
                                Queue queue2 = (Queue)sparseArray0.get(9);
                            }
                        }
                        while(this.i(queue2, fdzf0) > 0);
                        synchronized(sparseArray0) {
                            arrayList0 = new ArrayList(sparseArray0.size());
                            int v2 = sparseArray0.size();
                            for(int v3 = 0; v3 < v2; ++v3) {
                                arrayList0.add(((Queue)sparseArray0.valueAt(v3)));
                            }
                        }
                        int v4 = arrayList0.size();
                        int v6 = 0;
                        for(int v5 = 0; v5 < v4; ++v5) {
                            if(this.i(((Queue)arrayList0.get(v5)), fdzf0) >= 0) {
                                ++v6;
                            }
                        }
                    }
                    while(v6 != 0);
                    fdzb.g("no message found");
                    if(fdzf0 != null) {
                        ArrayList arrayList1 = fdzf0.c;
                        if(!arrayList1.isEmpty()) {
                            int v7 = arrayList1.size();
                            for(int v8 = 0; v8 < v7; ++v8) {
                                fdzc fdzc0 = (fdzc)arrayList1.get(v8);
                                String s = fdzc0.b;
                                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gikz.a).v_newBuilder();
                                if(s != null) {
                                    if(!hftp0.b_message.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    gikz gikz0 = (gikz)hftp0.b_message;
                                    gikz0.b |= 2;
                                    gikz0.d = s;
                                }
                                ccyx ccyx0 = fdzf0.a;
                                long v9 = fdzc0.a.toMillis();
                                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gilb.a).v_newBuilder();
                                if(!hftp1.b_message.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                gilb gilb0 = (gilb)hftp1.b_message;
                                gikz gikz1 = (gikz)hftp0.N_build();
                                gikz1.getClass();
                                gilb0.c = gikz1;
                                gilb0.b |= 1;
                                ccyv ccyv0 = ccyv.a(((MessageLite)hftp1.N_build()));
                                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)ccwq.a).v_newBuilder();
                                String s1 = ccyx0.a;
                                if(!hftp2.b_message.isImmutable()) {
                                    hftp2.ensureMutable();
                                }
                                ProtoLiteMessage hftv0 = hftp2.b_message;
                                s1.getClass();
                                ((ccwq)hftv0).b |= 1;
                                ((ccwq)hftv0).c = s1;
                                ccwp ccwp0 = ccwp.e;
                                if(!hftv0.isImmutable()) {
                                    hftp2.ensureMutable();
                                }
                                ((ccwq)hftp2.b_message).d = ccwp0.g;
                                ((ccwq)hftp2.b_message).b |= 2;
                                long v10 = ccyx0.b.a(v9);
                                if(!hftp2.b_message.isImmutable()) {
                                    hftp2.ensureMutable();
                                }
                                ProtoLiteMessage hftv1 = hftp2.b_message;
                                ((ccwq)hftv1).b |= 16;
                                ((ccwq)hftv1).g = v10;
                                if(!hftv1.isImmutable()) {
                                    hftp2.ensureMutable();
                                }
                                ccwq ccwq0 = (ccwq)hftp2.b_message;
                                ccwq0.b |= 0x20;
                                ccwq0.h = 1L;
                                ccyx0.a(hftp2, ccyv0);
                            }
                            ccyw ccyw0 = fdzf0.b;
                            int v11 = arrayList1.size();
                            ccyv ccyv1 = ccyw0.f.f;
                            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)ccwq.a).v_newBuilder();
                            String s2 = ccyw0.a;
                            if(!hftp3.b_message.isImmutable()) {
                                hftp3.ensureMutable();
                            }
                            ProtoLiteMessage hftv2 = hftp3.b_message;
                            s2.getClass();
                            ((ccwq)hftv2).b |= 1;
                            ((ccwq)hftv2).c = s2;
                            ccwp ccwp1 = ccwp.d;
                            if(!hftv2.isImmutable()) {
                                hftp3.ensureMutable();
                            }
                            ProtoLiteMessage hftv3 = hftp3.b_message;
                            ((ccwq)hftv3).d = ccwp1.g;
                            ((ccwq)hftv3).b |= 2;
                            if(!hftv3.isImmutable()) {
                                hftp3.ensureMutable();
                            }
                            ProtoLiteMessage hftv4 = hftp3.b_message;
                            ((ccwq)hftv4).b |= 8;
                            ((ccwq)hftv4).f = v11;
                            if(!hftv4.isImmutable()) {
                                hftp3.ensureMutable();
                            }
                            ccwq ccwq1 = (ccwq)hftp3.b_message;
                            ccwq1.b |= 0x20;
                            ccwq1.h = 1L;
                            ccyw0.a(hftp3, ccyv1);
                            if(Log.isLoggable("Wear_TransportWriter", 3)) {
                                Log.d("Wear_TransportWriter", "Logged batch of " + arrayList1.size() + " messages");
                            }
                            if(Log.isLoggable("Wear_TransportWriter", 2)) {
                                int v12 = arrayList1.size();
                                for(int v13 = 0; v13 < v12; ++v13) {
                                    Log.v("Wear_TransportWriter", "Duration in queue: " + ((fdzc)arrayList1.get(v13)).a.toString());
                                }
                            }
                            arrayList1.clear();
                        }
                    }
                    if(this.f && this.x) {
                        this.f = false;
                        fdzb.g("sending heartbeat");
                        if(hzzc.d()) {
                            OutputStream outputStream0 = this.m;
                            fdzb.j(outputStream0);
                            feaa.a(this.l, this.v, outputStream0, fdzb.h, this.p, fdzb.i, this.o, this.c);
                        }
                        else {
                            feaa.a(this.l, this.v, this.m, fdzb.h, this.p, fdzb.i, this.o, this.c);
                        }
                    }
                    if(gdqs0 == null) {
                        continue;
                    }
                }
                catch(Throwable throwable0) {
                    TWR.safeClose$NT(gdqs0, throwable0);
                    throw throwable0;
                }
                gdqs0.close();
            }
        }
        catch(IOException iOException0) {
            this.p.f("writer threw IOException: " + iOException0.getMessage());
            if(Log.isLoggable("Wear_TransportWriter", 3)) {
                Log.d("Wear_TransportWriter", "TransportWriter threw IOException: " + iOException0.getMessage());
            }
        }
        catch(Exception exception0) {
            this.p.f("writer unexpected exception: " + exception0.getMessage());
        }
    }
}

