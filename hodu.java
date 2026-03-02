public final class hodu extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hodu a;
    public int b;
    public int c;
    private static volatile Parser d;

    static {
        hodu hodu0 = new hodu();
        hodu.a = hodu0;
        ProtoLiteMessage.L(hodu.class, ((ProtoLiteMessage)hodu0));
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
                    return new hfvw(((MessageLite)hodu.a), "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\f\u0003\f", new Object[]{"b", "c"});
                }
                case 3: {
                    return new hodu();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hodu.a));
                }
                case 5: {
                    return hodu.a;
                }
                case 6: {
                    Object object1 = hodu.d;
                    if(object1 == null) {
                        Class class0 = hodu.class;
                        synchronized(class0) {
                            hfvs0 = hodu.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hodu.a));
                                hodu.d = hfvs0;
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

