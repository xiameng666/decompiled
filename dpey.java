public final class dpey extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final dpey a;
    public boolean b;
    private static volatile Parser c;

    static {
        dpey dpey0 = new dpey();
        dpey.a = dpey0;
        ProtoLiteMessage.L(dpey.class, ((ProtoLiteMessage)dpey0));
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
                    return new hfvw(((MessageLite)dpey.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"b"});
                }
                case 3: {
                    return new dpey();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)dpey.a));
                }
                case 5: {
                    return dpey.a;
                }
                case 6: {
                    Object object1 = dpey.c;
                    if(object1 == null) {
                        Class class0 = dpey.class;
                        synchronized(class0) {
                            hfvs0 = dpey.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)dpey.a));
                                dpey.c = hfvs0;
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

