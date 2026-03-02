import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.zip.GZIPInputStream;

public final class fvjl {
    private final fvdt a;
    private final int b;
    private final int c;
    private final int d;
    private final long e;
    private final boolean f;
    private final boolean g;

    public fvjl(fvdt fvdt0, int v, int v1, int v2, long v3, boolean z, boolean z1) {
        this.a = fvdt0;
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = v3;
        this.f = z;
        this.g = z1;
    }

    public final fvcl a(Iterable iterable0) {
        int v13;
        fvjn fvjn1;
        hirn hirn0;
        fvjl fvjl0 = this;
        ggzw ggzw0 = ggzw.c();
        ggqk ggqk0 = ((gged_interceptors)iterable0).E();
        while(ggqk0.hasNext()) {
            Object object0 = ggqk0.next();
            ggzw0.e(((ggzv)object0));
        }
        ggxr ggxr0 = ggxr.g(new ggxp(((double)fvjl0.b) / 6367000.0));
        double f = ggzw0.a.a;
        double f1 = ggzw0.a.b;
        double f2 = ggzw0.b.a;
        double f3 = ggzw0.b.b;
        ggzw0.g(new ggyh(new ggzv(f, f2).k(), ggxr0).g());
        ggzw0.g(new ggyh(new ggzv(f, f3).k(), ggxr0).g());
        ggzw0.g(new ggyh(new ggzv(f1, f2).k(), ggxr0).g());
        ggzw0.g(new ggyh(new ggzv(f1, f3).k(), ggxr0).g());
        ggzx ggzx0 = ggzw0.d();
        ggzv ggzv0 = ggzx0.j();
        double f4;
        for(f4 = ggzv0.c(); (f4 >= 180.0); f4 += -360.0) {
        }
        while((f4 < -180.0)) {
            f4 += 360.0;
        }
        fvcu fvcu0 = new fvcu(((int)((f4 + 180.0) / 6.0)) + 1, (Double.compare(ggzv0.b(), 0.0) < 0 ? fvct.b : fvct.a));
        int v = fvjl0.c;
        int v1 = fvjl0.d;
        ggxm ggxm0 = fvcu0.b(ggzx0);
        ArrayList arrayList0 = new ArrayList();
        double f5 = ((double)v) * fvcs.b(v1);
        for(int v2 = (int)(ggxm0.f().a / f5); (((double)v2) * f5 < ggxm0.e().a); ++v2) {
            for(int v3 = (int)(ggxm0.f().b / f5); (((double)v3) * f5 < ggxm0.e().b); ++v3) {
                arrayList0.add(new fvcs(fvcu0, v2, v3, v1, v));
            }
        }
        ggxm ggxm1 = fvcu0.b(ggzx0);
        double f6 = fvcs.b(v1);
        double f7 = Math.floor(ggxm1.f().a / f6) * f6;
        double f8 = Math.floor(ggxm1.f().b / f6) * f6;
        int v4 = (int)Math.ceil((ggxm1.e().a - ((double)(((int)f7)))) / f6);
        int v5 = (int)Math.ceil((ggxm1.e().b - ((double)(((int)f8)))) / f6);
        double f9 = (double)(((int)f7));
        fvck fvck0 = new fvck(fvcu0, f9, ((double)(((int)f8))), v4, v5, f6, fvjl0.g);
        HashMap hashMap0 = new HashMap();
        for(Object object1: arrayList0) {
            hashMap0.put(((fvcs)object1).toString(), ((fvcs)object1));
        }
        gged_interceptors gged0 = gged_interceptors.h(gggq.j(arrayList0, new fvjk()));
        fvdv fvdv0 = fvjl0.a.a(gged0, fvjl0.e);
        ggdy ggdy0 = new ggdy();
        Iterator iterator1 = fvdv0.a.iterator();
        while(iterator1.hasNext()) {
            Object object2 = iterator1.next();
            gxti gxti0 = ((gxtk)object2).c;
            if(gxti0 == null) {
                gxti0 = gxti.a;
            }
            fvcs fvcs0 = (fvcs)hashMap0.get((gxti0.c == 5 ? ((gxsm)gxti0.d) : gxsm.a).b);
            gxth gxth0 = ((gxtk)object2).d;
            if(gxth0 == null) {
                gxth0 = gxth.a;
            }
            gxsl gxsl0 = gxth0.b == 4 ? ((gxsl)gxth0.c) : gxsl.a;
            try(GZIPInputStream gZIPInputStream0 = new GZIPInputStream(gxsl0.b.newInput())) {
                hirn0 = (hirn)((Parser)((ProtoLiteMessage)hirn.b).jf(7, null)).k(gZIPInputStream0);
            }
            catch(IOException iOException0) {
                throw new fvjd(iOException0);
            }
            int v6 = fvcs0.c;
            if(new hfuh(hirn0.f, hirn.a).contains(hirl.a)) {
                throw new fvjd(4);
            }
            int v7 = v6 * v6;
            if(hirn0.d.size() != v7 || hirn0.f.size() != v7) {
                throw new fvjd(5);
            }
            ggdy0.i(new fvjo(fvcs0, hirn0));
            iterator1 = iterator1;
            hashMap0 = hashMap0;
            continue;
        }
        gged_interceptors gged1 = ggdy0.h();
        ggxm ggxm2 = ggxm.c(new ggxn(f9, ((double)(((int)f8)))), new ggxn(((double)v4) * f6 + f9, ((double)v5) * f6 + ((double)(((int)f8)))));
        int v8 = ((ggna)gged1).c;
        for(int v9 = 0; v9 < v8; ++v9) {
            fvjn fvjn0 = new fvjn(((fvjo)gged1.get(v9)), ggxm2);
            while(fvjn0.hasNext()) {
                fvjm fvjm0 = fvjn0.a();
                double f10 = (fvjm0.a.a - f9) / f6;
                double f11 = (fvjm0.a.b - ((double)(((int)f8)))) / f6;
                int v10 = (int)f10;
                if(v10 >= 0 && ((int)f11) >= 0 && v10 < v4 && ((int)f11) < v5) {
                    try {
                        gftb.x(v10, fvck0.e);
                        gftb.x(((int)f11), fvck0.f);
                        int v11 = ((int)f11) * fvck0.e + v10;
                        hirl hirl0 = fvjm0.d;
                        float f12 = fvjm0.c;
                        float f13 = fvjm0.b;
                        gftb.r(fvck0.i != null, "Call build() once");
                        fvck0.i.set(v11, hirl0 != hirl.a);
                        if(fvcl.l(hirl0)) {
                            fvck0.h.set(v11, true);
                            if(fvck0.b && fvck0.k.c(v11) != null) {
                                fvck0.k.d(v11, Byte.valueOf(((byte)0)));
                            }
                            fvjn1 = fvjn0;
                        }
                        else {
                            if(!fvck0.b) {
                                fvjn1 = fvjn0;
                            }
                            else if(hirl0 == hirl.d) {
                                float f14 = glws.a(f13, 0.0f, 127.0f);
                                fvjn1 = fvjn0;
                                fvck0.k.d(v11, Byte.valueOf(((byte)(((int)Math.ceil(f14))))));
                            }
                            else {
                                fvjn1 = fvjn0;
                                if(fvck0.k.c(v11) != null) {
                                    fvck0.k.d(v11, Byte.valueOf(((byte)0)));
                                }
                            }
                            fvck0.h.set(v11, false);
                            f13 = 0.0f;
                        }
                        short[] arr_v = fvck0.j;
                        long v12 = (long)Math.round((f12 + f13 - 4715.0f) * 5.0f);
                        if(v12 > 0x7FFFL) {
                            v13 = 0x7FFF;
                        }
                        else {
                            v13 = v12 >= 0xFFFFFFFFFFFF8000L ? ((int)v12) : 0xFFFF8000;
                        }
                        arr_v[v11] = (short)v13;
                        if(fvjl0.f) {
                            int v14 = fvjm0.f;
                            if(v14 != 2) {
                                float f15 = fvjm0.e;
                                if(fvck0.m == null) {
                                    fvck0.m = new fvcc(fvck0.h.size());
                                }
                                fvcc fvcc0 = fvck0.m;
                                fvcc0.c.set(v11, v14 == 4);
                                fvcc0.b.set(v11, v14 == 3);
                                fvcc0.d[v11] = v14 == 3 ? glxj.a(((int)f15) % 180) : fvcc.a;
                            }
                        }
                        fvjl0 = this;
                        fvjn0 = fvjn1;
                    }
                    catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
                        throw new IOException(indexOutOfBoundsException0);
                    }
                }
                else {
                    fvjl0 = this;
                }
                v9 = v9;
                gged1 = gged1;
                ggxm2 = ggxm2;
                v8 = v8;
                f9 = f9;
            }
            fvjl0 = this;
        }
        gftb.r(fvck0.i != null, "Call build() once");
        fvcl fvcl0 = new fvcl(fvck0);
        fvck0.h = null;
        fvck0.i = null;
        fvck0.j = null;
        fvck0.k = null;
        fvck0.l = null;
        fvck0.m = null;
        return fvcl0;
    }
}

