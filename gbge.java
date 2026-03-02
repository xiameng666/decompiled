import android.database.SQLException;

public final class gbge implements ibth {
    public final SQLException a;

    public gbge(SQLException sQLException0) {
        this.a = sQLException0;
    }

    @Override  // ibth
    public final Object a() {
        return "Failed to create new session entries: " + this.a.getMessage();
    }
}

