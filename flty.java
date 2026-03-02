import j..util.Objects;

public final class flty {
    public fmhr a;
    public flua b;
    private boolean c;
    private byte d;

    public flty() {
    }

    public flty(flub flub0) {
        this.a = flub0.a;
        this.c = flub0.b;
        this.b = flub0.c;
        this.d = 1;
    }

    public final flub a() {
        if(this.d == 1) {
            flua flua0 = this.b;
            if(flua0 != null) {
                return new flub(this.a, this.c, flua0);
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.d == 0) {
            stringBuilder0.append(" skipNotification");
        }
        if(this.b == null) {
            stringBuilder0.append(" oneOfType");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(boolean z) {
        this.c = z;
        this.d = 1;
    }

    public final void c(fltu fltu0) {
        Objects.requireNonNull(fltu0);
        this.b = new flsz(fltu0);
        this.b(true);
    }
}

