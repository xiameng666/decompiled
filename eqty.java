final class eqty extends bafo {
    private final ayud a;

    protected eqty(ayud ayud0) {
        super(ayud0);
        this.a = ayud0;
    }

    @Override  // bafo
    public final void a(MessageLite hfvm0, ayvm ayvm0) {
        ayuc ayuc0 = this.a.i(hfvm0);
        if(ayvm0 != null) {
            ayuc0.o = ayvm0;
        }
        gjll gjll0 = ((gjoc)hfvm0).k;
        if(gjll0 == null) {
            gjll0 = gjll.a;
        }
        int v = gjll0.b;
        if((v & 2) != 0) {
            gjkn gjkn0 = gjll0.d == null ? gjkn.a : gjll0.d;
            erpl.a(ayuc0, gjkn0.c, gjkn0.d);
        }
        else if((v & 1) != 0) {
            erpl.b(ayuc0, (gjll0.c == null ? gjle.a : gjll0.c));
        }
        ayuc0.d();
    }
}

