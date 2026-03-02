public final class hltd extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hltd a;
    private static volatile Parser b;

    static {
        hltd hltd0 = new hltd();
        hltd.a = hltd0;
        ProtoLiteMessage.L(hltd.class, ((ProtoLiteMessage)hltd0));
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
                    return new hfvw(((MessageLite)hltd.a), "\u0001\u0000", null);
                }
                case 3: {
                    return new hltd();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hltd.a));
                }
                case 5: {
                    return hltd.a;
                }
                case 6: {
                    Object object1 = hltd.b;
                    if(object1 == null) {
                        Class class0 = hltd.class;
                        synchronized(class0) {
                            hfvs0 = hltd.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hltd.a));
                                hltd.b = hfvs0;
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

