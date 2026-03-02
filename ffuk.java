public final class ffuk extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final ffuk a;
    public long b;
    public long c;
    public ByteString d;
    public long e;
    private static volatile Parser f;

    static {
        ffuk ffuk0 = new ffuk();
        ffuk.a = ffuk0;
        ProtoLiteMessage.L(ffuk.class, ((ProtoLiteMessage)ffuk0));
    }

    private ffuk() {
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
                    return new hfvw(((MessageLite)ffuk.a), "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\n\u0004\u0002", new Object[]{"b", "c", "d", "e"});
                }
                case 3: {
                    return new ffuk();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)ffuk.a));
                }
                case 5: {
                    return ffuk.a;
                }
                case 6: {
                    Object object1 = ffuk.f;
                    if(object1 == null) {
                        Class class0 = ffuk.class;
                        synchronized(class0) {
                            hfvs0 = ffuk.f;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)ffuk.a));
                                ffuk.f = hfvs0;
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

