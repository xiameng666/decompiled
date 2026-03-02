import com.google.android.gms.pay.pass.valuable.view.ucp.UcpV1PassDetailsInputView;
import j..util.Optional;

final class dwjr extends ibuo implements ibth {
    public dwjr(Object object0) {
        super(0, object0, dwjx.class, "onSaveUcpV1PassSpecific", "onSaveUcpV1PassSpecific()V", 0);
    }

    @Override  // ibth
    public final Object a() {
        dwjx dwjx0 = (dwjx)this.e;
        UcpV1PassDetailsInputView ucpV1PassDetailsInputView0 = dwjx0.ao;
        UcpV1PassDetailsInputView ucpV1PassDetailsInputView1 = null;
        if(ucpV1PassDetailsInputView0 == null) {
            ibuq.j("ucpV1PassDetailsInputView");
            ucpV1PassDetailsInputView0 = null;
        }
        String s = ucpV1PassDetailsInputView0.b();
        UcpV1PassDetailsInputView ucpV1PassDetailsInputView2 = dwjx0.ao;
        if(ucpV1PassDetailsInputView2 == null) {
            ibuq.j("ucpV1PassDetailsInputView");
        }
        else {
            ucpV1PassDetailsInputView1 = ucpV1PassDetailsInputView2;
        }
        String s1 = ucpV1PassDetailsInputView1.a();
        if(ibuq.m(s, dwjx0.T().i()) && ibuq.m(s1, dwjx0.T().h())) {
            ((ggtj)dwjx.an.h()).x("No changes to save, back to valuable detail screen");
            dwjx0.af(dwjx0.T().g());
            return ibom.a;
        }
        dwkl dwkl0 = dwjx0.T();
        ibuq.f(s, "cardTitle");
        ibuq.f(s1, "cardDescription");
        Optional optional0 = Optional.of(s);
        Optional optional1 = Optional.of(s1);
        dwkf dwkf0 = new dwkf(dwkl0);
        dwkg dwkg0 = new dwkg(dwkl0);
        dwkl0.c.a(dwkl0.e.b, optional0, optional1, Optional.empty(), dwkf0, dwkg0);
        return ibom.a;
    }
}

