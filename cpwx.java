import java.util.ArrayList;
import java.util.concurrent.Executor;

public final class cpwx {
    private final fjtv a;
    private final Executor b;

    public cpwx(fjtv fjtv0, Executor executor0) {
        this.a = fjtv0;
        this.b = executor0;
    }

    public final gmcd a() {
        ArrayList arrayList0 = new ArrayList();
        gged_interceptors gged0 = cpwu.a();
        ArrayList arrayList1 = new ArrayList();
        int v = ((ggna)gged0).c;
        for(int v2 = 0; v2 < v; ++v2) {
            arrayList1.add(this.b(((fizl)gged0.get(v2))));
        }
        arrayList0.addAll(arrayList1);
        gged_interceptors gged1 = cpwv.a();
        ArrayList arrayList2 = new ArrayList();
        int v3 = ((ggna)gged1).c;
        for(int v1 = 0; v1 < v3; ++v1) {
            for(Object object0: ((fizu)gged1.get(v1)).c) {
                fizl fizl0 = ((fizs)object0).c;
                if(fizl0 == null) {
                    fizl0 = fizl.a;
                }
                arrayList2.add(this.b(fizl0));
            }
        }
        arrayList0.addAll(arrayList2);
        return gmbu.a(arrayList0).a(new cpww(), this.b);
    }

    private final gmcd b(fizl fizl0) {
        fjcl fjcl0 = fkds.e(fizl0.c, fizl0.d);
        try {
            fjbs fjbs0 = fkdy.b(fizl0);
            fjsz fjsz0 = new fjsz();
            return this.a.b(fjcl0, fjbs0, fjsz0);
        }
        catch(hfur hfur0) {
            fkbp.g(hfur0, "%s: Unable to add groups from individual configs.", new Object[]{"PhenotypeConfig"});
            return gmbu.i(Boolean.valueOf(true));
        }
    }
}

