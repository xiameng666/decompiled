import android.content.Context;
import android.view.View.OnClickListener;
import android.view.View;
import j..util.Objects;

public final class duej implements View.OnClickListener {
    public final duew a;

    public duej(duew duew0) {
        this.a = duew0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        duew duew0 = this.a;
        Context context0 = duew0.requireContext();
        gtxf gtxf0 = gtxf.b(((gtxg)Objects.requireNonNull(duew0.aH)).h);
        if(gtxf0 == null) {
            gtxf0 = gtxf.f;
        }
        duew0.startActivity(dlnf.bH(context0, dtzb.d(gtxf0)));
    }
}

