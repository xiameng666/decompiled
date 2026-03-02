public final class gxst extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gxst a;
    public int b;
    public Object c;
    private static volatile Parser d;

    static {
        gxst gxst0 = new gxst();
        gxst.a = gxst0;
        ProtoLiteMessage.L(gxst.class, ((ProtoLiteMessage)gxst0));
    }

    private gxst() {
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
                    return new hfvw(((MessageLite)gxst.a), "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"c", "b", gxsy.class, gxtc.class, gxsn.class});
                }
                case 3: {
                    return new gxst();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gxst.a));
                }
                case 5: {
                    return gxst.a;
                }
                case 6: {
                    Object object1 = gxst.d;
                    if(object1 == null) {
                        Class class0 = gxst.class;
                        synchronized(class0) {
                            hfvs0 = gxst.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gxst.a));
                                gxst.d = hfvs0;
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

