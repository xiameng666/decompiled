public final class gyjf implements Runnable {
    public final gyim a;
    public final gyjd b;

    public gyjf(gyim gyim0, gyjd gyjd0) {
        this.a = gyim0;
        this.b = gyjd0;
    }

    @Override
    public final void run() {
        MessageLite hfvm0 = this.b.a();
        this.a.a(hfvm0);
    }
}

