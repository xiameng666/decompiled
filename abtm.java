import android.text.format.Formatter;
import android.widget.TextView;
import com.google.android.gms.app.phone.settings.ManageSpaceChimeraActivity;
import j..util.Objects;

public final class abtm implements evqf {
    final ManageSpaceChimeraActivity a;

    public abtm(ManageSpaceChimeraActivity manageSpaceChimeraActivity0) {
        Objects.requireNonNull(manageSpaceChimeraActivity0);
        this.a = manageSpaceChimeraActivity0;
        super();
    }

    @Override  // evqf
    public final void gw(Object object0) {
        long v1;
        long v;
        if(((azui)object0) == null) {
            v = 0L;
            v1 = 0L;
        }
        else {
            v = ((azui)object0).l();
            v1 = ((azui)object0).k();
        }
        ManageSpaceChimeraActivity manageSpaceChimeraActivity0 = this.a;
        manageSpaceChimeraActivity0.j.setText(Formatter.formatFileSize(manageSpaceChimeraActivity0, v));
        TextView textView0 = manageSpaceChimeraActivity0.l;
        if(textView0 != null) {
            textView0.setText(Formatter.formatFileSize(manageSpaceChimeraActivity0, v1));
        }
    }
}

