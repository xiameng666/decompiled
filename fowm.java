public final class fowm implements Thread.UncaughtExceptionHandler {
    public final fown a;
    public final Thread.UncaughtExceptionHandler b;

    public fowm(fown fown0, Thread.UncaughtExceptionHandler thread$UncaughtExceptionHandler0) {
        this.a = fown0;
        this.b = thread$UncaughtExceptionHandler0;
    }

    @Override
    public final void uncaughtException(Thread thread0, Throwable throwable0) {
        Thread.UncaughtExceptionHandler thread$UncaughtExceptionHandler0;
        try {
            thread$UncaughtExceptionHandler0 = this.b;
            fown fown0 = this.a;
            gdso gdso0 = gdox.a(throwable0);
            if(gdso0 != null) {
                gdrd gdrd0 = gdso0.a;
                fowk fowk0 = fowk.a(gdrd0.b);
                if(fowk0 != null && ((fowj)fowk0.b.get()) != null && fowk0.c.get() == null) {
                    long v1 = gdtt.a(gdrd0.c.getMostSignificantBits(), gdrd0.c.getLeastSignificantBits());
                    Long long0 = v1;
                    hfst hfst0 = hfyf.k(gdrd0.d);
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)iczt.a).v_newBuilder();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp0.b_message;
                    ((iczt)hftv0).b |= 1;
                    ((iczt)hftv0).c = 0;
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((iczt)hftp0.b_message).f = 2;
                    ((iczt)hftp0.b_message).b |= 8;
                    long0.getClass();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp0.b_message;
                    ((iczt)hftv1).b |= 4;
                    ((iczt)hftv1).e = v1;
                    if(hfst0 != null) {
                        if(!hftv1.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((iczt)hftp0.b_message).d = hfst0;
                        ((iczt)hftp0.b_message).b |= 2;
                    }
                    iczt iczt0 = (iczt)hftp0.N_build();
                    fotj fotj0 = fown0.a;
                    fota fota0 = fotb.a();
                    fota0.d(true);
                    idcv idcv0 = (idcv)((ProtoLiteMessage)idcw.a).v_newBuilder();
                    if(!idcv0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)idcv0).ensureMutable();
                    }
                    idcw idcw0 = (idcw)idcv0.b_message;
                    iczt0.getClass();
                    idcw0.s = iczt0;
                    idcw0.b |= 0x100000;
                    fota0.f(((idcw)((ProtoLiteBuilder)idcv0).N_build()));
                    fota0.b = null;
                    fotj0.b(fota0.a());
                }
            }
        }
        catch(Exception exception0) {
            ((ggsc)((ggsc)((ggsc)folb.a.j()).s(exception0)).ar(0x490E)).x("Failed to end CUI.");
        }
        finally {
            if(thread$UncaughtExceptionHandler0 != null) {
                thread$UncaughtExceptionHandler0.uncaughtException(thread0, throwable0);
            }
        }
    }
}

