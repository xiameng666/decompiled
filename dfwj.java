public final class dfwj implements Runnable {
    public final dfzz a;
    public final cuwu b;
    public final String c;
    public final dfzt d;

    public dfwj(dfzz dfzz0, cuwu cuwu0, String s, dfzt dfzt0) {
        this.a = dfzz0;
        this.b = cuwu0;
        this.c = s;
        this.d = dfzt0;
    }

    @Override
    public final void run() {
        dcvz.a.b().h("Start to send a stream payload back(%d)", Long.valueOf(this.b.i));
        this.a.l.z(this.c, this.b, this.d);
    }
}

