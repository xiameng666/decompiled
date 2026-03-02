public final class aldv extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final aldv a;
    public ByteString b;
    private static volatile Parser c;

    static {
        aldv aldv0 = new aldv();
        aldv.a = aldv0;
        ProtoLiteMessage.L(aldv.class, ((ProtoLiteMessage)aldv0));
    }

    private aldv() {
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
                    return new hfvw(((MessageLite)aldv.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"b"});
                }
                case 3: {
                    return new aldv();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)aldv.a));
                }
                case 5: {
                    return aldv.a;
                }
                case 6: {
                    Object object1 = aldv.c;
                    if(object1 == null) {
                        Class class0 = aldv.class;
                        synchronized(class0) {
                            hfvs0 = aldv.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)aldv.a));
                                aldv.c = hfvs0;
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

