import android.content.Context;
import android.net.Uri;

final class ekeu {
    public final frli a;
    private static ekeu b;

    private ekeu(Context context0) {
        frce frce0 = new frce(context0);
        frce0.d("romanesco");
        frce0.e("ContactIdDataStore.pb");
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)ejxp.a));
        frif frif0 = frie0.a();
        this.a = cjtb.a.a(frif0);
    }

    static ekeu a(Context context0) {
        synchronized(ekeu.class) {
            if(ekeu.b == null) {
                ekeu.b = new ekeu(context0.getApplicationContext());
            }
        }
        return ekeu.b;
    }
}

