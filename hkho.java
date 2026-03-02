public final class hkho extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hkho a;
    public int b;
    public Object c;
    private static volatile Parser d;

    static {
        hkho hkho0 = new hkho();
        hkho.a = hkho0;
        ProtoLiteMessage.L(hkho.class, ((ProtoLiteMessage)hkho0));
    }

    private hkho() {
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
                    return new hfvw(((MessageLite)hkho.a), "\u0004\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"c", "b", hkhn.class});
                }
                case 3: {
                    return new hkho();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hkho.a));
                }
                case 5: {
                    return hkho.a;
                }
                case 6: {
                    Object object1 = hkho.d;
                    if(object1 == null) {
                        Class class0 = hkho.class;
                        synchronized(class0) {
                            hfvs0 = hkho.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hkho.a));
                                hkho.d = hfvs0;
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

