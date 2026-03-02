import android.content.Context;

public final class fmqz implements fmrd {
    public final Context a;
    public final iv b;
    public fmrc c;

    public fmqz(Context context0) {
        this.a = context0;
        this.b = new fyju(context0);
    }

    public final void a(String s) {
        String s1 = this.a.getResources().getString(0x7F15053D, new Object[]{s});  // string:block_user_format "Block %1$s?"
        ((fyju)this.b).O(s1);
    }

    @Override  // fmrd
    public final void aL(Object object0) {
        throw null;
    }
}

