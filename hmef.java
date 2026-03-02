public final class hmef extends hmeb {
    @Override  // hmeb
    public final hmgz a() {
        return new hmgz("9F15");
    }

    @Override  // hmeb
    public final void b(hmgz hmgz0) {
        super.b(hmgz0);
        this.a = (short)(((char)(hmgz0.a[1] & 0xFF | hmgz0.a[0] << 8)));
    }
}

