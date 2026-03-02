import android.database.Cursor;

public final class caor extends caoq {
    public caor(Cursor cursor0) {
        this.a = cursor0;
    }

    @Override  // caoq
    protected final capd c() {
        caov caov0 = new caov();
        caov0.a = this.a.getLong(this.a.getColumnIndex("_id"));
        caov0.b = this.a.getString(this.a.getColumnIndex("album"));
        this.a.getString(this.a.getColumnIndex("album_art"));
        caov0.c = this.a.getString(this.a.getColumnIndex("artist"));
        caov0.d = this.a.getInt(this.a.getColumnIndex("numsongs"));
        return new caow(caov0);
    }
}

