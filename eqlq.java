import android.content.Context;
import android.os.SystemClock;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

public final class eqlq {
    public final long a;
    public final List b;
    public final ProtoLiteBuilder c;
    private boolean d;
    private final SparseArray e;

    public eqlq() {
        this.b = new ArrayList();
        this.e = new SparseArray();
        this.a = System.currentTimeMillis();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghqv.a).v_newBuilder();
        this.c = hftp0;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghqv ghqv0 = (ghqv)hftp0.b_message;
        ghqv0.b |= 0x1000;
        ghqv0.n = 2;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghqv ghqv1 = (ghqv)hftp0.b_message;
        ghqv1.b |= 0x10000;
        ghqv1.q = 0;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghqv ghqv2 = (ghqv)hftp0.b_message;
        ghqv2.b |= 0x20000;
        ghqv2.r = 0;
    }

    public final ghqv a(Context context0, long v) {
        synchronized(this) {
            if(!this.d) {
                int v2 = this.e(9);
                int v3 = this.e(10) + this.e(11);
                int v4 = this.e(12);
                ProtoLiteBuilder hftp0 = this.c;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ghqv ghqv0 = (ghqv)hftp0.b_message;
                ghqv0.b |= 0x200;
                ghqv0.j = v3;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((ghqv)hftv0).b |= 0x40;
                ((ghqv)hftv0).g = v2 + v3;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp0.b_message;
                ((ghqv)hftv1).b |= 0x80;
                ((ghqv)hftv1).h = v2;
                if(!hftv1.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv2 = hftp0.b_message;
                ((ghqv)hftv2).b |= 0x100;
                ((ghqv)hftv2).i = v4;
                if(!hftv2.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((ghqv)hftp0.b_message).k = hfty.a;
                List list0 = this.b;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ghqv ghqv1 = (ghqv)hftp0.b_message;
                hfuf hfuf0 = ghqv1.k;
                if(!hfuf0.c()) {
                    ghqv1.k = ProtoLiteMessage.C(hfuf0);
                }
                hfrj.E(list0, ghqv1.k);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ghqv ghqv2 = (ghqv)hftp0.b_message;
                ghqv2.b |= 0x8000;
                ghqv2.p = v;
                if(this.e(15) > 0) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ghqv ghqv3 = (ghqv)hftp0.b_message;
                    ghqv3.b |= 0x400;
                    ghqv3.l = true;
                    if(this.e(13) > 0) {
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ghqv ghqv4 = (ghqv)hftp0.b_message;
                        ghqv4.b |= 0x800;
                        ghqv4.m = 1;
                    }
                }
                else {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ghqv ghqv5 = (ghqv)hftp0.b_message;
                    ghqv5.b |= 0x400;
                    ghqv5.l = false;
                }
                long v5 = System.currentTimeMillis() - this.a;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ghqv ghqv6 = (ghqv)hftp0.b_message;
                ghqv6.b |= 2;
                ghqv6.c = v5;
                ghqv ghqv7 = (ghqv)hftp0.N_build();
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ghon.a).v_newBuilder();
                ghom ghom0 = ghom.g;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv3 = hftp1.b_message;
                ((ghon)hftv3).e = ghom0.av;
                ((ghon)hftv3).b |= 1;
                if(!hftv3.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ghon ghon0 = (ghon)hftp1.b_message;
                ghqv7.getClass();
                ghon0.j = ghqv7;
                ghon0.b |= 0x40;
                ghon ghon1 = (ghon)hftp1.N_build();
                ayud ayud0 = new aytt(context0, "ANDROID_AUTH").a();
                if(hygo.d()) {
                    new bafs(context0, 1).a(ghon1);
                }
                else if(hygo.c()) {
                    new eqts(context0, ayud0).d(((MessageLite)ghon1));
                }
                else if(hygu.c()) {
                    ayvm ayvm0 = fhbe.b(context0, new zay());
                    ayuc ayuc0 = ayud0.i(((MessageLite)ghon1));
                    ayuc0.o = ayvm0;
                    ayuc0.d();
                }
                else {
                    ayud0.i(((MessageLite)ghon1)).d();
                }
                this.d = true;
                return ghqv7;
            }
        }
        return null;
    }

    public final void b(int v) {
        SparseArray sparseArray0 = this.e;
        ArrayList arrayList0 = (ArrayList)sparseArray0.get(v);
        if(arrayList0 != null) {
            arrayList0.add(Long.valueOf(SystemClock.elapsedRealtime()));
            return;
        }
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(Long.valueOf(SystemClock.elapsedRealtime()));
        sparseArray0.put(v, arrayList1);
    }

    public final void c(int v, int v1) {
        for(int v2 = 0; v2 < v1; ++v2) {
            this.b(v);
        }
    }

    public final void d() {
        ProtoLiteBuilder hftp0 = this.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghqv ghqv0 = (ghqv)hftp0.b_message;
        ghqv0.b |= 16;
        ghqv0.e = true;
    }

    private final int e(int v) {
        ArrayList arrayList0 = (ArrayList)this.e.get(v);
        return arrayList0 == null ? 0 : arrayList0.size();
    }
}

