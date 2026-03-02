import android.net.Uri;
import android.util.Pair;
import j..util.Objects;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Random;

final class buqv implements gmbg {
    final List a;
    final clht b;
    final buqw c;

    public buqv(buqw buqw0, List list0, clht clht0) {
        this.a = list0;
        this.b = clht0;
        Objects.requireNonNull(buqw0);
        this.c = buqw0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        buqu buqu0 = new buqu(this);
        this.b.post(buqu0);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Pair pair0;
        int v13;
        long v10;
        mcd mcd0 = new mcd();
        mcd0.b = "G1Android";
        HashMap hashMap0 = new HashMap();
        hashMap0.put("Authorization", String.format(Locale.US, "Bearer %s", ((String)object0)));
        mcd0.a.b(hashMap0);
        for(Object object1: this.a) {
            Uri uri0 = Uri.parse(((hiwi)object1).b);
            mrc mrc0 = new mrc(new mya());
            lwu lwu0 = lwl.a(null, uri0, new lwm(), Collections.EMPTY_LIST, ggna.a, lws.a);
            gftb.check(lwu0.b);
            gftb.check(lwu0.b);
            mrd mrd0 = new mrd(lwu0, mcd0, mrc0, mnl.a);
            mfs mfs0 = (mfs)this.c.d;
            mfs0.as();
            List list0 = Collections.singletonList(mrd0);
            mfs0.as();
            List list1 = mfs0.j;
            int v = list1.size();
            mfs0.as();
            gftb.checkTrue(v >= 0);
            int v1 = Math.min(v, list1.size());
            if(list1.isEmpty()) {
                int v2 = mfs0.L;
                mfs0.as();
                int v3 = mfs0.V(mfs0.K);
                long v4 = mfs0.C();
                ++mfs0.v;
                if(!list1.isEmpty()) {
                    int v5 = list1.size();
                    for(int v6 = v5 - 1; v6 >= 0; --v6) {
                        list1.remove(v6);
                    }
                    mro mro0 = mfs0.O;
                    int[] arr_v = mro0.b;
                    int[] arr_v1 = new int[arr_v.length - v5];
                    int v8 = 0;
                    for(int v7 = 0; v7 < arr_v.length; ++v7) {
                        int v9 = arr_v[v7];
                        if(v9 >= 0 && v9 < v5) {
                            ++v8;
                        }
                        else {
                            if(v9 >= 0) {
                                v9 -= v5;
                            }
                            arr_v1[v7 - v8] = v9;
                        }
                    }
                    mfs0.O = new mro(arr_v1, new Random(mro0.a.nextLong()));
                }
                List list2 = mfs0.af(0, list0);
                lxp lxp0 = mfs0.aa();
                if(!lxp0.q() && ((mdd)lxp0).b < 0) {
                    throw new lwi();
                }
                if(v2 == -1) {
                    v3 = lxp0.g(mfs0.u);
                    v10 = 0x8000000000000001L;
                }
                else {
                    v10 = v4;
                }
                int v11 = 4;
                mhc mhc0 = mfs0.ad(mfs0.K, lxp0, mfs0.Y(lxp0, v3, v10));
                int v12 = mhc0.f;
                if(v12 == 1) {
                    v13 = v3;
                    v11 = 1;
                }
                else {
                    if(!lxp0.q()) {
                        if(v3 == -1) {
                            v11 = v12;
                            v13 = -1;
                            goto label_76;
                        }
                        else if(v3 < ((mdd)lxp0).b) {
                            v11 = 2;
                        }
                    }
                    v13 = v3;
                }
            label_76:
                mhc mhc1 = mfs.ac(mhc0, v11);
                mfz mfz0 = new mfz(list2, mfs0.O, v13, mau.t(v10));
                mfs0.g.f.d(17, mfz0).b();
                mfs0.aq(mhc1, 0, !mfs0.K.c.a.equals(mhc1.c.a) && !mfs0.K.b.q(), 4, mfs0.X(mhc1), -1, false);
            }
            else {
                int v14 = -1;
                mhc mhc2 = mfs0.K;
                lxp lxp1 = mhc2.b;
                ++mfs0.v;
                List list3 = mfs0.af(v1, list0);
                lxp lxp2 = mfs0.aa();
                int v15 = mfs0.V(mhc2);
                long v16 = mfs0.W(mhc2);
                if(!lxp1.q() && !lxp2.q()) {
                    lxo lxo0 = mfs0.a;
                    lxn lxn0 = mfs0.i;
                    pair0 = lxp1.l(lxo0, lxn0, v15, mau.t(v16));
                    Object object2 = pair0.first;
                    if(lxp2.a(object2) == -1) {
                        int v17 = mge.a(lxo0, lxn0, mfs0.t, mfs0.u, object2, lxp1, lxp2);
                        pair0 = v17 == -1 ? mfs0.Y(lxp2, -1, 0x8000000000000001L) : mfs0.Y(lxp2, v17, lxp2.p(v17, lxo0).a());
                    }
                }
                else {
                    int v18 = lxp1.q() || !lxp2.q() ? 0 : 1;
                    if(1 != v18) {
                        v14 = v15;
                    }
                    if(1 == v18) {
                        v16 = 0x8000000000000001L;
                    }
                    pair0 = mfs0.Y(lxp2, v14, v16);
                }
                mhc mhc3 = mfs0.ad(mhc2, lxp2, pair0);
                mfz mfz1 = new mfz(list3, mfs0.O, -1, 0x8000000000000001L);
                mfs0.g.f.g(18, v1, mfz1).b();
                mfs0.aq(mhc3, 0, false, 5, 0x8000000000000001L, -1, false);
            }
        }
        this.c.d.Q(true);
        this.c.d.O();
        ((lvu)this.c.d).q(0, 0L, false);
    }
}

