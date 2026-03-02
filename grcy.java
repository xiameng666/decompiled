public final class grcy extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final grcy a;
    public ByteString b;
    public int c;
    private static volatile Parser d;

    static {
        grcy grcy0 = new grcy();
        grcy.a = grcy0;
        ProtoLiteMessage.L(grcy.class, ((ProtoLiteMessage)grcy0));
    }

    private grcy() {
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
                    return new hfvw(((MessageLite)grcy.a), "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\u000B", new Object[]{"b", "c"});
                }
                case 3: {
                    return new grcy();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)grcy.a));
                }
                case 5: {
                    return grcy.a;
                }
                case 6: {
                    Object object1 = grcy.d;
                    if(object1 == null) {
                        Class class0 = grcy.class;
                        synchronized(class0) {
                            hfvs0 = grcy.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)grcy.a));
                                grcy.d = hfvs0;
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

