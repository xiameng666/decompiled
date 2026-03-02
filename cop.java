import java.util.ArrayList;
import java.util.List;

final class cop implements cii {
    private final List a;

    public cop(List list0) {
        this.a = list0;
    }

    @Override  // chl
    public final cmx a(cmc cmc0) {
        return this.c(cmc0);
    }

    @Override  // cii
    public final cnd c(cmc cmc0) {
        List list0 = this.a;
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ibns ibns0 = (ibns)list0.get(v1);
            arrayList0.add(new ibns(((long)(((long)((Number)ibns0.a).intValue()) * 1000000L)), ((cii)ibns0.b).c(cmc0)));
        }
        return new cpo(arrayList0);
    }
}

