public final class hder extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hder a;
    public static final hfta b;
    private static volatile Parser c;

    static {
        hder hder0 = new hder();
        hder.a = hder0;
        ProtoLiteMessage.L(hder.class, ((ProtoLiteMessage)hder0));
        hder.b = ProtoLiteMessage.Q(((MessageLite)hcnu.a), hder0, ((MessageLite)hder0), 0xFA16463, hfxe.k);
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
                    return new hfvw(((MessageLite)hder.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new hder();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hder.a));
                }
                case 5: {
                    return hder.a;
                }
                case 6: {
                    Object object1 = hder.c;
                    if(object1 == null) {
                        Class class0 = hder.class;
                        synchronized(class0) {
                            hfvs0 = hder.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hder.a));
                                hder.c = hfvs0;
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

