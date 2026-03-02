public final class hnwy extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hnwy a;
    public ByteString b;
    public long c;
    private static volatile Parser d;

    static {
        hnwy hnwy0 = new hnwy();
        hnwy.a = hnwy0;
        ProtoLiteMessage.L(hnwy.class, ((ProtoLiteMessage)hnwy0));
    }

    private hnwy() {
        this.b = ByteString.b;
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
                    return new hfvw(((MessageLite)hnwy.a), "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\u0002", new Object[]{"b", "c"});
                }
                case 3: {
                    return new hnwy();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hnwy.a));
                }
                case 5: {
                    return hnwy.a;
                }
                case 6: {
                    Object object1 = hnwy.d;
                    if(object1 == null) {
                        Class class0 = hnwy.class;
                        synchronized(class0) {
                            hfvs0 = hnwy.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hnwy.a));
                                hnwy.d = hfvs0;
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

