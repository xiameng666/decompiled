import android.net.Uri;

final class bdmd {
    public static final bdtx a(bxws bxws0) {
        ibuq.f(bxws0, "<this>");
        return new bdtx(bxws0.c, bxws0.f);
    }

    public static final bdtx b(bxwt bxwt0) {
        ibuq.f(bxwt0, "<this>");
        String s = bxwt0.c;
        String s1 = Uri.parse(s).getHost();
        if(s1 != null) {
            s = s1;
        }
        return new bdtx(s, bxwt0.d);
    }
}

