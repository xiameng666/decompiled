public final class gzht extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gzht a;
    public hfuo b;
    private static volatile Parser c;

    static {
        gzht gzht0 = new gzht();
        gzht.a = gzht0;
        ProtoLiteMessage.L(gzht.class, ((ProtoLiteMessage)gzht0));
    }

    private gzht() {
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
                    return new hfvw(((MessageLite)gzht.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", gzhr.class});
                }
                case 3: {
                    return new gzht();
                }
                case 4: {
                    return new gzhs();
                }
                case 5: {
                    return gzht.a;
                }
                case 6: {
                    Object object1 = gzht.c;
                    if(object1 == null) {
                        Class class0 = gzht.class;
                        synchronized(class0) {
                            hfvs0 = gzht.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gzht.a));
                                gzht.c = hfvs0;
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

