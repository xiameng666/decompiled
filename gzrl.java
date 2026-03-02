public final class gzrl extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gzrl a;
    public hfvh b;
    private static volatile Parser c;

    static {
        gzrl gzrl0 = new gzrl();
        gzrl.a = gzrl0;
        ProtoLiteMessage.L(gzrl.class, ((ProtoLiteMessage)gzrl0));
    }

    private gzrl() {
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
                    return new hfvw(((MessageLite)gzrl.a), "\u0004\u0001\u0000\u0000\u0003\u0003\u0001\u0001\u0000\u0000\u00032", new Object[]{"b", gzrk.a});
                }
                case 3: {
                    return new gzrl();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gzrl.a));
                }
                case 5: {
                    return gzrl.a;
                }
                case 6: {
                    Object object1 = gzrl.c;
                    if(object1 == null) {
                        Class class0 = gzrl.class;
                        synchronized(class0) {
                            hfvs0 = gzrl.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gzrl.a));
                                gzrl.c = hfvs0;
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

