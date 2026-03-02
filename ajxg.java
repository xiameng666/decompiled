public final class ajxg extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final ajxg a;
    public ByteString b;
    public long c;
    private static volatile Parser d;

    static {
        ajxg ajxg0 = new ajxg();
        ajxg.a = ajxg0;
        ProtoLiteMessage.L(ajxg.class, ((ProtoLiteMessage)ajxg0));
    }

    private ajxg() {
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
                    return new hfvw(((MessageLite)ajxg.a), "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\u0002", new Object[]{"b", "c"});
                }
                case 3: {
                    return new ajxg();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)ajxg.a));
                }
                case 5: {
                    return ajxg.a;
                }
                case 6: {
                    Object object1 = ajxg.d;
                    if(object1 == null) {
                        Class class0 = ajxg.class;
                        synchronized(class0) {
                            hfvs0 = ajxg.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)ajxg.a));
                                ajxg.d = hfvs0;
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

