public final class gigy extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gigy a;
    public hfuo b;
    private static volatile Parser c;

    static {
        gigy gigy0 = new gigy();
        gigy.a = gigy0;
        ProtoLiteMessage.L(gigy.class, ((ProtoLiteMessage)gigy0));
    }

    private gigy() {
        this.b = hfvv.a;
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
                    return new hfvw(((MessageLite)gigy.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", gigx.class});
                }
                case 3: {
                    return new gigy();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gigy.a));
                }
                case 5: {
                    return gigy.a;
                }
                case 6: {
                    Object object1 = gigy.c;
                    if(object1 == null) {
                        Class class0 = gigy.class;
                        synchronized(class0) {
                            hfvs0 = gigy.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gigy.a));
                                gigy.c = hfvs0;
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

