public abstract class ignj extends igne {
    @Override  // igne
    public final ignj a() {
        return this;
    }

    public abstract boolean b(ignj arg1);

    @Override  // igne
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof ignb) && this.b(((ignb)object0).a());
    }
}

