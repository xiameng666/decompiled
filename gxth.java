public final class gxth extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gxth a;
    public int b;
    public Object c;
    private static volatile Parser d;

    static {
        gxth gxth0 = new gxth();
        gxth.a = gxth0;
        ProtoLiteMessage.L(gxth.class, ((ProtoLiteMessage)gxth0));
    }

    private gxth() {
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
                    return new hfvw(((MessageLite)gxth.a), "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"c", "b", gxta.class, gxte.class, gxso.class, gxsl.class, gxtq.class});
                }
                case 3: {
                    return new gxth();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gxth.a));
                }
                case 5: {
                    return gxth.a;
                }
                case 6: {
                    Object object1 = gxth.d;
                    if(object1 == null) {
                        Class class0 = gxth.class;
                        synchronized(class0) {
                            hfvs0 = gxth.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gxth.a));
                                gxth.d = hfvs0;
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

