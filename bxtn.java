import java.util.ArrayList;
import java.util.List;

public class bxtn implements glzm {
    public final glzm a;
    public final gmcg b;
    public final gged_interceptors c;
    public final gged_interceptors d;

    public bxtn(glzm glzm0, gmcg gmcg0, List list0, List list1) {
        gftb.check(glzm0);
        gftb.check(gmcg0);
        this.a = glzm0;
        this.b = gmcg0;
        this.c = gged_interceptors.i(list0);
        this.d = gged_interceptors.i(list1);
    }

    @Override  // glzm
    public final gmcd a() {
        return this.c();
    }

    public cjtm b(int v, String s, azug azug0) {
        return new bxtc(v, s, this, agfg.a, azug0);
    }

    public final bxsy c() {
        ArrayList arrayList0 = new ArrayList();
        gged_interceptors gged0 = this.c;
        int v = gged0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            bxtd bxtd0 = new bxtd(this, ((bxsf)gged0.get(v1)));
            arrayList0.add(this.b.e(bxtd0));
        }
        gmbl gmbl0 = gmbu.c(arrayList0);
        bxte bxte0 = new bxte();
        gmcg gmcg0 = this.b;
        gmcd gmcd0 = glzd.g(gmbl0.a(bxte0, gmcg0), new bxtf(this), gmcg0);
        gmcd gmcd1 = glzd.f(gmcd0, new bxtg(this), gmcg0);
        bxth bxth0 = new bxth(this);
        gmcd gmcd2 = glyi.f(gmcd0, Throwable.class, bxth0, gmcg0);
        ArrayList arrayList1 = new ArrayList();
        int v2 = gged0.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            arrayList1.add(jqy.a(new bxti(this, gmcd2, ((bxsf)gged0.get(v3)))));
        }
        return bxsy.h(gmbu.b(new gmcd[]{gmcd2, gmcd1, gmbu.a(arrayList1).a(new bxtj(), gmcg0)}).b(new bxtk(gmcd2), gmcg0));
    }
}

