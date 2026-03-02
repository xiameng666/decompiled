import j..util.DesugarCollections;
import j..util.Objects;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public final class ghde implements Serializable {
    public static final double a = 0.0;
    public final ghci b;
    public final List c;
    public List d;
    public int e;
    public final List f;
    public volatile boolean g;
    private static final long serialVersionUID = 1L;

    static {
        double f = ggze.a + 4.996004E-16;
        ghde.a = f + f;
    }

    public ghde() {
        ghci ghci0 = new ghci();
        super();
        this.d = ggna.a;
        this.e = 0;
        this.f = new ArrayList();
        this.g = true;
        this.b = ghci0;
        this.c = new ArrayList();
    }

    public final ggzu a() {
        ggym ggym2;
        ggym ggym1;
        ghch ghch1;
        List list4;
        int v12;
        int v11;
        ghbw ghbw1;
        int v10;
        int v9;
        List list0;
        ghde ghde0 = this;
        if(!ghde0.g) {
            synchronized(this) {
                if(!ghde0.g) {
                    gftb.r(ghde0.d.isEmpty(), "Incremental updates not supported yet");
                    int v1 = ghde0.e;
                    int v2 = 0;
                    while(true) {
                        list0 = ghde0.c;
                        if(v1 >= list0.size()) {
                            break;
                        }
                        v2 += ((ghbx)list0.get(v1)).e();
                        ++v1;
                    }
                    ghci ghci0 = ghde0.b;
                    ghde0.d = ghde.b(v2 * 3 / 10 / 4);
                    List list1 = ghde.b(6);
                    for(int v3 = 0; v3 < 6; ++v3) {
                        list1.add(ghde.b(v2));
                    }
                    ghcg ghcg0 = new ghcg();
                    int v4 = list0.size() - ghde0.e;
                    ghch ghch0 = ghcg0.b;
                    int[] arr_v = ghch0.d;
                    if(v4 > arr_v.length) {
                        ghch0.d = Arrays.copyOf(arr_v, v4);
                    }
                    ghch0.a = false;
                    ghch0.e = 0;
                    if(v4 > ghcg0.c.length) {
                        ghcg0.c = new ghdb[v4];
                    }
                    int v5 = ghde0.e;
                    while(v5 < list0.size()) {
                        ghbx ghbx0 = (ghbx)list0.get(v5);
                        ghbx0.B();
                        ghch0.a = true;
                        if(ghbx0.u()) {
                            ghch0.c(v5);
                        }
                        int v6 = ghbx0.e();
                        ghbw ghbw0 = new ghbw();
                        ggxn ggxn0 = new ggxn();
                        ggxn ggxn1 = new ggxn();
                        int v7 = 0;
                        while(v7 < v6) {
                            ghbx0.p(v7, ghbw0);
                            ghch0.b(v5, ghbw0.a, ghbw0.b);
                            int v8 = ghbj.f(ghbw0.a);
                            if(v8 == ghbj.f(ghbw0.b)) {
                                ghbj.p(v8, ghbw0.a, ggxn0);
                                ghbj.p(v8, ghbw0.b, ggxn1);
                                double f = 1.0 - ghde.a;
                                if((Math.abs(ggxn0.a) <= f) && (Math.abs(ggxn0.b) <= f) && (Math.abs(ggxn1.a) <= f) && (Math.abs(ggxn1.b) <= f)) {
                                    v9 = v6;
                                    v10 = v7;
                                    ghbw1 = ghbw0;
                                    ((List)list1.get(v8)).add(new ghcf(v5, v10, ghbw0.a, ghbw0.b, ggxn0, ggxn1));
                                    goto label_77;
                                }
                                else {
                                    v9 = v6;
                                    ghbw1 = ghbw0;
                                    v10 = v7;
                                    v11 = 0;
                                    goto label_66;
                                }
                                goto label_62;
                            }
                            else {
                            label_62:
                                v9 = v6;
                                ghbw1 = ghbw0;
                                v10 = v7;
                                v11 = 0;
                            }
                        label_66:
                            while(v11 < 6) {
                                boolean z = ggze.c(ghbw1.a, ghbw1.b, v11, ghde.a, ggxn0, ggxn1);
                                ggxn0 = ggxn0;
                                ggxn1 = ggxn1;
                                if(z) {
                                    v12 = v11;
                                    ((List)list1.get(v11)).add(new ghcf(v5, v10, ghbw1.a, ghbw1.b, ggxn0, ggxn1));
                                }
                                else {
                                    v12 = v11;
                                }
                                v11 = v12 + 1;
                            }
                        label_77:
                            v7 = v10 + 1;
                            v6 = v9;
                            ghbw0 = ghbw1;
                        }
                        ++v5;
                    }
                    int v13 = 0;
                    for(int v14 = 0; v14 < 6; ++v14) {
                        v13 = Math.max(v13, ((List)list1.get(v14)).size());
                    }
                    ghcg0.a = ghci0;
                    ghcg0.e = list0;
                    List list2 = this.d;
                    Objects.requireNonNull(list2);
                    ghcg0.f = new ghby(list2);
                    ghcg0.d = new ghce(v13);
                    int v15 = 0;
                    while(v15 < 6) {
                        List list3 = (List)list1.get(v15);
                        int v16 = list3.size();
                        if(v16 == 0) {
                            if(ghch0.e == 0) {
                                list4 = list0;
                                ghch1 = ghch0;
                                goto label_160;
                            }
                            else {
                                v16 = 0;
                            }
                        }
                        List list5 = ghde.b(v16);
                        ggxm ggxm0 = ggxm.a();
                        int v17 = 0;
                        while(v17 < v16) {
                            ghcf ghcf0 = (ghcf)list3.get(v17);
                            ghcd ghcd0 = new ghcd();
                            ghcd0.a = ghcf0;
                            ghcd0.b.a.e(ghcf0.d, ghcf0.f);
                            ghcd0.b.b.e(ghcf0.e, ghcf0.g);
                            list5.add(ghcd0);
                            ggxm0.a.g(ghcd0.b.a);
                            ggxm0.b.g(ghcd0.b.b);
                            ++v17;
                            ghch0 = ghch0;
                            list5 = list5;
                            v16 = v16;
                            list0 = list0;
                            list3 = list3;
                        }
                        list4 = list0;
                        ghch1 = ghch0;
                        ggym ggym0 = ggym.x(v15);
                        double f1 = ghde.a;
                        ghac ghac0 = new ghac(ggym0, f1);
                        if(v16 > 0) {
                            int v18 = ghac0.f;
                            int v19 = ggym.i(v18);
                            if(v18 == 0) {
                                if(ggxm0.a.h(0.0) || ggxm0.b.h(0.0)) {
                                    ggym1 = ghac0.a;
                                    ggym2 = ggym0;
                                    goto label_154;
                                }
                                else {
                                    goto label_141;
                                }
                                goto label_137;
                            }
                            else {
                            label_137:
                                long v20 = (long)ghac0.c;
                                if(!ggxm0.a.h(ghbj.c(ghbj.b(v20 + v20 + ((long)v19))))) {
                                    long v21 = (long)ghac0.d;
                                    if(!ggxm0.b.h(ghbj.c(ghbj.b(v21 + v21 + ((long)v19))))) {
                                    label_141:
                                        ggxm ggxm1 = ggxm0.b(ghac0.b + 3.330669E-16);
                                        ggym2 = ggym0;
                                        int v22 = Math.max(ghac0.c, ghbj.e(ghbj.d(ggxm1.a.a)));
                                        int v23 = Math.max(ghac0.d, ghbj.e(ghbj.d(ggxm1.b.a)));
                                        int v24 = Math.min(ghac0.d + v19 - 1, ghbj.e(ghbj.d(ggxm1.b.b))) ^ v23 | v22 ^ Math.min(ghac0.c + v19 - 1, ghbj.e(ghbj.d(ggxm1.a.b)));
                                        int v25 = Long.numberOfLeadingZeros(v24 + v24 + 1) - 33;
                                        ggym1 = v25 <= v18 ? ghac0.a : ggym.y(ghac0.a.b(), v22, v23).E(v25);
                                        goto label_154;
                                    }
                                }
                                ggym2 = ggym0;
                                ggym1 = ghac0.a;
                            }
                        label_154:
                            if(ggym1.c != ghac0.a.c) {
                                ghde.j(ggym2.G(), ggym1.G(), ghcg0);
                                ghde.e(new ghac(ggym1, f1), list5, ghcg0);
                                ghde.j(ggym1.F().C(), ggym2.F().C(), ghcg0);
                                goto label_160;
                            }
                        }
                        ghde.e(ghac0, list5, ghcg0);
                    label_160:
                        list1.set(v15, null);
                        ++v15;
                        ghch0 = ghch1;
                        list0 = list4;
                    }
                    ghde0 = this;
                    ghde0.e = list0.size();
                    ghde0.g = true;
                }
            }
        }
        return new ggzu(ghde0.d);
    }

    static final List b(int v) {
        return v < 0x100 ? new ghdd(v) : new ghdc(v);
    }

    public final List c() {
        return DesugarCollections.unmodifiableList(this.c);
    }

    public final void d(ghbx ghbx0) {
        this.c.add(ghbx0);
        this.g = false;
    }

    static void e(ghac ghac0, List list0, ghcg ghcg0) {
        ghdb ghdb0;
        ghcr ghcr0;
        ghcy ghcy0;
        int v24;
        ghch ghch2;
        ghcj ghcj0;
        int v5;
        ggxm ggxm2;
        ghac ghac1 = ghac0;
        if(!list0.isEmpty() || ghcg0.b.e != 0) {
            if(list0.size() > 10) {
                ghch ghch0 = ghcg0.b;
                int v = Math.max(10, ((int)(((double)(list0.size() + ghch0.e)) * 0.2)));
                int v1 = 0;
                for(Object object0: list0) {
                    v1 += (ghac1.f >= ((ghcd)object0).a.c ? 0 : 1);
                    if(v1 > v) {
                        int v2 = list0.size();
                        List list1 = ghde.b(v2);
                        List list2 = ghde.b(v2);
                        List list3 = ghde.b(v2);
                        List list4 = ghde.b(v2);
                        gged_interceptors gged0 = gged_interceptors.o(list1, list2, list3, list4);
                        int v3 = ghcg0.d.a;
                        ggxm ggxm0 = ghac1.a();
                        int v4 = 0;
                        while(v4 < v2) {
                            ghcd ghcd0 = (ghcd)list0.get(v4);
                            ggxm ggxm1 = ghcd0.b;
                            ggxl ggxl0 = ggxm1.a;
                            ggxl ggxl1 = ggxm0.a;
                            if((ggxl0.b <= ggxl1.a)) {
                                ghde.i(ghcd0, ggxm0.b, list1, list2, ghcg0.d);
                                ggxm2 = ggxm0;
                                v5 = v4;
                            }
                            else {
                                double f = ggxl1.b;
                                if((ggxl0.a >= f)) {
                                    ghde.i(ghcd0, ggxm0.b, list3, list4, ghcg0.d);
                                    ggxm2 = ggxm0;
                                    v5 = v4;
                                }
                                else {
                                    ggxl ggxl2 = ggxm1.b;
                                    ggxl ggxl3 = ggxm0.b;
                                    ggxm2 = ggxm0;
                                    v5 = v4;
                                    if((ggxl2.b <= ggxl3.a)) {
                                        list1.add(ghde.f(ghcd0, true, f, ghcg0.d));
                                        list3.add(ghde.f(ghcd0, false, ggxl1.a, ghcg0.d));
                                    }
                                    else if((ggxl2.a >= ggxl3.b)) {
                                        list2.add(ghde.f(ghcd0, true, f, ghcg0.d));
                                        list4.add(ghde.f(ghcd0, false, ggxl1.a, ghcg0.d));
                                    }
                                    else {
                                        ghde.i(ghde.f(ghcd0, true, f, ghcg0.d), ggxl3, list1, list2, ghcg0.d);
                                        ghde.i(ghde.f(ghcd0, false, ggxl1.a, ghcg0.d), ggxl3, list3, list4, ghcg0.d);
                                    }
                                }
                            }
                            v4 = v5 + 1;
                            v2 = v2;
                            gged0 = gged0;
                            v3 = v3;
                            ggxm0 = ggxm2;
                        }
                        gged_interceptors gged1 = gged0;
                        int v6 = 0;
                        while(v6 < 4) {
                            int v7 = ghac1.e;
                            List list5 = (List)gged1.get(ggxv.d(v7, v6));
                            if(!list5.isEmpty() || ghch0.e > 0) {
                                int v8 = ggxv.d(v7, v6);
                                ghde.e(new ghac(ghac1, v6, v8 >> 1, v8 & 1), list5, ghcg0);
                            }
                            ++v6;
                            gged1 = gged1;
                        }
                        ghcg0.d.a = v3;
                        return;
                    }
                }
            }
            ghch ghch1 = ghcg0.b;
            if(ghch1.a && !list0.isEmpty()) {
                ggym ggym0 = ghac1.a;
                if(ggym0.G().c != ghch1.c.c) {
                    int v9 = ghac1.c;
                    int v10 = ghac1.d;
                    if((ghac1.e & 2) != 0) {
                        int v11 = ggym.i(ghac1.f);
                        v9 += v11;
                        v10 += v11;
                    }
                    long v12 = (long)v10;
                    long v13 = (long)v9;
                    ghch1.b = ghae.q(ghbj.h(ggym0.b(), v13 + v13, v12 + v12));
                }
                long v14 = (long)ghac1.d;
                long v15 = (long)ghac1.c;
                long v16 = (long)ggym.i(ghac1.f);
                ghch1.a(ghae.q(ghbj.h(ggym0.b(), v15 + v15 + v16, v14 + v14 + v16)));
                ghde.k(list0, ghcg0);
            }
            ggym ggym1 = ghac1.a;
            int v17 = list0.size();
            int v18 = ghcg0.e.size();
            ggym ggym2 = ggym1;
            int v19 = 0;
            int v20 = 0;
            int v21 = 0;
            while(v21 < v17 || v19 < ghch1.e) {
                int v22 = v21 >= v17 ? v18 : ((ghcd)list0.get(v21)).a.a;
                int v23 = v19 >= ghch1.e ? v18 : ghch1.d[v19];
                if(v23 < v22) {
                    ++v19;
                    ghcj0 = ggym2 == null ? new ghck(v23) : new ghcj(v23, ggym2.c);
                    ghch2 = ghch1;
                    v24 = v17;
                }
                else {
                    int v25;
                    for(v25 = v21; v25 < v17 && ((ghcd)list0.get(v25)).a.a == v22; ++v25) {
                    }
                    int v26 = v25 - v21;
                    if(v26 == 1) {
                        int v27 = ((ghcd)list0.get(v21)).a.b;
                        v24 = v17;
                        if(ggym2 == null) {
                            ghcy0 = v23 == v22 ? new ghcy(v22, v27) : new ghcz(v22, v27);
                            ghch2 = ghch1;
                            goto label_170;
                        }
                        else {
                            long v28 = ggym2.c;
                            ghcj0 = v23 == v22 ? new ghcw(v22, v27, v28) : new ghcx(v22, v27, v28);
                            ghch2 = ghch1;
                            goto label_171;
                        }
                        goto label_129;
                    }
                    else {
                    label_129:
                        v24 = v17;
                        int v29 = ((ghcd)list0.get(v21)).a.b;
                        int v30 = 1;
                        while(v30 < v26) {
                            ghch2 = ghch1;
                            if(v29 + v30 == ((ghcd)list0.get(v21 + v30)).a.b) {
                                ++v30;
                                ghch1 = ghch2;
                                continue;
                            }
                            else {
                                int[] arr_v = new int[v26];
                                for(int v31 = 0; v31 < v26; ++v31) {
                                    arr_v[v31] = ((ghcd)list0.get(v31 + v21)).a.b;
                                }
                                if(ggym2 != null) {
                                    long v32 = ggym2.c;
                                    ghcr0 = v23 == v22 ? new ghcr(v22, arr_v, v32) : new ghcs(v22, arr_v, v32);
                                }
                                else if(v23 == v22) {
                                    ghcr0 = new ghct(v22, arr_v);
                                }
                                else {
                                    ghcr0 = new ghcu(v22, arr_v);
                                }
                                ghcj0 = ghcr0;
                                goto label_171;
                            }
                            break;
                        }
                        ghch2 = ghch1;
                        if(ggym2 != null) {
                            long v33 = ggym2.c;
                            ghcm ghcm0 = v23 == v22 ? new ghcm(v22, v29, v26, v33) : new ghcn(v22, v29, v26, v33);
                            ghcj0 = ghcm0;
                            goto label_171;
                        }
                        else if(v23 == v22) {
                            ghcy0 = new ghco(v22, v29, v26);
                        }
                        else {
                            ghcy0 = new ghcp(v22, v29, v26);
                        }
                    }
                label_170:
                    ghcj0 = ghcy0;
                label_171:
                    if(v23 == v22) {
                        ++v19;
                    }
                    v21 = v25;
                }
                ghcg0.c[v20] = ghcj0;
                ggym2 = null;
                ghac1 = ghac0;
                ++v20;
                v17 = v24;
                ghch1 = ghch2;
            }
            Consumer consumer0 = ghcg0.f;
            ghdb[] arr_ghdb = ghcg0.c;
            switch(v20) {
                case 1: {
                    ghdb0 = arr_ghdb[0];
                    break;
                }
                case 2: {
                    ghdb0 = new ghca(arr_ghdb[0], arr_ghdb[1]);
                    break;
                }
                default: {
                    ghdb0 = new ghcb(((ghdb[])Arrays.copyOf(arr_ghdb, v20)));
                }
            }
            consumer0.accept(ghdb0);
            if(ghch1.a && !list0.isEmpty()) {
                int v34 = ghac1.c;
                int v35 = ghac1.d;
                int v36 = ggym.i(ghac1.f);
                if(ghac1.e != 0 && ghac1.e != 3) {
                    v35 += v36;
                }
                else {
                    v34 += v36;
                }
                long v37 = (long)v35;
                long v38 = (long)v34;
                ghch1.a(ghae.q(ghbj.h(ggym1.b(), v38 + v38, v37 + v37)));
                ghde.k(list0, ghcg0);
                ghch1.c = ggym1.F().C();
            }
        }
    }

    private static ghcd f(ghcd ghcd0, boolean z, double f, ghce ghce0) {
        if(!((int)z)) {
            return ghcd0.b.a.a >= f ? ghcd0 : ghde.h(ghcd0, ((boolean)(((int)z))), f, ((boolean)(((Double.compare(ghcd0.a.d, ghcd0.a.f) > 0 ? 1 : 0) == (ghcd0.a.e > ghcd0.a.g ? 1 : 0) ? 0 : 1) ^ ((int)z))), ghcd0.b.b.a(ggze.a(f, ghcd0.a.d, ghcd0.a.f, ghcd0.a.e, ghcd0.a.g)), ghce0);
        }
        return ghcd0.b.a.b <= f ? ghcd0 : ghde.h(ghcd0, ((boolean)(((int)z))), f, ((boolean)(((Double.compare(ghcd0.a.d, ghcd0.a.f) > 0 ? 1 : 0) == (ghcd0.a.e > ghcd0.a.g ? 1 : 0) ? 0 : 1) ^ ((int)z))), ghcd0.b.b.a(ggze.a(f, ghcd0.a.d, ghcd0.a.f, ghcd0.a.e, ghcd0.a.g)), ghce0);
    }

    private static ghcd g(ghcd ghcd0, boolean z, double f, ghce ghce0) {
        if(!((int)z)) {
            return ghcd0.b.b.a >= f ? ghcd0 : ghde.h(ghcd0, ((boolean)(((Double.compare(ghcd0.a.d, ghcd0.a.f) > 0 ? 1 : 0) == (ghcd0.a.e > ghcd0.a.g ? 1 : 0) ? 0 : 1) ^ ((int)z))), ghcd0.b.a.a(ggze.a(f, ghcd0.a.e, ghcd0.a.g, ghcd0.a.d, ghcd0.a.f)), ((boolean)(((int)z))), f, ghce0);
        }
        return ghcd0.b.b.b <= f ? ghcd0 : ghde.h(ghcd0, ((boolean)(((Double.compare(ghcd0.a.d, ghcd0.a.f) > 0 ? 1 : 0) == (ghcd0.a.e > ghcd0.a.g ? 1 : 0) ? 0 : 1) ^ ((int)z))), ghcd0.b.a.a(ggze.a(f, ghcd0.a.e, ghcd0.a.g, ghcd0.a.d, ghcd0.a.f)), ((boolean)(((int)z))), f, ghce0);
    }

    private static ghcd h(ghcd ghcd0, boolean z, double f, boolean z1, double f1, ghce ghce0) {
        List list0 = ghce0.b;
        if(ghce0.a == list0.size()) {
            list0.add(new ghcd());
        }
        int v = ghce0.a;
        ghce0.a = v + 1;
        ghcd ghcd1 = (ghcd)list0.get(v);
        ghcd1.a = ghcd0.a;
        if(z) {
            ghcd1.b.a.f(ghcd0.b.a.a, f);
        }
        else {
            ghcd1.b.a.f(f, ghcd0.b.a.b);
        }
        if(z1) {
            ghcd1.b.b.f(ghcd0.b.b.a, f1);
            return ghcd1;
        }
        ghcd1.b.b.f(f1, ghcd0.b.b.b);
        return ghcd1;
    }

    private static void i(ghcd ghcd0, ggxl ggxl0, List list0, List list1, ghce ghce0) {
        ggxl ggxl1 = ghcd0.b.b;
        if(ggxl1.b > ggxl0.a) {
            double f = ggxl0.b;
            if((ggxl1.a >= f)) {
                list1.add(ghcd0);
                return;
            }
            list0.add(ghde.g(ghcd0, true, f, ghce0));
            list1.add(ghde.g(ghcd0, false, ggxl0.a, ghce0));
            return;
        }
        list0.add(ghcd0);
    }

    private static void j(ggym ggym0, ggym ggym1, ghcg ghcg0) {
        if(ghcg0.b.e > 0) {
            ggyq ggyq0 = new ggyq();
            ggyq0.b.clear();
            while(ggym0.a(ggym1) < 0) {
                long v = ggym0.c;
                long v1;
                for(v1 = v; !ggym.S(v1) && ggym.s(ggym.q(v1)) == v && ggym.aa(ggym.r(ggym.q(v1)), ggym1.c); v1 = ggym.q(v1)) {
                }
                ggym ggym2 = new ggym(v1);
                ggyq0.b.add(ggym2);
                ggym0 = ggym2.F().C();
            }
            gged_interceptors gged0 = ggna.a;
            for(int v2 = 0; v2 < ggyq0.b(); ++v2) {
                ghde.e(new ghac(((ggym)ggyq0.b.get(v2)), ghde.a), gged0, ghcg0);
            }
        }
    }

    private static void k(List list0, ghcg ghcg0) {
        for(Object object0: list0) {
            ghcf ghcf0 = ((ghcd)object0).a;
            ((ghbx)ghcg0.e.get(ghcf0.a)).B();
            ghcg0.b.b(ghcf0.a, ghcf0.h, ghcf0.i);
        }
    }
}

