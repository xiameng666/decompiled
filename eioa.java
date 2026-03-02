import android.database.Cursor;

public final class eioa extends eiob implements eioe {
    public eioa(Cursor cursor0) {
        super(cursor0);
    }

    @Deprecated
    public final int a() {
        return this.a.getCount();
    }

    @Override  // eioe
    public final boolean b() {
        return this.a.moveToNext();
    }

    @Override  // eiob, eioi
    public final long c() {
        return this.a.getLong(0);
    }

    @Override  // eioe
    public final void close() {
        Cursor cursor0 = this.a;
        if(cursor0 != null) {
            cursor0.close();
        }
    }

    @Override  // eiob, eioi
    public final long d() {
        return this.a.getLong(1);
    }
}

