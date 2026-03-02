import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.view.View;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceGroup;
import com.android.settingslib.widget.ExpandablePreference;
import java.util.ArrayList;

public class skr extends oib {
    private final PreferenceGroup e;
    private ArrayList f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final Handler l;
    private final Runnable m;

    public skr(PreferenceGroup preferenceGroup0) {
        super(preferenceGroup0);
        this.e = preferenceGroup0;
        this.f = new ArrayList();
        this.l = new Handler(Looper.getMainLooper());
        this.m = () -> {
            ArrayList arrayList0 = new ArrayList(this.f);
            ArrayList arrayList1 = new ArrayList();
            this.f = arrayList1;
            arrayList1.clear();
            int v = this.b();
            ArrayList arrayList2 = new ArrayList(v);
            Integer integer0 = (int)0;
            for(int v2 = 0; v2 < v; ++v2) {
                arrayList2.add(integer0);
            }
            PreferenceGroup preferenceGroup0 = this.e;
            arrayList1.addAll(arrayList2);
            int v3 = this.b();
            int v5 = -1;
            int v6 = -1;
            for(int v4 = 0; v4 < v3; ++v4) {
                PreferenceGroup preferenceGroup1 = null;
                Preference preference0 = this.n(v4);
                if((preference0 instanceof sjy)) {
                    arrayList1.set(v4, integer0);
                    v5 = -1;
                    v6 = -1;
                }
                else if((preference0 instanceof PreferenceCategory)) {
                    arrayList1.set(v4, integer0);
                    v5 = -1;
                    v6 = -1;
                    preferenceGroup0 = (PreferenceGroup)preference0;
                }
                else if((preference0 instanceof ExpandablePreference) && ((ExpandablePreference)preference0).d) {
                    if((preference0 instanceof PreferenceGroup)) {
                        preferenceGroup1 = (PreferenceGroup)preference0;
                    }
                    arrayList1.set(v4, Integer.valueOf(((Number)arrayList1.get(v4)).intValue() | 3));
                    v6 = -1;
                    v5 = v4;
                    preferenceGroup0 = preferenceGroup1;
                }
                else {
                    if(preference0 != null) {
                        preferenceGroup1 = preference0.E;
                    }
                    arrayList1.set(v4, Integer.valueOf(((Number)arrayList1.get(v4)).intValue() | 1));
                    if(preferenceGroup1 == preferenceGroup0) {
                        if(v5 == -1) {
                            arrayList1.set(v4, Integer.valueOf(((Number)arrayList1.get(v4)).intValue() | 2));
                            v5 = v4;
                        }
                        if(v6 == -1 || v6 < v4) {
                            if(v6 != -1) {
                                arrayList1.set(v6, Integer.valueOf(((Number)arrayList1.get(v6)).intValue() & -5));
                            }
                            arrayList1.set(v4, Integer.valueOf(((Number)arrayList1.get(v4)).intValue() | 4));
                            v6 = v4;
                        }
                    }
                    else {
                        arrayList1.set(v4, Integer.valueOf(((Number)arrayList1.get(v4)).intValue() | 2));
                        arrayList1.set(v4, Integer.valueOf(((Number)arrayList1.get(v4)).intValue() | 4));
                        v5 = v4;
                        v6 = v5;
                        preferenceGroup0 = preferenceGroup1;
                    }
                }
            }
            if(!ibuq.m(this.f, arrayList0)) {
                ArrayList arrayList3 = this.f;
                int v7 = Math.min(arrayList0.size(), arrayList3.size());
                for(int v1 = 0; v1 < v7; ++v1) {
                    if(!ibuq.m(arrayList0.get(v1), arrayList3.get(v1))) {
                        this.r(v1);
                    }
                }
                int v8 = arrayList3.size() - v7;
                if(v8 > 0) {
                    this.u(v7, v8);
                }
            }
        };
        int v = preferenceGroup0.j.getResources().getDimensionPixelSize(0x7F07102C);  // dimen:settingslib_expressive_space_small1
        this.g = v;
        this.h = v + v;
        int v1 = preferenceGroup0.j.getResources().getDimensionPixelSize(0x7F07102C);  // dimen:settingslib_expressive_space_small1
        this.i = v1;
        this.j = v1 + v1;
        TypedValue typedValue0 = new TypedValue();
        preferenceGroup0.j.getTheme().resolveAttribute(0x101030E, typedValue0, true);
        this.k = typedValue0.resourceId;
        this.J();
    }

