import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;

public final class ekkl implements View.OnClickListener {
    public final ekku a;

    public ekkl(ekku ekku0) {
        this.a = ekku0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Intent intent0 = new Intent().setClassName("com.google.android.gms", "com.google.android.gms.people.sync.coreui.ContactsSyncCoreActivity");
        intent0.putExtra("authAccount", this.a.e.c.i());
        this.a.e.startActivityForResult(intent0, 4);
    }
}

