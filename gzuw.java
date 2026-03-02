public final class gzuw extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gzuw a;
    public hfuo b;
    private static volatile Parser c;

    static {
        gzuw gzuw0 = new gzuw();
        gzuw.a = gzuw0;
        ProtoLiteMessage.L(gzuw.class, ((ProtoLiteMessage)gzuw0));
    }

    private gzuw() {
        this.b = hfvv.a;
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
                    return new hfvw(((MessageLite)gzuw.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", gzsq.class});
                }
                case 3: {
                    return new gzuw();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gzuw.a));
                }
                case 5: {
                    return gzuw.a;
                }
                case 6: {
                    Object object1 = gzuw.c;
                    if(object1 == null) {
                        Class class0 = gzuw.class;
                        synchronized(class0) {
                            hfvs0 = gzuw.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gzuw.a));
                                gzuw.c = hfvs0;
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

