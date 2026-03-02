public final class gpow extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gpow a;
    public hfuo b;
    private static volatile Parser c;

    static {
        gpow gpow0 = new gpow();
        gpow.a = gpow0;
        ProtoLiteMessage.L(gpow.class, ((ProtoLiteMessage)gpow0));
    }

    private gpow() {
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
                    return new hfvw(((MessageLite)gpow.a), "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", gppj.class});
                }
                case 3: {
                    return new gpow();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gpow.a));
                }
                case 5: {
                    return gpow.a;
                }
                case 6: {
                    Object object1 = gpow.c;
                    if(object1 == null) {
                        Class class0 = gpow.class;
                        synchronized(class0) {
                            hfvs0 = gpow.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gpow.a));
                                gpow.c = hfvs0;
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

