public abstract class iaky extends iama {
    public iakv d;

    protected iaky(iakv iakv0) {
        this.d = iakv0;
    }

    @Override  // iama
    public final void e(iaku iaku0, iaof_metadata iaof0) {
        try {
            this.f(iaku0, iaof0);
        }
        catch(Exception exception0) {
            this.d = iala.a;
            iaof_metadata iaof1 = iapk.a(exception0);
            iapk iapk0 = iapk.d(exception0);
            if(iaof1 == null) {
                iaof1 = new iaof_metadata();
            }
            iaku0.a(iapk0, iaof1);
        }
    }

    protected abstract void f(iaku arg1, iaof_metadata arg2);

    @Override  // iama
    protected final iakv s() {
        return this.d;
    }
}

