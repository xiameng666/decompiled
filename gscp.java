public final class gscp extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gscp a;
    public int b;
    private static volatile Parser c;

    static {
        gscp gscp0 = new gscp();
        gscp.a = gscp0;
        ProtoLiteMessage.L(gscp.class, ((ProtoLiteMessage)gscp0));
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
                    return new hfvw(((MessageLite)gscp.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"b"});
                }
                case 3: {
                    return new gscp();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gscp.a));
                }
                case 5: {
                    return gscp.a;
                }
                case 6: {
                    Object object1 = gscp.c;
                    if(object1 == null) {
                        Class class0 = gscp.class;
                        synchronized(class0) {
                            hfvs0 = gscp.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gscp.a));
                                gscp.c = hfvs0;
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

