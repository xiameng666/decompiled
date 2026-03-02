public final class atlg implements gfsi {
    public final String a;
    public final atmb b;

    public atlg(String s, atmb atmb0) {
        this.a = s;
        this.b = atmb0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        Throwable throwable0 = (Throwable)object0;
        atll.a.g(this.a, throwable0, new Object[0]);
        this.b.a(gifh.i, "failed to execute async function, error message: " + throwable0.getMessage() + " msg: " + this.a);
        return null;
    }
}

