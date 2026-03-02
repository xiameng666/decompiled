public final class grfv extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final grfv a;
    public ByteString b;
    public int c;
    public int d;
    private static volatile Parser e;

    static {
        grfv grfv0 = new grfv();
        grfv.a = grfv0;
        ProtoLiteMessage.L(grfv.class, ((ProtoLiteMessage)grfv0));
    }

    private grfv() {
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
                    return new hfvw(((MessageLite)grfv.a), "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\u0004\u0003\u0004", new Object[]{"b", "c", "d"});
                }
                case 3: {
                    return new grfv();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)grfv.a));
                }
                case 5: {
                    return grfv.a;
                }
                case 6: {
                    Object object1 = grfv.e;
                    if(object1 == null) {
                        Class class0 = grfv.class;
                        synchronized(class0) {
                            hfvs0 = grfv.e;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)grfv.a));
                                grfv.e = hfvs0;
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

