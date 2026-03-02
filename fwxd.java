import android.os.SystemClock;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;

final class fwxd implements Runnable {
    final fwxh a;
    final gxdm b;

    public fwxd(fwxh fwxh0, gxdm gxdm0) {
        this.b = gxdm0;
        Objects.requireNonNull(fwxh0);
        this.a = fwxh0;
        super();
    }

    @Override
    public final void run() {
        int v18;
        int[] arr_v;
        int v4;
        gxdm gxdm0 = this.b;
        int v = gxaw.a(gxdm0.a);
        fwxg fwxg0 = this.a.d;
        if(v != 0) {
            switch(v - 1) {
                case 0x71: {
                    gwwy gwwy0 = (gwwy)gxdm0.a(((Parser)((ProtoLiteMessage)gwwy.b).jf(7, null)));
                    if(gwwy0 != null) {
                        fwxb fwxb0 = ((fwxk)fwxg0).l;
                        long v1 = SystemClock.elapsedRealtime();
                        long v2 = gwwy0.e;
                        if(Math.abs(v1 - v2 - (fwxb0.b - fwxb0.a)) > huou.a.c().c()) {
                            fwxb0.b = v1;
                            fwxb0.a = v2;
                        }
                        fwxb0.c = v1;
                        ((fwxk)fwxg0).a.h(109, ((int)gwwy0.e));
                        Arrays.toString(new hfuh(gwwy0.d, gwwy.a).toArray());
                        ((fwxk)fwxg0).f = gwxu.b(gwwy0.f) == null ? gwxu.a : gwxu.b(gwwy0.f);
                        for(Object object0: ((fwxk)fwxg0).b) {
                            int v3 = ((fwxk)fwxg0).f.ordinal();
                            if(v3 == 1) {
                                v4 = fuxl.L.am;
                            }
                            else {
                                switch(v3) {
                                    case 2: {
                                        v4 = fuxl.M.am;
                                        break;
                                    }
                                    case 3: {
                                        v4 = fuxl.N.am;
                                        break;
                                    }
                                    case 4: {
                                        v4 = fuxl.O.am;
                                        break;
                                    }
                                    case 5: {
                                        v4 = fuxl.P.am;
                                        break;
                                    }
                                    default: {
                                        v4 = fuxl.K.am;
                                    }
                                }
                            }
                            ((fwyn)object0).k(v4);
                        }
                        return;
                    }
                    ((fwxk)fwxg0).k();
                    return;
                }
                case 0x72: {
                    gwxb gwxb0 = (gwxb)gxdm0.a(((Parser)((ProtoLiteMessage)gwxb.a).jf(7, null)));
                    if(gwxb0 != null) {
                        for(int v5 = 0; v5 < gwxb0.e.size(); ++v5) {
                            if((((gwxd)gwxb0.e.get(v5)).b & 2) == 0) {
                                arr_v = null;
                            }
                            else {
                                byte[] arr_b = ((gwxd)gwxb0.e.get(v5)).d.toByteArray();
                                arr_v = new int[arr_b.length];
                                for(int v6 = 0; v6 < arr_b.length; ++v6) {
                                    arr_v[v6] = arr_b[v6] & 0xFF;
                                }
                            }
                            if((((gwxd)gwxb0.e.get(v5)).b & 1) != 0) {
                                gwxd gwxd0 = (gwxd)gwxb0.e.get(v5);
                            }
                            if(arr_v != null) {
                                Arrays.toString(arr_v);
                            }
                        }
                        for(int v7 = 0; v7 < gwxb0.d.size(); ++v7) {
                            gwxg gwxg0 = (gwxg)gwxb0.d.get(v7);
                            boolean z = gwxi.b(((gwxg)gwxb0.d.get(v7)).c) != null;
                            boolean z1 = gwxw.b(((gwxg)gwxb0.d.get(v7)).d) != null;
                        }
                        fvwz fvwz0 = ((fwxk)fwxg0).a;
                        int v8 = (gwxb0.b & 2) == 0 ? gwxa.a.ordinal() : (gwxa.b(gwxb0.f) == null ? gwxa.a : gwxa.b(gwxb0.f)).ordinal();
                        int v9 = gwxb0.e.size();
                        int v10 = gwxb0.d.size();
                        fvwz0.a(new fwsk(fvwz0.f(), v8, v9, v10, v8, v9, v10));
                        if(((fwxk)fwxg0).c) {
                            List list0 = ((fwxk)fwxg0).b;
                            if(!list0.isEmpty()) {
                                fwxl fwxl0 = ((fwxk)fwxg0).m;
                                if(fwxl0 != null) {
                                    hfuo hfuo0 = gwxb0.e;
                                    long v11 = gwxb0.c;
                                    ArrayList arrayList0 = new ArrayList(hfuo0.size());
                                    for(Object object1: hfuo0) {
                                        ByteString hfsf0 = ((gwxd)object1).d;
                                        int v12 = fwxl0.a.length;
                                        float[] arr_f = new float[v12];
                                        for(int v13 = 0; v13 < v12; ++v13) {
                                            arr_f[v13] = ((float)(hfsf0.a(fwxl0.a[v13]) & 0xFF)) / 250.0f;
                                        }
                                        v11 += (long)((gwxd)object1).c;
                                        arrayList0.add(new fwyp(fwxl0.b.a(v11), arr_f));
                                    }
                                    fwxl fwxl1 = ((fwxk)fwxg0).m;
                                    hfuo hfuo1 = gwxb0.d;
                                    long v14 = gwxb0.c;
                                    ArrayList arrayList1 = new ArrayList(hfuo1.size());
                                    for(Object object2: hfuo1) {
                                        long v15 = fwxl1.b.a(((long)((gwxg)object2).b) + v14);
                                        gwxi gwxi0 = gwxi.b(((gwxg)object2).c);
                                        if(gwxi0 == null) {
                                            gwxi0 = gwxi.a;
                                        }
                                        int v16 = (int)fwxc.b(gwxi0);
                                        gwxw gwxw0 = gwxw.b(((gwxg)object2).d);
                                        if(gwxw0 == null) {
                                            gwxw0 = gwxw.a;
                                        }
                                        Integer integer0 = null;
                                        ggqj ggqj0 = fwxc.a.v().om();
                                        while(ggqj0.hasNext()) {
                                            Object object3 = ggqj0.next();
                                            Map.Entry map$Entry0 = (Map.Entry)object3;
                                            if(map$Entry0.getValue() == gwxw0) {
                                                integer0 = (Integer)map$Entry0.getKey();
                                                break;
                                            }
                                        }
                                        arrayList1.add(new fwyq(v15, v16, ((int)integer0)));
                                        list0 = list0;
                                    }
                                    for(Object object4: list0) {
                                        fwyn fwyn0 = (fwyn)object4;
                                        if(!arrayList0.isEmpty()) {
                                            fwyn0.m(arrayList0, ((fwxk)fwxg0).k.e());
                                        }
                                        if(!arrayList1.isEmpty()) {
                                            fwyn0.n(arrayList1);
                                        }
                                        if(humy.f() && humy.a.b().z() && (gwxb0.b & 4) != 0) {
                                            Object object5 = null;
                                            for(Object object6: (gwxb0.g == null ? gwxc.a : gwxb0.g).b) {
                                                gwxr gwxr0 = (gwxr)object6;
                                                if(gwxq.a(gwxr0.b) == 5) {
                                                    object5 = new fwys(gwxr0.c);
                                                    break;
                                                }
                                            }
                                            fwyn0.o(((fwys)object5));
                                        }
                                        if(humy.f() && (gwxb0.b & 8) != 0) {
                                            gwxn gwxn0 = gwxb0.h == null ? gwxn.a : gwxb0.h;
                                            int v17 = gwxk.a(gwxn0.c);
                                            if(v17 == 0) {
                                                v18 = 1;
                                            }
                                            else {
                                                v18 = v17 == 2 ? 0 : 1;
                                            }
                                            fwyr fwyr0 = new fwyr(v18, (gwxm.a(gwxn0.b) == 2 ? 1 : 0), gwxn0.d, ((fwxk)fwxg0).l.a(gwxn0.e));
                                            fvwz0.a(new fwsl(fvwz0.f(), fwyr0.a, fwyr0.b, fwyr0.a, fwyr0.b));
                                            fwyn0.p(fwyr0);
                                        }
                                        if(((fwxk)fwxg0).g) {
                                            fwyn0.l();
                                        }
                                    }
                                    ((fwxk)fwxg0).g = false;
                                    if(humy.g() && (gwxb0.b & 4) != 0) {
                                        fuyt fuyt0 = fuyt.a(((fwxk)fwxg0).i);
                                        gwis gwis0 = (gwis)((fwxk)fwxg0).h.kt((gwxb0.g == null ? gwxc.a : gwxb0.g));
                                        if(humr.l()) {
                                            fuyt0.c.cp().b(new fuyp(fuyt0, gwis0));
                                            return;
                                        }
                                        fuyt0.b(gwis0);
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                        ((fwxk)fwxg0).g = false;
                        return;
                    }
                    ((fwxk)fwxg0).k();
                    return;
                }
                default: {
                    return;
                }
            }
        }
        throw null;
    }
}

