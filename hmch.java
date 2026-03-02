import java.util.ArrayList;
import java.util.List;

public final class hmch extends hmcb {
    @Override  // hmcb
    public final List a(hmgf hmgf0) {
        hmgz hmgz1;
        hmgz hmgz0;
        hmfh hmfh0 = hmgf0.f.a;
        boolean z = true;
        if(hmgf0.e() == 1) {
            hmfv hmfv0 = hmgf0.i;
            if(((hmft)hmfv0).a) {
                hmgz0 = hmgf0.p.b.c.f;
                hmgz1 = hmgf0.p.b.c.g;
            }
            else {
                hmgz0 = hmgf0.p.b.b.f;
                hmgz1 = hmgf0.p.b.b.g;
            }
            if(hmgf0.o) {
                if(hmgz1 != null) {
                    if(hmfv0.a() == 2) {
                        if((hmgz1.a(0) & 4) == 4) {
                            z = false;
                        }
                        return hmch.b(z);
                    }
                    if((hmgz1.a(0) & 2) == 2) {
                        z = false;
                    }
                    return hmch.b(z);
                }
                return hmch.b(true);
            }
            return hmgz0 == null ? hmch.b(true) : hmch.b(((boolean)(hmch.c(hmgz0, hmfh0) ^ 1)));
        }
        if(hmgf0.e() != 2) {
            throw null;
        }
        hmgz hmgz2 = hmgf0.p.c.f;
        return hmgz2 == null ? hmch.b(true) : hmch.b(((boolean)(hmch.c(hmgz2, hmfh0) ^ 1)));
    }

    private static final List b(boolean z) {
        List list0 = new ArrayList();
        if(!z) {
            list0.add(hmhq.h);
        }
        return list0;
    }

    private static final boolean c(hmgz hmgz0, hmfh hmfh0) {
        hmgz hmgz1 = hmfh0.a();
        for(int v = 0; v < hmgz0.b(); ++v) {
            if((hmgz1.a(v + 3) & hmgz0.a(v)) != 0) {
                return true;
            }
        }
        return false;
    }
}

