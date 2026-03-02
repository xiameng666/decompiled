public final class gzis extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gzis a;
    public hfuo b;
    private static volatile Parser c;

    static {
        gzis gzis0 = new gzis();
        gzis.a = gzis0;
        ProtoLiteMessage.L(gzis.class, ((ProtoLiteMessage)gzis0));
    }

    private gzis() {
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
                    return new hfvw(((MessageLite)gzis.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", gzir.class});
                }
                case 3: {
                    return new gzis();
                }
                case 4: {
                    return new gziq();
                }
                case 5: {
                    return gzis.a;
                }
                case 6: {
                    Object object1 = gzis.c;
                    if(object1 == null) {
                        Class class0 = gzis.class;
                        synchronized(class0) {
                            hfvs0 = gzis.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gzis.a));
                                gzis.c = hfvs0;
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

