public final class hkzs extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hkzs a;
    public ByteString b;
    private static volatile Parser c;

    static {
        hkzs hkzs0 = new hkzs();
        hkzs.a = hkzs0;
        ProtoLiteMessage.L(hkzs.class, ((ProtoLiteMessage)hkzs0));
    }

    private hkzs() {
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
                    return new hfvw(((MessageLite)hkzs.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"b"});
                }
                case 3: {
                    return new hkzs();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hkzs.a));
                }
                case 5: {
                    return hkzs.a;
                }
                case 6: {
                    Object object1 = hkzs.c;
                    if(object1 == null) {
                        Class class0 = hkzs.class;
                        synchronized(class0) {
                            hfvs0 = hkzs.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hkzs.a));
                                hkzs.c = hfvs0;
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

