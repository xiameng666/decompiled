import j..util.Objects;
import java.util.Collection;

public final class fhpa {
    public static float a(Collection collection0, Collection collection1, gfsi gfsi0, gfsi gfsi1) {
        ggeo ggeo0 = ggkm.f(collection0, gfsi0);
        float f = 0.0f;
        for(Object object0: collection1) {
            Object object1 = ggeo0.get(gfsi0.apply(object0));
            if(object1 != null) {
                f += ((float)(((Float)gfsi1.apply(object0)))) * ((float)(((Float)gfsi1.apply(object1))));
            }
        }
        return f == 0.0f ? 0.0f : f / (fhpa.c(collection0, gfsi1) * fhpa.c(collection1, gfsi1));
    }

    public static Collection b(Collection collection0, gfsi gfsi0, gfsi gfsi1) {
        ggeo ggeo0 = ggma.a(collection0, gfsi0).map;
        gfze gfze0 = new gfze(gfsi1, ggmi.a);
        Objects.requireNonNull(gfze0);
        return new ggkk(ggkm.n(ggeo0, new fhow(gfze0)));
    }

    private static float c(Collection collection0, gfsi gfsi0) {
        float f = 0.0f;
        for(Object object0: collection0) {
            float f1 = (float)(((Float)gfsi0.apply(object0)));
            f += f1 * f1;
        }
        return (float)Math.sqrt(f);
    }
}

