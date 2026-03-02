public final class gspg extends ProtoLiteMessage implements gsph {
    public static final gspg a;
    public hfuo b;
    public long c;
    private static volatile Parser d;

    static {
        gspg gspg0 = new gspg();
        gspg.a = gspg0;
        ProtoLiteMessage.L(gspg.class, ((ProtoLiteMessage)gspg0));
    }

    private gspg() {
        this.b = hfvv.a;
    }

    @Override  // gsph
    public final gspe a(int v) {
        throw null;
    }

    public final void b() {
        hfuo hfuo0 = this.b;
        if(!hfuo0.c()) {
            this.b = ProtoLiteMessage.E(hfuo0);
        }
    }

    @Override  // ProtoLiteMessage
    public final Object jf(int v, Object object0) {
        Parser hfvs0;
        if(v != 0) {
            switch(v - 1) {
                case 0: {
                    return (byte)1;
                }
                case 2: {
                    return new hfvw(((MessageLite)gspg.a), "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001B\u0002\u0002", new Object[]{"b", gspe.class, "c"});
                }
                case 3: {
                    return new gspg();
                }
                case 4: {
                    return new gspf();
                }
                case 5: {
                    return gspg.a;
                }
                case 6: {
                    Object object1 = gspg.d;
                    if(object1 == null) {
                        Class class0 = gspg.class;
                        synchronized(class0) {
                            hfvs0 = gspg.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gspg.a));
                                gspg.d = hfvs0;
                            }
                        }
                        return hfvs0;
                    }
                    return object1;
                }
                default: {
                    throw null;
                }
            }
        }
        throw null;
    }
}

