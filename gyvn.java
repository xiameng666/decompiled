public final class gyvn extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gyvn a;
    public hfuo b;
    private static volatile Parser c;

    static {
        gyvn gyvn0 = new gyvn();
        gyvn.a = gyvn0;
        ProtoLiteMessage.L(gyvn.class, ((ProtoLiteMessage)gyvn0));
    }

    private gyvn() {
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
                    return new hfvw(((MessageLite)gyvn.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", gyvz.class});
                }
                case 3: {
                    return new gyvn();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gyvn.a));
                }
                case 5: {
                    return gyvn.a;
                }
                case 6: {
                    Object object1 = gyvn.c;
                    if(object1 == null) {
                        Class class0 = gyvn.class;
                        synchronized(class0) {
                            hfvs0 = gyvn.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gyvn.a));
                                gyvn.c = hfvs0;
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

