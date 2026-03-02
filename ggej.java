final class ggej {
    private final Object a;
    private final Object b;
    private final Object c;

    public ggej(Object object0, Object object1, Object object2) {
        this.a = object0;
        this.b = object1;
        this.c = object2;
    }

    final IllegalArgumentException a() {
        return new IllegalArgumentException("Multiple entries with same key: " + this.a + "=" + this.b + " and " + this.a + "=" + this.c);
    }
}

