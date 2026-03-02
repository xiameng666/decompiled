import j..time.Duration;
import j..time.Instant;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class bgri implements Function {
    public final bgrj a;
    public final hguc b;

    public bgri(bgrj bgrj0, hguc hguc0) {
        this.a = bgrj0;
        this.b = hguc0;
    }

    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        hfwn hfwn0 = ((gxog)object0).d;
        if(hfwn0 == null) {
            hfwn0 = hfwn.a;
        }
        hgtw hgtw0 = this.b.h == null ? hgtw.a : this.b.h;
        hfst hfst0 = hgtw0.c == null ? hfst.a : hgtw0.c;
        return Duration.between(hfyg.d(hfwn0), Instant.ofEpochMilli(this.a.a.a())).compareTo(hfyg.c(hfst0)) > 0 ? Boolean.valueOf(false) : Boolean.valueOf(true);
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

