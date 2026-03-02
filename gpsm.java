import android.content.Context;
import android.net.NetworkRequest.Builder;
import android.net.NetworkRequest;
import android.net.TrafficStats;
import android.net.wifi.WifiManager.MulticastLock;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.NetworkInterface;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicBoolean;

public final class gpsm implements gpso {
    final Queue a;
    final Queue b;
    public final byte[] c;
    public final WifiManager.MulticastLock d;
    public final Object e;
    public final Object f;
    final AtomicBoolean g;
    volatile Thread h;
    Thread i;
    Thread j;
    public volatile boolean k;
    public gpsn l;
    public gpsi m;
    public gpsi n;
    public int o;
    public Timer p;
    public final gpsv q;
    public final gpqz r;
    public final gpsr s;

    public gpsm(Context context0, WifiManager.MulticastLock wifiManager$MulticastLock0, gpsv gpsv0, gpqz gpqz0) {
        this.a = new ArrayDeque();
        this.b = new ArrayDeque();
        this.c = new byte[0x800];
        this.e = new Object();
        this.f = new Object();
        this.g = new AtomicBoolean(false);
        this.o = 0;
        this.q = gpsv0;
        this.d = wifiManager$MulticastLock0;
        this.r = gpqz0;
        this.s = new gpsr(context0, gpsv0);
    }

    @Override  // gpso
    public final void a() {
        gpsv gpsv0;
        gpsr gpsr0;
        synchronized(this) {
            if(this.m != null) {
                gpqn.e(this.q, "Discovery is already in progress.");
                return;
            }
            goto label_5;
        }
        return;
    label_5:
        this.g.set(false);
        this.k = false;
        gpsr0 = this.s;
        gpqg gpqg0 = gpsr0.a;
        gpqn.d(gpqg0.a, "Start watching connectivity changes");
        if(!gpqg0.e) {
            NetworkRequest.Builder networkRequest$Builder0 = new NetworkRequest.Builder().addTransportType(1);
            networkRequest$Builder0.setIncludeOtherUidNetworks(true);
            NetworkRequest networkRequest0 = networkRequest$Builder0.build();
            gpqg0.c.registerNetworkCallback(networkRequest0, gpqg0.b);
            gpqg0.e = true;
        }
        try {
            try {
                int v = this.r.e;
                if(v != -1) {
                    TrafficStats.setThreadStatsTag(v);
                }
                gpsv0 = this.q;
                gpsi gpsi0 = new gpsi(gpsr0, gpsv0);
                this.m = gpsi0;
                List list0 = gpsi0.c.b();
                InetSocketAddress inetSocketAddress0 = gpsi.a;
                if(gpsr.e(list0)) {
                    gpsi0.e = true;
                    inetSocketAddress0 = gpsi.b;
                }
                else {
                    gpsi0.e = false;
                }
                for(Object object0: list0) {
                    MulticastSocket multicastSocket0 = gpsi0.d;
                    NetworkInterface networkInterface0 = ((gpss)object0).a;
                    multicastSocket0.joinGroup(inetSocketAddress0, networkInterface0);
                    if(!gpsi0.e) {
                        multicastSocket0.joinGroup(gpsi.b, networkInterface0);
                    }
                }
                this.d.acquire();
                goto label_51;
            }
            catch(IOException iOException0) {
                this.d.release();
                gpsi gpsi1 = this.m;
                if(gpsi1 != null) {
                    gpsi1.b();
                    this.m = null;
                }
                throw iOException0;
            }
        }
        catch(Throwable throwable1) {
            if(this.r.e != -1) {
                TrafficStats.clearThreadStatsTag();
            }
            throw throwable1;
        label_51:
            if(v != -1) {
                TrafficStats.clearThreadStatsTag();
            }
            if(this.h == null) {
                this.h = new Thread(new gpsk(this));
                this.h.setName("mdns-send");
                this.h.start();
            }
            else {
                gpqn.e(gpsv0, "A socket thread already exists.");
            }
            if(this.i != null) {
                gpqn.e(gpsv0, "A multicast receiver thread already exists.");
                return;
            }
            goto label_63;
        }
        return;
    label_63:
        Thread thread0 = new Thread(new gpsl(this));
        this.i = thread0;
        thread0.setName("mdns-multicast-receive");
        this.i.start();
    }

    @Override  // gpso
    public final void b(List list0, boolean z) {
        this.f(list0, this.a, z);
    }

    @Override  // gpso
    public final void c(List list0, boolean z) {
        this.f(list0, this.a, z);
    }

    public final void d(gpsn gpsn0) {
        synchronized(this) {
            this.l = gpsn0;
        }
    }

    public final void e(Thread thread0) {
        long v = SystemClock.elapsedRealtime();
        long v1 = 1000L;
        while(thread0.isAlive() && v1 > 0L) {
            try {
                thread0.interrupt();
                thread0.join(v1);
                if(thread0.isAlive()) {
                    gpqn.e(this.q, "Failed to join thread: " + thread0);
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

    private final void f(List list0, Queue queue0, boolean z) {
        int v = 0;
        if(!this.k) {
            if(!list0.isEmpty()) {
                InetAddress inetAddress0 = ((InetSocketAddress)((DatagramPacket)list0.get(0)).getSocketAddress()).getAddress();
                for(Object object0: list0) {
                    if(!inetAddress0.equals(((InetSocketAddress)((DatagramPacket)object0).getSocketAddress()).getAddress())) {
                        gpsj gpsj0 = new gpsj();
                        ArrayList arrayList0 = new ArrayList(list0.size());
                        for(Object object1: list0) {
                            arrayList0.add(gpsj0.apply(object1));
                        }
                        Log.wtf("MdnsClient", "Some mDNS packets have a different target address. addresses=" + arrayList0.toString());
                        return;
                    }
                }
                boolean z1 = ((InetSocketAddress)((DatagramPacket)list0.get(0)).getSocketAddress()).getAddress() instanceof Inet4Address;
                boolean z2 = ((InetSocketAddress)((DatagramPacket)list0.get(0)).getSocketAddress()).getAddress() instanceof Inet6Address;
                int v1 = this.m == null || !this.m.e ? 0 : 1;
                if(!z1) {
                    v = v1;
                }
                else if(v1 != 0) {
                    return;
                }
                if(z2 && v == 0 && z) {
                    return;
                }
                synchronized(queue0) {
                    queue0.addAll(list0);
                }
                gpsv gpsv0 = this.q;
                gpqn.d(gpsv0, "Trigger send thread.");
                Thread thread0 = this.h;
                if(thread0 != null) {
                    thread0.interrupt();
                    return;
                }
                gpqn.e(gpsv0, "Socket thread is null");
                return;
            }
            Log.wtf("MdnsClient", "No mDns packets to send");
            return;
        }
        gpqn.e(this.q, "sendMdnsPacket() is called after discovery already stopped");
    }
}

