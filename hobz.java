public final class hobz extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hobz a;
    public ByteString b;
    private static volatile Parser c;

    static {
        hobz hobz0 = new hobz();
        hobz.a = hobz0;
        ProtoLiteMessage.L(hobz.class, ((ProtoLiteMessage)hobz0));
    }

    private hobz() {
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
                    return new hfvw(((MessageLite)hobz.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"b"});
                }
                case 3: {
                    return new hobz();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hobz.a));
                }
                case 5: {
                    return hobz.a;
                }
                case 6: {
                    Object object1 = hobz.c;
                    if(object1 == null) {
                        Class class0 = hobz.class;
                        synchronized(class0) {
                            hfvs0 = hobz.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hobz.a));
                                hobz.c = hfvs0;
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