    @Override  // oib
    public void G(oij oij0, int v) {
        int v1 = 0;
        ibuq.f(oij0, "holder");
        super.G(oij0, v);
        View view0 = oij0.a;
        Context context0 = view0.getContext();
        ibuq.c(context0);
        if(!sku.a(context0)) {
            v1 = this.k;
        }
        else if(v >= 0 && v < this.f.size()) {
            Object object0 = this.f.get(v);
            ibuq.e(object0, "get(...)");
            int v2 = ((Number)object0).intValue();
            if((v2 & 1) != 0) {
                if((v2 & 2) != 0 && (v2 & 4) == 0) {
                    v1 = 0x7F080EAF;  // drawable:settingslib_round_background_top
                }
                else if((v2 & 4) != 0 && (v2 & 2) == 0) {
                    v1 = 0x7F080EA7;  // drawable:settingslib_round_background_bottom
                }
                else if((v2 & 2) == 0) {
                    v1 = 0x7F080EAA;  // drawable:settingslib_round_background_center
                }
                else {
                    v1 = 0x7F080EA6;  // drawable:settingslib_round_background
                }
            }
        }
        if(sku.a(context0)) {
            int v3 = v1 == 0 ? this.g : this.h;
            int v4 = v1 == 0 ? this.i : this.j;
            if((this.n(v) instanceof skm)) {
                int v5 = context0.getResources().getDimensionPixelSize(0x7F07101D);  // dimen:settingslib_expressive_space_extrasmall4
                v3 += v5;
                v4 += v5;
            }
            view0.setPaddingRelative(v3, view0.getPaddingTop(), v4, view0.getPaddingBottom());
        }
        view0.setBackgroundResource(v1);
    }

    @Override  // oib
    public final void H(Preference preference0) {
        super.H(preference0);
        this.l.removeCallbacks(this.m);
        this.l.post(this.m);
    }

    // Detected as a lambda impl.
    public final void J() {
        ArrayList arrayList0 = new ArrayList(this.f);
        ArrayList arrayList1 = new ArrayList();
        this.f = arrayList1;
        arrayList1.clear();
        int v = this.b();
        ArrayList arrayList2 = new ArrayList(v);
        Integer integer0 = (int)0;
        for(int v2 = 0; v2 < v; ++v2) {
            arrayList2.add(integer0);
        }
        PreferenceGroup preferenceGroup0 = this.e;
        arrayList1.addAll(arrayList2);
        int v3 = this.b();
        int v5 = -1;
        int v6 = -1;
        for(int v4 = 0; v4 < v3; ++v4) {
            PreferenceGroup preferenceGroup1 = null;
            Preference preference0 = this.n(v4);
            if((preference0 instanceof sjy)) {
                arrayList1.set(v4, integer0);
                v5 = -1;
                v6 = -1;
            }
            else if((preference0 instanceof PreferenceCategory)) {
                arrayList1.set(v4, integer0);
                v5 = -1;
                v6 = -1;
                preferenceGroup0 = (PreferenceGroup)preference0;
            }
            else if((preference0 instanceof ExpandablePreference) && ((ExpandablePreference)preference0).d) {
                if((preference0 instanceof PreferenceGroup)) {
                    preferenceGroup1 = (PreferenceGroup)preference0;
                }
                arrayList1.set(v4, Integer.valueOf(((Number)arrayList1.get(v4)).intValue() | 3));
                v6 = -1;
                v5 = v4;
                preferenceGroup0 = preferenceGroup1;
            }
            else {
                if(preference0 != null) {
                    preferenceGroup1 = preference0.E;
                }
                arrayList1.set(v4, Integer.valueOf(((Number)arrayList1.get(v4)).intValue() | 1));
                if(preferenceGroup1 == preferenceGroup0) {
                    if(v5 == -1) {
                        arrayList1.set(v4, Integer.valueOf(((Number)arrayList1.get(v4)).intValue() | 2));
                        v5 = v4;
                    }
                    if(v6 == -1 || v6 < v4) {
                        if(v6 != -1) {
                            arrayList1.set(v6, Integer.valueOf(((Number)arrayList1.get(v6)).intValue() & -5));
                        }
                        arrayList1.set(v4, Integer.valueOf(((Number)arrayList1.get(v4)).intValue() | 4));
                        v6 = v4;
                    }
                }
                else {
                    arrayList1.set(v4, Integer.valueOf(((Number)arrayList1.get(v4)).intValue() | 2));
                    arrayList1.set(v4, Integer.valueOf(((Number)arrayList1.get(v4)).intValue() | 4));
                    v5 = v4;
                    v6 = v5;
                    preferenceGroup0 = preferenceGroup1;
                }
            }
        }
        if(!ibuq.m(this.f, arrayList0)) {
            ArrayList arrayList3 = this.f;
            int v7 = Math.min(arrayList0.size(), arrayList3.size());
            for(int v1 = 0; v1 < v7; ++v1) {
                if(!ibuq.m(arrayList0.get(v1), arrayList3.get(v1))) {
                    this.r(v1);
                }
            }
            int v8 = arrayList3.size() - v7;
            if(v8 > 0) {
                this.u(v7, v8);
            }
        }
    }

    @Override  // oib
    public void h(uq uq0, int v) {
        this.G(((oij)uq0), v);
    }
}

