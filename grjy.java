public final class grjy extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final grjy a;
    public hfuf b;
    private static volatile Parser c;

    static {
        grjy grjy0 = new grjy();
        grjy.a = grjy0;
        ProtoLiteMessage.L(grjy.class, ((ProtoLiteMessage)grjy0));
    }

    private grjy() {
        this.b = hfty.a;
    }

    public final void b() {
        hfuf hfuf0 = this.b;
        if(!hfuf0.c()) {
            this.b = ProtoLiteMessage.C(hfuf0);
        }
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
                    return new hfvw(((MessageLite)grjy.a), "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0016", new Object[]{"b"});
                }
                case 3: {
                    return new grjy();
                }
                case 4: {
                    return new grjx();
                }
                case 5: {
                    return grjy.a;
                }
                case 6: {
                    Object object1 = grjy.c;
                    if(object1 == null) {
                        Class class0 = grjy.class;
                        synchronized(class0) {
                            hfvs0 = grjy.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)grjy.a));
                                grjy.c = hfvs0;
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

