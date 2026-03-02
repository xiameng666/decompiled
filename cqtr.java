import android.content.Context;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public final class cqtr implements cqre {
    final cqrf a;
    public final cqre b;
    private static final cqwd c;
    private final gful_cronetEngineProvider d;
    private final List e;
    private volatile boolean f;

    static {
        cqtr.c = new cqwd("MdnsNIProvider");
    }

    public cqtr(Context context0, cqrf cqrf0) {
        this.d = gfus.a(((gful_cronetEngineProvider)new cqtp()));
        this.e = new ArrayList();
        this.f = true;
        cqtq cqtq0 = () -> this.f = true;
        this.b = cqtq0;
        if(cqrf0 != null) {
            this.a = cqrf0;
            return;
        }
        cqrh cqrh0 = new cqrh(context0);
        this.a = cqrh0;
        cqrh.a.b("set listener %s", cqtq0);
        cqrh0.c = cqtq0;
    }

    // Detected as a lambda impl.
    @Override  // cqre
    public final void a() {
        this.f = true;
    }

    public final List b() {
        List list0;
        synchronized(this) {
            if(this.f) {
                this.f = false;
                this.e.clear();
                Iterator iterator0 = cqtr.d().iterator();
            label_6:
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    cqtu cqtu0 = (cqtu)object0;
                    if(cqtu0 == null) {
                        continue;
                        try {
                        label_10:
                            if(cqtu0.a.isLoopback() || cqtu0.a.isPointToPoint() || cqtu0.a.isVirtual() || !cqtu0.a.isUp() || !cqtu0.a.supportsMulticast()) {
                                continue;
                            }
                            for(Object object1: cqtu0.a()) {
                                if(!(((cqtt)object1).a() instanceof Inet4Address)) {
                                    continue;
                                }
                                goto label_24;
                            }
                            Iterator iterator2 = cqtu0.a().iterator();
                            do {
                                if(!iterator2.hasNext()) {
                                    continue label_6;
                                }
                                Object object2 = iterator2.next();
                            }
                            while(!(((cqtt)object2).a() instanceof Inet6Address));
                        }
                        catch(IOException iOException0) {
                            a.e(cqtr.c.a.i(), "Failed to check interface %s.", cqtu0.a.getDisplayName(), iOException0);
                            continue;
                        }
                    label_24:
                        this.e.add(cqtu0);
                        continue;
                    }
                    else {
                        goto label_10;
                    }
                    break;
                }
                if(this.e.isEmpty()) {
                    cqtr.c.a("No network interface available for mDNS scanning.");
                }
            }
            list0 = new ArrayList(this.e);
        }
        return list0;
    }

    public final boolean c(List list0) {
        if(list0.isEmpty()) {
            return false;
        }
        if(((Boolean)this.d.mr()).booleanValue()) {
            return true;
        }
        boolean z = false;
        for(Object object0: list0) {
            for(Object object1: ((cqtu)object0).a()) {
                if((((cqtt)object1).a() instanceof Inet6Address)) {
                    z = true;
                    continue;
                }
                return false;
            }
        }
        return z;
    }

    static final List d() {
        List list0 = new ArrayList();
        try {
            Enumeration enumeration0 = NetworkInterface.getNetworkInterfaces();
            if(enumeration0 != null) {
                while(enumeration0.hasMoreElements()) {
                    list0.add(new cqtu(((NetworkInterface)enumeration0.nextElement())));
                }
            }
        }
        catch(SocketException socketException0) {
            a.ae(cqtr.c.a.i(), "Failed to get network interfaces.", socketException0);
            return list0;
        }
        catch(NullPointerException nullPointerException0) {
            a.ae(cqtr.c.a.i(), "Failed to call getNetworkInterfaces API", nullPointerException0);
            return list0;
        }
        return list0;
    }
}

