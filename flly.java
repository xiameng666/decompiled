import android.database.Cursor;

public final class flly implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ggdy ggdy0 = new ggdy();
        while(((Cursor)object0).moveToNext()) {
            gfsx gfsx0 = flor.b(((Cursor)object0));
            if(gfsx0.i()) {
                ggdy0.i(gfsx0.d());
            }
        }
        return ggdy0.h();
    }
}

