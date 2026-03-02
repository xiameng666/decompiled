public final class gycs extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gycs a;
    public hfuf b;
    private static volatile Parser c;

    static {
        gycs gycs0 = new gycs();
        gycs.a = gycs0;
        ProtoLiteMessage.L(gycs.class, ((ProtoLiteMessage)gycs0));
    }

    private gycs() {
        this.b = hfty.a;
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
                    return new hfvw(((MessageLite)gycs.a), "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\'", new Object[]{"b"});
                }
                case 3: {
                    return new gycs();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gycs.a));
                }
                case 5: {
                    return gycs.a;
                }
                case 6: {
                    Object object1 = gycs.c;
                    if(object1 == null) {
                        Class class0 = gycs.class;
                        synchronized(class0) {
                            hfvs0 = gycs.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gycs.a));
                                gycs.c = hfvs0;
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

