import j..util.Objects;

public final class afk {
    public final String a;
    public final int b;

    public afk(String s, int v) {
        kat.a(s);
        this.a = s;
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null) {
            return false;
        }
        return (object0 instanceof afk) ? this.b == ((afk)object0).b && this.a.equals(((afk)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, ((int)this.b)});
    }

    @Override
    public final String toString() {
        return this.b == -1 ? this.a : this.a + "[" + this.b + "]";
    }
}

