import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import j..util.Objects;

public final class eiol extends einz {
    final eior d;

    public eiol(eior eior0, String s, Object[] arr_object, String[] arr_s) {
        Objects.requireNonNull(eior0);
        this.d = eior0;
        super(s, arr_object, arr_s);
    }

    public final int b() {
        try(SQLiteStatement sQLiteStatement0 = this.d.c.compileStatement(this.a)) {
            this.a(sQLiteStatement0);
            this.d.d.a();
            return sQLiteStatement0.executeUpdateDelete();
        }
    }

    public final long c() {
        try(SQLiteStatement sQLiteStatement0 = this.d.c.compileStatement(this.a)) {
            this.a(sQLiteStatement0);
            this.d.d.a();
            return sQLiteStatement0.executeInsert();
        }
    }

    public final void d() {
        try(SQLiteStatement sQLiteStatement0 = this.d.c.compileStatement(this.a)) {
            this.a(sQLiteStatement0);
            this.d.d.a();
            sQLiteStatement0.execute();
        }
    }

    public final eiol e() {
        return new eiol(this.d, this.a, this.b, eior.a);
    }

    public final eiol f(String[] arr_s) {
        return new eiol(this.d, this.a, this.b, arr_s);
    }

    public final eiol g(Object[] arr_object) {
        return new eiol(this.d, this.a, arr_object, this.c);
    }

    public final eiol h(eiob eiob0) {
        Cursor cursor0 = eiob0.a;
        int v = cursor0.getColumnCount();
        Object[] arr_object = new Object[v];
        for(int v1 = 0; v1 < v; ++v1) {
            switch(cursor0.getType(v1)) {
                case 0: {
                    break;
                }
                case 1: {
                    arr_object[v1] = cursor0.getLong(v1);
                    break;
                }
                case 2: {
                    arr_object[v1] = cursor0.getDouble(v1);
                    break;
                }
                case 3: {
                    arr_object[v1] = cursor0.getString(v1);
                    break;
                }
                case 4: {
                    arr_object[v1] = cursor0.getBlob(v1);
                    break;
                }
                default: {
                    throw new IllegalStateException("Unrecognized column type:" + cursor0.getType(v1));
                }
            }
        }
        return new eiol(this.d, this.a, arr_object, this.c);
    }
}

