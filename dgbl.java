import android.content.Context;

final class dgbl {
    static final String[] a;
    static final String[] b;
    public final Context c;

    static {
        dgbl.a = new String[]{"_id", "lookup"};
        dgbl.b = new String[]{"contact_id", "lookup", "display_name", "photo_thumb_uri", "mimetype", "data1", "data4", "account_name", "account_type", "starred"};
    }

    public dgbl(Context context0) {
        this.c = context0;
    }
}

