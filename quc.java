public final class quc {
    public float a;
    public float b;

    public quc() {
        this(1.0f, 1.0f);
    }

    public quc(float f, float f1) {
        this.a = f;
        this.b = f1;
    }

    @Override
    public final String toString() {
        return this.a + "x" + this.b;
    }
}

