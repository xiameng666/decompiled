public final class greb extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final greb a;
    public hfuo b;
    private static volatile Parser c;

    static {
        greb greb0 = new greb();
        greb.a = greb0;
        ProtoLiteMessage.L(greb.class, ((ProtoLiteMessage)greb0));
    }

    private greb() {
        this.b = hfvv.a;
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
                    return new hfvw(((MessageLite)greb.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", grfw.class});
                }
                case 3: {
                    return new greb();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)greb.a));
                }
                case 5: {
                    return greb.a;
                }
                case 6: {
                    Object object1 = greb.c;
                    if(object1 == null) {
                        Class class0 = greb.class;
                        synchronized(class0) {
                            hfvs0 = greb.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)greb.a));
                                greb.c = hfvs0;
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

