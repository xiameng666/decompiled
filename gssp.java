public final class gssp extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gssp a;
    public hfuo b;
    private static volatile Parser c;

    static {
        gssp gssp0 = new gssp();
        gssp.a = gssp0;
        ProtoLiteMessage.L(gssp.class, ((ProtoLiteMessage)gssp0));
    }

    private gssp() {
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
                    return new hfvw(((MessageLite)gssp.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", gsut.class});
                }
                case 3: {
                    return new gssp();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gssp.a));
                }
                case 5: {
                    return gssp.a;
                }
                case 6: {
                    Object object1 = gssp.c;
                    if(object1 == null) {
                        Class class0 = gssp.class;
                        synchronized(class0) {
                            hfvs0 = gssp.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gssp.a));
                                gssp.c = hfvs0;
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

