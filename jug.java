public final class jug {
    public int a;

    public jug() {
        this.a = 1;
    }

    public final void a() {
        this.a |= 4;
    }

    @Override
    public final Object clone() {
        Object object0 = new jug();
        object0.a = this.a;
        return object0;
    }
}

