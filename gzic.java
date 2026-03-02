public final class gzic extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gzic a;
    public hfuo b;
    private static volatile Parser c;

    static {
        gzic gzic0 = new gzic();
        gzic.a = gzic0;
        ProtoLiteMessage.L(gzic.class, ((ProtoLiteMessage)gzic0));
    }

    private gzic() {
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
                    return new hfvw(((MessageLite)gzic.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", gzib.class});
                }
                case 3: {
                    return new gzic();
                }
                case 4: {
                    return new gzia();
                }
                case 5: {
                    return gzic.a;
                }
                case 6: {
                    Object object1 = gzic.c;
                    if(object1 == null) {
                        Class class0 = gzic.class;
                        synchronized(class0) {
                            hfvs0 = gzic.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gzic.a));
                                gzic.c = hfvs0;
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

