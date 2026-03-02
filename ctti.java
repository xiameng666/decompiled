import com.google.android.gms.nearby.presence.PresenceDevice;

public final class ctti extends cvxe {
    final cttl a;

    public ctti(cttl cttl0) {
        this.a = cttl0;
        super();
    }

    @Override  // cvxe
    public final void a(cuwd cuwd0, cuuz cuuz0) {
        ibuq.f(((PresenceDevice)cuwd0), "device");
        if(cuuz0.a == 3) {
            cttl cttl0 = this.a;
            ((ggtj)cttl0.d.h()).z("onBandwidthChanged to HIGH quality: @ %s", cuuz0.c);
            do {
                Object object0 = cttl0.i.b();
                ctow ctow0 = (ctow)object0;
            }
            while(!cttl0.i.h(object0, ctor.a));
        }
    }

    @Override  // cvxe
    public final void b(cuwd cuwd0, cuvf cuvf0) {
        PresenceDevice presenceDevice0 = (PresenceDevice)cuwd0;
        ibuq.f(presenceDevice0, "device");
        this.a.a.c(presenceDevice0.f, this.a.h);
    }

    @Override  // cvxe
    public final void c(cuwd cuwd0, cuvl cuvl0) {
        ibuq.f(((PresenceDevice)cuwd0), "device");
        cttl cttl0 = this.a;
        ((ggtj)cttl0.d.h()).B("onConnectionResult: %s = ", cuvl0.a.j);
        if(!cuvl0.a.e()) {
            icnl icnl0 = cttl0.i;
            do {
                Object object0 = icnl0.b();
                ctow ctow0 = (ctow)object0;
            }
            while(!icnl0.h(object0, ctot.a));
            return;
        }
        icck icck0 = cttl0.f;
        if(icck0 != null) {
            iccl.i(icck0);
        }
        cttl0.f = iccl.b(cttl0.b);
        icck icck1 = cttl0.f;
        if(icck1 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        icbb.b(icck1, null, null, new ctth(cttl0, null), 3);
    }

    @Override  // cvxe
    public final void d(cuwd cuwd0) {
        ibuq.f(((PresenceDevice)cuwd0), "device");
        cttl cttl0 = this.a;
        ((ggtj)cttl0.d.h()).x("onDisconnected");
        icck icck0 = cttl0.f;
        if(icck0 != null) {
            iccl.i(icck0);
        }
        cttl0.f = null;
        icnl icnl0 = cttl0.i;
        do {
            Object object0 = icnl0.b();
            ctow ctow0 = (ctow)object0;
        }
        while(!icnl0.h(object0, ctot.a));
    }
}

