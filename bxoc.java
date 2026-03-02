import android.content.Context;

public final class bxoc {
    public static final bxod a(Context context0, String s) {
        return new bxod(bxoc.d(context0, s), bxoc.c(context0));
    }

    public static final bxod b(Context context0, String s) {
        return new bxod(bxoc.d(context0, s), bxoc.c(context0));
    }

    private static ayvm c(Context context0) {
        return fhbe.b(context0, new icym());
    }

    private static final ayud d(Context context0, String s) {
        bxob bxob0 = new bxob();
        aytt aytt0 = new aytt(context0, "IDENTITY_GMSCORE");
        aytt0.f = s;
        aytt0.g = bxob0;
        return aytt0.a();
    }
}

