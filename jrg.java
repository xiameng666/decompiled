final class jrg {
    jri a;
    final jrh b;

    public jrg(jrh jrh0) {
        this.b = jrh0;
        super();
    }

    @Override
    public final String toString() {
        String s = "[ ";
        if(this.a != null) {
            for(int v = 0; v < 9; ++v) {
                s = s + this.a.i[v] + " ";
            }
        }
        return s + "] " + this.a;
    }
}

