public final class gxys extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gxys a;
    public int b;
    public Object c;
    private static volatile Parser d;

    static {
        gxys gxys0 = new gxys();
        gxys.a = gxys0;
        ProtoLiteMessage.L(gxys.class, ((ProtoLiteMessage)gxys0));
    }

    private gxys() {
        this.b = 0;
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
                    return new hfvw(((MessageLite)gxys.a), "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"c", "b", gxyv.class});
                }
                case 3: {
                    return new gxys();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gxys.a));
                }
                case 5: {
                    return gxys.a;
                }
                case 6: {
                    Object object1 = gxys.d;
                    if(object1 == null) {
                        Class class0 = gxys.class;
                        synchronized(class0) {
                            hfvs0 = gxys.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gxys.a));
                                gxys.d = hfvs0;
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

