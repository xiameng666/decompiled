import android.content.Intent;
import android.os.ParcelFileDescriptor;

public final class gaqp {
    public static final String a(gano gano0) {
        ibuq.f(gano0, "<this>");
        ibuq.e(gano0.a, "getIntent(...)");
        return gano0.a.getStringExtra("cacheKey");
    }

    public static final ParcelFileDescriptor b(gano gano0) {
        ibuq.f(gano0, "<this>");
        ibuq.e(gano0.a, "getIntent(...)");
        return (ParcelFileDescriptor)jwh.a(gano0.a, "pdfFileDescriptor", ParcelFileDescriptor.class);
    }

    public static final int c(gano gano0) {
        ibuq.f(gano0, "<this>");
        ibuq.e(gano0.a, "getIntent(...)");
        return gano0.a.getIntExtra("renderAction", 0);
    }

    public static final void d(Intent intent0, String s) {
        if(s != null && s.length() != 0) {
            intent0.putExtra("cacheKey", s);
        }
    }

    public static final void e(Intent intent0, ParcelFileDescriptor parcelFileDescriptor0) {
        if(parcelFileDescriptor0 != null) {
            ibuq.c(intent0.putExtra("pdfFileDescriptor", parcelFileDescriptor0));
            return;
        }
        intent0.removeExtra("pdfFileDescriptor");
    }

    public static final void f(Intent intent0, int v) {
        intent0.putExtra("renderAction", v);
    }
}

