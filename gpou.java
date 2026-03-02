public final class gpou extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gpou a;
    public hfuo b;
    private static volatile Parser c;

    static {
        gpou gpou0 = new gpou();
        gpou.a = gpou0;
        ProtoLiteMessage.L(gpou.class, ((ProtoLiteMessage)gpou0));
    }

    private gpou() {
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
                    return new hfvw(((MessageLite)gpou.a), "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", gppj.class});
                }
                case 3: {
                    return new gpou();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gpou.a));
                }
                case 5: {
                    return gpou.a;
                }
                case 6: {
                    Object object1 = gpou.c;
                    if(object1 == null) {
                        Class class0 = gpou.class;
                        synchronized(class0) {
                            hfvs0 = gpou.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gpou.a));
                                gpou.c = hfvs0;
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

