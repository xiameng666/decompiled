import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.nsd.NsdServiceInfo;
import j..util.Objects;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

public final class czlc {
    public static final Map a;

    static {
        czlc.a = new bxd();
    }

    public static gymd a() {
        return czlc.d() ? gymd.C : gymd.a;
    }

    public static boolean b() {
        return czlc.d();
    }

    public static boolean c(Context context0) {
        Intent intent0 = jwe.b(context0, null, new IntentFilter("android.net.nsd.STATE_CHANGED"), 2);
        if(intent0 == null) {
            return false;
        }
        return Objects.equals(intent0.getAction(), "android.net.nsd.STATE_CHANGED") ? intent0.getIntExtra("nsd_state", -1) == 2 : false;
    }

    public static boolean d() {
        try {
            Enumeration enumeration0 = NetworkInterface.getNetworkInterfaces();
            while(true) {
            label_1:
                if(!enumeration0.hasMoreElements()) {
                    return false;
                }
                if(((NetworkInterface)enumeration0.nextElement()).supportsMulticast()) {
                    return true;
                }
            }
        }
        catch(SocketException socketException0) {
            czkq.a.e().f(socketException0).p("Failed to query networks for multicast support.", new Object[0]);
            return false;
        }
        goto label_1;
    }

    public static void e(cuqs cuqs0, String s, NsdServiceInfo nsdServiceInfo0, czkv czkv0, czkz czkz0) {
        czkw czkw0;
        cunf cunf2;
        cunf cunf1;
        NsdServiceInfo nsdServiceInfo1;
        AtomicReference atomicReference0;
        synchronized(czlc.class) {
            if(nsdServiceInfo0.getServiceType().contains(czkz0.b)) {
                if(czkz0.f != null && Objects.equals(czkz0.f, nsdServiceInfo0.getServiceName())) {
                    cunf cunf0 = czkq.a.b();
                    String s1 = nsdServiceInfo0.getServiceName();
                    cunf0.i("%s discovered service %s, but that\'s us. Ignoring.", czkz0.a.name(), s1);
                    return;
                }
                goto label_9;
            }
            goto label_72;
        }
        return;
    label_9:
        atomicReference0 = new AtomicReference();
        try {
            try {
                nsdServiceInfo1 = (NsdServiceInfo)jqy.a(new czkr(atomicReference0, cuqs0, nsdServiceInfo0, czkz0)).get(czkz0.e, TimeUnit.SECONDS);
                goto label_42;
            }
            catch(InterruptedException unused_ex) {
            }
            catch(ExecutionException executionException0) {
                goto label_20;
            }
            catch(TimeoutException timeoutException0) {
                goto label_28;
            }
            Thread.currentThread().interrupt();
            czkq.a.b().p("Interrupted while resolving NsdServiceInfo", new Object[0]);
            if(bbqa.d()) {
                goto label_15;
            }
            return;
        }
        catch(Throwable throwable1) {
            goto label_38;
        }
    label_15:
        czkq.a.b().p("Stop resolving NsdServiceInfo.", new Object[0]);
        cuqs0.a(((cuqr)atomicReference0.get()));
        return;
        try {
        label_20:
            cunf1 = czkq.a;
            cunf1.b().f(executionException0).p("Failed to resolve NsdServiceInfo", new Object[0]);
            if(bbqa.d()) {
                goto label_23;
            }
            return;
        }
        catch(Throwable throwable1) {
            goto label_38;
        }
    label_23:
        cunf1.b().p("Stop resolving NsdServiceInfo.", new Object[0]);
        cuqs0.a(((cuqr)atomicReference0.get()));
        return;
        try {
        label_28:
            cunf2 = czkq.a;
            cunf2.b().f(timeoutException0).p("Timed out while resolving NsdServiceInfo", new Object[0]);
            if(bbqa.d()) {
                goto label_31;
            }
            return;
        }
        catch(Throwable throwable1) {
            goto label_38;
        }
    label_31:
        cunf2.b().p("Stop resolving NsdServiceInfo.", new Object[0]);
        cuqs0.a(((cuqr)atomicReference0.get()));
        return;
    label_38:
        if(bbqa.d()) {
            czkq.a.b().p("Stop resolving NsdServiceInfo.", new Object[0]);
            cuqs0.a(((cuqr)atomicReference0.get()));
        }
        throw throwable1;
    label_42:
        if(bbqa.d()) {
            czkq.a.b().p("Stop resolving NsdServiceInfo.", new Object[0]);
            cuqs0.a(((cuqr)atomicReference0.get()));
        }
        String s2 = nsdServiceInfo1.getAttributes() == null || nsdServiceInfo1.getAttributes().get("IPv4") == null ? null : new String(((byte[])nsdServiceInfo1.getAttributes().get("IPv4")));
        if(s2 != null) {
            try {
                nsdServiceInfo1.setHost(InetAddress.getByName(s2));
                goto label_53;
            }
            catch(UnknownHostException unused_ex) {
            }
            gymd gymd0 = bboz.a(s2) ? gymd.al : gymd.am;
            czke.n(czkz0.a, s, 6, gymr.e, gymd0, String.format("Remote Service:%s, IP Address:%s", nsdServiceInfo1.getServiceName(), s2));
            return;
        }
    label_53:
        if(czkz0.f != null && bbqa.d() || (czkz0.g == null || !Objects.equals(czkz0.g, nsdServiceInfo1.getHost()))) {
            cunf cunf3 = czkq.a;
            cunf cunf4 = cunf3.b();
            gyxl gyxl0 = czkz0.a;
            cunf4.l("%s discovered service name:%s type:%s at ip:%s port:%s", gyxl0.name(), nsdServiceInfo1.getServiceName(), nsdServiceInfo1.getServiceType(), nsdServiceInfo1.getHost(), Integer.valueOf(nsdServiceInfo1.getPort()));
            czkw0 = (czkw)czlc.a.get(s);
            if(czkw0 == null) {
                cunf3.e().i("%s discovered service %s but service tracker does not exist. Ignoring.", gyxl0.name(), nsdServiceInfo1.getServiceName());
                return;
            }
        }
        else {
            goto label_67;
        }
        czkw0.b(nsdServiceInfo1.getServiceName(), nsdServiceInfo1);
        czkv0.a(nsdServiceInfo1);
        return;
    label_67:
        cunf cunf5 = czkq.a.b();
        String s3 = nsdServiceInfo1.getServiceName();
        cunf5.i("%s discovered service %s, but it comes from a local address. Ignoring.", czkz0.a.name(), s3);
        return;
    label_72:
        cunf cunf6 = czkq.a.b();
        String s4 = nsdServiceInfo0.getServiceName();
        String s5 = nsdServiceInfo0.getServiceType();
        cunf6.k("%s discovered service %s with service type %s, but was looking for services with service type %s.", czkz0.a.name(), s4, s5, czkz0.b);
    }

    public static void f(String s, NsdServiceInfo nsdServiceInfo0, czkv czkv0, czkz czkz0) {
        synchronized(czlc.class) {
            czkw czkw0 = (czkw)czlc.a.get(s);
            if(czkw0 == null) {
                cunf cunf0 = czkq.a.b();
                String s1 = nsdServiceInfo0.getServiceName();
                cunf0.i("Ignoring %s lost event for service %s because we\'re no longer scanning.", czkz0.a.name(), s1);
                return;
            }
            NsdServiceInfo nsdServiceInfo1 = czkw0.a(nsdServiceInfo0.getServiceName());
            if(nsdServiceInfo1 == null) {
                cunf cunf1 = czkq.a.b();
                String s2 = nsdServiceInfo0.getServiceName();
                cunf1.i("%s lost %s but it was never reported as found.", czkz0.a.name(), s2);
                return;
            }
            czkq.a.b().i("Lost service %s on %s.", nsdServiceInfo1.getServiceName(), czkz0.a.name());
            czkv0.b(nsdServiceInfo1);
        }
    }
}

