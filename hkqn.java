public final class hkqn extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hkqn a;
    public int b;
    public Object c;
    private static volatile Parser d;

    static {
        hkqn hkqn0 = new hkqn();
        hkqn.a = hkqn0;
        ProtoLiteMessage.L(hkqn.class, ((ProtoLiteMessage)hkqn0));
    }

    private hkqn() {
        this.b = 0;
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
                    return new hfvw(((MessageLite)hkqn.a), "\u0004\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"c", "b", hksz.class, hkql.class, hkqj.class, hkqg.class});
                }
                case 3: {
                    return new hkqn();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hkqn.a));
                }
                case 5: {
                    return hkqn.a;
                }
                case 6: {
                    Object object1 = hkqn.d;
                    if(object1 == null) {
                        Class class0 = hkqn.class;
                        synchronized(class0) {
                            hfvs0 = hkqn.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hkqn.a));
                                hkqn.d = hfvs0;
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

