import android.accounts.Account;
import android.content.Context;
import android.net.Uri;

public final class fkwk {
    public final Account a;
    public final fjcv b;
    private final Context c;
    private final hfid d;

    public fkwk(Account account0, Context context0, fjcv fjcv0) {
        this.a = account0;
        this.c = context0;
        this.d = new hfid(null);
        this.b = fjcv0;
    }

    final int a(int v) {
        switch(v) {
            case 0: {
                return this.c.getResources().getDimensionPixelSize(0x7F071399);  // dimen:tiny_photo_size
            }
            case 1: {
                return this.c.getResources().getDimensionPixelSize(0x7F0710FC);  // dimen:small_photo_size
            }
            case 2: {
                return this.c.getResources().getDimensionPixelSize(0x7F070BE3);  // dimen:medium_photo_size
            }
            case 3: {
                return this.c.getResources().getDimensionPixelSize(0x7F0708D7);  // dimen:large_photo_size
            }
            case 4: {
                return this.c.getResources().getDimensionPixelSize(0x7F07136D);  // dimen:thumbnail_photo_size
            }
            default: {
                return this.c.getResources().getDimensionPixelSize(0x7F0716E5);  // dimen:x_large_photo_size
            }
        }
    }

    public static String b(String s) {
        return "photos_filegroup_" + s;
    }

    public final String c(Uri uri0, int v) {
        hfid hfid0 = this.d;
        if(hfid0.i(uri0)) {
            int v1 = this.a(v);
            hfik hfik0 = new hfik();
            hfik0.d(v1);
            return hfid0.j(hfik0, uri0).toString();
        }
        return uri0 + "?sz=" + this.a(v);
    }
}

