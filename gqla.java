public final class gqla extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gqla a;
    public hfuo b;
    private static volatile Parser c;

    static {
        gqla gqla0 = new gqla();
        gqla.a = gqla0;
        ProtoLiteMessage.L(gqla.class, ((ProtoLiteMessage)gqla0));
    }

    private gqla() {
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
                    return new hfvw(((MessageLite)gqla.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", gqlb.class});
                }
                case 3: {
                    return new gqla();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gqla.a));
                }
                case 5: {
                    return gqla.a;
                }
                case 6: {
                    Object object1 = gqla.c;
                    if(object1 == null) {
                        Class class0 = gqla.class;
                        synchronized(class0) {
                            hfvs0 = gqla.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gqla.a));
                                gqla.c = hfvs0;
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

