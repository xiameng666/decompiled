public final class gkhc extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gkhc a;
    private static volatile Parser b;

    static {
        gkhc gkhc0 = new gkhc();
        gkhc.a = gkhc0;
        ProtoLiteMessage.L(gkhc.class, ((ProtoLiteMessage)gkhc0));
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
                    return new hfvw(((MessageLite)gkhc.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gkhc();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gkhc.a));
                }
                case 5: {
                    return gkhc.a;
                }
                case 6: {
                    Object object1 = gkhc.b;
                    if(object1 == null) {
                        Class class0 = gkhc.class;
                        synchronized(class0) {
                            hfvs0 = gkhc.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gkhc.a));
                                gkhc.b = hfvs0;
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

