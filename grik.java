public final class grik extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final grik a;
    public hfuo b;
    private static volatile Parser c;

    static {
        grik grik0 = new grik();
        grik.a = grik0;
        ProtoLiteMessage.L(grik.class, ((ProtoLiteMessage)grik0));
    }

    private grik() {
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
                    return new hfvw(((MessageLite)grik.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", grij.class});
                }
                case 3: {
                    return new grik();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)grik.a));
                }
                case 5: {
                    return grik.a;
                }
                case 6: {
                    Object object1 = grik.c;
                    if(object1 == null) {
                        Class class0 = grik.class;
                        synchronized(class0) {
                            hfvs0 = grik.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)grik.a));
                                grik.c = hfvs0;
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

