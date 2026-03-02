public final class gzhn extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gzhn a;
    public hfuo b;
    private static volatile Parser c;

    static {
        gzhn gzhn0 = new gzhn();
        gzhn.a = gzhn0;
        ProtoLiteMessage.L(gzhn.class, ((ProtoLiteMessage)gzhn0));
    }

    private gzhn() {
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
                    return new hfvw(((MessageLite)gzhn.a), "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001B", new Object[]{"b", gzkg.class});
                }
                case 3: {
                    return new gzhn();
                }
                case 4: {
                    return new gzhm();
                }
                case 5: {
                    return gzhn.a;
                }
                case 6: {
                    Object object1 = gzhn.c;
                    if(object1 == null) {
                        Class class0 = gzhn.class;
                        synchronized(class0) {
                            hfvs0 = gzhn.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gzhn.a));
                                gzhn.c = hfvs0;
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

