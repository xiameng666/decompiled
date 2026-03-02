public class fwyj {
    public final gmcg a;
    public final gmcg b;
    public final gmcg c;
    private final fvsi d;

    public fwyj(gmcg gmcg0, gmcg gmcg1, gmcg gmcg2) {
        this.a = gmcg0;
        this.b = gmcg1;
        this.c = gmcg2;
        this.d = new fvsi(this.getClass().getSimpleName());
    }

    public final void a() {
        this.d.a();
    }

    public final void b() {
        if(huvd.t()) {
            fvsi fvsi0 = this.d;
            Thread thread0 = Thread.currentThread();
            if(fvsi0.b.getId() == thread0.getId()) {
                throw new fvsj(fvsi0.a, thread0);
            }
        }
    }
}

