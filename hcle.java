public final class hcle extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hcle a;
    public static final hfta b;
    private static volatile Parser c;

    static {
        hcle hcle0 = new hcle();
        hcle.a = hcle0;
        ProtoLiteMessage.L(hcle.class, ((ProtoLiteMessage)hcle0));
        hcle.b = ProtoLiteMessage.Q(((MessageLite)hcnu.a), hcle0, ((MessageLite)hcle0), 0xF8297C8, hfxe.k);
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
                    return new hfvw(((MessageLite)hcle.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new hcle();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hcle.a));
                }
                case 5: {
                    return hcle.a;
                }
                case 6: {
                    Object object1 = hcle.c;
                    if(object1 == null) {
                        Class class0 = hcle.class;
                        synchronized(class0) {
                            hfvs0 = hcle.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hcle.a));
                                hcle.c = hfvs0;
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

