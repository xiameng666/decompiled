import java.text.BreakIterator;

public final class jfr implements jga {
    @Override  // jga
    public final void a(jge jge0) {
        if(jge0.k()) {
            jge0.g(jge0.c, jge0.d);
            return;
        }
        switch(jge0.b()) {
            case -1: {
                int v = jge0.a;
                int v1 = jge0.b;
                jge0.j(v, v);
                jge0.g(v, v1);
                return;
            }
            case 0: {
                return;
            }
            default: {
                BreakIterator breakIterator0 = BreakIterator.getCharacterInstance();
                breakIterator0.setText(jge0.toString());
                jge0.g(breakIterator0.preceding(jge0.b()), jge0.b());
            }
        }
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof jfr;
    }

    @Override
    public final int hashCode() {
        return new ibuk(this.getClass()).hashCode();
    }

    @Override
    public final String toString() {
        return "BackspaceCommand()";
    }
}

