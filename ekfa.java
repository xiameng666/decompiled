import android.os.Bundle;

public final class ekfa implements glzn {
    public final hiiy a;
    public final ekau b;
    public final cmbm c;

    public ekfa(cmbm cmbm0, hiiy hiiy0, ekau ekau0) {
        this.c = cmbm0;
        this.a = hiiy0;
        this.b = ekau0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        Void void0 = (Void)object0;
        Bundle bundle0 = new Bundle();
        bundle0.putInt("trigger_id", this.b.a);
        bundle0.putLong("trigger_timestamp", this.b.b);
        return gmbu.m(new cmav(this.c, this.a, bundle0), this.c.b);
    }
}

