abstract class crqc extends crpy {
    private boolean a;

    public crqc(crqq crqq0) {
        super(crqq0);
        ++this.m.n;
    }

    protected final void aA() {
        if(this.aC()) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    public final void aB() {
        if(this.a) {
            throw new IllegalStateException("Can\'t initialize twice");
        }
        this.aM();
        ++this.m.o;
        this.a = true;
    }

    final boolean aC() {
        return this.a;
    }

    protected abstract void aM();
}

