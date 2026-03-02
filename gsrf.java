public final class gsrf extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gsrf a;
    private static volatile Parser b;

    static {
        gsrf gsrf0 = new gsrf();
        gsrf.a = gsrf0;
        ProtoLiteMessage.L(gsrf.class, ((ProtoLiteMessage)gsrf0));
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
                    return new hfvw(((MessageLite)gsrf.a), "\u0001\u0000", null);
                }
                case 3: {
                    return new gsrf();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gsrf.a));
                }
                case 5: {
                    return gsrf.a;
                }
                case 6: {
                    Object object1 = gsrf.b;
                    if(object1 == null) {
                        Class class0 = gsrf.class;
                        synchronized(class0) {
                            hfvs0 = gsrf.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gsrf.a));
                                gsrf.b = hfvs0;
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

