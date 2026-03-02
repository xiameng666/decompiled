import android.content.Context;
import android.content.Intent;
import java.util.HashMap;

public final class gapf implements gamu {
    private final Context a;

    public gapf(Context context0) {
        this.a = context0;
    }

    @Override  // gamu
    public final ganp a(gano gano0) {
        String s = gano0.a.getStringExtra("flow_name");
        HashMap hashMap0 = (HashMap)gano0.a.getSerializableExtra("content_binding");
        bhnd bhnd0 = bhnc.a(this.a, s);
        String s1 = bhnd0.a(hashMap0);
        bhnd0.close();
        Intent intent0 = ganp.e(0);
        intent0.putExtra("result", s1);
        return new ganp(intent0);
    }
}

