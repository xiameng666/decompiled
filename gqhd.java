public final class gqhd extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gqhd a;
    public hfuo b;
    public boolean c;
    public long d;
    private static volatile Parser e;

    static {
        gqhd gqhd0 = new gqhd();
        gqhd.a = gqhd0;
        ProtoLiteMessage.L(gqhd.class, ((ProtoLiteMessage)gqhd0));
    }

    private gqhd() {
        this.b = hfvv.a;
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
                    return new hfvw(((MessageLite)gqhd.a), "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001B\u0002\u0007\u0003\u0002", new Object[]{"b", gqhv.class, "c", "d"});
                }
                case 3: {
                    return new gqhd();
                }
                case 4: {
                    return new gqhc();
                }
                case 5: {
                    return gqhd.a;
                }
                case 6: {
                    Object object1 = gqhd.e;
                    if(object1 == null) {
                        Class class0 = gqhd.class;
                        synchronized(class0) {
                            hfvs0 = gqhd.e;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gqhd.a));
                                gqhd.e = hfvs0;
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

