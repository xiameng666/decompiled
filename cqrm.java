import android.text.TextUtils;
import com.google.android.gms.mdns.MdnsSearchOptions;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public final class cqrm implements Callable {
    public static final int a;
    private static final cqwd b;
    private final gful_cronetEngineProvider c;
    private final gful_cronetEngineProvider d;
    private final gful_cronetEngineProvider e;
    private final gful_cronetEngineProvider f;
    private final cqwc g;
    private final WeakReference h;
    private final cqrx i;
    private final String[] j;
    private final List k;
    private final boolean l;
    private final int m;
    private final MdnsSearchOptions n;
    private final int o;

    static {
        cqrm.b = new cqwd("MdnsQueryCallable");
    }

    public cqrm(cqtn cqtn0, cqrx cqrx0, String s, Collection collection0, MdnsSearchOptions mdnsSearchOptions0, boolean z, int v) {
        this.c = gfus.a(((gful_cronetEngineProvider)new cqri()));
        gful_cronetEngineProvider gful0 = gfus.a(((gful_cronetEngineProvider)new cqrj()));
        this.d = gful0;
        this.e = gfus.a(((gful_cronetEngineProvider)new cqrk()));
        this.f = gfus.a(((gful_cronetEngineProvider)new cqrl()));
        this.h = new WeakReference(cqtn0);
        this.i = cqrx0;
        this.j = TextUtils.split(s, "\\.");
        this.k = new ArrayList(collection0);
        this.l = z;
        this.m = v;
        this.n = mdnsSearchOptions0;
        this.o = !((Boolean)gful0.mr()).booleanValue() || mdnsSearchOptions0 == null ? 0 : mdnsSearchOptions0.e;
        this.g = cqwc.b();
    }

    public final kau a() {
        gged_interceptors gged0;
        kau kau1;
        String[] arr_s;
        String s;
        boolean z;
        int v1;
        cqrx cqrx0;
        int v;
        List list0;
        cqtn cqtn0;
        kau kau0 = null;
        try {
            cqtn0 = (cqtn)this.h.get();
            if(cqtn0 == null) {
                return null;
            }
            list0 = this.k;
            v = !((Boolean)this.c.mr()).booleanValue() || (this.n == null || !this.n.d) ? 12 : 0xFF;
            cqrx0 = this.i;
            v1 = this.m;
            cqrx0.c(v1);
            z = false;
            cqrx0.c(0);
            cqrx0.c((list0.isEmpty() ? 1 : list0.size() + 1));
            cqrx0.c(0);
            cqrx0.c(0);
            cqrx0.c(0);
            Iterator iterator0 = list0.iterator();
            while(true) {
            label_16:
                if(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    s = (String)object0;
                    arr_s = new String[this.j.length + 2];
                    kau1 = kau0;
                    break;
                }
                goto label_33;
            }
        }
        catch(IOException iOException0) {
            a.e(cqrm.b.a.i(), "Failed to create mDNS packet for subtype: %s.", TextUtils.join(",", this.k), iOException0);
            return kau0;
        }
        try {
            arr_s[0] = "_" + s;
            arr_s[1] = "_sub";
            System.arraycopy(this.j, 0, arr_s, 2, this.j.length);
            cqrx0.a(arr_s);
            cqrx0.c(v);
            cqrx0.c((this.l ? 0x8000 : 0) | 1);
            kau0 = kau1;
            goto label_16;
        label_33:
            kau1 = kau0;
            cqrx0.a(this.j);
            cqrx0.c(v);
            cqrx0.c((this.l ? 0x8000 : 0) | 1);
            int v2 = this.o;
            if(cqtn0.l != null && cqtn0.l.e) {
                z = true;
            }
            switch(v2) {
                case 1: {
                    gged0 = !z || !((Boolean)this.e.mr()).booleanValue() ? gged_interceptors.l(cqrp.a) : gged_interceptors.l(cqrp.b);
                    break;
                }
                case 2: {
                    gged0 = gged_interceptors.l(cqrp.b);
                    break;
                }
                default: {
                    if(v2 == 3) {
                        gged0 = gged_interceptors.m(cqrp.a, cqrp.b);
                    }
                    else if(z) {
                        gged0 = gged_interceptors.l(cqrp.b);
                    }
                    else {
                        gged0 = gged_interceptors.l(cqrp.a);
                    }
                }
            }
            ggqk ggqk0 = gged0.E();
        label_53:
            if(!ggqk0.hasNext()) {
                return new kau(v1, list0);
            }
            Object object1 = ggqk0.next();
            InetAddress inetAddress0 = (InetAddress)object1;
            this.b(cqtn0, new InetSocketAddress(inetAddress0, this.g.a()));
            Iterator iterator1 = ((List)this.f.mr()).iterator();
            while(true) {
                if(!iterator1.hasNext()) {
                    goto label_53;
                }
                Object object2 = iterator1.next();
                this.b(cqtn0, new InetSocketAddress(inetAddress0, ((int)(((Integer)object2)))));
            }
        }
        catch(IOException iOException0) {
        }
        a.e(cqrm.b.a.i(), "Failed to create mDNS packet for subtype: %s.", TextUtils.join(",", this.k), iOException0);
        return kau1;
    }

    private final void b(cqtn cqtn0, InetSocketAddress inetSocketAddress0) {
        DatagramPacket datagramPacket0 = new DatagramPacket(this.i.a, this.i.b, inetSocketAddress0);
        if(this.l) {
            if(((Boolean)cqtn0.b.mr()).booleanValue()) {
                cqtn0.d(datagramPacket0, cqtn0.x);
                return;
            }
            cqtn0.d(datagramPacket0, cqtn0.w);
            return;
        }
        cqtn0.d(datagramPacket0, cqtn0.w);
    }

    @Override
    public final Object call() {
        return this.a();
    }
}

