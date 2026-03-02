public final class dfwi implements Runnable {
    public final dfzz a;

    public dfwi(dfzz dfzz0) {
        this.a = dfzz0;
    }

    @Override
    public final void run() {
        dfzz dfzz0 = this.a;
        dfzi dfzi0 = (dfzi)dfzz0.ab.getAndSet(null);
        if(dfzi0 != null && dfzi0.a != null) {
            dcvz.a.b().p("defer bandwidth upgrade timeout. run bandwidth upgrade.", new Object[0]);
            dfzz0.l.P(dfzi0.a);
            dfzi0.m = null;
        }
    }
}

