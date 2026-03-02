import android.database.Cursor;

public final class caou extends caoq {
    public caou(Cursor cursor0) {
        this.a = cursor0;
    }

    @Override  // caoq
    protected final capd c() {
        capa capa0 = new capa();
        capa0.b = this.a.getLong(this.a.getColumnIndex("_id"));
        capa0.a = this.a.getString(this.a.getColumnIndex("name"));
        return new capb(capa0);
    }
}

