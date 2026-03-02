public final class gstx extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gstx a;
    public int b;
    public int c;
    private static volatile Parser d;

    static {
        gstx gstx0 = new gstx();
        gstx.a = gstx0;
        ProtoLiteMessage.L(gstx.class, ((ProtoLiteMessage)gstx0));
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
                    return new hfvw(((MessageLite)gstx.a), "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"b", "c"});
                }
                case 3: {
                    return new gstx();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gstx.a));
                }
                case 5: {
                    return gstx.a;
                }
                case 6: {
                    Object object1 = gstx.d;
                    if(object1 == null) {
                        Class class0 = gstx.class;
                        synchronized(class0) {
                            hfvs0 = gstx.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gstx.a));
                                gstx.d = hfvs0;
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

