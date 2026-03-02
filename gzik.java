public final class gzik extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gzik a;
    public hfuo b;
    private static volatile Parser c;

    static {
        gzik gzik0 = new gzik();
        gzik.a = gzik0;
        ProtoLiteMessage.L(gzik.class, ((ProtoLiteMessage)gzik0));
    }

    private gzik() {
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
                    return new hfvw(((MessageLite)gzik.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", gzij.class});
                }
                case 3: {
                    return new gzik();
                }
                case 4: {
                    return new gzig();
                }
                case 5: {
                    return gzik.a;
                }
                case 6: {
                    Object object1 = gzik.c;
                    if(object1 == null) {
                        Class class0 = gzik.class;
                        synchronized(class0) {
                            hfvs0 = gzik.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gzik.a));
                                gzik.c = hfvs0;
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

