import android.database.Cursor;

public final class caot extends caoq {
    public caot(Cursor cursor0) {
        this.a = cursor0;
    }

    @Override  // caoq
    protected final capd c() {
        caoz caoz0 = new caoz();
        caoz0.a = this.a.getLong(this.a.getColumnIndex("_id"));
        caoz0.b = this.a.getLong(this.a.getColumnIndex("date_modified"));
        caoz0.c = this.a.getString(this.a.getColumnIndex("title"));
        caoz0.d = this.a.getString(this.a.getColumnIndex("album"));
        caoz0.e = this.a.getLong(this.a.getColumnIndex("album_id"));
        caoz0.f = this.a.getString(this.a.getColumnIndex("artist"));
        caoz0.g = this.a.getLong(this.a.getColumnIndex("artist_id"));
        return new capc(caoz0);
    }
}

