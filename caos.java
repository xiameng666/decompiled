import android.database.Cursor;

public final class caos extends caoq {
    public caos(Cursor cursor0) {
        this.a = cursor0;
    }

    @Override  // caoq
    protected final capd c() {
        caox caox0 = new caox();
        caox0.b = this.a.getLong(this.a.getColumnIndex("_id"));
        caox0.a = this.a.getString(this.a.getColumnIndex("artist"));
        return new caoy(caox0);
    }
}

