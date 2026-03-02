public final class hfky extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hfky a;
    public hfuo b;
    private static volatile Parser c;

    static {
        hfky hfky0 = new hfky();
        hfky.a = hfky0;
        ProtoLiteMessage.L(hfky.class, ((ProtoLiteMessage)hfky0));
    }

    private hfky() {
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
                    return new hfvw(((MessageLite)hfky.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", hfkx.class});
                }
                case 3: {
                    return new hfky();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hfky.a));
                }
                case 5: {
                    return hfky.a;
                }
                case 6: {
                    Object object1 = hfky.c;
                    if(object1 == null) {
                        Class class0 = hfky.class;
                        synchronized(class0) {
                            hfvs0 = hfky.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hfky.a));
                                hfky.c = hfvs0;
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

