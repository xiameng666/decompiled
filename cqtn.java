import android.content.Context;
import android.net.wifi.WifiManager.MulticastLock;
import android.os.Build.VERSION;
import android.os.SystemClock;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetSocketAddress;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public final class cqtn {
    private final gful_cronetEngineProvider A;
    private final gful_cronetEngineProvider B;
    private final Context C;
    private final cqrf D;
    private final cqwc E;
    private final cqsg F;
    private cqtm G;
    private int H;
    public static final cqwd a;
    public final gful_cronetEngineProvider b;
    public final gful_cronetEngineProvider c;
    public final gful_cronetEngineProvider d;
    public final byte[] e;
    public final byte[] f;
    public final WifiManager.MulticastLock g;
    public final Object h;
    public final Object i;
    public final cquj j;
    public volatile boolean k;
    public cqsz l;
    public cqsz m;
    public Timer n;
    public AtomicInteger o;
    public Timer p;
    boolean q;
    boolean r;
    final AtomicBoolean s;
    volatile Thread t;
    Thread u;
    Thread v;
    final Queue w;
    final Queue x;
    private final gful_cronetEngineProvider y;
    private final gful_cronetEngineProvider z;

    static {
        cqtn.a = new cqwd("MdnsClient");
    }

    public cqtn(Context context0, cqrf cqrf0, WifiManager.MulticastLock wifiManager$MulticastLock0) {
        gful_cronetEngineProvider gful0 = gfus.a(((gful_cronetEngineProvider)new cqtb()));
        this.b = gful0;
        this.y = gfus.a(((gful_cronetEngineProvider)new cqtc()));
        this.z = gfus.a(((gful_cronetEngineProvider)new cqtd()));
        this.c = gfus.a(((gful_cronetEngineProvider)new cqte()));
        this.d = gfus.a(((gful_cronetEngineProvider)new cqtf()));
        this.A = gfus.a(((gful_cronetEngineProvider)new cqtg()));
        this.B = gfus.a(((gful_cronetEngineProvider)new cqth()));
        this.e = new byte[0x800];
        this.h = new Object();
        this.i = new Object();
        this.H = 0;
        this.s = new AtomicBoolean(false);
        this.w = new ArrayDeque();
        this.x = new ArrayDeque();
        this.C = context0;
        this.D = cqrf0;
        this.g = wifiManager$MulticastLock0;
        this.E = cqwc.b();
        this.j = new cquj();
        this.F = new cqsg();
        if(((Boolean)gful0.mr()).booleanValue()) {
            this.f = new byte[0x800];
            return;
        }
        this.f = null;
    }

    final cqsz a(int v) {
        return new cqsz(new cqtr(this.C, this.D), v);
    }

    public final void b(int v) {
        cqug cqug0 = new cqug(this.j, v);
        this.j.a.execute(cqug0);
    }

    // Detected as a lambda impl.
    public final void c(byte[] arr_b, cqsz cqsz0) {
        DatagramPacket datagramPacket0 = new DatagramPacket(arr_b, 0x800);
        while(!this.k) {
            try {
                Object object0 = this.h;
                synchronized(object0) {
                    if(cqsz0 != null && (cqsz0 == this.l || cqsz0 == this.m)) {
                        cqsz0.b.receive(datagramPacket0);
                    }
                }
                if(this.k) {
                    continue;
                }
                String s = cqsz0 == this.l ? "multicast" : "unicast";
                int v1 = cqsz0 == null ? -1 : cqsz0.a();
                int v2 = this.H + 1;
                this.H = v2;
                LinkedList linkedList0 = new LinkedList();
                int v3 = this.F.a(datagramPacket0, linkedList0, v1);
                if(v3 == 0) {
                    if(s.equals("multicast")) {
                        this.q = true;
                        if(this.s.getAndSet(false)) {
                            ((ggtj)cqtn.a.a.i()).x("Recovered from the state where the phone can\'t receive any multicast response");
                            cqui cqui0 = new cqui(this.j);
                            this.j.a.execute(cqui0);
                        }
                    }
                    else {
                        this.r = true;
                    }
                    for(Object object1: linkedList0) {
                        cqse cqse0 = (cqse)object1;
                        String s1 = cqse0.f();
                        cqtn.a.d("mDNS %s response received: %s at ifIndex %d", s, s1, Integer.valueOf(v1));
                        cqtm cqtm0 = this.G;
                        if(cqtm0 != null) {
                            cqtm0.d(cqse0);
                        }
                    }
                }
                else {
                    if(v3 == 1) {
                        continue;
                    }
                    ((ggtj)cqtn.a.a.j()).X("Error while decoding %s packet (%d): %d", s, Integer.valueOf(v2), Integer.valueOf(v3));
                    cqtm cqtm1 = this.G;
                    if(cqtm1 == null) {
                        continue;
                    }
                    cqtm1.c(v2, v3);
                }
            }
            catch(IOException iOException0) {
                if(this.k) {
                    continue;
                }
                a.ae(cqtn.a.a.i(), "Failed to receive mDNS packets.", iOException0);
            }
            catch(UnsupportedOperationException unsupportedOperationException0) {
                ((ggtj)((ggtj)cqtn.a.a.i()).s(unsupportedOperationException0)).z("MulticastSocket.receive() is throwing UnsupportedOperationException on API %d.", Build.VERSION.SDK_INT);
            }
        }
        cqtn.a.a("Receive thread stopped.");
    }

    public final void d(DatagramPacket datagramPacket0, Queue queue0) {
        if(this.k && !((Boolean)this.z.mr()).booleanValue()) {
            ((ggtj)cqtn.a.a.j()).x("sendMdnsPacket() is called after discovery already stopped");
            return;
        }
        synchronized(queue0) {
            while(((long)queue0.size()) >= ((long)(((Long)this.A.mr())))) {
                queue0.remove();
            }
            queue0.add(datagramPacket0);
        }
        cqwd cqwd0 = cqtn.a;
        cqwd0.a("Trigger send thread.");
        Thread thread0 = this.t;
        if(thread0 != null) {
            thread0.interrupt();
            return;
        }
        ((ggtj)cqwd0.a.j()).x("Socket thread is null");
    }

    public final void e(List list0, cqsz cqsz0) {
        String s;
        cqsz cqsz1 = this.l;
        for(Object object0: list0) {
            DatagramPacket datagramPacket0 = (DatagramPacket)object0;
            if(this.k) {
                break;
            }
            try {
                s = cqsz0 == cqsz1 ? "multicast" : "unicast";
                cqtn.a.b("Sending a %s mDNS packet...", s);
                for(Object object1: cqsz0.a.b()) {
                    cqsz0.b.setNetworkInterface(((cqtu)object1).a);
                    cqsz0.b.send(datagramPacket0);
                }
                AtomicInteger atomicInteger0 = this.o;
                if(atomicInteger0 != null) {
                    atomicInteger0.incrementAndGet();
                }
                synchronized(this.i) {
                    if(cqsz0 == this.l) {
                        if(this.s.get()) {
                            return;
                        }
                        if(this.p != null) {
                            return;
                        }
                        if(((Boolean)this.y.mr()).booleanValue() && ((Boolean)this.b.mr()).booleanValue()) {
                            Timer timer0 = new Timer();
                            this.p = timer0;
                            timer0.schedule(new cqtl(this), ((Long)this.d.mr()).longValue());
                        }
                    }
                }
            }
            catch(IOException iOException0) {
                a.e(cqtn.a.a.i(), "Failed to send a %s mDNS packet.", s, iOException0);
            }
        }
        list0.clear();
    }

    public final void f(cqtm cqtm0) {
        synchronized(this) {
            this.G = cqtm0;
        }
    }

    public final void g() {
        synchronized(this) {
            if(this.l != null) {
                ((ggtj)cqtn.a.a.j()).x("Discovery is already in progress.");
                return;
            }
            synchronized(this.w) {
                this.j.a.execute(new cquh(this.j, this.w.size()));
            }
            this.q = false;
            this.r = false;
            this.s.set(false);
            this.k = false;
            try {
                bbfj.b(0x900);
                cqsz cqsz0 = this.a(this.E.a());
                this.l = cqsz0;
                List list0 = cqsz0.a.b();
                InetSocketAddress inetSocketAddress0 = cqsz0.c;
                if(cqsz0.a.c(list0)) {
                    cqsz0.e = true;
                    inetSocketAddress0 = cqsz0.d;
                }
                else {
                    cqsz0.e = false;
                }
                for(Object object0: list0) {
                    cqsz0.b.joinGroup(inetSocketAddress0, ((cqtu)object0).a);
                }
                gful_cronetEngineProvider gful0 = this.b;
                if(((Boolean)gful0.mr()).booleanValue()) {
                    this.m = this.a(0);
                }
                this.g.acquire();
            }
            catch(IOException iOException0) {
                this.g.release();
                cqsz cqsz1 = this.l;
                if(cqsz1 != null) {
                    cqsz1.b();
                    this.l = null;
                }
                cqsz cqsz2 = this.m;
                if(cqsz2 != null) {
                    cqsz2.b();
                    this.m = null;
                }
                throw iOException0;
            }
            finally {
                bbfj.a();
            }
            if(this.t == null) {
                this.t = new Thread(new cqta(this));
                this.t.setName("mdns-send");
                this.t.start();
                AtomicInteger atomicInteger0 = this.o;
                if(atomicInteger0 == null) {
                    this.o = new AtomicInteger();
                }
                else {
                    atomicInteger0.set(0);
                }
                long v3 = (long)(((Long)this.B.mr()));
                Timer timer0 = new Timer("MdnsSocketClientTimer", true);
                this.n = timer0;
                timer0.scheduleAtFixedRate(new cqtk(this), v3, v3);
            }
            else {
                ((ggtj)cqtn.a.a.j()).x("A socket thread already exists.");
            }
            if(this.u != null) {
                ((ggtj)cqtn.a.a.j()).x("A multicast receiver thread already exists.");
                return;
            }
            Thread thread0 = new Thread(() -> {
                DatagramPacket datagramPacket0 = new DatagramPacket(this.a.e, 0x800);
                while(!this.k) {
                    try {
                        Object object0 = this.h;
                        synchronized(object0) {
                            if(this.a.l != null && (this.a.l == this.l || this.a.l == this.m)) {
                                this.a.l.b.receive(datagramPacket0);
                            }
                        }
                        if(this.k) {
                            continue;
                        }
                        String s = this.a.l == this.l ? "multicast" : "unicast";
                        int v1 = this.a.l == null ? -1 : this.a.l.a();
                        int v2 = this.H + 1;
                        this.H = v2;
                        LinkedList linkedList0 = new LinkedList();
                        int v3 = this.F.a(datagramPacket0, linkedList0, v1);
                        if(v3 == 0) {
                            if(s.equals("multicast")) {
                                this.q = true;
                                if(this.s.getAndSet(false)) {
                                    ((ggtj)cqtn.a.a.i()).x("Recovered from the state where the phone can\'t receive any multicast response");
                                    cqui cqui0 = new cqui(this.j);
                                    this.j.a.execute(cqui0);
                                }
                            }
                            else {
                                this.r = true;
                            }
                            for(Object object1: linkedList0) {
                                cqse cqse0 = (cqse)object1;
                                String s1 = cqse0.f();
                                cqtn.a.d("mDNS %s response received: %s at ifIndex %d", s, s1, Integer.valueOf(v1));
                                cqtm cqtm0 = this.G;
                                if(cqtm0 != null) {
                                    cqtm0.d(cqse0);
                                }
                            }
                        }
                        else {
                            if(v3 == 1) {
                                continue;
                            }
                            ((ggtj)cqtn.a.a.j()).X("Error while decoding %s packet (%d): %d", s, Integer.valueOf(v2), Integer.valueOf(v3));
                            cqtm cqtm1 = this.G;
                            if(cqtm1 == null) {
                                continue;
                            }
                            cqtm1.c(v2, v3);
                        }
                    }
                    catch(IOException iOException0) {
                        if(this.k) {
                            continue;
                        }
                        a.ae(cqtn.a.a.i(), "Failed to receive mDNS packets.", iOException0);
                    }
                    catch(UnsupportedOperationException unsupportedOperationException0) {
                        ((ggtj)((ggtj)cqtn.a.a.i()).s(unsupportedOperationException0)).z("MulticastSocket.receive() is throwing UnsupportedOperationException on API %d.", Build.VERSION.SDK_INT);
                    }
                }
                cqtn.a.a("Receive thread stopped.");
            });
            this.u = thread0;
            thread0.setName("mdns-multicast-receive");
            this.u.start();
            if(((Boolean)gful0.mr()).booleanValue()) {
                Thread thread1 = new Thread(new cqtj(this));
                this.v = thread1;
                thread1.setName("mdns-unicast-receive");
                this.v.start();
            }
        }
    }

    public final void h(Thread thread0) {
        long v = SystemClock.elapsedRealtime();
        long v1 = 1000L;
        while(thread0.isAlive() && v1 > 0L) {
            try {
                thread0.interrupt();
                thread0.join(v1);
                if(thread0.isAlive()) {
                    ((ggtj)cqtn.a.a.j()).B("Failed to join thread: %s.", thread0);
                    return;
                }
            }
            catch(InterruptedException unused_ex) {
                v1 = 1000L - (SystemClock.elapsedRealtime() - v);
                continue;
            }
            break;
        }
    }
}

