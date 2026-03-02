import android.os.Bundle;

public final class aqmn implements fs {
    public final aqmq a;

    public aqmn(aqmq aqmq0) {
        this.a = aqmq0;
    }

    @Override  // fs
    public final void a(String s, Bundle bundle0) {
        ibuq.f(s, "<unused var>");
        ibuq.f(bundle0, "bundle");
        String s1 = bundle0.getString("backup_dialog_tag");
        if(s1 != null) {
            ibth ibth0 = (ibth)this.a.d.get(s1);
            if(ibth0 != null) {
                ibth0.a();
            }
        }
    }
}

