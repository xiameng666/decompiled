public final class gzcc extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gzcc a;
    public hfuo b;
    private static volatile Parser c;

    static {
        gzcc gzcc0 = new gzcc();
        gzcc.a = gzcc0;
        ProtoLiteMessage.L(gzcc.class, ((ProtoLiteMessage)gzcc0));
    }

    private gzcc() {
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
                    return new hfvw(((MessageLite)gzcc.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", gzcj.class});
                }
                case 3: {
                    return new gzcc();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gzcc.a));
                }
                case 5: {
                    return gzcc.a;
                }
                case 6: {
                    Object object1 = gzcc.c;
                    if(object1 == null) {
                        Class class0 = gzcc.class;
                        synchronized(class0) {
                            hfvs0 = gzcc.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gzcc.a));
                                gzcc.c = hfvs0;
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

