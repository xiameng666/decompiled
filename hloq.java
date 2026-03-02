public final class hloq extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hloq a;
    public static final hfta b;
    private static volatile Parser c;

    static {
        hloq hloq0 = new hloq();
        hloq.a = hloq0;
        ProtoLiteMessage.L(hloq.class, ((ProtoLiteMessage)hloq0));
        hloq.b = ProtoLiteMessage.Q(((MessageLite)hlph.a), gijq.a, ((MessageLite)gijq.a), 21, hfxe.k);
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
                    return new hfvw(((MessageLite)hloq.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new hloq();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hloq.a));
                }
                case 5: {
                    return hloq.a;
                }
                case 6: {
                    Object object1 = hloq.c;
                    if(object1 == null) {
                        Class class0 = hloq.class;
                        synchronized(class0) {
                            hfvs0 = hloq.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hloq.a));
                                hloq.c = hfvs0;
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

