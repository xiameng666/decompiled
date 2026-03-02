public final class hltg extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hltg a;
    private static volatile Parser b;

    static {
        hltg hltg0 = new hltg();
        hltg.a = hltg0;
        ProtoLiteMessage.L(hltg.class, ((ProtoLiteMessage)hltg0));
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
                    return new hfvw(((MessageLite)hltg.a), "\u0001\u0000", null);
                }
                case 3: {
                    return new hltg();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hltg.a));
                }
                case 5: {
                    return hltg.a;
                }
                case 6: {
                    Object object1 = hltg.b;
                    if(object1 == null) {
                        Class class0 = hltg.class;
                        synchronized(class0) {
                            hfvs0 = hltg.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hltg.a));
                                hltg.b = hfvs0;
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

