import android.content.Context;

public final class asqq {
    private final aqqk a;

    public asqq(Context context0) {
        aqqk aqqk0 = new aqqk(context0, false, false, 14);
        super();
        this.a = aqqk0;
    }

    public final void a(ghys ghys0, ghyr ghyr0) {
        this.a.a(ghys0, ghyr0);
    }

    public final void b(gifd gifd0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghys.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp0.b_message;
        gifd0.getClass();
        ghys0.av = gifd0;
        ghys0.d |= 0x1000000;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        this.a(((ghys)hftv0), ghyr.aJ);
    }

    public final void c(gifc gifc0) {
        ibuq.f(gifc0, "notShownReason");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gifd.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gifd)hftv0).b |= 1;
        ((gifd)hftv0).c = true;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gifd)hftv1).e = gifc0.g;
        ((gifd)hftv1).b |= 4;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        gifd gifd0 = (gifd)hftp0.b_message;
        gifd0.b |= 2;
        gifd0.d = false;
        ProtoLiteMessage hftv2 = hftp0.N_build();
        ibuq.e(hftv2, "build(...)");
        this.b(((gifd)hftv2));
    }
}

