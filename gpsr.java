import android.content.Context;
import android.net.Network;
import android.util.Pair;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public final class gpsr {
    final gpqg a;
    private final gpsv b;
    private final List c;
    private volatile boolean d;

    public gpsr(Context context0, gpsv gpsv0) {
        this.c = new ArrayList();
        this.d = true;
        this.b = gpsv0;
        this.a = new gpqg(context0, new gpsq(this), gpsv0);
    }

    public final gpsy a(InetAddress inetAddress0) {
        gpsy gpsy0;
        synchronized(this) {
            gpqg gpqg0 = this.a;
            List list0 = this.b();
            gpsy0 = null;
            if((inetAddress0 instanceof Inet6Address) && inetAddress0.isLinkLocalAddress()) {
                int v1 = ((Inet6Address)inetAddress0).getScopeId();
                for(Object object0: list0) {
                    gpss gpss0 = (gpss)object0;
                    if(gpss0.a() == v1) {
                        NetworkInterface networkInterface0 = gpss0.a;
                        if(networkInterface0 == null) {
                            break;
                        }
                        Pair pair0 = gpqg0.a(new gpqa(networkInterface0));
                        if(pair0 == null) {
                            break;
                        }
                        gpsy0 = new gpsy(((Network)pair0.first), networkInterface0.getIndex());
                        break;
                    }
                }
            }
            else {
                Pair pair1 = gpqg0.a(new gpqc(inetAddress0));
                if(pair1 != null) {
                    gpqd gpqd0 = new gpqd(pair1);
                    for(Object object1: list0) {
                        if(!gpqd0.test(object1)) {
                            continue;
                        }
                        goto label_27;
                    }
                    object1 = null;
                label_27:
                    if(((gpss)object1) != null) {
                        return new gpsy(((Network)pair1.first), ((gpss)object1).a());
                    }
                }
            }
        }
        return gpsy0;
    }

    public final List b() {
        List list0;
        synchronized(this) {
            if(this.d) {
                this.d = false;
                this.c.clear();
                Iterator iterator0 = this.c().iterator();
            label_6:
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    gpss gpss0 = (gpss)object0;
                    gpsv gpsv0 = this.b;
                    if(gpss0 == null) {
                        continue;
                        try {
                        label_11:
                            if(gpss0.a.isLoopback() || gpss0.a.isPointToPoint() || gpss0.a.isVirtual() || !gpss0.a.isUp() || !gpss0.a.supportsMulticast()) {
                                continue;
                            }
                            for(Object object1: gpss0.b()) {
                                if(!(((InterfaceAddress)object1).getAddress() instanceof Inet4Address)) {
                                    continue;
                                }
                                goto label_25;
                            }
                            Iterator iterator2 = gpss0.b().iterator();
                            do {
                                if(!iterator2.hasNext()) {
                                    continue label_6;
                                }
                                Object object2 = iterator2.next();
                            }
                            while(!(((InterfaceAddress)object2).getAddress() instanceof Inet6Address));
                        }
                        catch(IOException iOException0) {
                            gpqn.b(gpsv0, String.format("Failed to check interface %s.", gpss0.a.getDisplayName()), iOException0);
                            continue;
                        }
                    label_25:
                        this.c.add(gpss0);
                        continue;
                    }
                    else {
                        goto label_11;
                    }
                    break;
                }
                if(this.c.isEmpty()) {
                    gpqn.d(this.b, "No network interface available for mDNS scanning.");
                }
            }
            list0 = new ArrayList(this.c);
        }
        return list0;
    }

    final List c() {
        List list0 = new ArrayList();
        try {
            Enumeration enumeration0 = NetworkInterface.getNetworkInterfaces();
            if(enumeration0 != null) {
                while(enumeration0.hasMoreElements()) {
                    list0.add(new gpss(((NetworkInterface)enumeration0.nextElement())));
                }
            }
        }
        catch(SocketException socketException0) {
            gpqn.b(this.b, "Failed to get network interfaces.", socketException0);
            return list0;
        }
        catch(NullPointerException nullPointerException0) {
            gpqn.b(this.b, "Failed to call getNetworkInterfaces API", nullPointerException0);
            return list0;
        }
        return list0;
    }

    public final void d() {
        synchronized(this) {
            this.d = true;
        }
    }

    public static final boolean e(List list0) {
        if(list0.isEmpty()) {
            return false;
        }
        boolean z = false;
        for(Object object0: list0) {
            for(Object object1: ((gpss)object0).b()) {
                if((((InterfaceAddress)object1).getAddress() instanceof Inet6Address)) {
                    z = true;
                    continue;
                }
                return false;
            }
        }
        return z;
    }
}

