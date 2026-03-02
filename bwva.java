import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;

public final class bwva {
    public final bwuz a;
    public final bwuz b;
    public String c;
    private static final String[] d;
    private static final String[] e;
    private static final String[] f;
    private static final String[] g;
    private final ContentResolver h;
    private boolean i;
    private final Uri j;
    private final String[] k;

    static {
        bwva.d = new String[]{"seqno", "action", "uri"};
        bwva.e = new String[]{"created_timestamp", "doc_score", "section_thing_proto"};
        bwva.f = new String[]{"seqno", "action", "uri", "tag"};
        bwva.g = new String[0];
    }

    public bwva(ContentResolver contentResolver0, Uri uri0, String s, String[] arr_s) {
        this.a = new bwuz();
        this.b = new bwuz();
        this.h = contentResolver0;
        this.j = uri0;
        this.c = s;
        String[] arr_s1 = new String[arr_s.length + 3];
        this.k = arr_s1;
        System.arraycopy(bwva.d, 0, arr_s1, 0, 3);
        System.arraycopy(arr_s, 0, arr_s1, 3, arr_s.length);
    }

    public final void a() {
        this.a.d();
        this.b.d();
        this.i = true;
    }

    public final void b(long v) {
        long v1;
        bwuz bwuz0 = this.a;
        if(bwuz0.g()) {
            this.c(v);
        }
        bwuz bwuz1 = this.b;
        if(bwuz1.g()) {
            v1 = v;
            this.d(bwuz1.b(this.h, this.j, "tags", bwva.f, bwva.g, v1, "100"));
        }
        else {
            v1 = v;
        }
        if(bwuz0.g() && !bwuz1.g()) {
            this.c(v1);
            bwne.q("In second refillDocumentCursor, last seen seqno: %d, docs seqno: %d, tags seqno: %d", new Object[]{v1, bwuz0.a(), bwuz1.a()});
        }
    }

    private final void c(long v) {
        this.d(this.a.b(this.h, this.j, "documents", this.k, bwva.e, v, "20"));
    }

    private final void d(String s) {
        if(!TextUtils.isEmpty(s)) {
            if(TextUtils.isEmpty(this.c)) {
                this.c = s;
                return;
            }
            if(!s.equals(this.c)) {
                throw new bwvi(this.c, s);
            }
        }
    }

    @Override
    protected final void finalize() {
        try {
            if(!this.i) {
                bwne.f("Content cursor disposed without a closing");
            }
            this.a();
        }
        finally {
            super.finalize();
        }
    }
}

