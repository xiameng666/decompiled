public final class akvm implements Runnable {
    public final akvn a;
    public final akvp b;
    public final gele c;

    public akvm(akvn akvn0, akvp akvp0, gele gele0) {
        this.a = akvn0;
        this.b = akvp0;
        this.c = gele0;
    }

    @Override
    public final void run() {
        gele gele0 = this.c;
        akvp akvp0 = this.b;
        synchronized(akvp0.c) {
            akvp0.f();
            aliu aliu0 = new aliu();
            if(akvp0.h == 0) {
                ((ggtj)akvp.a.j()).x("Channel was disconnected when write finished; cannot proceed.");
                aliu0.h(2);
                return;
            }
            akvn akvn0 = this.a;
            if(gele0.a()) {
                aliu0.h(0);
                aliu0.X(akvn0.c);
                Runnable runnable0 = akvn0.b;
                if(runnable0 != null) {
                    runnable0.run();
                }
                return;
            }
            aliu0.h(1);
            ((ggtj)((ggtj)akvp.a.j()).s(gele0.a)).B("Error while sending [Responder Auth] to address %s; disconnecting.", akvn0.a);
            akvp0.g();
            if(akvp0.b() != 3) {
                aliu0.F(7);
            }
        }
    }
}

