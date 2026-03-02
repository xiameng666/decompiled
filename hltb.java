public final class hltb extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hltb a;
    private static volatile Parser b;

    static {
        hltb hltb0 = new hltb();
        hltb.a = hltb0;
        ProtoLiteMessage.L(hltb.class, ((ProtoLiteMessage)hltb0));
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
                    return new hfvw(((MessageLite)hltb.a), "\u0001\u0000", null);
                }
                case 3: {
                    return new hltb();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hltb.a));
                }
                case 5: {
                    return hltb.a;
                }
                case 6: {
                    Object object1 = hltb.b;
                    if(object1 == null) {
                        Class class0 = hltb.class;
                        synchronized(class0) {
                            hfvs0 = hltb.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hltb.a));
                                hltb.b = hfvs0;
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

