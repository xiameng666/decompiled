import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.SystemClock;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public final class arem extends aqqn {
    public final List g;
    public final List h;
    public final List i;
    public final Queue j;
    public int k;
    public final ProtoLiteBuilder l;
    private final WifiManager m;
    private final List n;
    private final List o;
    private ProtoLiteBuilder p;

    public arem(Context context0) {
        super(context0);
        this.l = ((ProtoLiteMessage)hkyg.a).v_newBuilder();
        this.g = new ArrayList();
        this.n = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayDeque();
        this.o = new ArrayList();
        this.k = 3;
        this.m = (WifiManager)context0.getApplicationContext().getSystemService("wifi");
    }

    @Override  // aqqn
    public final void b(hkyx hkyx0) {
        this.n.add(hkyx0);
    }

    @Override  // aqqn
    protected final void e() {
        ProtoLiteBuilder hftp0 = this.l;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hfvv hfvv0 = hfvv.a;
        ((hkyg)hftp0.b_message).f = hfvv0;
        List list0 = this.g;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkyg hkyg0 = (hkyg)hftp0.b_message;
        hfuo hfuo0 = hkyg0.f;
        if(!hfuo0.c()) {
            hkyg0.f = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(list0, hkyg0.f);
        list0.clear();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hkyg)hftv0).d = hfvv0;
        List list1 = this.n;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkyg hkyg1 = (hkyg)hftp0.b_message;
        hfuo hfuo1 = hkyg1.d;
        if(!hfuo1.c()) {
            hkyg1.d = ProtoLiteMessage.E(hfuo1);
        }
        hfrj.E(list1, hkyg1.d);
        list1.clear();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((hkyg)hftv1).g = hfvv0;
        List list2 = this.h;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkyg hkyg2 = (hkyg)hftp0.b_message;
        hfuo hfuo2 = hkyg2.g;
        if(!hfuo2.c()) {
            hkyg2.g = ProtoLiteMessage.E(hfuo2);
        }
        hfrj.E(list2, hkyg2.g);
        list2.clear();
        if(hqhq.q()) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp0.b_message;
            ((hkyg)hftv2).i = hfvv0;
            List list3 = this.i;
            if(!hftv2.isImmutable()) {
                hftp0.ensureMutable();
            }
            hkyg hkyg3 = (hkyg)hftp0.b_message;
            hfuo hfuo3 = hkyg3.i;
            if(!hfuo3.c()) {
                hkyg3.i = ProtoLiteMessage.E(hfuo3);
            }
            hfrj.E(list3, hkyg3.i);
            list3.clear();
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        ((hkyg)hftv3).l = hfvv0;
        Queue queue0 = this.j;
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkyg hkyg4 = (hkyg)hftp0.b_message;
        hfuo hfuo4 = hkyg4.l;
        if(!hfuo4.c()) {
            hkyg4.l = ProtoLiteMessage.E(hfuo4);
        }
        hfrj.E(queue0, hkyg4.l);
        queue0.clear();
        synchronized(this) {
            ProtoLiteBuilder hftp1 = this.p;
            if(hftp1 != null) {
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((hkzi)hftp1.b_message).e = hfvv0;
                for(Object object0: this.o) {
                    ProtoLiteBuilder hftp2 = this.p;
                    hkzg hkzg0 = (hkzg)((ProtoLiteBuilder)object0).N_build();
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    hkzi hkzi0 = (hkzi)hftp2.b_message;
                    hkzg0.getClass();
                    hfuo hfuo5 = hkzi0.e;
                    if(!hfuo5.c()) {
                        hkzi0.e = ProtoLiteMessage.E(hfuo5);
                    }
                    hkzi0.e.add(hkzg0);
                }
                ProtoLiteBuilder hftp3 = this.l;
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ((hkyg)hftp3.b_message).p = null;
                ((hkyg)hftp3.b_message).b &= 0xFFFFFEFF;
                hkzi hkzi1 = (hkzi)this.p.N_build();
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                hkyg hkyg5 = (hkyg)hftp3.b_message;
                hkzi1.getClass();
                hkyg5.p = hkzi1;
                hkyg5.b |= 0x100;
            }
        }
        ProtoLiteBuilder hftp4 = this.e;
        ProtoLiteBuilder hftp5 = this.l;
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        hkyf hkyf0 = (hkyf)hftp4.b_message;
        hkyg hkyg6 = (hkyg)hftp5.N_build();
        hkyg6.getClass();
        hkyf0.e = hkyg6;
        hkyf0.b |= 8;
    }

    @Override  // aqqn
    protected final int g() {
        return this.k;
    }

    public final void i(String s, int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hkyz.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hkyz)hftv0).b |= 1;
        ((hkyz)hftv0).c = "com.android.providers.telephony";
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((hkyz)hftv1).b |= 2;
        ((hkyz)hftv1).d = v;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hkyz)hftp0.b_message).e = 1;
        ((hkyz)hftp0.b_message).b |= 4;
        hkyz hkyz0 = (hkyz)hftp0.N_build();
        this.g.add(hkyz0);
    }

    public final void j(boolean z) {
        ProtoLiteBuilder hftp0 = this.l;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkyg hkyg0 = (hkyg)hftp0.b_message;
        hkyg0.b |= 0x2000;
        hkyg0.u = z;
    }

    public final void k(int v) {
        ProtoLiteBuilder hftp0 = this.l;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkyg hkyg0 = (hkyg)hftp0.b_message;
        hkyg0.b |= 0x800;
        hkyg0.s = v;
    }

    public final void l(int v) {
        ProtoLiteBuilder hftp0 = this.l;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkyg hkyg0 = (hkyg)hftp0.b_message;
        hkyg0.b |= 0x1000;
        hkyg0.t = v;
    }

    public final void m(int v) {
        ProtoLiteBuilder hftp0 = this.l;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkyg hkyg0 = (hkyg)hftp0.b_message;
        hkyg0.b |= 0x400;
        hkyg0.r = v;
    }

    public final void n(int v) {
        ProtoLiteBuilder hftp0 = this.l;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkyg hkyg0 = (hkyg)hftp0.b_message;
        hkyg0.b |= 0x200;
        hkyg0.q = v;
    }

    public final void o(int v, boolean z, arnc arnc0) {
        synchronized(this) {
            if(this.p == null) {
                this.s(v, z, arnc0);
            }
            List list0 = this.o;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hkzg.a).v_newBuilder();
            long v2 = SystemClock.elapsedRealtime();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hkzg hkzg0 = (hkzg)hftp0.b_message;
            hkzg0.b |= 1;
            hkzg0.c = v2;
            list0.add(hftp0);
        }
    }

    public final void p(long v, int v1, int v2) {
        synchronized(this) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hkzj.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((hkzj)hftv0).b |= 1;
            ((hkzj)hftv0).c = v;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((hkzj)hftv1).b |= 2;
            ((hkzj)hftv1).d = v1;
            if(v1 == 3) {
                if(!hftv1.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hkzj hkzj0 = (hkzj)hftp0.b_message;
                hkzj0.b |= 4;
                hkzj0.e = v2;
            }
            hkzj hkzj1 = (hkzj)hftp0.N_build();
            List list0 = this.o;
            int v4 = list0.size();
            if(v4 == 0) {
                arem.a.f("Could not log a WirelessD2DTransferMediumContext as no parent ConnectionAttempt exists.", new Object[0]);
                return;
            }
            ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)list0.get(v4 - 1);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            hkzg hkzg0 = (hkzg)hftp1.b_message;
            hkzj1.getClass();
            hfuo hfuo0 = hkzg0.d;
            if(!hfuo0.c()) {
                hkzg0.d = ProtoLiteMessage.E(hfuo0);
            }
            hkzg0.d.add(hkzj1);
        }
    }

    public final void q(hkzb hkzb0) {
        ProtoLiteBuilder hftp0 = this.l;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkyg hkyg0 = (hkyg)hftp0.b_message;
        hkzb0.getClass();
        hkyg0.n = hkzb0;
        hkyg0.b |= 0x40;
    }

    private final hkys r() {
        hkys hkys0;
        synchronized(this) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hkys.a).v_newBuilder();
            WifiManager wifiManager0 = this.m;
            int v1 = arei.e(wifiManager0);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hkys)hftp0.b_message).d = v1 - 1;
            ((hkys)hftp0.b_message).b |= 2;
            int v2 = arei.d(wifiManager0);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hkys)hftp0.b_message).g = v2 - 1;
            ((hkys)hftp0.b_message).b |= 16;
            Context context0 = this.b;
            int v3 = arei.b(context0);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hkys)hftp0.b_message).c = v3 - 1;
            ((hkys)hftp0.b_message).b |= 1;
            int v4 = arei.c(context0);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hkys)hftp0.b_message).e = v4 - 1;
            ((hkys)hftp0.b_message).b |= 4;
            int v5 = arei.a(context0);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hkys)hftp0.b_message).f = v5 - 1;
            ((hkys)hftp0.b_message).b |= 8;
            hkys0 = (hkys)hftp0.N_build();
        }
        return hkys0;
    }

    private final void s(int v, boolean z, arnc arnc0) {
        synchronized(this) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hkzi.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hkzi hkzi0 = (hkzi)hftp0.b_message;
            int v2 = 4;
            hkzi0.b |= 4;
            hkzi0.f = v;
            String s = hvol.s();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((hkzi)hftv0).b |= 2;
            ((hkzi)hftv0).d = s;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((hkzi)hftv1).b |= 16;
            ((hkzi)hftv1).g = z;
            int v3 = arnc0.i;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            hkzi hkzi1 = (hkzi)hftp0.b_message;
            hkzi1.b |= 0x20;
            hkzi1.h = v3;
            switch(arnc0.ordinal()) {
                case 0: {
                    v2 = 1;
                    break;
                }
                case 1: {
                    v2 = 2;
                    break;
                }
                case 2: {
                    v2 = 3;
                    break;
                }
                case 3: {
                    break;
                }
                case 4: {
                    v2 = 5;
                    break;
                }
                case 5: {
                    v2 = 6;
                    break;
                }
                case 6: {
                    v2 = 7;
                    break;
                }
                default: {
                    throw new RuntimeException(null, null);
                }
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hkzi)hftp0.b_message).c = v2 - 1;
            ((hkzi)hftp0.b_message).b |= 1;
            hkys hkys0 = this.r();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hkzi hkzi2 = (hkzi)hftp0.b_message;
            hkys0.getClass();
            hkzi2.i = hkys0;
            hkzi2.b |= 0x40;
            this.p = hftp0;
        }
    }
}

