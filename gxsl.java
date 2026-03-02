public final class gxsl extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gxsl a;
    public ByteString b;
    private static volatile Parser c;

    static {
        gxsl gxsl0 = new gxsl();
        gxsl.a = gxsl0;
        ProtoLiteMessage.L(gxsl.class, ((ProtoLiteMessage)gxsl0));
    }

    private gxsl() {
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
                    return new hfvw(((MessageLite)gxsl.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"b"});
                }
                case 3: {
                    return new gxsl();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gxsl.a));
                }
                case 5: {
                    return gxsl.a;
                }
                case 6: {
                    Object object1 = gxsl.c;
                    if(object1 == null) {
                        Class class0 = gxsl.class;
                        synchronized(class0) {
                            hfvs0 = gxsl.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gxsl.a));
                                gxsl.c = hfvs0;
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

