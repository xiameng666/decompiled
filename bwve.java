import j..util.Objects;

final class bwve extends bwzp {
    final bwvf a;

    public bwve(bwvf bwvf0, gltq gltq0, String s, bxbi bxbi0) {
        Objects.requireNonNull(bwvf0);
        this.a = bwvf0;
        super(gltq0, 2, 3, s, bxbi0);
    }

    @Override  // bwzp
    protected final Object a() {
        this.a.e.g.w(this.a.a, this.a.d);
        return null;
    }
}

