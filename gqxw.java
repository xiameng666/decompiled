public final class gqxw extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gqxw a;
    private static volatile Parser b;

    static {
        gqxw gqxw0 = new gqxw();
        gqxw.a = gqxw0;
        ProtoLiteMessage.L(gqxw.class, ((ProtoLiteMessage)gqxw0));
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
                    return new hfvw(((MessageLite)gqxw.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gqxw();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gqxw.a));
                }
                case 5: {
                    return gqxw.a;
                }
                case 6: {
                    Object object1 = gqxw.b;
                    if(object1 == null) {
                        Class class0 = gqxw.class;
                        synchronized(class0) {
                            hfvs0 = gqxw.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gqxw.a));
                                gqxw.b = hfvs0;
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

