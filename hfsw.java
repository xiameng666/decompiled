public final class hfsw extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hfsw a;
    private static volatile Parser b;

    static {
        hfsw hfsw0 = new hfsw();
        hfsw.a = hfsw0;
        ProtoLiteMessage.L(hfsw.class, ((ProtoLiteMessage)hfsw0));
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
                    return new hfvw(((MessageLite)hfsw.a), "\u0000\u0000", null);
                }
                case 3: {
                    return new hfsw();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hfsw.a));
                }
                case 5: {
                    return hfsw.a;
                }
                case 6: {
                    Object object1 = hfsw.b;
                    if(object1 == null) {
                        Class class0 = hfsw.class;
                        synchronized(class0) {
                            hfvs0 = hfsw.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hfsw.a));
                                hfsw.b = hfvs0;
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

