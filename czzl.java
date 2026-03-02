import android.content.Context;

public final class czzl {
    public final bbfe_BaseGrpcServer a;
    public final baqr b;
    public final czzn c;
    public final czzq d;
    public final czzo e;

    public czzl(Context context0) {
        baqr baqr0 = new baqr();
        this.b = baqr0;
        baqr0.e = "com.google.android.gms";
        bbfe_BaseGrpcServer bbfe0 = new bbfe_BaseGrpcServer(context0, "instantmessaging-pa.googleapis.com", 443, context0.getApplicationInfo().uid, 0x2604);
        bbfe0.enableRetry = false;
        bbfe0.addHeader("X-Goog-Api-Key", "AIzaSyAP-gfH3qvi6vgHZbSYwQ_XHqV_mXHhzIk");
        bbfe0.addHeader("X-Android-Package", "com.google.android.gms");
        String s = bbmq.l(context0, "com.google.android.gms");
        if(s != null) {
            bbfe0.addHeader("X-Android-Cert", s);
        }
        bbfe0.addHeader("User-Agent", a.f(1, "grpc-Nearby/", "/1"));
        bbfe0.addHeader("Sec-X-Google-Grpc", "1");
        bbfe0.addHeader("Origin", "android-app://com.google.android.gms");
        this.a = bbfe0;
        new czzp(bbfe0);
        this.c = new czzn(bbfe0);
        this.d = new czzq(bbfe0);
        this.e = new czzo(bbfe0);
    }
}

