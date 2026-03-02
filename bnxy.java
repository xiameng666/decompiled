public final class bnxy implements gfsi {
    public final int a;

    public bnxy(int v) {
        this.a = v;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        Void void0 = (Void)object0;
        return this.a < 0 ? Boolean.valueOf(false) : Boolean.valueOf(true);
    }
}

