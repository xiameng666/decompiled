import java.util.Locale;

public final class burc extends ialz {
    public burc(iakv iakv0) {
        super(iakv0);
    }

    @Override  // iama
    public final void e(iaku iaku0, iaof_metadata iaof0) {
        ibuq.f(iaku0, "responseListener");
        ibuq.f(iaof0, "headers");
        String s = Locale.getDefault().toLanguageTag();
        iaof0.i(burd.a, s);
        super.e(iaku0, iaof0);
    }
}

