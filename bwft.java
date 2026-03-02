import android.database.MatrixCursor;

public final class bwft implements bwfx {
    public final MatrixCursor a;

    public bwft(MatrixCursor matrixCursor0) {
        this.a = matrixCursor0;
    }

    @Override  // bwfx
    public final void a(String s, String s1) {
        this.a.addRow(new String[]{s, s1});
    }
}

