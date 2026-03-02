public final class gqvz extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gqvz a;
    public hfuo b;
    public hfuo c;
    private static volatile Parser d;

    static {
        gqvz gqvz0 = new gqvz();
        gqvz.a = gqvz0;
        ProtoLiteMessage.L(gqvz.class, ((ProtoLiteMessage)gqvz0));
    }

    private gqvz() {
        this.b = hfvv.a;
        this.c = hfvv.a;
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
                    return new hfvw(((MessageLite)gqvz.a), "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001B\u0002\u001B", new Object[]{"b", gqwl.class, "c", gqwk.class});
                }
                case 3: {
                    return new gqvz();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gqvz.a));
                }
                case 5: {
                    return gqvz.a;
                }
                case 6: {
                    Object object1 = gqvz.d;
                    if(object1 == null) {
                        Class class0 = gqvz.class;
                        synchronized(class0) {
                            hfvs0 = gqvz.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gqvz.a));
                                gqvz.d = hfvs0;
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

