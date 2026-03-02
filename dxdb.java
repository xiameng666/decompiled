import com.google.mlkit.vision.barcode.aidls.BarcodeParcel;

abstract class dxdb implements gfsi {
    public void a(BarcodeParcel barcodeParcel0, ProtoLiteBuilder hftp0) {
        throw null;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = this.e();
        this.b(((BarcodeParcel)object0), hftp0);
        if(((BarcodeParcel)object0).c != null) {
            this.c(((BarcodeParcel)object0), hftp0);
        }
        if(((BarcodeParcel)object0).b != null) {
            this.a(((BarcodeParcel)object0), hftp0);
        }
        this.d(((BarcodeParcel)object0), hftp0);
        return (hfir)hftp0.N_build();
    }

    public abstract void b(BarcodeParcel arg1, ProtoLiteBuilder arg2);

    public abstract void c(BarcodeParcel arg1, ProtoLiteBuilder arg2);

    public abstract void d(BarcodeParcel arg1, ProtoLiteBuilder arg2);

    public ProtoLiteBuilder e() {
        throw null;
    }
}

