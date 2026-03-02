public final class hkik extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hkik a;
    public int b;
    public ByteString c;
    private static volatile Parser d;

    static {
        hkik hkik0 = new hkik();
        hkik.a = hkik0;
        ProtoLiteMessage.L(hkik.class, ((ProtoLiteMessage)hkik0));
    }

    private hkik() {
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
                    return new hfvw(((MessageLite)hkik.a), "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\n", new Object[]{"b", "c"});
                }
                case 3: {
                    return new hkik();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hkik.a));
                }
                case 5: {
                    return hkik.a;
                }
                case 6: {
                    Object object1 = hkik.d;
                    if(object1 == null) {
                        Class class0 = hkik.class;
                        synchronized(class0) {
                            hfvs0 = hkik.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hkik.a));
                                hkik.d = hfvs0;
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

