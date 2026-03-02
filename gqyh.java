public final class gqyh extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gqyh a;
    private static volatile Parser b;

    static {
        gqyh gqyh0 = new gqyh();
        gqyh.a = gqyh0;
        ProtoLiteMessage.L(gqyh.class, ((ProtoLiteMessage)gqyh0));
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
                    return new hfvw(((MessageLite)gqyh.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gqyh();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gqyh.a));
                }
                case 5: {
                    return gqyh.a;
                }
                case 6: {
                    Object object1 = gqyh.b;
                    if(object1 == null) {
                        Class class0 = gqyh.class;
                        synchronized(class0) {
                            hfvs0 = gqyh.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gqyh.a));
                                gqyh.b = hfvs0;
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

