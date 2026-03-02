public final class gqux extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gqux a;
    public int b;
    public ByteString c;
    private static volatile Parser d;

    static {
        gqux gqux0 = new gqux();
        gqux.a = gqux0;
        ProtoLiteMessage.L(gqux.class, ((ProtoLiteMessage)gqux0));
    }

    private gqux() {
        this.c = ByteString.b;
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
                    return new hfvw(((MessageLite)gqux.a), "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\n", new Object[]{"b", "c"});
                }
                case 3: {
                    return new gqux();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gqux.a));
                }
                case 5: {
                    return gqux.a;
                }
                case 6: {
                    Object object1 = gqux.d;
                    if(object1 == null) {
                        Class class0 = gqux.class;
                        synchronized(class0) {
                            hfvs0 = gqux.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gqux.a));
                                gqux.d = hfvs0;
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

