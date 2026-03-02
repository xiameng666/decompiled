import android.net.nsd.NsdManager.DiscoveryListener;
import android.net.nsd.NsdServiceInfo;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import j..util.Objects;

final class cqvg implements NsdManager.DiscoveryListener {
    public final String a;
    final cqvh b;

    public cqvg(cqvh cqvh0, String s) {
        Objects.requireNonNull(cqvh0);
        this.b = cqvh0;
        super();
        this.a = s;
    }

    @Override  // android.net.nsd.NsdManager$DiscoveryListener
    public final void onDiscoveryStarted(String s) {
    }

    @Override  // android.net.nsd.NsdManager$DiscoveryListener
    public final void onDiscoveryStopped(String s) {
    }

    @Override  // android.net.nsd.NsdManager$DiscoveryListener
    public final void onServiceFound(NsdServiceInfo nsdServiceInfo0) {
        cqvh cqvh0 = this.b;
        bzs bzs0 = cqvh0.g;
        synchronized(bzs0) {
            if(!cqvh0.i) {
                return;
            }
            if(cqvh0.f) {
                String s = nsdServiceInfo0.getServiceName();
                String s1 = this.a;
                cqvh0.h.v(s, s1);
                cqvs cqvs0 = (cqvs)bzs0.get(s);
                if(cqvs0 != null) {
                    if(s1 != null) {
                        cqvs0.a(s1);
                    }
                    return;
                }
                cqvs cqvs1 = new cqvs(cqvh0.a, cqvh0.b, cqvh0.c, cqvh0.d, cqvh0.e);
                if(s1 != null) {
                    cqvs1.a(s1);
                }
                cqsh cqsh0 = new cqsh();
                cqsh0.d = s;
                if(cqvs1.i(cqsh0.a(), ApiMetadata.a(ComplianceOptions.a))) {
                    bzs0.put(nsdServiceInfo0.getServiceName(), cqvs1);
                }
                return;
            }
        }
        cqve cqve0 = new cqve(this, nsdServiceInfo0);
        cqvh0.c.b(cqve0);
    }

    @Override  // android.net.nsd.NsdManager$DiscoveryListener
    public final void onServiceLost(NsdServiceInfo nsdServiceInfo0) {
        cqvh cqvh0 = this.b;
        bzs bzs0 = cqvh0.g;
        synchronized(bzs0) {
            if(!cqvh0.i) {
                return;
            }
            if(cqvh0.f) {
                String s = nsdServiceInfo0.getServiceName();
                String s1 = this.a;
                cqvh0.h.E(s, s1);
                cqvs cqvs0 = (cqvs)bzs0.get(s);
                if(!cqvh0.h.u(s)) {
                    if(cqvs0 == null) {
                        ((ggtj)((ggtj)cqvh0.d.i()).ar(7129)).B("Missing resolver when getting onServiceLost for subtype %s", s1);
                        return;
                    }
                    if(Thread.currentThread() != cqvs0.a.getThread()) {
                        throw new IllegalStateException("This method must be called on the looper thread");
                    }
                    cqvs0.h(ApiMetadata.a(ComplianceOptions.a));
                    if(cqvs0.b != null) {
                        cqvs0.onServiceLost();
                    }
                    cqvs0.d = true;
                    bzs0.remove(s);
                    return;
                }
                else if(cqvs0 != null && s1 != null) {
                    if(Thread.currentThread() != cqvs0.a.getThread()) {
                        throw new IllegalStateException("This method must be called on the looper thread");
                    }
                    if(cqvs0.c.remove(s1)) {
                        NsdServiceInfo nsdServiceInfo1 = cqvs0.b;
                        if(nsdServiceInfo1 != null) {
                            cqvs0.onServiceUpdated(nsdServiceInfo1);
                        }
                    }
                }
                return;
            }
        }
        cqvf cqvf0 = new cqvf(this, nsdServiceInfo0);
        cqvh0.c.b(cqvf0);
    }

    @Override  // android.net.nsd.NsdManager$DiscoveryListener
    public final void onStartDiscoveryFailed(String s, int v) {
        ((ggtj)((ggtj)this.b.d.i()).ar(7130)).X("Failed to start discovery for serviceType %s, subtype %s with code %d", s, this.a, Integer.valueOf(v));
        cqvc cqvc0 = new cqvc(this);
        this.b.c.b(cqvc0);
    }

    @Override  // android.net.nsd.NsdManager$DiscoveryListener
    public final void onStopDiscoveryFailed(String s, int v) {
        ((ggtj)((ggtj)this.b.d.i()).ar(7131)).X("Failed to stop discovery for serviceType %s, subtype %s with code %d", s, this.a, Integer.valueOf(v));
        cqvd cqvd0 = new cqvd(this, v);
        this.b.c.b(cqvd0);
    }
}

