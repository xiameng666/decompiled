public final class hcsj extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hcsj a;
    public static final hfta b;
    private static volatile Parser c;

    static {
        hcsj hcsj0 = new hcsj();
        hcsj.a = hcsj0;
        ProtoLiteMessage.L(hcsj.class, ((ProtoLiteMessage)hcsj0));
        hcsj.b = ProtoLiteMessage.Q(((MessageLite)hcsi.a), hcsj0, ((MessageLite)hcsj0), 0xDCF6F9C, hfxe.k);
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
                    return new hfvw(((MessageLite)hcsj.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new hcsj();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hcsj.a));
                }
                case 5: {
                    return hcsj.a;
                }
                case 6: {
                    Object object1 = hcsj.c;
                    if(object1 == null) {
                        Class class0 = hcsj.class;
                        synchronized(class0) {
                            hfvs0 = hcsj.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hcsj.a));
                                hcsj.c = hfvs0;
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

