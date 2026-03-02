import android.os.SystemClock;
import j..util.concurrent.ConcurrentHashMap;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

public final class czwf {
    public static final ggpj a;
    public final czlg b;
    public final czvq c;
    public final DataInputStream d;
    public final Map e;
    public final Map f;
    public volatile boolean g;
    public gymd h;
    private final CountDownLatch i;
    private final ExecutorService j;
    private final gmcg k;
    private final AtomicBoolean l;

    static {
        czwf.a = new ggph(ggcx.l());
    }

    private czwf(czlg czlg0) {
        this.i = new CountDownLatch(1);
        this.e = new ConcurrentHashMap();
        this.f = new ConcurrentHashMap();
        this.j = cuui.d();
        this.k = cuui.d();
        AtomicBoolean atomicBoolean0 = new AtomicBoolean(false);
        this.l = atomicBoolean0;
        this.g = false;
        this.h = gymd.cw;
        this.b = czlg0;
        this.c = new czvq(czlg0.f(), atomicBoolean0);
        this.d = new DataInputStream(new BufferedInputStream(czlg0.e()));
    }

    final czlg a(String s, String s1) {
        czvp czvp0 = new czvp(this.c, s, s1, this.c.a, this.c.c, 2);
        this.c.b.put(s, czvp0);
        czlg czlg0 = this.b.d(czvp0);
        czlg0.g(new czwc(this, s));
        String s2 = czvl.b(s, s1);
        this.f.put(s2, czlg0);
        return czlg0;
    }

