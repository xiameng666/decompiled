public final class hfkv extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hfkv a;
    public static final hfta b;
    private static volatile Parser c;

    static {
        hfkv hfkv0 = new hfkv();
        hfkv.a = hfkv0;
        ProtoLiteMessage.L(hfkv.class, ((ProtoLiteMessage)hfkv0));
        hfkv.b = ProtoLiteMessage.Q(((MessageLite)hfnh.a), hfkw.a, ((MessageLite)hfkw.a), 6, hfxe.k);
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
                    return new hfvw(((MessageLite)hfkv.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new hfkv();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hfkv.a));
                }
                case 5: {
                    return hfkv.a;
                }
                case 6: {
                    Object object1 = hfkv.c;
                    if(object1 == null) {
                        Class class0 = hfkv.class;
                        synchronized(class0) {
                            hfvs0 = hfkv.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hfkv.a));
                                hfkv.c = hfvs0;
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

