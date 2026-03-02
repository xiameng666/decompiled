public final class fvje extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final fvje a;
    public ByteString b;
    public ByteString c;
    public ByteString d;
    private static volatile Parser e;

    static {
        fvje fvje0 = new fvje();
        fvje.a = fvje0;
        ProtoLiteMessage.L(fvje.class, ((ProtoLiteMessage)fvje0));
    }

    private fvje() {
        this.b = ByteString.b;
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
                    return new hfvw(((MessageLite)fvje.a), "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\n\u0003\n", new Object[]{"b", "c", "d"});
                }
                case 3: {
                    return new fvje();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)fvje.a));
                }
                case 5: {
                    return fvje.a;
                }
                case 6: {
                    Object object1 = fvje.e;
                    if(object1 == null) {
                        Class class0 = fvje.class;
                        synchronized(class0) {
                            hfvs0 = fvje.e;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)fvje.a));
                                fvje.e = hfvs0;
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

