public final class hkrd extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hkrd a;
    public ByteString b;
    private static volatile Parser c;

    static {
        hkrd hkrd0 = new hkrd();
        hkrd.a = hkrd0;
        ProtoLiteMessage.L(hkrd.class, ((ProtoLiteMessage)hkrd0));
    }

    private hkrd() {
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
                    return new hfvw(((MessageLite)hkrd.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"b"});
                }
                case 3: {
                    return new hkrd();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hkrd.a));
                }
                case 5: {
                    return hkrd.a;
                }
                case 6: {
                    Object object1 = hkrd.c;
                    if(object1 == null) {
                        Class class0 = hkrd.class;
                        synchronized(class0) {
                            hfvs0 = hkrd.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hkrd.a));
                                hkrd.c = hfvs0;
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

