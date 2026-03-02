public final class dwic implements dpuf {
    public final dwif a;
    public final int b;
    public final dpue c;

    public dwic(dwif dwif0, int v, dpue dpue0) {
        this.a = dwif0;
        this.b = v;
        this.c = dpue0;
    }

    @Override  // dpuf
    public final void a(dpui dpui0) {
        int v = this.a.c.get();
        if(this.b != v) {
            return;
        }
        this.c.a(dpui0);
    }
}

