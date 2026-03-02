import android.database.SQLException;

public final class gbgh implements ibth {
    public final SQLException a;

    public gbgh(SQLException sQLException0) {
        this.a = sQLException0;
    }

    @Override  // ibth
    public final Object a() {
        return "Failed to put saved state: " + this.a.getMessage();
    }
}

