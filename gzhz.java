public final class gzhz extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gzhz a;
    public hfuo b;
    private static volatile Parser c;

    static {
        gzhz gzhz0 = new gzhz();
        gzhz.a = gzhz0;
        ProtoLiteMessage.L(gzhz.class, ((ProtoLiteMessage)gzhz0));
    }

    private gzhz() {
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
                    return new hfvw(((MessageLite)gzhz.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", gzhy.class});
                }
                case 3: {
                    return new gzhz();
                }
                case 4: {
                    return new gzhx();
                }
                case 5: {
                    return gzhz.a;
                }
                case 6: {
                    Object object1 = gzhz.c;
                    if(object1 == null) {
                        Class class0 = gzhz.class;
                        synchronized(class0) {
                            hfvs0 = gzhz.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gzhz.a));
                                gzhz.c = hfvs0;
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

