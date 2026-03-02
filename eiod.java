import android.database.sqlite.SQLiteDatatypeMismatchException;
import android.database.sqlite.SQLiteRawStatement;
import android.database.sqlite.SQLiteStatement;
import android.os.Build.VERSION;
import j..util.Objects;
import jeb.synthetic.TWR;

public final class eiod extends einz {
    final eior d;

    public eiod(eior eior0, String s, Object[] arr_object, String[] arr_s) {
        Objects.requireNonNull(eior0);
        this.d = eior0;
        super(s, arr_object, arr_s);
    }

    public final long b() {
        try(SQLiteStatement sQLiteStatement0 = this.d.c.compileStatement(this.a)) {
            this.a(sQLiteStatement0);
            return sQLiteStatement0.simpleQueryForLong();
        }
    }

    public final eioa c() {
        this.d.d.a();
        String s = this.a;
        eioc eioc0 = new eioc(this);
        return new eioa(this.d.c.rawQueryWithFactory(eioc0, s, null, null));
    }

    public final eiod d() {
        return new eiod(this.d, this.a, this.b, eior.a);
    }

    public final eiod e(String[] arr_s) {
        return new eiod(this.d, this.a, this.b, arr_s);
    }

    public final eioe f() {
        eior eior0 = this.d;
        eior0.d.a();
        String s = this.a;
        if(Build.VERSION.SDK_INT >= 35) {
            SQLiteRawStatement sQLiteRawStatement0 = eior0.c.createRawStatement(s);
            eioe eioe0 = new eiom(sQLiteRawStatement0);
            try {
                Object[] arr_object = this.b;
                if(arr_object != null) {
                    for(int v = 0; v < arr_object.length; ++v) {
                        Object object0 = arr_object[v];
                        if(object0 == null) {
                            sQLiteRawStatement0.bindNull(v + 1);
                        }
                        else if((object0 instanceof String)) {
                            sQLiteRawStatement0.bindText(v + 1, ((String)object0));
                        }
                        else if((object0 instanceof byte[])) {
                            sQLiteRawStatement0.bindBlob(v + 1, ((byte[])object0));
                        }
                        else if((object0 instanceof Integer)) {
                            sQLiteRawStatement0.bindLong(v + 1, ((Integer)object0).longValue());
                        }
                        else if((object0 instanceof Long)) {
                            sQLiteRawStatement0.bindLong(v + 1, ((Long)object0).longValue());
                        }
                        else if((object0 instanceof Float)) {
                            sQLiteRawStatement0.bindDouble(v + 1, ((Float)object0).doubleValue());
                        }
                        else {
                            if(!(object0 instanceof Double)) {
                                throw new IllegalArgumentException("Attempted to bind an unsupported type " + object0.getClass());
                            }
                            sQLiteRawStatement0.bindDouble(v + 1, ((Double)object0).doubleValue());
                        }
                    }
                }
                return eioe0;
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(((eiom)eioe0), throwable0);
                throw throwable0;
            }
        }
        eioc eioc0 = new eioc(this);
        return new eioa(eior0.c.rawQueryWithFactory(eioc0, s, null, null));
    }

    public final boolean g() {
        long v = this.b();
        if(v == 0L) {
            return false;
        }
        if(v == 1L) {
            return true;
        }
        throw new SQLiteDatatypeMismatchException(a.D(v, "Query returned ", " which is not a boolean value (0,1)"));
    }

    public final eiod h(Object[] arr_object) {
        return new eiod(this.d, this.a, arr_object, this.c);
    }

    public final eiok i() {
        try(eioe eioe0 = this.f()) {
            if(eioe0.b()) {
                if((eioe0 instanceof eioa)) {
                    eioa eioa0 = (eioa)eioe0;
                    return new eiok(eioe0);
                }
                if(!(eioe0 instanceof eiom)) {
                    throw new IllegalStateException("Unknown result type");
                }
                eiom eiom0 = (eiom)eioe0;
                return new eiok(eioe0);
            }
        }
        return null;
    }
}

