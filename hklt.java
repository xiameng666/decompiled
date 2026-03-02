public final class hklt extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hklt a;
    public int b;
    public ByteString c;
    private static volatile Parser d;

    static {
        hklt hklt0 = new hklt();
        hklt.a = hklt0;
        ProtoLiteMessage.L(hklt.class, ((ProtoLiteMessage)hklt0));
    }

    private hklt() {
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
                    return new hfvw(((MessageLite)hklt.a), "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\n", new Object[]{"b", "c"});
                }
                case 3: {
                    return new hklt();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hklt.a));
                }
                case 5: {
                    return hklt.a;
                }
                case 6: {
                    Object object1 = hklt.d;
                    if(object1 == null) {
                        Class class0 = hklt.class;
                        synchronized(class0) {
                            hfvs0 = hklt.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hklt.a));
                                hklt.d = hfvs0;
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

