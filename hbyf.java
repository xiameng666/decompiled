public final class hbyf extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hbyf a;
    public hfuf b;
    private static volatile Parser c;

    static {
        hbyf hbyf0 = new hbyf();
        hbyf.a = hbyf0;
        ProtoLiteMessage.L(hbyf.class, ((ProtoLiteMessage)hbyf0));
    }

    private hbyf() {
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
                    return new hfvw(((MessageLite)hbyf.a), "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\'", new Object[]{"b"});
                }
                case 3: {
                    return new hbyf();
                }
                case 4: {
                    return new ProtoLiteBuilder(null, null);
                }
                case 5: {
                    return hbyf.a;
                }
                case 6: {
                    Object object1 = hbyf.c;
                    if(object1 == null) {
                        Class class0 = hbyf.class;
                        synchronized(class0) {
                            hfvs0 = hbyf.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hbyf.a));
                                hbyf.c = hfvs0;
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

