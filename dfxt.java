public final class dfxt implements Runnable {
    public final dfzz a;

    public dfxt(dfzz dfzz0) {
        this.a = dfzz0;
    }

    @Override
    public final void run() {
        dfzz dfzz0 = this.a;
        if(dfzz0.bA()) {
            dcvz.a.b().p("Ignoring start background caching timeout because we\'re still scanning", new Object[0]);
            return;
        }
        dfzz0.y.k();
    }
}

