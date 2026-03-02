public final class chq extends cht {
    public float a;
    public float b;

    public chq(float f, float f1) {
        this.a = f;
        this.b = f1;
    }

    @Override  // cht
    public final float a(int v) {
        switch(v) {
            case 0: {
                return this.a;
            }
            case 1: {
                return this.b;
            }
            default: {
                return 0.0f;
            }
        }
    }

    @Override  // cht
    public final int b() {
        return 2;
    }

    @Override  // cht
    public final cht c() {
        return new chq(0.0f, 0.0f);
    }

    @Override  // cht
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
    }

    @Override  // cht
    public final void e(int v, float f) {
        switch(v) {
            case 0: {
                this.a = f;
                return;
            }
            case 1: {
                this.b = f;
            }
        }
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof chq) && ((chq)object0).a == this.a && ((chq)object0).b == this.b;
    }

    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.a) * 0x1F + Float.floatToIntBits(this.b);
    }

    @Override
    public final String toString() {
        return "AnimationVector2D: v1 = " + this.a + ", v2 = " + this.b;
    }
}

