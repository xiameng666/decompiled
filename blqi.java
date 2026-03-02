public final class blqi implements Runnable {
    public final blqm a;
    public final bmzg b;

    public blqi(blqm blqm0, bmzg bmzg0) {
        this.a = blqm0;
        this.b = bmzg0;
    }

    @Override
    public final void run() {
        blqh blqh0 = new blqh(this.b);
        this.a.c.c.g(this.a.b, blqh0);
    }
}