    public final czlg b(String s) {
        czlg czlg0;
        if(!this.o()) {
            this.h = gymd.cy;
            return null;
        }
        try {
            String s1 = czup.c();
            gmcu gmcu0 = new gmcu();
            this.e.put(s, gmcu0);
            czvq czvq0 = this.c;
            if(czvq0.c()) {
                long v1 = SystemClock.elapsedRealtime();
                gmcu gmcu1 = new gmcu();
                czvo czvo0 = czvq0.c;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gyty.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gyty)hftp0.b_message).f = 1;
                ((gyty)hftp0.b_message).b |= 2;
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gytz.a).v_newBuilder();
                ByteString hfsf0 = ByteString.copyFrom(czvl.c(s, s1));
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp1.b_message;
                ((gytz)hftv0).b |= 1;
                ((gytz)hftv0).c = hfsf0;
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gytz gytz0 = (gytz)hftp1.b_message;
                s1.getClass();
                gytz0.b |= 2;
                gytz0.d = s1;
                gytz gytz1 = (gytz)hftp1.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gyty gyty0 = (gyty)hftp0.b_message;
                gytz1.getClass();
                gyty0.e = gytz1;
                gyty0.b |= 1;
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gytu.a).v_newBuilder();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ((gytu)hftp2.b_message).e = 1;
                ((gytu)hftp2.b_message).b |= 1;
                gytn gytn0 = gytn.a;
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                gytu gytu0 = (gytu)hftp2.b_message;
                gytn0.getClass();
                gytu0.d = gytn0;
                gytu0.c = 2;
                gytu gytu1 = (gytu)hftp2.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gyty gyty1 = (gyty)hftp0.b_message;
                gytu1.getClass();
                gyty1.d = gytu1;
                gyty1.c = 3;
                czvo0.b(gmcu1, ((gyty)hftp0.N_build()).toBytesArray(), "CONNECTION_REQUEST");
                czvq.b(gmcu1, "CONNECTION_REQUEST");
                if(hvol.aa()) {
                    czkq.a.b().h("[PERFORMANCE] Took %d milliseconds to write multiplex CONNECTION_REQUEST frame.", Long.valueOf(SystemClock.elapsedRealtime() - v1));
                }
            }
            long v2 = SystemClock.elapsedRealtime();
            gytp gytp0 = (gytp)gmcu0.v(hvog.a.bk().bK(), TimeUnit.MILLISECONDS);
            if(hvol.aa()) {
                czkq.a.b().h("[PERFORMANCE] Took %d milliseconds to receive multiplex CONNECTION_RESPONSE frame.", Long.valueOf(SystemClock.elapsedRealtime() - v2));
            }
            switch(gytp0.ordinal()) {
                case 1: {
                    czkq.a.d().j("[%s] establishVirtualSocket after remote response to accept the connection with serviceId=%s, serviceIHashSalt=%s", "MultiplexSocket", s, s1);
                    return this.a(s, s1);
                }
                case 2: {
                    this.h = gymd.cx;
                    break;
                }
                default: {
                    this.h = gymd.cB;
                }
            }
            czkq.a.e().l("[%s] Failed to establish a virtual socket for service ID : %s, hash salt : %s,  hash key : %s because of %s.", "MultiplexSocket", s, s1, bbmu.c(czvl.c(s, s1)), gytp0.name());
            return null;
        }
        catch(IOException iOException0) {
            this.h = gymd.cA;
            czkq.a.c().f(iOException0).i("[%s] Failed to send a CONNECTION_REQUEST frame for service ID %s.", "MultiplexSocket", s);
        }
        catch(InterruptedException interruptedException0) {
            this.h = gymd.cD;
            czkq.a.c().f(interruptedException0).i("[%s] Waiting for the CONNECTION_RESPONSE for %s but got InterruptedException", "MultiplexSocket", s);
            Thread.currentThread().interrupt();
        }
        catch(ExecutionException executionException0) {
            this.h = gymd.cC;
            czkq.a.c().f(executionException0).i("[%s] Waiting for the CONNECTION_RESPONSE for %s but got ExecutionException", "MultiplexSocket", s);
        }
        catch(TimeoutException timeoutException0) {
            this.h = gymd.cz;
            czkq.a.b().f(timeoutException0).i("[%s] Waiting for the CONNECTION_RESPONSE for %s but timeout", "MultiplexSocket", s);
        }
        finally {
            this.p(s);
        }
        return null;
    }

    public final czlg c(String s) {
        String s1 = czvl.b(s, this.c.a(s));
        return (czlg)this.f.get(s1);
    }

    public static czwf d(czlg czlg0, String s) {
        czwf czwf0 = new czwf(czlg0);
        czlg0.g(new czwa(czwf0));
        czkq.a.d().i("[%s] createIncomingSocket with serviceId=%s", "MultiplexSocket", s);
        czwf0.q(s, "RECEIVER_CONDIMENT");
        czwf0.m();
        return czwf0;
    }

    public static czwf e(czlg czlg0, String s) {
        String s1 = czup.c();
        czwf czwf0 = new czwf(czlg0);
        czlg0.g(new czvw(czwf0));
        czkq.a.d().j("[%s] createOutgoingSocket with serviceId=%s, serviceIdHashSalt=%s", "MultiplexSocket", s, s1);
        czwf0.q(s, s1);
        czwf0.m();
        return czwf0;
    }

    public final void f(PrintWriter printWriter0) {
        String s;
        printWriter0.write("  [MultiplexSocket]:\n");
        int v = this.b.f;
        switch(v) {
            case 1: {
                s = "CONNECTION_TECHNOLOGY_UNKNOWN_TECHNOLOGY";
                break;
            }
            case 2: {
                s = "CONNECTION_TECHNOLOGY_BLE_GATT";
                break;
            }
            case 3: {
                s = "CONNECTION_TECHNOLOGY_BLE_L2CAP";
                break;
            }
            case 4: {
                s = "CONNECTION_TECHNOLOGY_HOTSPOT_DIRECT";
                break;
            }
            case 5: {
                s = "CONNECTION_TECHNOLOGY_HOTSPOT_LOCALONLY";
                break;
            }
            case 6: {
                s = "CONNECTION_TECHNOLOGY_HOTSPOT_SOFTAP";
                break;
            }
            case 7: {
                s = "CONNECTION_TECHNOLOGY_WEBRTC_WIFI";
                break;
            }
            case 8: {
                s = "CONNECTION_TECHNOLOGY_WEBRTC_MOBILE";
                break;
            }
            case 9: {
                s = "CONNECTION_TECHNOLOGY_WEBRTC_ETHERNET";
                break;
            }
            case 10: {
                s = "CONNECTION_TECHNOLOGY_WEBRTC_VPN";
                break;
            }
            case 11: {
                s = "CONNECTION_TECHNOLOGY_WEBRTC_LOOPBACK";
                break;
            }
            case 12: {
                s = "CONNECTION_TECHNOLOGY_WEBRTC_ADAPTER_TYPE_ANY";
                break;
            }
            default: {
                s = "null";
            }
        }
        if(v == 0) {
            throw null;
        }
        printWriter0.write(String.format("    Technology : %s\n", s));
        printWriter0.write(String.format("    Virtual Socket Num : %s\n", this.f.size()));
        for(Object object0: this.f.keySet()) {
            printWriter0.write(String.format("    Virtual Socket service ID : %s\n", ((String)object0)));
        }
        printWriter0.flush();
    }

    public final void g() {
        czkq.a.b().h("[%s] Enable the Multiplex Socket.", "MultiplexSocket");
        this.l.set(true);
        this.i.countDown();
    }

    public static void h(String s, int v, czwe czwe0) {
        czwf.a.b(s, Integer.valueOf(v), czwe0);
    }

    public final void i(Runnable runnable0) {
        this.k.execute(runnable0);
    }

    public final void j() {
        this.i(() -> {
            czkq.a.b().h("[%s] shutdown", "MultiplexSocket");
            Map map0 = this.f;
            for(Object object0: map0.values()) {
                bbpb.b(((czlg)object0));
            }
            map0.clear();
            czvq czvq0 = this.c;
            try {
                czvq0.a.close();
            }
            catch(IOException unused_ex) {
            }
            czvq0.c.a();
            bbpb.b(this.b);
            czwf.a.i();
            this.e.clear();
            cuui.h(this.j, "MultiplexSocket.physicalReaderThread");
            cuui.h(this.k, "MultiplexSocket.singleThreadOffloader");
            this.g = true;
        });
    }

    public final void k(String s) {
        czvq czvq0 = this.c;
        String s1 = czvl.b(s, czvq0.a(s));
        if(((czlg)this.f.remove(s1)) != null) {
            cunf cunf0 = czkq.a;
            cunf0.b().i("[%s] Virtual socket(%s) disconnected", "MultiplexSocket", s);
            try {
                czvp czvp0 = (czvp)czvq0.b.remove(s);
                if(czvp0 == null) {
                    cunf0.e().i("[%s] Failed to close VirtualOutputStream(%s) because it\'s already gone.", "MultiplexOutputStream", s);
                }
                else {
                    String s2 = czvp0.b;
                    try {
                        czvp0.close();
                    }
                    catch(IOException unused_ex) {
                    }
                    if(czvq0.c()) {
                        long v = SystemClock.elapsedRealtime();
                        gmcu gmcu0 = new gmcu();
                        czvo czvo0 = czvq0.c;
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gyty.a).v_newBuilder();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((gyty)hftp0.b_message).f = 1;
                        ((gyty)hftp0.b_message).b |= 2;
                        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gytz.a).v_newBuilder();
                        ByteString hfsf0 = ByteString.copyFrom(czvl.c(s, s2));
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        gytz gytz0 = (gytz)hftp1.b_message;
                        gytz0.b |= 1;
                        gytz0.c = hfsf0;
                        gytz gytz1 = (gytz)hftp1.N_build();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gyty gyty0 = (gyty)hftp0.b_message;
                        gytz1.getClass();
                        gyty0.e = gytz1;
                        gyty0.b |= 1;
                        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gytu.a).v_newBuilder();
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ((gytu)hftp2.b_message).e = 3;
                        ((gytu)hftp2.b_message).b |= 1;
                        gytr gytr0 = gytr.a;
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        gytu gytu0 = (gytu)hftp2.b_message;
                        gytr0.getClass();
                        gytu0.d = gytr0;
                        gytu0.c = 4;
                        gytu gytu1 = (gytu)hftp2.N_build();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gyty gyty1 = (gyty)hftp0.b_message;
                        gytu1.getClass();
                        gyty1.d = gytu1;
                        gyty1.c = 3;
                        czvo0.b(gmcu0, ((gyty)hftp0.N_build()).toBytesArray(), "DISCONNECTION");
                        czvq.b(gmcu0, "DISCONNECTION");
                        if(hvol.aa()) {
                            czkq.a.b().h("[PERFORMANCE] Took %d milliseconds to write multiplex DISCONNECTION frame.", Long.valueOf(SystemClock.elapsedRealtime() - v));
                        }
                    }
                    if(czvq0.b.isEmpty()) {
                        try {
                            czvq0.a.close();
                        }
                        catch(IOException unused_ex) {
                        }
                        czvq0.c.a();
                    }
                }
            }
            catch(IOException iOException0) {
                czkq.a.c().f(iOException0).h("[%s] close multiplexOutputStream failed.", "MultiplexSocket");
            }
            if(this.f.isEmpty()) {
                czkq.a.b().h("[%s] Close the physical socket because all virtual sockets disconnected.", "MultiplexSocket");
                czmk.A(this.b, "PhysicalSocket", this.b.a);
            }
        }
    }

    // Detected as a lambda impl.
    public final void l() {
        czkq.a.b().h("[%s] shutdown", "MultiplexSocket");
        Map map0 = this.f;
        for(Object object0: map0.values()) {
            bbpb.b(((czlg)object0));
        }
        map0.clear();
        czvq czvq0 = this.c;
        try {
            czvq0.a.close();
        }
        catch(IOException unused_ex) {
        }
        czvq0.c.a();
        bbpb.b(this.b);
        czwf.a.i();
        this.e.clear();
        cuui.h(this.j, "MultiplexSocket.physicalReaderThread");
        cuui.h(this.k, "MultiplexSocket.singleThreadOffloader");
        this.g = true;
    }

    final void m() {
        if(this.g) {
            czkq.a.e().h("[%s] Failed to start reader thread since socket is shutdown.", "MultiplexSocket");
            return;
        }
        czwb czwb0 = new czwb(this);
        this.j.execute(czwb0);
    }

    public static void n(String s, int v) {
        czwf.a.c(s, Integer.valueOf(v));
    }

    public final boolean o() {
        return this.l.get();
    }

    private final void p(String s) {
        gmcu gmcu0 = (gmcu)this.e.remove(s);
    }

    private final void q(String s, String s1) {
        czvp czvp0 = new czvp(this.c, s, s1, this.c.a, this.c.c, 1);
        this.c.b.put(s, czvp0);
        czlg czlg0 = this.b.d(czvp0);
        czlg0.g(new czvx(this, s));
        if(!this.o()) {
            czvy czvy0 = new czvy(this);
            czlg0.e.add(czvy0);
        }
        String s2 = czvl.b(s, s1);
        this.f.put(s2, czlg0);
    }
}

