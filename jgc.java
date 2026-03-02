public final class jgc implements ibts {
    public final jga a;

    public jgc(jga jga0) {
        this.a = jga0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        String s;
        if((((jga)object0) instanceof jfs)) {
            s = "CommitTextCommand(text.length=" + ((jfs)(((jga)object0))).b().length() + ", newCursorPosition=" + ((jfs)(((jga)object0))).a + ')';
            return this.a == ((jga)object0) ? " > " + s : "   " + s;
        }
        if((((jga)object0) instanceof jhg)) {
            s = "SetComposingTextCommand(text.length=" + ((jhg)(((jga)object0))).b().length() + ", newCursorPosition=" + ((jhg)(((jga)object0))).a + ')';
            return this.a == ((jga)object0) ? " > " + s : "   " + s;
        }
        if((((jga)object0) instanceof jhf)) {
            s = ((jhf)(((jga)object0))).toString();
            return this.a == ((jga)object0) ? " > " + s : "   " + s;
        }
        if((((jga)object0) instanceof jfy)) {
            s = ((jfy)(((jga)object0))).toString();
            return this.a == ((jga)object0) ? " > " + s : "   " + s;
        }
        if((((jga)object0) instanceof jfz)) {
            s = ((jfz)(((jga)object0))).toString();
            return this.a == ((jga)object0) ? " > " + s : "   " + s;
        }
        if((((jga)object0) instanceof jhh)) {
            s = ((jhh)(((jga)object0))).toString();
            return this.a == ((jga)object0) ? " > " + s : "   " + s;
        }
        if((((jga)object0) instanceof jgg)) {
            jgg jgg0 = (jgg)(((jga)object0));
            return this.a == ((jga)object0) ? " > FinishComposingTextCommand()" : "   FinishComposingTextCommand()";
        }
        if((((jga)object0) instanceof jfr)) {
            jfr jfr0 = (jfr)(((jga)object0));
            return this.a == ((jga)object0) ? " > BackspaceCommand()" : "   BackspaceCommand()";
        }
        if(!(((jga)object0) instanceof jgs)) {
            if((((jga)object0) instanceof jfx)) {
                jfx jfx0 = (jfx)(((jga)object0));
                return this.a == ((jga)object0) ? " > DeleteAllCommand()" : "   DeleteAllCommand()";
            }
            String s1 = new ibuk(((jga)object0).getClass()).c();
            if(s1 == null) {
                s1 = "{anonymous EditCommand}";
            }
            s = "Unknown EditCommand: " + s1;
            return this.a == ((jga)object0) ? " > " + s : "   " + s;
        }
        jgs jgs0 = (jgs)(((jga)object0));
        throw null;
    }
}

