public final class gzgc extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gzgc a;
    public int b;
    private static volatile Parser c;

    static {
        gzgc gzgc0 = new gzgc();
        gzgc.a = gzgc0;
        ProtoLiteMessage.L(gzgc.class, ((ProtoLiteMessage)gzgc0));
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
                    return new hfvw(((MessageLite)gzgc.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"b"});
                }
                case 3: {
                    return new gzgc();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gzgc.a));
                }
                case 5: {
                    return gzgc.a;
                }
                case 6: {
                    Object object1 = gzgc.c;
                    if(object1 == null) {
                        Class class0 = gzgc.class;
                        synchronized(class0) {
                            hfvs0 = gzgc.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gzgc.a));
                                gzgc.c = hfvs0;
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

