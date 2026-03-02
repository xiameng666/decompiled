public final class hodg extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hodg a;
    public int b;
    private static volatile Parser c;

    static {
        hodg hodg0 = new hodg();
        hodg.a = hodg0;
        ProtoLiteMessage.L(hodg.class, ((ProtoLiteMessage)hodg0));
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
                    return new hfvw(((MessageLite)hodg.a), "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\f", new Object[]{"b"});
                }
                case 3: {
                    return new hodg();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hodg.a));
                }
                case 5: {
                    return hodg.a;
                }
                case 6: {
                    Object object1 = hodg.c;
                    if(object1 == null) {
                        Class class0 = hodg.class;
                        synchronized(class0) {
                            hfvs0 = hodg.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hodg.a));
                                hodg.c = hfvs0;
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

