public final class gsyk extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gsyk a;
    public boolean b;
    private static volatile Parser c;

    static {
        gsyk gsyk0 = new gsyk();
        gsyk.a = gsyk0;
        ProtoLiteMessage.L(gsyk.class, ((ProtoLiteMessage)gsyk0));
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
                    return new hfvw(((MessageLite)gsyk.a), "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u0007", new Object[]{"b"});
                }
                case 3: {
                    return new gsyk();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gsyk.a));
                }
                case 5: {
                    return gsyk.a;
                }
                case 6: {
                    Object object1 = gsyk.c;
                    if(object1 == null) {
                        Class class0 = gsyk.class;
                        synchronized(class0) {
                            hfvs0 = gsyk.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gsyk.a));
                                gsyk.c = hfvs0;
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

