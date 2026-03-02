import java.util.Arrays;
import java.util.List;

public final class srb {
    public final byte[] a;
    public final swg b;
    public final sqx c;
    public sxd d;
    public final sre e;
    public final sua f;
    public final swn g;
    public boolean h;
    public boolean i;

    public srb(byte[] arr_b, swg swg0, srp srp0) {
        this.c = new sqx();
        this.d = sxd.a;
        this.h = false;
        this.a = (byte[])arr_b.clone();
        this.b = swg0;
        this.f = new sua();
        this.g = new swn(this);
        this.e = new sre(srp0);
    }

    public final svt a() {
        List list0 = this.b.b();
        return list0.isEmpty() ? swa.a : ((svt)list0.get(0));
    }

    public final svt b() {
        sxd sxd0 = this.d;
        if(sxd0.d()) {
            return (svt)sxd0.b();
        }
        throw sxf.g("BUG: Trying to access selected ADF before AID is selected");
    }

    public final void c(swh swh0) {
        swg swg0 = this.b;
        int v = swg0.d(swh0);
        if(v != 1 && v != 2) {
            throw sxf.g("Could not update file system: ADF_NOT_FOUND");
        }
        ssr ssr0 = this.b().e();
        if(swh.d(swh0.a, ssr0) || swh.d(swh0.b, ssr0)) {
            sxd sxd0 = swg0.a(ssr0.a());
            if(sxd0.d()) {
                this.d = sxd0;
            }
            else {
                this.i = true;
                this.d = new sxd(this.a());
            }
        }
        if(v == 1) {
            this.h = true;
        }
    }

    public final void d(svt svt0, boolean z, boolean z1) {
        if(!z1 && svt0.e().f == ssp.c) {
            throw new IllegalStateException("BUG: Can\'t select disabled ADF");
        }
        this.i = z;
        this.d = new sxd(svt0);
    }

    public final void e() {
        this.d = new sxd(this.e);
    }

    public final boolean f(svt svt0) {
        List list0 = this.b.b();
        return list0.isEmpty() ? svt0 == swa.a : Arrays.equals(svt0.e().a(), ((svt)list0.get(0)).e().a());
    }
}

