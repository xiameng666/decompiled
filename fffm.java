import j..util.Objects;
import java.util.List;

public final class fffm {
    public final ffgm a;

    public fffm(ffgm ffgm0) {
        Objects.requireNonNull(ffgm0);
        this.a = ffgm0;
        super();
    }

    public static final boolean a() {
        felm felm0 = ffgp.f();
        Boolean boolean0 = felm0.u;
        if(boolean0 != null) {
            return boolean0.booleanValue();
        }
        List list0 = felm0.c.h();
        if(list0.size() != 1) {
            return false;
        }
        felm0.u = Boolean.valueOf(((fczq)list0.get(0)).h());
        return felm0.u.booleanValue();
    }
}

