public final class gssh extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gssh a;
    public int b;
    private static volatile Parser c;

    static {
        gssh gssh0 = new gssh();
        gssh.a = gssh0;
        ProtoLiteMessage.L(gssh.class, ((ProtoLiteMessage)gssh0));
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
                    return new hfvw(((MessageLite)gssh.a), "\u0004\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0000\u0000\u0003\f", new Object[]{"b"});
                }
                case 3: {
                    return new gssh();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gssh.a));
                }
                case 5: {
                    return gssh.a;
                }
                case 6: {
                    Object object1 = gssh.c;
                    if(object1 == null) {
                        Class class0 = gssh.class;
                        synchronized(class0) {
                            hfvs0 = gssh.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gssh.a));
                                gssh.c = hfvs0;
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

