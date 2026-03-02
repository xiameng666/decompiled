public final class igup extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final igup a;
    public int b;
    public int c;
    public ByteString d;
    private static volatile Parser e;

    static {
        igup igup0 = new igup();
        igup.a = igup0;
        ProtoLiteMessage.L(igup.class, ((ProtoLiteMessage)igup0));
    }

    private igup() {
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
                    return new hfvw(((MessageLite)igup.a), "\u0000\u0003\u0000\u0000\u0004\u0007\u0003\u0000\u0000\u0000\u0004\f\u0006\u0004\u0007\n", new Object[]{"b", "c", "d"});
                }
                case 3: {
                    return new igup();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)igup.a));
                }
                case 5: {
                    return igup.a;
                }
                case 6: {
                    Object object1 = igup.e;
                    if(object1 == null) {
                        Class class0 = igup.class;
                        synchronized(class0) {
                            hfvs0 = igup.e;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)igup.a));
                                igup.e = hfvs0;
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

