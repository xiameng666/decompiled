public final class gslm extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gslm a;
    public hfuo b;
    private static volatile Parser c;

    static {
        gslm gslm0 = new gslm();
        gslm.a = gslm0;
        ProtoLiteMessage.L(gslm.class, ((ProtoLiteMessage)gslm0));
    }

    private gslm() {
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
                    return new hfvw(((MessageLite)gslm.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", gslp.class});
                }
                case 3: {
                    return new gslm();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gslm.a));
                }
                case 5: {
                    return gslm.a;
                }
                case 6: {
                    Object object1 = gslm.c;
                    if(object1 == null) {
                        Class class0 = gslm.class;
                        synchronized(class0) {
                            hfvs0 = gslm.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gslm.a));
                                gslm.c = hfvs0;
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

