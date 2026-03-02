public final class ffbj extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final ffbj a;
    public hfvh b;
    private static volatile Parser c;

    static {
        ffbj ffbj0 = new ffbj();
        ffbj.a = ffbj0;
        ProtoLiteMessage.L(ffbj.class, ((ProtoLiteMessage)ffbj0));
    }

    private ffbj() {
        this.b = hfvh.a;
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
                    return new hfvw(((MessageLite)ffbj.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", ffbi.a});
                }
                case 3: {
                    return new ffbj();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)ffbj.a));
                }
                case 5: {
                    return ffbj.a;
                }
                case 6: {
                    Object object1 = ffbj.c;
                    if(object1 == null) {
                        Class class0 = ffbj.class;
                        synchronized(class0) {
                            hfvs0 = ffbj.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)ffbj.a));
                                ffbj.c = hfvs0;
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

