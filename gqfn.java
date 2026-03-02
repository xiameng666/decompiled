public final class gqfn extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gqfn a;
    public hfuo b;
    private static volatile Parser c;

    static {
        gqfn gqfn0 = new gqfn();
        gqfn.a = gqfn0;
        ProtoLiteMessage.L(gqfn.class, ((ProtoLiteMessage)gqfn0));
    }

    private gqfn() {
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
                    return new hfvw(((MessageLite)gqfn.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", gqfu.class});
                }
                case 3: {
                    return new gqfn();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gqfn.a));
                }
                case 5: {
                    return gqfn.a;
                }
                case 6: {
                    Object object1 = gqfn.c;
                    if(object1 == null) {
                        Class class0 = gqfn.class;
                        synchronized(class0) {
                            hfvs0 = gqfn.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gqfn.a));
                                gqfn.c = hfvs0;
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

