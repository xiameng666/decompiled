import com.google.android.gms.multidevice.sync.QuickAccessDocument;

public final class ctgx {
    public static final QuickAccessDocument a(ctyq ctyq0) {
        String s = ctyq0.c;
        ibuq.e(s, "getDocumentId(...)");
        String s1 = ctyq0.d;
        ibuq.e(s1, "getDisplayName(...)");
        String s2 = ctyq0.e;
        ibuq.e(s2, "getMimeType(...)");
        long v = ctyq0.f;
        int v1 = ctyq0.g;
        Integer integer0 = ctyq0.h == 0 ? null : ((int)ctyq0.h);
        Long long0 = ctyq0.i == 0L ? null : ((long)ctyq0.i);
        String s3 = ctyq0.j;
        return s3.length() == 0 ? new QuickAccessDocument(s, s1, s2, v, v1, integer0, long0, null) : new QuickAccessDocument(s, s1, s2, v, v1, integer0, long0, s3);
    }
}

