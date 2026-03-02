import java.io.Serializable;

abstract class ggbl implements Serializable, Comparable {
    final Comparable b;
    private static final long serialVersionUID;

    public ggbl(Comparable comparable0) {
        this.b = comparable0;
    }

    public int a(ggbl ggbl0) {
        if(ggbl0 != ggbj.a) {
            if(ggbl0 == ggbh.a) {
                return -1;
            }
            int v = TimeRange.b(this.b, ggbl0.b);
            return v == 0 ? Boolean.compare(this instanceof ggbi, ggbl0 instanceof ggbi) : v;
        }
        return 1;
    }

    public abstract gfzd b();

    public abstract gfzd c();

    @Override
    public int compareTo(Object object0) {
        return this.a(((ggbl)object0));
    }

    public abstract ggbl d(gfzd arg1, ggbv arg2);

    public abstract ggbl e(gfzd arg1, ggbv arg2);

    @Override
    public final boolean equals(Object object0) {
        if((object0 instanceof ggbl)) {
            ggbl ggbl0 = (ggbl)object0;
            try {
                if(this.a(ggbl0) == 0) {
                    return true;
                }
            }
            catch(ClassCastException unused_ex) {
            }
        }
        return false;
    }

    public Comparable f() {
        return this.b;
    }

    public abstract Comparable g(ggbv arg1);

    public abstract Comparable h(ggbv arg1);

    @Override
    public abstract int hashCode();

    public abstract void i(StringBuilder arg1);

    public abstract void j(StringBuilder arg1);

    public abstract boolean k(Comparable arg1);
}

