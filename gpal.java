public final class gpal {
    public final gpay a;
    public final int b;
    private final int c;

    public gpal(gpay gpay0, int v, int v1) {
        this.a = gpay0;
        this.b = v;
        this.c = v1;
    }

    public gpal(Class class0, int v, int v1) {
        this(new gpay(gpax.class, class0), v, v1);
    }

    public final boolean a() {
        return this.c == 0;
    }

    public final boolean b() {
        return this.b == 2;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof gpal) && this.a.equals(((gpal)object0).a) && this.b == ((gpal)object0).b && this.c == ((gpal)object0).c;
    }

    @Override
    public final int hashCode() {
        return this.c ^ ((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b) * 1000003;
    }

    @Override
    public final String toString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder("Dependency{anInterface=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", type=");
        int v = this.b;
        if(v == 1) {
            s = "required";
        }
        else {
            s = v == 0 ? "optional" : "set";
        }
        stringBuilder0.append(s);
        stringBuilder0.append(", injection=");
        stringBuilder0.append((this.c == 0 ? "direct" : "provider"));
        stringBuilder0.append("}");
        return stringBuilder0.toString();
    }
}

