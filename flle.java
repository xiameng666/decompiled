import android.database.Cursor;

public final class flle implements gfsi {
    public final flmu a;

    public flle(flmu flmu0) {
        this.a = flmu0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        gged_interceptors gged0;
        Cursor cursor0 = (Cursor)object0;
        ggdy ggdy0 = new ggdy();
        if(cursor0.moveToFirst()) {
            do {
                try {
                    gfsx gfsx0 = floc.a(cursor0);
                    if(gfsx0.i()) {
                        ggdy0.i(flnv.b(gfsx0.d()));
                    }
                    else {
                        fmai fmai0 = fmaj.a();
                        fmai0.g(10031);
                        ggdy0.i(flnv.a(fmai0.a()));
                    }
                }
                catch(Exception unused_ex) {
                    fmai fmai1 = fmaj.a();
                    fmai1.g(10031);
                    ggdy0.i(flnv.a(fmai1.a()));
                }
            }
            while(cursor0.moveToNext());
        }
        gged0 = ggdy0.h();
        gged_interceptors gged1 = flof.d(gged0);
        int v = ((ggna)gged1).c;
        for(int v1 = 0; v1 < v; ++v1) {
            fmaj fmaj0 = (fmaj)gged1.get(v1);
            this.a.d.b(fmaj0);
        }
        return flof.e(gged0);
    }
}

