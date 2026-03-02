public final class gzqu extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gzqu a;
    public hfuo b;
    private static volatile Parser c;

    static {
        gzqu gzqu0 = new gzqu();
        gzqu.a = gzqu0;
        ProtoLiteMessage.L(gzqu.class, ((ProtoLiteMessage)gzqu0));
    }

    private gzqu() {
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
                    return new hfvw(((MessageLite)gzqu.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", gzhi.class});
                }
                case 3: {
                    return new gzqu();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gzqu.a));
                }
                case 5: {
                    return gzqu.a;
                }
                case 6: {
                    Object object1 = gzqu.c;
                    if(object1 == null) {
                        Class class0 = gzqu.class;
                        synchronized(class0) {
                            hfvs0 = gzqu.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gzqu.a));
                                gzqu.c = hfvs0;
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

