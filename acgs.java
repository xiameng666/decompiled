import j..util.Objects;

public final class acgs {
    public final int a;
    public final String b;
    private final Object c;

    public acgs(int v, Object object0, String s) {
        this.a = v;
        this.c = object0;
        this.b = s;
    }

    public final Object a() {
        if(this.b()) {
            return this.c;
        }
        throw new IllegalStateException("AppSearchResult is a failure: " + this.toString());
    }

    public final boolean b() {
        return this.a == 0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof acgs) ? this.a == ((acgs)object0).a && Objects.equals(this.c, ((acgs)object0).c) && Objects.equals(this.b, ((acgs)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{((int)this.a), this.c, this.b});
    }

    @Override
    public final String toString() {
        return this.b() ? "[SUCCESS]: " + this.c : "[FAILURE(" + this.a + ")]: " + this.b;
    }
}

