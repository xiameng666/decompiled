import android.database.Cursor;

public final class flmf implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ggdy ggdy0 = new ggdy();
        while(((Cursor)object0).moveToNext()) {
            gfsx gfsx0 = floa.c(((Cursor)object0));
            if(gfsx0.i()) {
                ggdy0.i(gfsx0.d());
            }
            else {
                flbj.c("ContactCursors", "error parsing row in list");
            }
        }
        return ggdy0.h();
    }
}

