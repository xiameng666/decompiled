public final class bxod {
    private static final bboh a;
    private final ayud b;
    private final ayvm c;

    static {
        bxod.a = bboh.a("IdentityGmscoreLogger");
    }

    public bxod(ayud ayud0, ayvm ayvm0) {
        this.b = ayud0;
        this.c = ayvm0;
    }

    public final void a(gixr gixr0) {
        hpnu hpnu0 = hpnu.a;
        if(hpnu0.d().d()) {
            ((ggtj)((ggtj)bxod.a.h()).ar(5803)).w(gixr0);
        }
        if(hpnu0.d().e()) {
            cdwj.v().j(((ProtoLiteMessage)gixr0));
            return;
        }
        ayuc ayuc0 = this.b.i(((MessageLite)gixr0));
        ayuc0.o = this.c;
        ayuc0.d();
    }
}

