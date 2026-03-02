public final class hkfd extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hkfd a;
    public ByteString b;
    public ByteString c;
    private static volatile Parser d;

    static {
        hkfd hkfd0 = new hkfd();
        hkfd.a = hkfd0;
        ProtoLiteMessage.L(hkfd.class, ((ProtoLiteMessage)hkfd0));
    }

    private hkfd() {
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
                    return new hfvw(((MessageLite)hkfd.a), "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\n", new Object[]{"b", "c"});
                }
                case 3: {
                    return new hkfd();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hkfd.a));
                }
                case 5: {
                    return hkfd.a;
                }
                case 6: {
                    Object object1 = hkfd.d;
                    if(object1 == null) {
                        Class class0 = hkfd.class;
                        synchronized(class0) {
                            hfvs0 = hkfd.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hkfd.a));
                                hkfd.d = hfvs0;
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

