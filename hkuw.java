public final class hkuw extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hkuw a;
    public int b;
    public Object c;
    private static volatile Parser d;

    static {
        hkuw hkuw0 = new hkuw();
        hkuw.a = hkuw0;
        ProtoLiteMessage.L(hkuw.class, ((ProtoLiteMessage)hkuw0));
    }

    private hkuw() {
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
                    return new hfvw(((MessageLite)hkuw.a), "\u0004\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"c", "b", hkuo.class});
                }
                case 3: {
                    return new hkuw();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hkuw.a));
                }
                case 5: {
                    return hkuw.a;
                }
                case 6: {
                    Object object1 = hkuw.d;
                    if(object1 == null) {
                        Class class0 = hkuw.class;
                        synchronized(class0) {
                            hfvs0 = hkuw.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hkuw.a));
                                hkuw.d = hfvs0;
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

