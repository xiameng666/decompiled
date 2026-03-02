import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.format.DateFormat;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewTreeObserver.OnDrawListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.location.quake.ealert.ux.EAlertUxArgs;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class fvwn extends uq implements ViewTreeObserver.OnDrawListener, ViewTreeObserver.OnGlobalLayoutListener, cpnt {
    private final MapView A;
    public static final int t;
    private static final int u;
    private static final int v;
    private final EAlertUxArgs w;
    private cpnp x;
    private boolean y;
    private final AtomicBoolean z;

    static {
        fvwn.u = Color.argb(80, 0xD9, 0x30, 37);
        fvwn.v = Color.argb(20, 0xD9, 0x30, 37);
    }

    public fvwn(View view0, EAlertUxArgs eAlertUxArgs0) {
        super(view0);
        this.z = new AtomicBoolean(false);
        this.w = eAlertUxArgs0;
        Context context0 = view0.getContext();
        MapView mapView0 = (MapView)view0.findViewById(0x7F0B18A6);  // id:map
        this.A = mapView0;
        if(mapView0 == null) {
            return;
        }
        mapView0.b(null);
        mapView0.f();
        mapView0.a(this);
        mapView0.getViewTreeObserver().addOnGlobalLayoutListener(this);
        mapView0.getViewTreeObserver().addOnDrawListener(this);
        ((TextView)view0.findViewById(0x7F0B1853)).setText((eAlertUxArgs0.g ? "Test " : "") + (eAlertUxArgs0.r ? context0.getString(0x7F150E84, new Object[]{((float)eAlertUxArgs0.c)}) : "Estimated earthquake"));  // id:local_map_title
        TextView textView0 = (TextView)view0.findViewById(0x7F0B184F);  // id:local_map_distance
        double f = eAlertUxArgs0.e;
        if(fxmp.g(Locale.getDefault())) {
            textView0.setText(context0.getString(0x7F150DF1, new Object[]{((double)(f * 0.621371))}));  // string:distance_to_epicenter_mile "%.1f miles away"
        }
        else {
            textView0.setText(context0.getString(0x7F150DF0, new Object[]{f}));  // string:distance_to_epicenter_km "%.1f km away"
        }
        ((TextView)view0.findViewById(0x7F0B1852)).setText(new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), (DateFormat.is24HourFormat(context0) ? "MMMM d, yyyy HH:mm" : "MMMM d, yyyy h:mm a")), Locale.getDefault()).format(Long.valueOf(TimeUnit.SECONDS.toMillis(eAlertUxArgs0.a))));  // id:local_map_time
        TextView textView1 = (TextView)view0.findViewById(0x7F0B1850);  // id:local_map_source
        String s = String.format(Locale.getDefault(), "%1$s", context0.getString((eAlertUxArgs0.m == 2 ? 0x7F151468 : 0x7F150EA8)));  // string:google_alert_source "Android Earthquake Alerts System"
        int v = eAlertUxArgs0.m;
        if(s.length() > 0) {
            SpannableString spannableString0 = new SpannableString(s);
            spannableString0.setSpan(new fvwm((v == 2 ? "https://support.google.com/android?p=android_earthquakealerts" : "https://www.shakealert.org"), context0, eAlertUxArgs0), 0, s.length(), 33);
            textView1.setText(spannableString0);
            textView1.setMovementMethod(LinkMovementMethod.getInstance());
        }
        ((Button)view0.findViewById(0x7F0B23F1)).setOnClickListener(new fvwl(context0, eAlertUxArgs0));  // id:update_link
    }

    private final void D() {
        cpni cpni0;
        List list1;
        boolean z = true;
        if(this.y && this.x != null && this.A.getWidth() != 0 && !this.z.getAndSet(true)) {
            MarkerOptions markerOptions0 = new MarkerOptions();
            EAlertUxArgs eAlertUxArgs0 = this.w;
            LatLng latLng0 = eAlertUxArgs0.b;
            markerOptions0.a(latLng0);
            markerOptions0.d = cprn.b(0x7F0806FD);
            this.x.c().b();
            this.x.g(markerOptions0);
            this.x.n(new fvwk());
            cpnp cpnp0 = this.x;
            List list0 = eAlertUxArgs0.l;
            if(list0 != null && list0.isEmpty()) {
                list1 = list0;
            }
            else {
                list1 = eAlertUxArgs0.f;
                if(list1 == null || list1.isEmpty()) {
                    list1 = null;
                }
            }
            if(list1 == null) {
                cpni0 = cpnj.b(latLng0, ((float)(((int)(13.0f - eAlertUxArgs0.c)))));
            }
            else {
                cprw cprw0 = new cprw();
                for(Object object0: list0) {
                    cprw0.b(((LatLng)object0));
                }
                LatLng latLng1 = eAlertUxArgs0.d;
                if(latLng1 != null) {
                    cprw0.b(latLng1);
                }
                if(latLng0 != null) {
                    cprw0.b(latLng0);
                }
                cpni0 = cpnj.a(cprw0.a(), ((int)huqb.a.s().w()));
            }
            cpnp0.i(cpni0);
            MarkerOptions markerOptions1 = new MarkerOptions();
            markerOptions1.a(eAlertUxArgs0.d);
            markerOptions1.d = cprn.b(0x7F080808);
            this.x.g(markerOptions1);
            if(list0 == null || list0.size() <= 2) {
                z = false;
            }
            int v = 0xFFFF0000;
            if(z) {
                cpnp cpnp1 = this.x;
                PolygonOptions polygonOptions0 = new PolygonOptions();
                polygonOptions0.b();
                polygonOptions0.a(list0);
                polygonOptions0.d = 0xFFFF0000;
                polygonOptions0.e();
                polygonOptions0.e = fvwn.v;
                polygonOptions0.c();
                polygonOptions0.d();
                cpnp1.q(polygonOptions0);
            }
            List list2 = eAlertUxArgs0.f;
            if(list2 != null && list2.size() > 2) {
                cpnp cpnp2 = this.x;
                PolygonOptions polygonOptions1 = new PolygonOptions();
                polygonOptions1.b();
                polygonOptions1.a(list2);
                if(z) {
                    v = fvwn.u;
                }
                polygonOptions1.d = v;
                polygonOptions1.e();
                polygonOptions1.e = fvwn.u;
                polygonOptions1.c();
                polygonOptions1.d();
                cpnp2.q(polygonOptions1);
            }
        }
    }

    @Override  // cpnt
    public final void a(cpnp cpnp0) {
        this.x = cpnp0;
        this.D();
    }

    @Override  // android.view.ViewTreeObserver$OnDrawListener
    public final void onDraw() {
        this.y = true;
        this.D();
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.y = true;
        this.D();
        this.A.getViewTreeObserver().removeOnDrawListener(this);
    }
}

