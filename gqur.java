public final class gqur extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gqur a;
    public hfvh b;
    private static volatile Parser c;

    static {
        gqur gqur0 = new gqur();
        gqur.a = gqur0;
        ProtoLiteMessage.L(gqur.class, ((ProtoLiteMessage)gqur0));
    }

    private gqur() {
        this.b = hfvh.a;
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
                    return new hfvw(((MessageLite)gqur.a), "\u0004\u0001\u0000\u0000\u0003\u0003\u0001\u0001\u0000\u0000\u00032", new Object[]{"b", gquq.a});
                }
                case 3: {
                    return new gqur();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gqur.a));
                }
                case 5: {
                    return gqur.a;
                }
                case 6: {
                    Object object1 = gqur.c;
                    if(object1 == null) {
                        Class class0 = gqur.class;
                        synchronized(class0) {
                            hfvs0 = gqur.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gqur.a));
                                gqur.c = hfvs0;
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

