public final class armk implements arli {
    public final armp a;
    public final Runnable b;

    public armk(armp armp0, Runnable runnable0) {
        this.a = armp0;
        this.b = runnable0;
    }

    @Override  // arli
    public final void a(int v) {
        this.a.b.execute(this.b);
    }
}

