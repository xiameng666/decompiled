public final class hkiy extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hkiy a;
    public ByteString b;
    public ByteString c;
    private static volatile Parser d;

    static {
        hkiy hkiy0 = new hkiy();
        hkiy.a = hkiy0;
        ProtoLiteMessage.L(hkiy.class, ((ProtoLiteMessage)hkiy0));
    }

    private hkiy() {
        this.b = ByteString.b;
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
                    return new hfvw(((MessageLite)hkiy.a), "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\n", new Object[]{"b", "c"});
                }
                case 3: {
                    return new hkiy();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hkiy.a));
                }
                case 5: {
                    return hkiy.a;
                }
                case 6: {
                    Object object1 = hkiy.d;
                    if(object1 == null) {
                        Class class0 = hkiy.class;
                        synchronized(class0) {
                            hfvs0 = hkiy.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hkiy.a));
                                hkiy.d = hfvs0;
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

