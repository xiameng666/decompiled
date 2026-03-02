import j..util.DesugarCollections;
import java.util.Map.Entry;

public final class cooh implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        if(!((gfsx)object0).i()) {
            throw new IllegalStateException("No upload requests found for a given account");
        }
        for(Object object1: DesugarCollections.unmodifiableMap(((cogp)((gfsx)object0).d()).b).entrySet()) {
            coga coga0 = ((cogs)((Map.Entry)object1).getValue()).e;
            if(coga0 == null) {
                coga0 = coga.a;
            }
            cofw cofw0 = coga0.f == null ? cofw.a : coga0.f;
            if(!cofw0.d && cofv.a(cofw0.c) == 3) {
                return Boolean.valueOf(true);
            }
        }
        return Boolean.valueOf(false);
    }
}

