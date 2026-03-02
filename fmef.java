public final class fmef {
    public fmhm a;
    private gged_interceptors b;

    public final fmeg a() {
        fmhm fmhm0 = this.a;
        if(fmhm0 != null) {
            gged_interceptors gged0 = this.b;
            if(gged0 != null) {
                return new fmeg(fmhm0, gged0);
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.a == null) {
            stringBuilder0.append(" promptText");
        }
        if(this.b == null) {
            stringBuilder0.append(" buttons");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(gged_interceptors gged0) {
        if(gged0 == null) {
            throw new NullPointerException("Null buttons");
        }
        this.b = gged0;
    }
}

