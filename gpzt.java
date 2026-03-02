import java.util.Set;

public final class gpzt extends gpzq {
    private final gqbt a;

    public gpzt() {
        this.a = new gqbt(gqbt.a, false);
    }

    public final gpzo b(String s) {
        return (gpzo)this.a.get(s);
    }

    public final gpzq c(String s) {
        return (gpzq)this.a.get(s);
    }

    public final gpzt e(String s) {
        return (gpzt)this.a.get(s);
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof gpzt) && ((gpzt)object0).a.equals(this.a);
    }

    public final Set f() {
        return this.a.entrySet();
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void k(String s, gpzq gpzq0) {
        this.a.put(s, gpzq0);
    }

    public final void l(String s, Number number0) {
        this.k(s, new gpzw(number0));
    }

    public final void m(String s, String s1) {
        gpzs gpzs0 = s1 == null ? gpzs.a : new gpzw(s1);
        this.k(s, gpzs0);
    }

    public final boolean n(String s) {
        return this.a.containsKey(s);
    }
}

