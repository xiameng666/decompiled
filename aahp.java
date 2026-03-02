import android.content.Intent;

public final class aahp implements lqj {
    public final aahu a;

    public aahp(aahu aahu0) {
        this.a = aahu0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        String s = ((aamq)object0).a.b;
        Intent intent0 = new Intent().putExtra("authAccount", s);
        xob xob0 = (xob)this.a.requireContext();
        xob0.setResult(-1, intent0);
        xob0.finish();
    }
}

