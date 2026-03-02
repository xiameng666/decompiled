public final class gsnj extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gsnj a;
    public hfuo b;
    private static volatile Parser c;

    static {
        gsnj gsnj0 = new gsnj();
        gsnj.a = gsnj0;
        ProtoLiteMessage.L(gsnj.class, ((ProtoLiteMessage)gsnj0));
    }

    private gsnj() {
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
                    return new hfvw(((MessageLite)gsnj.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", gsnn.class});
                }
                case 3: {
                    return new gsnj();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gsnj.a));
                }
                case 5: {
                    return gsnj.a;
                }
                case 6: {
                    Object object1 = gsnj.c;
                    if(object1 == null) {
                        Class class0 = gsnj.class;
                        synchronized(class0) {
                            hfvs0 = gsnj.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gsnj.a));
                                gsnj.c = hfvs0;
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

