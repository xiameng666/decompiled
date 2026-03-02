public final class gzbm extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gzbm a;
    public hfuo b;
    private static volatile Parser c;

    static {
        gzbm gzbm0 = new gzbm();
        gzbm.a = gzbm0;
        ProtoLiteMessage.L(gzbm.class, ((ProtoLiteMessage)gzbm0));
    }

    private gzbm() {
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
                    return new hfvw(((MessageLite)gzbm.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", gzbl.class});
                }
                case 3: {
                    return new gzbm();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gzbm.a));
                }
                case 5: {
                    return gzbm.a;
                }
                case 6: {
                    Object object1 = gzbm.c;
                    if(object1 == null) {
                        Class class0 = gzbm.class;
                        synchronized(class0) {
                            hfvs0 = gzbm.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gzbm.a));
                                gzbm.c = hfvs0;
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

