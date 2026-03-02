import android.database.sqlite.SQLiteDatabase;

public final class fllf implements Runnable {
    public final SQLiteDatabase a;

    public fllf(SQLiteDatabase sQLiteDatabase0) {
        this.a = sQLiteDatabase0;
    }

    @Override
    public final void run() {
        flnh.d(this.a);
    }
}

