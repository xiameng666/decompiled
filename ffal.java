public final class ffal extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final ffal a;
    public hfvh b;
    private static volatile Parser c;

    static {
        ffal ffal0 = new ffal();
        ffal.a = ffal0;
        ProtoLiteMessage.L(ffal.class, ((ProtoLiteMessage)ffal0));
    }

    private ffal() {
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
                    return new hfvw(((MessageLite)ffal.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", ffak.a});
                }
                case 3: {
                    return new ffal();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)ffal.a));
                }
                case 5: {
                    return ffal.a;
                }
                case 6: {
                    Object object1 = ffal.c;
                    if(object1 == null) {
                        Class class0 = ffal.class;
                        synchronized(class0) {
                            hfvs0 = ffal.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)ffal.a));
                                ffal.c = hfvs0;
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

