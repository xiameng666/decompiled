import com.google.android.libraries.tapandpay.ui.viewheader.ComposeViewHeader;

final class dnlf implements icih {
    final dnlp a;

    public dnlf(dnlp dnlp0) {
        this.a = dnlp0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        ComposeViewHeader composeViewHeader0 = this.a.aj;
        if(composeViewHeader0 == null) {
            ibuq.j("viewHeaderView");
            composeViewHeader0 = null;
        }
        if(composeViewHeader0 != null) {
            composeViewHeader0.b(((fuho)object0));
        }
        return ibom.a;
    }
}

