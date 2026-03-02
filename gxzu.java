public final class gxzu extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gxzu a;
    public ByteString b;
    private static volatile Parser c;

    static {
        gxzu gxzu0 = new gxzu();
        gxzu.a = gxzu0;
        ProtoLiteMessage.L(gxzu.class, ((ProtoLiteMessage)gxzu0));
    }

    private gxzu() {
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
                    return new hfvw(((MessageLite)gxzu.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"b"});
                }
                case 3: {
                    return new gxzu();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gxzu.a));
                }
                case 5: {
                    return gxzu.a;
                }
                case 6: {
                    Object object1 = gxzu.c;
                    if(object1 == null) {
                        Class class0 = gxzu.class;
                        synchronized(class0) {
                            hfvs0 = gxzu.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gxzu.a));
                                gxzu.c = hfvs0;
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

