import android.database.sqlite.SQLiteProgram;

class einz {
    protected final String a;
    protected final Object[] b;
    protected final String[] c;

    public einz(String s, Object[] arr_object, String[] arr_s) {
        this.a = s;
        this.b = arr_object;
        this.c = arr_s;
    }

    protected final void a(SQLiteProgram sQLiteProgram0) {
        Object[] arr_object = this.b;
        if(arr_object != null) {
            int v = 0;
            while(v < arr_object.length) {
                Object object0 = arr_object[v];
                if(object0 == null) {
                    sQLiteProgram0.bindNull(v + 1);
                    ++v;
                    continue;
                }
                if((object0 instanceof String)) {
                    sQLiteProgram0.bindString(v + 1, ((String)object0));
                    ++v;
                    continue;
                }
                if((object0 instanceof byte[])) {
                    sQLiteProgram0.bindBlob(v + 1, ((byte[])object0));
                    ++v;
                    continue;
                }
                if((object0 instanceof Integer)) {
                    sQLiteProgram0.bindLong(v + 1, ((Integer)object0).longValue());
                    ++v;
                    continue;
                }
                if((object0 instanceof Long)) {
                    sQLiteProgram0.bindLong(v + 1, ((Long)object0).longValue());
                    ++v;
                    continue;
                }
                if((object0 instanceof Float)) {
                    sQLiteProgram0.bindDouble(v + 1, ((Float)object0).doubleValue());
                    ++v;
                    continue;
                }
                if(!(object0 instanceof Double)) {
                    throw new IllegalArgumentException("Attempted to bind an unsupported type " + object0.getClass());
                }
                sQLiteProgram0.bindDouble(v + 1, ((Double)object0).doubleValue());
                ++v;
                continue;
            }
        }
    }
}

