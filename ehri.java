import android.content.Intent;

public final class ehri implements bboe {
    public final ehrj a;

    public ehri(ehrj ehrj0) {
        this.a = ehrj0;
    }

    @Override  // bboe
    public final Object a(Object object0) {
        if(bbqa.c()) {
            ehrj ehrj0 = this.a;
            Object object1 = null;
            if(((Intent)object0) != null && ((Intent)object0).getBooleanExtra("android.intent.extra.SHOWING_ATTRIBUTION", false)) {
                ehrc ehrc0 = ehrj0.a;
                String[] arr_s = ((Intent)object0).getStringArrayExtra("android.intent.extra.ATTRIBUTION_TAGS");
                hgiq hgiq0 = ehrc0.a.a(arr_s);
                if(hgiq0 != null) {
                    object1 = ehrc0.b.a(hgiq0);
                }
            }
            if(object1 != null) {
                return object1;
            }
        }
        String s = ehrf.g(((Intent)object0));
        if(s == null) {
            return hxir.c();
        }
        Object object2 = ehku.a(s);
        return bbqr.d(((String)object2)) ? hxir.c() : object2;
    }
}

