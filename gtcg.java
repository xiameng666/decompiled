public final class gtcg extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gtcg a;
    private static volatile Parser b;

    static {
        gtcg gtcg0 = new gtcg();
        gtcg.a = gtcg0;
        ProtoLiteMessage.L(gtcg.class, ((ProtoLiteMessage)gtcg0));
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
                    return new hfvw(((MessageLite)gtcg.a), "\u0000\u0000", null);
                }
                case 3: {
                    return new gtcg();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gtcg.a));
                }
                case 5: {
                    return gtcg.a;
                }
                case 6: {
                    Object object1 = gtcg.b;
                    if(object1 == null) {
                        Class class0 = gtcg.class;
                        synchronized(class0) {
                            hfvs0 = gtcg.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gtcg.a));
                                gtcg.b = hfvs0;
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

