public final class dftt implements Runnable {
    public final dfud a;

    public dftt(dfud dfud0) {
        this.a = dfud0;
    }

    @Override
    public final void run() {
        this.a.a.getContentResolver().unregisterContentObserver(this.a.k);
        cutr.f(this.a.a, this.a.j);
        dcvz.a.b().p("Stopped listening for contact book changed events.", new Object[0]);
    }
}

