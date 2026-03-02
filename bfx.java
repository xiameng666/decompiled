import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import android.view.Surface;
import j..util.Objects;
import java.util.ArrayList;
import java.util.concurrent.Executor;

public final class bfx {
    public static int a;
    public final bkk b;
    public final bjo c;
    public final bfq d;
    public final bfp e;
    private final bgs f;

    static {
    }

    public bfx(bkk bkk0, Size size0, CameraCharacteristics cameraCharacteristics0, boolean z, bgf bgf0) {
        boj.b();
        bff bff0;
        bge bge0;
        bcw bcw1;
        int v;
        this.b = bkk0;
        bhl bhl0 = null;
        bjn bjn0 = (bjn)blq.c(bkk0, bnc.r, null);
        if(bjn0 == null) {
            throw new IllegalStateException("Implementation is missing option unpacker for " + bqs.b(bkk0, bkk0.toString()));
        }
        bjm bjm0 = new bjm();
        bjn0.a(bkk0, bjm0);
        this.c = bjm0.b();
        bfq bfq0 = new bfq();
        this.d = bfq0;
        Executor executor0 = bov.a();
        bgs bgs0 = new bgs(((Executor)Objects.requireNonNull(((Executor)blq.c(bkk0, bkk.Q, executor0)))), cameraCharacteristics0);
        this.f = bgs0;
        ArrayList arrayList0 = new ArrayList();
        boolean z1 = false;
        if(((int)(((Integer)blq.c(bkk0, bkm.m, Integer.valueOf(0))))) == 0) {
            Integer integer0 = (Integer)blq.c(bkk0, bkk.d, null);
            if(integer0 == null) {
                Integer integer1 = (Integer)blq.c(bkk0, bkm.l, null);
                if(integer1 != null && ((int)integer1) == 0x1005) {
                    v = 0x1005;
                }
                else {
                    v = integer1 == null || ((int)integer1) != 0x20 ? 0x100 : 0x20;
                }
            }
            else {
                v = (int)integer0;
            }
            arrayList0.add(Integer.valueOf(v));
        }
        else {
            arrayList0.add(Integer.valueOf(0x20));
            arrayList0.add(Integer.valueOf(0x100));
        }
        bfp bfp0 = new bfp(size0, bkk0.a(), arrayList0, z, ((bco)blq.c(bkk0, bkk.f, null)), bgf0, new bsc(), new bsc());
        this.e = bfp0;
        kay.d(bfq0.f == null && bfq0.b == null, "CaptureNode does not support recreation yet.");
        bfq0.f = bfp0;
        Size size1 = bfp0.f;
        int v1 = bfp0.g;
        bhl bhl1 = new bfn(bfq0);
        boolean z2 = bfp0.h.size() > 1;
        if(!bfp0.i && bfp0.j == null) {
            if(z2) {
                bcw bcw0 = new bcw(size1.getWidth(), size1.getHeight(), 0x100, 4);
                bhl bhl2 = bho.a(new bhl[]{bhl1, bcw0.b});
                bcw1 = new bcw(size1.getWidth(), size1.getHeight(), 0x20, 4);
                bhl[] arr_bhl = {bhl1, bcw1.b};
                bhl1 = bhl2;
                bge0 = bcw0;
                bhl0 = bho.a(arr_bhl);
            }
            else {
                bge0 = new bcw(size1.getWidth(), size1.getHeight(), v1, 4);
                bhl1 = bho.a(new bhl[]{bhl1, bge0.b});
                bcw1 = null;
            }
            bff0 = new bfe(bfq0);
        }
        else {
            int v2 = size1.getWidth();
            int v3 = size1.getHeight();
            bfq0.g = new bge(bfq.b(bfp0.j, v2, v3, v1));
            bge0 = bfq0.g;
            bff0 = new bff(bfq0);
            bcw1 = null;
        }
        bfp0.a = bhl1;
        if(z2 && bhl0 != null) {
            bfp0.b = bhl0;
        }
        Surface surface0 = (Surface)Objects.requireNonNull(bge0.e());
        kay.d(bfp0.c == null, "The surface is already set.");
        bfp0.c = new bkr(surface0, bfp0.f, bfp0.g);
        bfq0.b = new bdm(bge0);
        bfq0.e(bge0);
        bgf bgf1 = bfp0.k;
        if(bgf1 != null) {
            int v4 = bgf1.a.getWidth();
            int v5 = bgf1.a.getHeight();
            bkq bkq0 = bfq.b(bfp0.j, v4, v5, bgf1.b);
            bkq0.j(new bfg(bfq0), bow.a());
            bfq0.d = new bdm(bkq0);
            bfp0.e = new bkr(bkq0.e(), bgf1.a, bgf1.b);
        }
        if(z2 && bcw1 != null) {
            Surface surface1 = bcw1.e();
            if(bfp0.d == null) {
                z1 = true;
            }
            kay.d(z1, "The secondary surface is already set.");
            bfp0.d = new bkr(surface1, bfp0.f, bfp0.g);
            bfq0.c = new bdm(bcw1);
            bfq0.e(bcw1);
        }
        bfp0.l.a = bff0;
        bfp0.m.a = new bfh(bfq0);
        bfq0.e = new bgq(new bsc(), new bsc(), bfp0.g, bfp0.h);
        bgq bgq0 = bfq0.e;
        bgs0.c = bgq0;
        bgq0.a.a = new bgi(bgs0);
        bgq0.b.a = new bgj(bgs0);
        bgs0.d = new bgg();
        bgs0.e = new bfw(bgs0.k);
        bgs0.h = new bfy();
        bgs0.f = new bfb();
        bgs0.g = new bga();
        bgs0.i = new bgc();
        if(bgq0.c != 35 && !bgs0.l) {
            return;
        }
        bgs0.j = new bgb();
    }

    public final void a() {
        boj.b();
        boj.b();
        bfp bfp0 = (bfp)Objects.requireNonNull(this.d.f);
        bdm bdm0 = (bdm)Objects.requireNonNull(this.d.b);
        bdm bdm1 = this.d.c;
        bdm bdm2 = this.d.d;
        bfp0.a().d();
        bfp0.a().c().hB(new bfj(bdm0), bow.a());
        bka bka0 = bfp0.e;
        if(bka0 != null) {
            bka0.d();
            bfp0.e.c().hB(new bfk(bdm2), bow.a());
        }
        if(bfp0.h.size() > 1) {
            bka bka1 = bfp0.d;
            if(bka1 != null) {
                bka1.d();
                bfp0.d.c().hB(new bfl(bdm1), bow.a());
            }
        }
    }

    final void b(bgx bgx0) {
        boj.b();
        this.e.m.accept(bgx0);
    }
}

