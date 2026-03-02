import com.google.mlkit.vision.barcode.aidls.BarcodeParcel;

final class dxdg extends dxdb {
    public static final dxdg a;

    static {
        dxdg.a = new dxdg();
    }

    @Override  // dxdb
    public final void a(BarcodeParcel barcodeParcel0, ProtoLiteBuilder hftp0) {
        ibuq.f(barcodeParcel0, "from");
        ibuq.f(hftp0, "to");
        String s = barcodeParcel0.b == null ? "" : barcodeParcel0.b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hfir hfir0 = (hfir)hftp0.b_message;
        hfir0.b |= 4;
        hfir0.e = s;
    }

    @Override  // dxdb
    public final void b(BarcodeParcel barcodeParcel0, ProtoLiteBuilder hftp0) {
        ibuq.f(barcodeParcel0, "from");
        ibuq.f(hftp0, "to");
        hfit hfit0 = dxdi.a(Integer.valueOf(barcodeParcel0.a));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hfir)hftp0.b_message).c = hfit0.q;
        ((hfir)hftp0.b_message).b |= 1;
    }

    @Override  // dxdb
    public final void c(BarcodeParcel barcodeParcel0, ProtoLiteBuilder hftp0) {
        ibuq.f(barcodeParcel0, "from");
        ibuq.f(hftp0, "to");
        ByteString hfsf0 = dxdi.c(barcodeParcel0.d, barcodeParcel0.c, barcodeParcel0.b);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hfir hfir0 = (hfir)hftp0.b_message;
        hfir0.b |= 2;
        hfir0.d = hfsf0;
    }

    @Override  // dxdb
    public final void d(BarcodeParcel barcodeParcel0, ProtoLiteBuilder hftp0) {
        ibuq.f(barcodeParcel0, "from");
        ibuq.f(hftp0, "to");
        hfiv hfiv0 = dxdi.b(Integer.valueOf(barcodeParcel0.f));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hfir)hftp0.b_message).f = hfiv0.o;
        ((hfir)hftp0.b_message).b |= 16;
    }

    @Override  // dxdb
    public final ProtoLiteBuilder e() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hfir.a).v_newBuilder();
        ibuq.e(hftp0, "newBuilder(...)");
        hfit hfit0 = hfit.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hfir)hftp0.b_message).c = hfit0.q;
        ((hfir)hftp0.b_message).b |= 1;
        ByteString hfsf0 = ByteString.b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        hfsf0.getClass();
        ((hfir)hftv0).b |= 2;
        ((hfir)hftv0).d = hfsf0;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((hfir)hftv1).b |= 4;
        ((hfir)hftv1).e = "";
        hfiv hfiv0 = hfiv.a;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hfir)hftp0.b_message).f = hfiv0.o;
        ((hfir)hftp0.b_message).b |= 16;
        return hftp0;
    }
}

