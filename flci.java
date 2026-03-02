import j..util.Objects;

final class flci extends ialz {
    final flcj a;

    public flci(flcj flcj0, iakv iakv0) {
        Objects.requireNonNull(flcj0);
        this.a = flcj0;
        super(iakv0);
    }

    @Override  // iama
    public final void e(iaku iaku0, iaof_metadata iaof0) {
        flcj flcj0 = this.a;
        if(flcj0.b != null) {
            iaof0.i(flcj.a, flcj0.b);
        }
        super.e(iaku0, iaof0);
    }
}

