import android.content.ContentProviderOperation.Builder;
import android.content.ContentProviderOperation;
import android.content.ContentValues;
import android.net.Uri;
import android.text.TextUtils;

public abstract class ehhs {
    final ehbg a;
    protected final ehim b;
    protected final boolean c;
    private final String d;
    private final egzp e;
    private final ehga f;
    private final Uri g;

    protected ehhs(String s, ehbg ehbg0, ehga ehga0, egzp egzp0, Uri uri0, ehim ehim0) {
        this.d = s;
        this.f = ehga0;
        this.a = ehbg0;
        this.e = egzp0;
        this.g = uri0;
        this.b = ehim0;
        egiv.R();
        this.c = egiv.g().booleanValue();
    }

    protected abstract ehaa a();

    protected abstract void b();

    protected abstract void c();

    protected abstract boolean d(Object arg1);

    protected abstract int e();

    protected abstract ehaa f(ehaa arg1, boolean arg2, ehhr arg3);

    public final void g(ehic ehic0) {
        ehaa ehaa2;
        ehaa ehaa0 = this.a();
        String s = ehaa0.a;
        String s1 = ehaa0.b;
        if(this.a.a.a) {
            ((ehiv)this.b).k = true;
        }
        if(TextUtils.isEmpty(s)) {
            this.c();
            if(TextUtils.isEmpty(s1)) {
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put("sync2", "SWEEP_MARK");
                ContentProviderOperation.Builder contentProviderOperation$Builder0 = ContentProviderOperation.newUpdate(ehab.c(this.g, this.f.a)).withValues(contentValues0);
                String s2 = ((Boolean)ehij.a.mr()).booleanValue() ? "sourceid IS NOT NULL AND dirty = 0" : "sourceid IS NOT NULL";
                this.f.a(contentProviderOperation$Builder0.withSelection(s2, null).build(), "mark");
            }
        }
        ehhr ehhr0 = new ehhr(this, ehic0);
        egiv.R();
        int v = (int)hwzc.a.c().w();
        Integer.valueOf(v).getClass();
        int v1 = 0;
        while(true) {
            ehaa ehaa1 = new ehaa(s, s1);
            int v2 = v;
            while(true) {
                this.e.d();
                try {
                    ehaa2 = this.f(ehaa1, v1 == 0, ehhr0);
                    goto label_43;
                }
                catch(iapl iapl0) {
                }
                iaph iaph0 = iapl0.a.t;
                if(iaph0 == iaph.j && iapl0.getMessage().contains("EXPIRED_SYNC_TOKEN")) {
                    goto label_28;
                }
                if(iaph0 == iaph.k && iapl0.getMessage().contains("INVALID_PAGE_TOKEN")) {
                label_28:
                    if(v1 == 0) {
                        egig.k(this.d, "Stale sync token in first page, reverting to full sync");
                        this.b();
                        this.g(ehic0);
                        return;
                    }
                    egig.b(this.d, "Stale sync token in non-first page, terminating and restart a new sync");
                    throw new ehfh(new ehfg(6));
                }
                if(iaph0 != iaph.e) {
                    throw new ehfh(iapl0);
                }
                --v2;
                if(v2 <= 0) {
                    break;
                }
                egig.m(this.d, "Deadline exceeded. %d remaining attempts.", new Object[]{v2});
            }
            egig.b(this.d, "Too many times deadline exceeded.");
            throw new ehfh(new ehfg(7));
        label_43:
            if(ehaa2 == null) {
                break;
            }
            String s3 = ehaa2.a;
            if(TextUtils.isEmpty(s3) && TextUtils.isEmpty(ehaa2.b)) {
                break;
            }
            ++v1;
            s1 = ehaa2.b;
            if(TextUtils.isEmpty(s1)) {
                ehic0.b(s3);
                return;
            }
            ehic0.c(s1);
        }
        throw new ehfh(new ehfg(this.e()));
    }
}

