import android.content.Context;
import android.text.TextUtils;
import android.widget.Filter;
import android.widget.Filterable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

public final class accc extends acei implements Filterable {
    public final int a;
    public final Context b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public boolean f;
    public final Collection g;
    public List h;
    public String i;
    public int j;
    public final aceh k;
    public aceg l;
    private final acca n;

    public accc(Context context0, boolean z, String[] arr_s) {
        super(context0);
        this.a = this.b();
        this.b();
        this.b();
        this.k = new aceh(this);
        this.b = context0;
        this.c = z;
        List list0 = Arrays.asList(acfd.i(arr_s));
        this.d = list0.contains("email");
        this.e = list0.contains("phone");
        this.n = new acca(this);
        this.g = new LinkedHashSet();
        this.h = new ArrayList();
        this.l = new aceg(this, this.h);
    }

    public static String a(String s) {
        if(TextUtils.isEmpty(s)) {
            return "";
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        int v = s.length();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = s.charAt(v1);
            if(v2 != 40 && v2 != 41 && v2 != 43 && v2 != 46 && (Character.getType(((char)v2)) != 12 && Character.getType(((char)v2)) != 20)) {
                int v3 = Character.digit(((char)v2), 10);
                if(v3 == -1) {
                    stringBuilder0.append(((char)v2));
                }
                else {
                    stringBuilder0.append(v3);
                }
            }
        }
        return stringBuilder0.toString();
    }

    @Override  // android.widget.Filterable
    public final Filter getFilter() {
        return this.n;
    }
}

