public final class jhg implements jga {
    public final int a;
    private final iwj b;

    public jhg(String s, int v) {
        iwj iwj0 = new iwj(s);
        super();
        this.b = iwj0;
        this.a = v;
    }

    @Override  // jga
    public final void a(jge jge0) {
        if(jge0.k()) {
            int v = jge0.c;
            jge0.h(v, jge0.d, this.b());
            if(this.b().length() > 0) {
                jge0.i(v, this.b().length() + v);
            }
        }
        else {
            int v1 = jge0.a;
            jge0.h(v1, jge0.b, this.b());
            if(this.b().length() > 0) {
                jge0.i(v1, this.b().length() + v1);
            }
        }
        int v2 = jge0.b() + this.a;
        int v3 = ibwt.j((this.a <= 0 ? v2 - this.b().length() : v2 - 1), 0, jge0.c());
        jge0.j(v3, v3);
    }

    public final String b() {
        return this.b.b;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof jhg)) {
            return false;
        }
        return ibuq.m(this.b(), ((jhg)object0).b()) ? this.a == ((jhg)object0).a : false;
    }

    @Override
    public final int hashCode() {
        return this.b().hashCode() * 0x1F + this.a;
    }

    @Override
    public final String toString() {
        return "SetComposingTextCommand(text=\'" + this.b() + "\', newCursorPosition=" + this.a + ')';
    }
}

