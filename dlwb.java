import dagger.Lazy;
import java.util.Collection;

public final class dlwb implements dmba {
    private final ggeo a;

    public dlwb(ggeo ggeo0) {
        this.a = ggeo0;
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        ibuq.f(hjrn0, "bulletin");
        ibuq.f(hjwe0, "filter");
        gftb.g(hjwe0.b == 1, "Cannot evaluate non-composite filter", new Object[0]);
        hjsq hjsq0 = hjwe0.b == 1 ? ((hjsq)hjwe0.c) : hjsq.a;
        ibuq.e(hjsq0, "getCompositeFilter(...)");
        return this.c(hjrn0, hjsq0);
    }

    private final boolean b(hjwe hjwe0) {
        int v = hjwe0.b;
        if(v == 1) {
            hfuo hfuo0 = ((hjsq)hjwe0.c).b;
            ibuq.e(hfuo0, "getFiltersList(...)");
            if((hfuo0 instanceof Collection) && hfuo0.isEmpty()) {
                return false;
            }
            for(Object object0: hfuo0) {
                ibuq.c(((hjwe)object0));
                if(this.b(((hjwe)object0))) {
                    return true;
                }
            }
            return false;
        }
        Integer integer0 = (int)hjwc.a(v).aw;
        return !this.a.containsKey(integer0);
    }

    private final boolean c(hjrn hjrn0, hjsq hjsq0) {
        int v;
        hfuo hfuo0 = hjsq0.b;
        ibuq.e(hfuo0, "getFiltersList(...)");
        if(!(hfuo0 instanceof Collection) || !hfuo0.isEmpty()) {
            for(Object object0: hfuo0) {
                ibuq.c(((hjwe)object0));
                if(this.b(((hjwe)object0))) {
                    return false;
                }
            }
        }
        switch(hjsq0.c) {
            case 0: {
                v = 2;
                break;
            }
            case 1: {
                v = 3;
                break;
            }
            case 2: {
                v = 4;
                break;
            }
            case 3: {
                v = 5;
                break;
            }
            default: {
                v = 0;
            }
        }
        if(v == 0) {
            v = 1;
        }
        switch(v - 2) {
            case 1: {
                if((hfuo0 instanceof Collection) && hfuo0.isEmpty()) {
                    return true;
                }
                for(Object object1: hfuo0) {
                    ibuq.c(((hjwe)object1));
                    if(this.d(hjrn0, ((hjwe)object1)) != 1) {
                        return false;
                    }
                }
                return true;
            }
            case 2: {
                if((hfuo0 instanceof Collection) && hfuo0.isEmpty()) {
                    return false;
                }
                for(Object object2: hfuo0) {
                    ibuq.c(((hjwe)object2));
                    if(this.d(hjrn0, ((hjwe)object2)) == 1) {
                        return true;
                    }
                }
                return false;
            }
            case 3: {
                if((hfuo0 instanceof Collection) && hfuo0.isEmpty()) {
                    return true;
                }
                for(Object object3: hfuo0) {
                    ibuq.c(((hjwe)object3));
                    if(this.d(hjrn0, ((hjwe)object3)) != 2) {
                        return false;
                    }
                }
                return true;
            }
            default: {
                return false;
            }
        }
    }

    private final int d(hjrn hjrn0, hjwe hjwe0) {
        int v = hjwe0.b;
        if(v == 1) {
            hjsq hjsq0 = (hjsq)hjwe0.c;
            ibuq.e(hjsq0, "getCompositeFilter(...)");
            return this.c(hjrn0, hjsq0) ? 1 : 2;
        }
        Integer integer0 = (int)hjwc.a(v).aw;
        Lazy lazy0 = (Lazy)this.a.get(integer0);
        if(lazy0 == null) {
            return 3;
        }
        return ((dmba)lazy0.get()).a(hjrn0, hjwe0) ? 1 : 2;
    }
}

