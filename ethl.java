import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.tapandpay.ui.rowsecondary.icon.RowSecondaryIcon;
import com.google.android.libraries.tapandpay.ui.tile.standard.TileStandard;
import java.util.List;

public final class ethl extends tk {
    public etio a;
    private final etlf e;
    private final boolean f;
    private List g;

    public ethl(etlf etlf0, boolean z) {
        ibuq.f(etlf0, "viewModel");
        super();
        this.e = etlf0;
        this.f = z;
        this.f();
    }

    @Override  // tk
    public final int b() {
        this.f();
        List list0 = this.g;
        if(list0 == null) {
            ibuq.j("devices");
            list0 = null;
        }
        return list0.size();
    }

    @Override  // tk
    public final int dx(int v) {
        List list0 = this.g;
        if(list0 == null) {
            ibuq.j("devices");
            list0 = null;
        }
        etli etli0 = (etli)list0.get(v);
        etlf etlf0 = this.e;
        if(!etlf.p(etli0)) {
            return 2;
        }
        if(etli0.h == gtmu.c) {
            if(etlf0.o()) {
                String[] arr_s = etlf0.d.l;
                if(arr_s != null) {
                    if(arr_s.length == 0) {
                        return 1;
                    }
                    for(int v1 = 0; v1 < arr_s.length; ++v1) {
                        if("fitbit".equals(arr_s[v1])) {
                            return 1;
                        }
                    }
                    return 3;
                }
                return 1;
            }
            return 3;
        }
        return 1;
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        switch(v) {
            case 1: {
                View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0B54, viewGroup0, false);  // layout:tapandpay_device_list_item
                ibuq.e(view0, "inflate(...)");
                return new uq(view0, null);
            }
            case 2: {
                View view1 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0C0F, viewGroup0, false);  // layout:unselectable_device_list_item
                ibuq.e(view1, "inflate(...)");
                return new uq(view1, null);
            }
            case 3: {
                View view2 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0B55, viewGroup0, false);  // layout:tapandpay_device_unsupported_card
                ibuq.e(view2, "inflate(...)");
                return new uq(view2, null);
            }
            default: {
                throw new IllegalStateException("Could not find view binder");
            }
        }
    }

    private final void f() {
        this.g = this.f ? this.e.a().d.a : this.e.a().c.a;
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        String s;
        ibuq.f(uq0, "viewHolder");
        List list0 = this.g;
        if(list0 == null) {
            ibuq.j("devices");
            list0 = null;
        }
        etli etli0 = (etli)list0.get(v);
        int v1 = (gtmv.b(etli0.a.g) == null ? gtmv.e : gtmv.b(etli0.a.g)) == gtmv.b ? 0x7F080BED : 0x7F080C64;  // drawable:quantum_gm_ic_phone_android_vd_theme_24
        if(etli0.a.j) {
            s = uq0.a.getContext().getString(0x7F150D69, new Object[]{etli0.e});  // string:device_name_for_current_device "%1$s (this phone)"
            ibuq.c(s);
        }
        else {
            s = etli0.e;
        }
        switch(this.dx(v)) {
            case 1: {
                TileStandard tileStandard1 = (TileStandard)uq0.a;
                tileStandard1.setEnabled(false);
                tileStandard1.p(s);
                Drawable drawable1 = tileStandard1.getContext().getDrawable(v1);
                if(drawable1 != null) {
                    tileStandard1.j(drawable1);
                }
                if(this.a != null) {
                    tileStandard1.setOnClickListener(new ethk(this, etli0));
                }
                return;
            }
            case 2: {
                ((RowSecondaryIcon)uq0.a).o(s);
                ((RowSecondaryIcon)uq0.a).r(v1);
                return;
            }
            default: {
                uq0.a.findViewById(0x7F0B08B1).setBackgroundColor(0);  // id:TileContainer
                TileStandard tileStandard0 = (TileStandard)uq0.a;
                tileStandard0.p(s);
                Drawable drawable0 = tileStandard0.getContext().getDrawable(v1);
                if(drawable0 != null) {
                    tileStandard0.j(drawable0);
                }
            }
        }
    }
}

