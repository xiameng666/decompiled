public final class grfn extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final grfn a;
    public int b;
    public ByteString c;
    public ByteString d;
    private static volatile Parser e;

    static {
        grfn grfn0 = new grfn();
        grfn.a = grfn0;
        ProtoLiteMessage.L(grfn.class, ((ProtoLiteMessage)grfn0));
    }

    private grfn() {
        this.c = ByteString.b;
        this.d = ByteString.b;
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
                    return new hfvw(((MessageLite)grfn.a), "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\n\u0003\n", new Object[]{"b", "c", "d"});
                }
                case 3: {
                    return new grfn();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)grfn.a));
                }
                case 5: {
                    return grfn.a;
                }
                case 6: {
                    Object object1 = grfn.e;
                    if(object1 == null) {
                        Class class0 = grfn.class;
                        synchronized(class0) {
                            hfvs0 = grfn.e;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)grfn.a));
                                grfn.e = hfvs0;
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

