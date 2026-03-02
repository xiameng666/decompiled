import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.drawable.Drawable;
import android.text.format.Formatter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.android.gms.wearable.internal.PackageStorageInfo;
import java.util.Collections;
import java.util.List;

public final class ffly extends BaseAdapter {
    private final List a;
    private final LayoutInflater b;
    private final Context c;

    public ffly(xob xob0, fceq fceq0) {
        List list0 = fceq0.b().c;
        this.a = list0;
        Collections.sort(list0, new fflw(this));
        this.b = xob0.getLayoutInflater();
        this.c = xob0.getApplicationContext();
    }

    public final PackageStorageInfo a(int v) {
        return (PackageStorageInfo)this.a.get(v);
    }

    @Override  // android.widget.Adapter
    public final int getCount() {
        return this.a.size();
    }

    @Override  // android.widget.Adapter
    public final Object getItem(int v) {
        return this.a(v);
    }

    @Override  // android.widget.Adapter
    public final long getItemId(int v) {
        return (long)v;
    }

    @Override  // android.widget.Adapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        if(view0 == null) {
            view0 = this.b.inflate(0x7F0E0555, null);  // layout:manage_applications_item
            view0.setTag(new fflx(this.c, view0));
        }
        fflx fflx0 = (fflx)view0.getTag();
        PackageStorageInfo packageStorageInfo0 = this.a(v);
        fflx0.a.setText(packageStorageInfo0.b);
        String s = packageStorageInfo0.c < 0L ? null : Formatter.formatFileSize(fflx0.d, packageStorageInfo0.c);
        fflx0.b.setText(s);
        try {
            Drawable drawable0 = fflx0.d.getPackageManager().getApplicationIcon(packageStorageInfo0.a);
            fflx0.c.setImageDrawable(drawable0);
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            fflx0.c.setImageDrawable(null);
        }
        return view0;
    }
}

