import android.database.Cursor;

public abstract class caoq implements AutoCloseable {
    public Cursor a;

    public final int a() {
        return this.a.getCount();
    }

    public final capd b() {
        if(!this.a.isClosed() && this.a.getCount() != 0) {
            int v = this.a.getPosition();
            this.a.moveToFirst();
            capd capd0 = this.c();
            this.a.moveToPosition(v);
            return capd0;
        }
        return null;
    }

    protected abstract capd c();

    @Override
    public final void close() {
        this.a.close();
    }

    public final capd d() {
        return this.a.moveToNext() ? this.c() : null;
    }

    public final boolean e() {
        return !this.a.isClosed() && this.a.getCount() != 0 && !this.a.isLast();
    }
}

