public final class gsry extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gsry a;
    public hfuf b;
    private static volatile Parser c;

    static {
        gsry gsry0 = new gsry();
        gsry.a = gsry0;
        ProtoLiteMessage.L(gsry.class, ((ProtoLiteMessage)gsry0));
    }

    private gsry() {
        this.b = hfty.a;
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
                    return new hfvw(((MessageLite)gsry.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"b"});
                }
                case 3: {
                    return new gsry();
                }
                case 4: {
                    return new gsrx();
                }
                case 5: {
                    return gsry.a;
                }
                case 6: {
                    Object object1 = gsry.c;
                    if(object1 == null) {
                        Class class0 = gsry.class;
                        synchronized(class0) {
                            hfvs0 = gsry.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gsry.a));
                                gsry.c = hfvs0;
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

