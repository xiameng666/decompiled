import com.google.android.gms.chimera.modules.auth.folsom.AppContextProvider;
import java.util.ArrayList;

public final class ajsf implements ajra {
    public final ajrc a;

    public ajsf(ajrc ajrc0) {
        this.a = ajrc0;
    }

    @Override  // ajra
    public final Object a() {
        fhbw fhbw0 = new fhbw();
        fhad fhad0 = fhae.a();
        fhad0.b(AppContextProvider.a());
        iakr iakr0 = cmma.g(0x4800, -1, fhad0.a(), fhbw0).a(grgh.l);
        ArrayList arrayList0 = new ArrayList();
        String s = ajrc.e("com.google.android.gms");
        if(s != null) {
            arrayList0.add(new iaqd(s));
        }
        iaof_metadata iaof0 = new iaof_metadata();
        iaof0.i(new iant("X-Goog-Api-Key", iaof_metadata.c), "AIzaSyAP-gfH3qvi6vgHZbSYwQ_XHqV_mXHhzIk");
        iaof0.i(new iant("X-Android-Package", iaof_metadata.c), "com.google.android.gms");
        iaof0.i(new iant("X-Android-Cert", iaof_metadata.c), bbmq.l(AppContextProvider.a(), "com.google.android.gms"));
        arrayList0.add(new ibjz(iaof0));
        grfl grfl0 = grfm.a(iala.a(iakr0, arrayList0));
        gphs gphs0 = new gphs(this.a.a.name, "google");
        return (grfl)grfl0.q(gphs.a, gphs0);
    }
}

