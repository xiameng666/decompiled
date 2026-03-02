import java.util.Collection;

public final class besi implements ibts {
    public final besj a;

    public besi(besj besj0) {
        this.a = besj0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((bedv)object0), "affiliatedGroups");
        boolean z = false;
        if(this.a.b && !this.a.a.b().isEmpty()) {
            Collection collection0 = (Collection)((bedv)object0).b;
            if(collection0 != null && !collection0.isEmpty()) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}

