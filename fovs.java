import j..time.Instant;
import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class fovs implements Predicate {
    public final Instant a;

    public fovs(Instant instant0) {
        this.a = instant0;
    }

    @Override
    public final Predicate and(Predicate predicate0) {
        return Predicate.-CC.$default$and(this, predicate0);
    }

    @Override
    public final Predicate negate() {
        return Predicate.-CC.$default$negate(this);
    }

    @Override
    public final Predicate or(Predicate predicate0) {
        return Predicate.-CC.$default$or(this, predicate0);
    }

    @Override
    public final boolean test(Object object0) {
        int v = ((iddc)object0).c;
        if(v == 1) {
            hfwn hfwn0 = ((idbj)((iddc)object0).d).g;
            if(hfwn0 == null) {
                hfwn0 = hfwn.a;
            }
            return hfyg.d(hfwn0).isAfter(this.a);
        }
        iddk iddk0 = v == 3 ? ((iddk)((iddc)object0).d) : iddk.a;
        return hfyg.d((iddk0.e == null ? hfwn.a : iddk0.e)).isAfter(this.a);
    }
}

