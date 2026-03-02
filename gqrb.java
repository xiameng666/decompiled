public final class gqrb extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gqrb a;
    public int b;
    public Object c;
    private static volatile Parser d;

    static {
        gqrb gqrb0 = new gqrb();
        gqrb.a = gqrb0;
        ProtoLiteMessage.L(gqrb.class, ((ProtoLiteMessage)gqrb0));
    }

    private gqrb() {
        this.b = 0;
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
                    return new hfvw(((MessageLite)gqrb.a), "\u0004\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"c", "b", gqsg.class, gqsa.class, gqrg.class, gqrh.class});
                }
                case 3: {
                    return new gqrb();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gqrb.a));
                }
                case 5: {
                    return gqrb.a;
                }
                case 6: {
                    Object object1 = gqrb.d;
                    if(object1 == null) {
                        Class class0 = gqrb.class;
                        synchronized(class0) {
                            hfvs0 = gqrb.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gqrb.a));
                                gqrb.d = hfvs0;
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

