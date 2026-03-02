public final class hoex extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hoex a;
    public int b;
    private static volatile Parser c;

    static {
        hoex hoex0 = new hoex();
        hoex.a = hoex0;
        ProtoLiteMessage.L(hoex.class, ((ProtoLiteMessage)hoex0));
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
                    return new hfvw(((MessageLite)hoex.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"b"});
                }
                case 3: {
                    return new hoex();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hoex.a));
                }
                case 5: {
                    return hoex.a;
                }
                case 6: {
                    Object object1 = hoex.c;
                    if(object1 == null) {
                        Class class0 = hoex.class;
                        synchronized(class0) {
                            hfvs0 = hoex.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hoex.a));
                                hoex.c = hfvs0;
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

