import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import j..util.Objects;
import java.io.IOException;

public final class dvky {
    public static final dvkz a(Context context0, String s, Uri uri0) {
        Uri uri1;
        ibuq.f(context0, "context");
        ibuq.f(s, "accountName");
        ibuq.f(uri0, "uri");
        bboh bboh0 = dvkz.a;
        ((ggtj)bboh0.h()).x("Constructing CachedImage");
        if(!dvla.b(context0, uri0)) {
            ((ggtj)bboh0.h()).x("Creating image cache for given uri");
            if(Objects.equals(uri0.getScheme(), "content")) {
                String s1 = uri0.getHost();
                uri1 = ibpo.aB(dvkz.b, s1) ? dvky.b(context0, uri0, true) : dvky.b(context0, uri0, false);
            }
            else {
                uri1 = dvky.b(context0, uri0, false);
            }
            ibuq.f(context0, "context");
            ibuq.f(s, "accountName");
            if(s.length() == 0) {
                ((ggtj)dvld.a.j()).x("Cannot schedule a cleanup task without a valid account name");
                return new dvkz(uri1);
            }
            Bundle bundle0 = new Bundle();
            bundle0.putString("account_name", s);
            clks clks0 = new clks();
            clks0.j = "com.google.android.gms.pay.gcmtask.PayGcmTaskService";
            clks0.l(false);
            clks0.a = clkz.j;
            clks0.u = bundle0;
            clks0.q("cleanupucpcache.oneoff");
            clks0.v(2);
            clla clla0 = clks0.a();
            cljp.a(context0).f(clla0);
            ((ggtj)dvld.a.h()).x("Scheduled a recurring task to clean up cached image URIs");
            return new dvkz(uri1);
        }
        ((ggtj)bboh0.h()).x("Image is already cached");
        return new dvkz(uri0);
    }

    private static final Uri b(Context context0, Uri uri0, boolean z) {
        ((ggtj)dvkz.a.h()).B("Creating cached URI with fallback and isInternal: %s", Boolean.valueOf(((boolean)(((int)z)))));
        try {
            gged_interceptors gged0 = gged_interceptors.l(uri0);
            ibuq.e(gged0, "of(...)");
            Object object0 = dvla.a(context0, gged0, ((boolean)(((int)z)))).get(0);
            ibuq.e(object0, "get(...)");
            return (Uri)object0;
        }
        catch(IOException iOException0) {
            a.e(dvkz.a.h(), "Fall back to create cached URI with isInternal: %s", Boolean.valueOf(((boolean)(((int)z) ^ 1))), iOException0);
            try {
                gged_interceptors gged1 = gged_interceptors.l(uri0);
                ibuq.e(gged1, "of(...)");
                Object object1 = dvla.a(context0, gged1, ((boolean)(((int)z) ^ 1))).get(0);
                ibuq.e(object1, "get(...)");
                return (Uri)object1;
            }
            catch(IOException iOException1) {
                a.ae(dvkz.a.j(), "Fail to create cached URI with fallback", iOException1);
                throw iOException1;
            }
        }
    }
}

