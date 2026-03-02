public final class fmfd {
    private gged_interceptors a;
    private gged_interceptors b;

    public final fmfe a() {
        if(this.a != null && this.b != null) {
            return new fmfe(this.a, this.b);
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.a == null) {
            stringBuilder0.append(" decorationIdsToAdd");
        }
        if(this.b == null) {
            stringBuilder0.append(" decorationIdsToRemove");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(gged_interceptors gged0) {
        if(gged0 == null) {
            throw new NullPointerException("Null decorationIdsToAdd");
        }
        this.a = gged0;
    }

    public final void c(gged_interceptors gged0) {
        if(gged0 == null) {
            throw new NullPointerException("Null decorationIdsToRemove");
        }
        this.b = gged0;
    }
}

