public final class gzji extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gzji a;
    public hfuf b;
    private static volatile Parser c;

    static {
        gzji gzji0 = new gzji();
        gzji.a = gzji0;
        ProtoLiteMessage.L(gzji.class, ((ProtoLiteMessage)gzji0));
    }

    private gzji() {
        this.b = hfty.a;
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
                    return new hfvw(((MessageLite)gzji.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\'", new Object[]{"b"});
                }
                case 3: {
                    return new gzji();
                }
                case 4: {
                    return new gzjh();
                }
                case 5: {
                    return gzji.a;
                }
                case 6: {
                    Object object1 = gzji.c;
                    if(object1 == null) {
                        Class class0 = gzji.class;
                        synchronized(class0) {
                            hfvs0 = gzji.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gzji.a));
                                gzji.c = hfvs0;
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

