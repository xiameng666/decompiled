import android.content.Context;

public final class fmiz implements flvf {
    private final Context a;
    private final fmjf b;

    public fmiz(Context context0, fmjf fmjf0) {
        this.a = context0;
        this.b = fmjf0;
    }

    @Override  // flvf
    public final flvf a(String s) {
        if(iadl.h()) {
            this.b.a = s;
            return this;
        }
        fmjf fmjf0 = new fmjf(s);
        return new fmiz(this.a, fmjf0);
    }

    @Override  // flvf
    public final Object b() {
        return this.b;
    }
}

