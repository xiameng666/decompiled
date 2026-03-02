public final class hnxj extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hnxj a;
    public int b;
    public ByteString c;
    private static volatile Parser d;

    static {
        hnxj hnxj0 = new hnxj();
        hnxj.a = hnxj0;
        ProtoLiteMessage.L(hnxj.class, ((ProtoLiteMessage)hnxj0));
    }

    private hnxj() {
        this.c = ByteString.b;
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
                    return new hfvw(((MessageLite)hnxj.a), "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\n", new Object[]{"b", "c"});
                }
                case 3: {
                    return new hnxj();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hnxj.a));
                }
                case 5: {
                    return hnxj.a;
                }
                case 6: {
                    Object object1 = hnxj.d;
                    if(object1 == null) {
                        Class class0 = hnxj.class;
                        synchronized(class0) {
                            hfvs0 = hnxj.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hnxj.a));
                                hnxj.d = hfvs0;
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

