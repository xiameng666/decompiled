import android.database.Cursor;

class eiob implements eioi {
    public final Cursor a;

    public eiob(Cursor cursor0) {
        this.a = cursor0;
    }

    @Override  // eioi
    public long c() {
        throw null;
    }

    @Override  // eioi
    public long d() {
        throw null;
    }

    @Override  // eioi
    public final double e(int v) {
        return this.a.getDouble(v);
    }

    @Override  // eioi
    public final long f(int v) {
        return this.a.getLong(v);
    }

    @Override  // eioi
    public final String g(int v) {
        return this.a.getString(v);
    }

    @Override  // eioi
    public final String h(int v) {
        String s = this.a.getString(v);
        this.l(v, s);
        return s;
    }

    @Override  // eioi
    public final boolean i(int v) {
        return this.a.isNull(v);
    }

    @Override  // eioi
    public final byte[] j(int v) {
        return this.a.getBlob(v);
    }

    @Override  // eioi
    public final byte[] k(int v) {
        byte[] arr_b = this.a.getBlob(v);
        this.l(v, arr_b);
        return arr_b;
    }

    final void l(int v, Object object0) {
        if(object0 != null) {
            return;
        }
        throw new eioj("Returned NULL for column " + this.a.getColumnName(v));
    }
}

