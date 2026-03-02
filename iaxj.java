public final class iaxj implements Runnable {
    public final iaxm a;
    public final iaor b;

    public iaxj(iaxm iaxm0, iaor iaor0) {
        this.a = iaxm0;
        this.b = iaor0;
    }

    @Override
    public final void run() {
        iaos iaos0 = this.b.a();
        this.a.a.a(iaos0);
    }
}

