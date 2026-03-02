import j..util.DesugarCollections;
import java.util.Collections;
import java.util.List;

public final class aej extends aep {
    public aej(ajt ajt0) {
        super(ajt0);
    }

    public final String a() {
        String s = this.a.d;
        kay.i(s);
        return s;
    }

    public final List b() {
        ajo ajo0 = this.a.f;
        if(ajo0 == null) {
            return Collections.EMPTY_LIST;
        }
        return ajo0.b == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(ajo0.b);
    }

    public final boolean c() {
        ajo ajo0 = this.a.f;
        return ajo0 == null ? false : ajo0.a;
    }
}

