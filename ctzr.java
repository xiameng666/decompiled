public final class ctzr extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final ctzr a;
    private static volatile Parser b;

    static {
        ctzr ctzr0 = new ctzr();
        ctzr.a = ctzr0;
        ProtoLiteMessage.L(ctzr.class, ((ProtoLiteMessage)ctzr0));
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
                    return new hfvw(((MessageLite)ctzr.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new ctzr();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)ctzr.a));
                }
                case 5: {
                    return ctzr.a;
                }
                case 6: {
                    Object object1 = ctzr.b;
                    if(object1 == null) {
                        Class class0 = ctzr.class;
                        synchronized(class0) {
                            hfvs0 = ctzr.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)ctzr.a));
                                ctzr.b = hfvs0;
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

