public final class jfy implements jga {
    private final int a;
    private final int b;

    public jfy(int v, int v1) {
        this.a = v;
        this.b = v1;
        if(v >= 0 && v1 >= 0) {
            return;
        }
        jie.a(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + v + " and " + v1 + " respectively."));
    }

    @Override  // jga
    public final void a(jge jge0) {
        int v = jge0.b + this.b;
        jge0.g(jge0.b, Math.min((((jge0.b ^ v) & (this.b ^ v)) >= 0 ? jge0.b + this.b : jge0.c()), jge0.c()));
        jge0.g(Math.max(0, (((this.a ^ jge0.a) & (jge0.a ^ jge0.a - this.a)) >= 0 ? jge0.a - this.a : 0)), jge0.a);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof jfy)) {
            return false;
        }
        return this.a == ((jfy)object0).a ? this.b == ((jfy)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return this.a * 0x1F + this.b;
    }

    @Override
    public final String toString() {
        return "DeleteSurroundingTextCommand(lengthBeforeCursor=" + this.a + ", lengthAfterCursor=" + this.b + ')';
    }
}

