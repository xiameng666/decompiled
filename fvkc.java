import java.io.File;
import java.util.Iterator;

public final class fvkc implements fxzt {
    public final fvka a;
    public final fwyd b;
    private final fvkd c;
    private final File d;
    private final fwyi e;

    public fvkc(fwyd fwyd0, fwyk fwyk0, fwyi fwyi0) {
        File file2;
        String s;
        File file0;
        if(fwyk0.j() == null) {
            file0 = null;
        }
        else {
            if(huqs.c()) {
                if(fwyk0.j() == null) {
                    s = ccsb.a.a("nlp_devices");
                }
                else {
                    ccsg ccsg0 = ccsb.a;
                    File file1 = fwyk0.j();
                    gftb.check(file1);
                    s = ccsg0.b(file1, "nlp_devices");
                }
                file2 = new File(s);
            }
            else {
                file2 = new File(fwyk0.j(), "nlp_devices");
            }
            file0 = file2;
        }
        super();
        this.b = fwyd0;
        this.d = file0;
        this.e = fwyi0;
        fvkd fvkd0 = new fvkd();
        this.c = fvkd0;
        this.a = new fvka(fvkd0);
    }

    public final fvkb a(long v, long v1) {
        fvka fvka0 = this.a;
        fvkb fvkb0 = fvka0.b(v);
        if(fvkb0 == null) {
            fvkb0 = new fvkb(v);
            fvka0.c(fvkb0);
            ++this.c.c;
        }
        fvkb0.b = fvkb.a(v1);
        return fvkb0;
    }

    public final fvur b() {
        byte[] arr_b = this.e.b();
        fvjz fvjz0 = new fvjz(this);
        return new fvur(3, arr_b, this.d, fvjz0);
    }

    public final Iterator c() {
        return this.a.a.f().a();
    }

    public final void d() {
        long v = this.b.b() - 604800000L;
        Iterator iterator0 = this.c();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            int v1 = ((fvkb)object0).b;
            if(v1 == 0x7FFF) {
                iterator0.remove();
            }
            else {
                if(((long)v1) * 86400000L >= v) {
                    continue;
                }
                iterator0.remove();
                ++this.c.b;
            }
        }
    }

    @Override  // fxzt
    public final void e() {
        this.c.a = 0;
        this.c.b = 0;
        this.c.c = 0;
    }

    @Override  // fxzt
    public final void f(ProtoLiteBuilder hftp0, long v) {
        int v1 = this.a.a();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gxmy.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gxmy)hftv0).b |= 1;
        ((gxmy)hftv0).c = 1000;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        fvkd fvkd0 = this.c;
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((gxmy)hftv1).b |= 2;
        ((gxmy)hftv1).d = v1;
        int v2 = fvkd0.a;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        ((gxmy)hftv2).b |= 4;
        ((gxmy)hftv2).e = v2;
        int v3 = fvkd0.b;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp1.b_message;
        ((gxmy)hftv3).b |= 8;
        ((gxmy)hftv3).f = v3;
        int v4 = fvkd0.c;
        if(!hftv3.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp1.b_message;
        ((gxmy)hftv4).b |= 16;
        ((gxmy)hftv4).g = v4;
        if(!hftv4.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv5 = hftp1.b_message;
        ((gxmy)hftv5).b |= 0x20;
        ((gxmy)hftv5).h = 0;
        if(!hftv5.isImmutable()) {
            hftp1.ensureMutable();
        }
        gxmy gxmy0 = (gxmy)hftp1.b_message;
        gxmy0.b |= 0x40;
        gxmy0.i = 0;
        gxmy gxmy1 = (gxmy)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gxng gxng0 = (gxng)hftp0.b_message;
        gxmy1.getClass();
        gxng0.d = gxmy1;
        gxng0.b |= 0x100;
    }
}

