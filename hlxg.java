public final class hlxg extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hlxg a;
    public ByteString b;
    private static volatile Parser c;

    static {
        hlxg hlxg0 = new hlxg();
        hlxg.a = hlxg0;
        ProtoLiteMessage.L(hlxg.class, ((ProtoLiteMessage)hlxg0));
    }

    private hlxg() {
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
                    return new hfvw(((MessageLite)hlxg.a), "\u0004\u0001\u0000\u0000\t\t\u0001\u0000\u0000\u0000\t\n", new Object[]{"b"});
                }
                case 3: {
                    return new hlxg();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hlxg.a));
                }
                case 5: {
                    return hlxg.a;
                }
                case 6: {
                    Object object1 = hlxg.c;
                    if(object1 == null) {
                        Class class0 = hlxg.class;
                        synchronized(class0) {
                            hfvs0 = hlxg.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hlxg.a));
                                hlxg.c = hfvs0;
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

