public final class hltc extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hltc a;
    private static volatile Parser b;

    static {
        hltc hltc0 = new hltc();
        hltc.a = hltc0;
        ProtoLiteMessage.L(hltc.class, ((ProtoLiteMessage)hltc0));
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
                    return new hfvw(((MessageLite)hltc.a), "\u0001\u0000", null);
                }
                case 3: {
                    return new hltc();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hltc.a));
                }
                case 5: {
                    return hltc.a;
                }
                case 6: {
                    Object object1 = hltc.b;
                    if(object1 == null) {
                        Class class0 = hltc.class;
                        synchronized(class0) {
                            hfvs0 = hltc.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hltc.a));
                                hltc.b = hfvs0;
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

