import java.util.ArrayList;
import java.util.List;

public final class dgdg implements dgdh {
    public final dgfc a;
    private final int b;
    private final String c;
    private final List d;
    private final List e;
    private final List f;
    private final List g;

    public dgdg(dgfc dgfc0) {
        ibuq.f(dgfc0, "introduction");
        super();
        this.a = dgfc0;
        this.b = dgfc0.a;
        this.c = dgfc0.b;
        ArrayList arrayList0 = new ArrayList(ibpo.q(dgfc0.c, 10));
        for(Object object0: dgfc0.c) {
            arrayList0.add(((dgfl)object0).c(null));
        }
        this.d = arrayList0;
        ArrayList arrayList1 = new ArrayList(ibpo.q(this.a.d, 10));
        for(Object object1: this.a.d) {
            arrayList1.add(((dggj)object1).c(""));
        }
        this.e = arrayList1;
        ArrayList arrayList2 = new ArrayList(ibpo.q(this.a.e, 10));
        for(Object object2: this.a.e) {
            arrayList2.add(((dggo)object2).c(null, false));
        }
        this.f = arrayList2;
        ArrayList arrayList3 = new ArrayList(ibpo.q(this.a.f, 10));
        for(Object object3: this.a.f) {
            arrayList3.add(((dgen)object3).c(null));
        }
        this.g = arrayList3;
    }

    @Override  // dgdh
    public final int a() {
        return this.b;
    }

    @Override  // dgdh
    public final String b() {
        return this.c;
    }

    @Override  // dgdh
    public final List c() {
        return this.g;
    }

    @Override  // dgdh
    public final List d() {
        return this.d;
    }

    @Override  // dgdh
    public final List e() {
        return this.e;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof dgdg) ? ibuq.m(this.a, ((dgdg)object0).a) : false;
    }

    @Override  // dgdh
    public final List f() {
        return this.f;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Incomplete(introduction=" + this.a + ")";
    }
}

