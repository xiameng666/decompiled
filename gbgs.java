import com.google.android.wallet.bender3.framework.client.WidgetConfig;

public final class gbgs {
    public static final gano a(WidgetConfig widgetConfig0, fbbw fbbw0) {
        ibuq.f(fbbw0, "requestInput");
        gano gano0 = new gano(gano.b("requestContextBuilder", widgetConfig0));
        ibuq.f(fbbw0, "value");
        gawi.q(gano0.a, "createRequestContextActionData", ((MessageLite)fbbw0));
        return gano0;
    }

    public static final ProtoLiteBuilder b() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fbbw.a).v_newBuilder();
        fbbv fbbv0 = fbbv.b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((fbbw)hftv0).f = fbbv0.d;
        ((fbbw)hftv0).b |= 2;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        fbbw fbbw0 = (fbbw)hftp0.b_message;
        fbbw0.b |= 0x20;
        fbbw0.k = true;
        return hftp0;
    }
}

