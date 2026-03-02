public final class hkky extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hkky a;
    public int b;
    public Object c;
    private static volatile Parser d;

    static {
        hkky hkky0 = new hkky();
        hkky.a = hkky0;
        ProtoLiteMessage.L(hkky.class, ((ProtoLiteMessage)hkky0));
    }

    private hkky() {
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
                    return new hfvw(((MessageLite)hkky.a), "\u0004\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"c", "b", hkkx.class});
                }
                case 3: {
                    return new hkky();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hkky.a));
                }
                case 5: {
                    return hkky.a;
                }
                case 6: {
                    Object object1 = hkky.d;
                    if(object1 == null) {
                        Class class0 = hkky.class;
                        synchronized(class0) {
                            hfvs0 = hkky.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hkky.a));
                                hkky.d = hfvs0;
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

