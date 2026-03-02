public final class gstr extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gstr a;
    public boolean b;
    private static volatile Parser c;
    private boolean d;

    static {
        gstr gstr0 = new gstr();
        gstr.a = gstr0;
        ProtoLiteMessage.L(gstr.class, ((ProtoLiteMessage)gstr0));
    }

    public static void b(gstr gstr0) {
        gstr0.d = true;
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
                    return new hfvw(((MessageLite)gstr.a), "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"b", "d"});
                }
                case 3: {
                    return new gstr();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gstr.a));
                }
                case 5: {
                    return gstr.a;
                }
                case 6: {
                    Object object1 = gstr.c;
                    if(object1 == null) {
                        Class class0 = gstr.class;
                        synchronized(class0) {
                            hfvs0 = gstr.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gstr.a));
                                gstr.c = hfvs0;
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

