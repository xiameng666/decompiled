public final class ftiw extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final ftiw a;
    public int b;
    public Object c;
    private static volatile Parser d;

    static {
        ftiw ftiw0 = new ftiw();
        ftiw.a = ftiw0;
        ProtoLiteMessage.L(ftiw.class, ((ProtoLiteMessage)ftiw0));
    }

    private ftiw() {
        this.b = 0;
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
                    return new hfvw(((MessageLite)ftiw.a), "\u0004\u001A\u0001\u0000\u0001\u001E\u001A\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000B<\u0000\r<\u0000\u000F<\u0000\u0010<\u0000\u0011<\u0000\u0012<\u0000\u0013<\u0000\u0014<\u0000\u0015<\u0000\u0016<\u0000\u0017=\u0000\u0018<\u0000\u0019<\u0000\u001C<\u0000\u001D=\u0000\u001E<\u0000", new Object[]{"c", "b", ftit.class, ftij.class, ftig.class, hfsw.class, ftiu.class, hfsw.class, ftim.class, ftio.class, ftiq.class, ftir.class, ftip.class, hfsw.class, ftii.class, hfsw.class, hfsw.class, hfsw.class, hfsw.class, hfsw.class, gtjh.class, ftih.class, ftiv.class, ftil.class, ftin.class, hfsw.class});
                }
                case 3: {
                    return new ftiw();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)ftiw.a));
                }
                case 5: {
                    return ftiw.a;
                }
                case 6: {
                    Object object1 = ftiw.d;
                    if(object1 == null) {
                        Class class0 = ftiw.class;
                        synchronized(class0) {
                            hfvs0 = ftiw.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)ftiw.a));
                                ftiw.d = hfvs0;
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

