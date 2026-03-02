public final class gxzm extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gxzm a;
    public ByteString b;
    private static volatile Parser c;

    static {
        gxzm gxzm0 = new gxzm();
        gxzm.a = gxzm0;
        ProtoLiteMessage.L(gxzm.class, ((ProtoLiteMessage)gxzm0));
    }

    private gxzm() {
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
                    return new hfvw(((MessageLite)gxzm.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"b"});
                }
                case 3: {
                    return new gxzm();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gxzm.a));
                }
                case 5: {
                    return gxzm.a;
                }
                case 6: {
                    Object object1 = gxzm.c;
                    if(object1 == null) {
                        Class class0 = gxzm.class;
                        synchronized(class0) {
                            hfvs0 = gxzm.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gxzm.a));
                                gxzm.c = hfvs0;
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

