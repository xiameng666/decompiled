public final class gzip extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gzip a;
    public hfuo b;
    private static volatile Parser c;

    static {
        gzip gzip0 = new gzip();
        gzip.a = gzip0;
        ProtoLiteMessage.L(gzip.class, ((ProtoLiteMessage)gzip0));
    }

    private gzip() {
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
                    return new hfvw(((MessageLite)gzip.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", gzio.class});
                }
                case 3: {
                    return new gzip();
                }
                case 4: {
                    return new gzil();
                }
                case 5: {
                    return gzip.a;
                }
                case 6: {
                    Object object1 = gzip.c;
                    if(object1 == null) {
                        Class class0 = gzip.class;
                        synchronized(class0) {
                            hfvs0 = gzip.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gzip.a));
                                gzip.c = hfvs0;
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

