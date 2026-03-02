import java.text.Collator;

final class bele implements beok {
    public final Collator a;

    public bele() {
        Collator collator0 = Collator.getInstance(bgmp.b());
        this.a = collator0;
        collator0.setStrength(0);
    }

    @Override  // beok
    public final Object a(Object object0, Object object1) {
        gged_interceptors gged0 = ((bedi)object1).a;
        if(gged0.isEmpty()) {
            return gfqx.a;
        }
        ggdy ggdy0 = new ggdy();
        ggdy0.k(((bedi)object0).a);
        ggdy0.k(gged0);
        gged_interceptors gged1 = ggdy0.h();
        ggdy ggdy1 = new ggdy();
        ggdy1.k(((bedi)object0).b);
        ggdy1.k(((bedi)object1).b);
        gged_interceptors gged2 = ggch.j(gqnb.a(gged1, ggdy1.h())).o(new beld(this));
        int v = gged2.size();
        for(int v1 = 0; v1 < v; ++v1) {
            gged_interceptors gged3 = ((gqlt)gged2.get(v1)).c;
            int v2 = ((ggna)gged3).c;
            for(int v3 = 0; v3 < v2; ++v3) {
                gged_interceptors gged4 = ((gqmd)gged3.get(v3)).c();
                boolean z = true;
                gfuy.a(((boolean)(gged4.isEmpty() ^ 1)));
                gqmg gqmg0 = ((bedg)gged4.get(0)).d;
                int v4 = ((ggna)gged4).c;
                for(int v5 = 0; v5 < v4; ++v5) {
                    gfuy.a(((bedg)gged4.get(v5)).d == gqmg0);
                }
                if(gqmg0 == gqmg.c && v4 != 1) {
                    z = false;
                }
                gfuy.a(z);
            }
        }
        return gfsx.m(gged2);
    }
}

