import android.content.Context;
import java.io.File;

public final class athn {
    public final atho a;
    public final athp b;
    public final int c;

    public athn(atho atho0, athp athp0, int v) {
        this.a = atho0;
        this.b = athp0;
        this.c = v;
    }

    public static athn a(Context context0) {
        athp athp0 = new athp((hrnt.i() ? new File(ccsb.a.b(context0.getFilesDir(), "tertiary_key_rotation_windowed_count")) : new File(context0.getFilesDir(), "tertiary_key_rotation_windowed_count")));
        return new athn(new atho(context0.getSharedPreferences("tertiary_key_rotation_tracker", 0), ((int)hqjb.a.d().e())), athp0, ((int)hqjb.a.d().f()));
    }
}

