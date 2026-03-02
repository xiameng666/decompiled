public final class grcw extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final grcw a;
    public ByteString b;
    private static volatile Parser c;

    static {
        grcw grcw0 = new grcw();
        grcw.a = grcw0;
        ProtoLiteMessage.L(grcw.class, ((ProtoLiteMessage)grcw0));
    }

    private grcw() {
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
                    return new hfvw(((MessageLite)grcw.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"b"});
                }
                case 3: {
                    return new grcw();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)grcw.a));
                }
                case 5: {
                    return grcw.a;
                }
                case 6: {
                    Object object1 = grcw.c;
                    if(object1 == null) {
                        Class class0 = grcw.class;
                        synchronized(class0) {
                            hfvs0 = grcw.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)grcw.a));
                                grcw.c = hfvs0;
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

