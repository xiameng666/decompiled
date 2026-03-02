public final class jfz implements jga {
    private final int a;
    private final int b;

    public jfz(int v, int v1) {
        this.a = v;
        this.b = v1;
        if(v >= 0 && v1 >= 0) {
            return;
        }
        jie.a(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + v + " and " + v1 + " respectively."));
    }

    @Override  // jga
    public final void a(jge jge0) {
        int v = 0;
        int v1 = 0;
        int v2 = 0;
        while(v1 < this.a) {
            int v3 = jge0.a;
            if(v3 > v2 + 1) {
                v2 = jgb.a(jge0.a(v3 - (v2 + 1) - 1), jge0.a(jge0.a - (v2 + 1))) ? v2 + 2 : v2 + 1;
                ++v1;
                continue;
            }
            else {
                v2 = v3;
            }
            break;
        }
        int v4 = this.b;
        int v5 = 0;
        while(v < v4) {
            if(jge0.b + (v5 + 1) < jge0.c()) {
                int v6 = jge0.a(jge0.b + (v5 + 1));
                v5 = jgb.a(jge0.a(jge0.b + (v5 + 1) - 1), ((char)v6)) ? v5 + 2 : v5 + 1;
                ++v;
                continue;
            }
            else {
                v5 = jge0.c() - jge0.b;
            }
            break;
        }
        jge0.g(jge0.b, v5 + jge0.b);
        jge0.g(jge0.a - v2, jge0.a);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof jfz)) {
            return false;
        }
        return this.a == ((jfz)object0).a ? this.b == ((jfz)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return this.a * 0x1F + this.b;
    }

    @Override
    public final String toString() {
        return "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=" + this.a + ", lengthAfterCursor=" + this.b + ')';
    }
}

