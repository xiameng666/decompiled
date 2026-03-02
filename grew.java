public final class grew extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final grew a;
    public ByteString b;
    public int c;
    private static volatile Parser d;

    static {
        grew grew0 = new grew();
        grew.a = grew0;
        ProtoLiteMessage.L(grew.class, ((ProtoLiteMessage)grew0));
    }

    private grew() {
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
                    return new hfvw(((MessageLite)grew.a), "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\f", new Object[]{"b", "c"});
                }
                case 3: {
                    return new grew();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)grew.a));
                }
                case 5: {
                    return grew.a;
                }
                case 6: {
                    Object object1 = grew.d;
                    if(object1 == null) {
                        Class class0 = grew.class;
                        synchronized(class0) {
                            hfvs0 = grew.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)grew.a));
                                grew.d = hfvs0;
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

