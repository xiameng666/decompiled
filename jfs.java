public final class jfs implements jga {
    public final int a;
    private final iwj b;

    public jfs(iwj iwj0, int v) {
        this.b = iwj0;
        this.a = v;
    }

    public jfs(String s, int v) {
        this(new iwj(s), v);
    }

    @Override  // jga
    public final void a(jge jge0) {
        if(jge0.k()) {
            jge0.h(jge0.c, jge0.d, this.b());
        }
        else {
            jge0.h(jge0.a, jge0.b, this.b());
        }
        int v = jge0.b() + this.a;
        int v1 = ibwt.j((this.a <= 0 ? v - this.b().length() : v - 1), 0, jge0.c());
        jge0.j(v1, v1);
    }

    public final String b() {
        return this.b.b;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof jfs)) {
            return false;
        }
        return ibuq.m(this.b(), ((jfs)object0).b()) ? this.a == ((jfs)object0).a : false;
    }

    @Override
    public final int hashCode() {
        return this.b().hashCode() * 0x1F + this.a;
    }

    @Override
    public final String toString() {
        return "CommitTextCommand(text=\'" + this.b() + "\', newCursorPosition=" + this.a + ')';
    }
}

