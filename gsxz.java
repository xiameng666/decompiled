public final class gsxz extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gsxz a;
    public hfuo b;
    public hfvh c;
    private static volatile Parser d;

    static {
        gsxz gsxz0 = new gsxz();
        gsxz.a = gsxz0;
        ProtoLiteMessage.L(gsxz.class, ((ProtoLiteMessage)gsxz0));
    }

    private gsxz() {
        this.c = hfvh.a;
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
                    return new hfvw(((MessageLite)gsxz.a), "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0001\u0001\u0000\u0002\u001B\u00032", new Object[]{"b", gsxn.class, "c", gsxy.a});
                }
                case 3: {
                    return new gsxz();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gsxz.a));
                }
                case 5: {
                    return gsxz.a;
                }
                case 6: {
                    Object object1 = gsxz.d;
                    if(object1 == null) {
                        Class class0 = gsxz.class;
                        synchronized(class0) {
                            hfvs0 = gsxz.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gsxz.a));
                                gsxz.d = hfvs0;
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

