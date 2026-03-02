public final class grco extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final grco a;
    public hfuo b;
    public ByteString c;
    private static volatile Parser d;

    static {
        grco grco0 = new grco();
        grco.a = grco0;
        ProtoLiteMessage.L(grco.class, ((ProtoLiteMessage)grco0));
    }

    private grco() {
        this.b = hfvv.a;
        this.c = ByteString.b;
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
                    return new hfvw(((MessageLite)grco.a), "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001C\u0002\n", new Object[]{"b", "c"});
                }
                case 3: {
                    return new grco();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)grco.a));
                }
                case 5: {
                    return grco.a;
                }
                case 6: {
                    Object object1 = grco.d;
                    if(object1 == null) {
                        Class class0 = grco.class;
                        synchronized(class0) {
                            hfvs0 = grco.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)grco.a));
                                grco.d = hfvs0;
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

