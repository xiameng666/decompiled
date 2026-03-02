public final class grcx extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final grcx a;
    public ByteString b;
    private static volatile Parser c;

    static {
        grcx grcx0 = new grcx();
        grcx.a = grcx0;
        ProtoLiteMessage.L(grcx.class, ((ProtoLiteMessage)grcx0));
    }

    private grcx() {
        this.b = ByteString.b;
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
                    return new hfvw(((MessageLite)grcx.a), "\u0000\u0001\u0000\u0000\u0004\u0004\u0001\u0000\u0000\u0000\u0004\n", new Object[]{"b"});
                }
                case 3: {
                    return new grcx();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)grcx.a));
                }
                case 5: {
                    return grcx.a;
                }
                case 6: {
                    Object object1 = grcx.c;
                    if(object1 == null) {
                        Class class0 = grcx.class;
                        synchronized(class0) {
                            hfvs0 = grcx.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)grcx.a));
                                grcx.c = hfvs0;
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

