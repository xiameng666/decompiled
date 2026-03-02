public final class gzbo extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gzbo a;
    public hfuo b;
    private static volatile Parser c;

    static {
        gzbo gzbo0 = new gzbo();
        gzbo.a = gzbo0;
        ProtoLiteMessage.L(gzbo.class, ((ProtoLiteMessage)gzbo0));
    }

    private gzbo() {
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
                    return new hfvw(((MessageLite)gzbo.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", gzbn.class});
                }
                case 3: {
                    return new gzbo();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gzbo.a));
                }
                case 5: {
                    return gzbo.a;
                }
                case 6: {
                    Object object1 = gzbo.c;
                    if(object1 == null) {
                        Class class0 = gzbo.class;
                        synchronized(class0) {
                            hfvs0 = gzbo.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gzbo.a));
                                gzbo.c = hfvs0;
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

