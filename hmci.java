import java.util.ArrayList;
import java.util.List;

public final class hmci extends hmcb {
    @Override  // hmcb
    public final List a(hmgf hmgf0) {
        return hmgf0.e() != 1 || hmgf0.i.f().b != 4 ? hmci.b(true) : hmci.b(hmgf0.p.a.h);
    }

    private static final List b(boolean z) {
        List list0 = new ArrayList();
        if(!z) {
            list0.add(hmhq.i);
        }
        return list0;
    }
}

