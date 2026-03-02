public final class grdm extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final grdm a;
    public int b;
    public Object c;
    private static volatile Parser d;

    static {
        grdm grdm0 = new grdm();
        grdm.a = grdm0;
        ProtoLiteMessage.L(grdm.class, ((ProtoLiteMessage)grdm0));
    }

    private grdm() {
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
                    return new hfvw(((MessageLite)grdm.a), "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"c", "b", grdk.class, grdj.class, grdl.class});
                }
                case 3: {
                    return new grdm();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)grdm.a));
                }
                case 5: {
                    return grdm.a;
                }
                case 6: {
                    Object object1 = grdm.d;
                    if(object1 == null) {
                        Class class0 = grdm.class;
                        synchronized(class0) {
                            hfvs0 = grdm.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)grdm.a));
                                grdm.d = hfvs0;
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

