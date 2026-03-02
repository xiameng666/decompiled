import com.google.android.gms.pay.pass.idcard.view.MdocPresentationChimeraActivity;
import j..util.Objects;

public final class duhr implements evqf {
    public final MdocPresentationChimeraActivity a;

    public duhr(MdocPresentationChimeraActivity mdocPresentationChimeraActivity0) {
        this.a = mdocPresentationChimeraActivity0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        MdocPresentationChimeraActivity mdocPresentationChimeraActivity0 = this.a;
        boolean z = false;
        mdocPresentationChimeraActivity0.t = false;
        if(((hjzr)object0) == null) {
            mdocPresentationChimeraActivity0.a("DisplayInfo is null. Credman requester not allowlisted.");
            return;
        }
        if(Objects.equals(((hjzr)object0), hjzr.a)) {
            mdocPresentationChimeraActivity0.a("DisplayInfo is empty. Credman requester not allowlisted.");
            return;
        }
        gtwm gtwm0 = (gtwm)Objects.requireNonNull(mdocPresentationChimeraActivity0.n);
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gtwm0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gtwm0));
        gtvm gtvm0 = ((gtwm)hftp0.b_message).i;
        if(gtvm0 == null) {
            gtvm0 = gtvm.a;
        }
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gtvm0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)gtvm0));
        String s = ((hjzr)object0).c;
        if(!((gtvl)hftp1).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((gtvl)hftp1))).ensureMutable();
        }
        gtvm gtvm1 = (gtvm)((gtvl)hftp1).b_message;
        s.getClass();
        gtvm1.b |= 2;
        gtvm1.d = s;
        String s1 = ((hjzr)object0).e;
        if(!((gtvl)hftp1).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((gtvl)hftp1))).ensureMutable();
        }
        gtvm gtvm2 = (gtvm)((gtvl)hftp1).b_message;
        s1.getClass();
        gtvm2.b |= 4;
        gtvm2.f = s1;
        String s2 = ((hjzr)object0).d;
        if(!((gtvl)hftp1).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((gtvl)hftp1))).ensureMutable();
        }
        gtvm gtvm3 = (gtvm)((gtvl)hftp1).b_message;
        s2.getClass();
        gtvm3.b |= 8;
        gtvm3.g = s2;
        if(((hjzr)object0).h == 1) {
            z = true;
        }
        if(!((gtvl)hftp1).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((gtvl)hftp1))).ensureMutable();
        }
        gtvm gtvm4 = (gtvm)((gtvl)hftp1).b_message;
        gtvm4.b |= 0x20;
        gtvm4.j = z;
        gtvm gtvm5 = (gtvm)((ProtoLiteBuilder)(((gtvl)hftp1))).N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtwm gtwm1 = (gtwm)hftp0.b_message;
        gtvm5.getClass();
        gtwm1.i = gtvm5;
        gtwm1.b |= 1;
        mdocPresentationChimeraActivity0.n = (gtwm)hftp0.N_build();
        mdocPresentationChimeraActivity0.g();
    }
}

