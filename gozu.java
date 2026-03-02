import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class gozu {
    public int a;
    public gpaa b;
    private final Set c;
    private final Set d;
    private int e;
    private final Set f;

    @SafeVarargs
    public gozu(gpay gpay0, gpay[] arr_gpay) {
        HashSet hashSet0 = new HashSet();
        this.c = hashSet0;
        this.d = new HashSet();
        this.e = 0;
        this.a = 0;
        this.f = new HashSet();
        hashSet0.add(gpay0);
        for(int v = 0; v < arr_gpay.length; ++v) {
            gpaw.b(arr_gpay[v]);
        }
        Collections.addAll(this.c, arr_gpay);
    }

    @SafeVarargs
    public gozu(Class class0, Class[] arr_class) {
        HashSet hashSet0 = new HashSet();
        this.c = hashSet0;
        this.d = new HashSet();
        this.e = 0;
        this.a = 0;
        this.f = new HashSet();
        hashSet0.add(new gpay(gpax.class, class0));
        for(int v = 0; v < arr_class.length; ++v) {
            Class class1 = arr_class[v];
            gpaw.b(class1);
            gpay gpay0 = new gpay(gpax.class, class1);
            this.c.add(gpay0);
        }
    }

    public final gozv a() {
        gpaw.a(this.b != null, "Missing required property: factory.");
        return new gozv(new HashSet(this.c), new HashSet(this.d), this.e, this.a, this.b, this.f);
    }

    public final void b(gpal gpal0) {
        if(this.c.contains(gpal0.a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        this.d.add(gpal0);
    }

    public final void c(int v) {
        gpaw.a(this.e == 0, "Instantiation type has already been set.");
        this.e = v;
    }
}

