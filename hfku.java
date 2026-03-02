public final class hfku extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hfku a;
    public static final hfta b;
    private static volatile Parser c;

    static {
        hfku hfku0 = new hfku();
        hfku.a = hfku0;
        ProtoLiteMessage.L(hfku.class, ((ProtoLiteMessage)hfku0));
        hfku.b = ProtoLiteMessage.Q(((MessageLite)hfnh.a), hfky.a, ((MessageLite)hfky.a), 7, hfxe.k);
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
                    return new hfvw(((MessageLite)hfku.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new hfku();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hfku.a));
                }
                case 5: {
                    return hfku.a;
                }
                case 6: {
                    Object object1 = hfku.c;
                    if(object1 == null) {
                        Class class0 = hfku.class;
                        synchronized(class0) {
                            hfvs0 = hfku.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hfku.a));
                                hfku.c = hfvs0;
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

