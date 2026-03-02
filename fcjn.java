import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.gms.wearable.AppTheme;
import java.util.List;

public final class fcjn extends tk {
    public static final fcgf a;
    public List e;
    public final lqi f;
    private final long g;
    private final AppTheme h;

    static {
        fcjn.a = new fcgf(new String[]{"DeviceListAdapter"});
    }

    public fcjn(AppTheme appTheme0) {
        this.e = null;
        this.f = new lqi();
        this.g = System.currentTimeMillis();
        this.h = appTheme0;
    }

    @Override  // tk
    public final int b() {
        return this.e == null ? 0 : this.e.size();
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        return fczo.i(this.h) ? new fcjp(LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0225, viewGroup0, false), this.g) : new fcjp(LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0222, viewGroup0, false), this.g);  // layout:companion_restore_expressive_device_list_item
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        List list0 = this.e;
        if(list0 != null) {
            aqfl aqfl0 = (aqfl)list0.get(v);
            ((fcjp)uq0).t.setText(aqfl0.e);
            CharSequence charSequence0 = DateUtils.getRelativeTimeSpanString(aqfl0.d, ((fcjp)uq0).v, 60000L, 0x40000);
            ((fcjp)uq0).u.setText(charSequence0);
            ((fcjp)uq0).a.setOnClickListener(new fcjm(this, list0, v));
        }
    }
}

