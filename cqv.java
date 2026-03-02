import android.content.Context;

final class cqv implements cuv {
    private final Context a;
    private final jks b;
    private final long c;
    private final dld d;

    public cqv(Context context0, jks jks0, long v, dld dld0) {
        this.a = context0;
        this.b = jks0;
        this.c = v;
        this.d = dld0;
    }

    @Override  // cuv
    public final cuu a() {
        return new cqu(this.a, this.b, this.c);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!ibuq.m(this.getClass(), (object0 == null ? null : object0.getClass()))) {
            return false;
        }
        ibuq.d(object0, "null cannot be cast to non-null type androidx.compose.foundation.AndroidEdgeEffectOverscrollFactory");
        if(!ibuq.m(this.a, ((cqv)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((cqv)object0).b)) {
            return false;
        }
        return ibog.c(this.c, ((cqv)object0).c) ? ibuq.m(this.d, ((cqv)object0).d) : false;
    }

    @Override  // cuv
    public final int hashCode() {
        return ((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + ibof.a(this.c)) * 0x1F + this.d.hashCode();
    }
}

