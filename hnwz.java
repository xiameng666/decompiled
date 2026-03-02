public final class hnwz extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hnwz a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    private static volatile Parser h;

    static {
        hnwz hnwz0 = new hnwz();
        hnwz.a = hnwz0;
        ProtoLiteMessage.L(hnwz.class, ((ProtoLiteMessage)hnwz0));
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
                    return new hfvw(((MessageLite)hnwz.a), "\u0000\u0006\u0000\u0000\u0003\t\u0006\u0000\u0000\u0000\u0003\u0004\u0004\u0004\u0005\u0004\u0007\f\b\f\t\f", new Object[]{"b", "c", "d", "e", "f", "g"});
                }
                case 3: {
                    return new hnwz();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hnwz.a));
                }
                case 5: {
                    return hnwz.a;
                }
                case 6: {
                    Object object1 = hnwz.h;
                    if(object1 == null) {
                        Class class0 = hnwz.class;
                        synchronized(class0) {
                            hfvs0 = hnwz.h;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hnwz.a));
                                hnwz.h = hfvs0;
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

