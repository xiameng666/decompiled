import j..util.Objects;

final class dlah extends fyxo {
    final dlai a;

    public dlah(dlai dlai0) {
        Objects.requireNonNull(dlai0);
        this.a = dlai0;
        super();
    }

    @Override  // fyxo
    public final void a(fyxp fyxp0, int v) {
        synchronized(dlai.a) {
            dlai dlai0 = this.a;
            if(dlai0.b != null && dlai0.b.get() == fyxp0) {
                dlai0.b.clear();
            }
        }
    }

    @Override  // fyxo
    public final void b(Object object0, int v) {
        this.a(((fyxp)object0), v);
    }
}

