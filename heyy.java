public final class heyy extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final heyy a;
    public hfuo b;
    private static volatile Parser c;

    static {
        heyy heyy0 = new heyy();
        heyy.a = heyy0;
        ProtoLiteMessage.L(heyy.class, ((ProtoLiteMessage)heyy0));
    }

    private heyy() {
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
                    return new hfvw(((MessageLite)heyy.a), "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001B", new Object[]{"b", heze.class});
                }
                case 3: {
                    return new heyy();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)heyy.a));
                }
                case 5: {
                    return heyy.a;
                }
                case 6: {
                    Object object1 = heyy.c;
                    if(object1 == null) {
                        Class class0 = heyy.class;
                        synchronized(class0) {
                            hfvs0 = heyy.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)heyy.a));
                                heyy.c = hfvs0;
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

