import android.app.Notification;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.UserHandle;
import android.service.notification.StatusBarNotification;
import android.util.LruCache;
import com.google.android.gms.chimera.modules.auth.proximity.AppContextProvider;
import java.util.HashMap;
import java.util.Map;

public final class almg {
    final LruCache a;
    final LruCache b;
    private static final baun c;
    private static final Map d;
    private static final Object e;
    private final Context f;

    static {
        almg.c = new baun("ProximityAuth", new String[]{"AppInfoManager"});
        almg.d = new HashMap();
        almg.e = new Object();
    }

    public almg(Context context0) {
        this.f = context0;
        this.a = new LruCache(((int)hpzm.a.f().a()));
        this.b = new LruCache(((int)hpzm.a.f().b()));
    }

    public static almg a(Context context0) {
        Map map0;
        synchronized(almg.e) {
            map0 = almg.d;
            if(!map0.containsKey(context0)) {
                map0.put(context0, new almg(context0));
            }
        }
        return (almg)map0.get(context0);
    }

    public final alsw b(String s, UserHandle userHandle0) {
        return this.c(s, userHandle0, gfqx.a);
    }

    public final alsw c(String s, UserHandle userHandle0, gfsx gfsx0) {
        ProtoLiteBuilder hftp3;
        try {
            int v = 36;
            Context context0 = this.f;
            PackageManager packageManager0 = context0.getPackageManager();
            ApplicationInfo applicationInfo0 = hpzm.s() ? packageManager0.getApplicationInfoAsUser(s, 0x20000, userHandle0) : packageManager0.getApplicationInfo(s, 0x20000);
            if(applicationInfo0 == null) {
                almg.c.m("Cannot fetch app infor for %s.", new Object[]{s});
                return null;
            }
            if(hpzm.a.f().P()) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)alsw.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                alsw alsw0 = (alsw)hftp0.b_message;
                s.getClass();
                alsw0.c = s;
                String s1 = packageManager0.getApplicationLabel(applicationInfo0).toString();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                alsw alsw1 = (alsw)hftp0.b_message;
                s1.getClass();
                alsw1.d = s1;
                long v1 = (long)userHandle0.getIdentifier();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((alsw)hftp0.b_message).f = v1;
                String s2 = almg.d(s, userHandle0.getIdentifier());
                LruCache lruCache0 = this.a;
                ByteString hfsf0 = (ByteString)lruCache0.get(s2);
                if(hfsf0 == null) {
                    Drawable drawable0 = context0.getPackageManager().getApplicationIcon(applicationInfo0);
                    int v2 = hpzm.Q() ? 0x60 : 36;
                    hfsf0 = alni.d(drawable0, v2, v2);
                    lruCache0.put(s2, hfsf0);
                }
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((alsw)hftp0.b_message).e = hfsf0;
                if(gfsx0.i()) {
                    StatusBarNotification statusBarNotification0 = (StatusBarNotification)gfsx0.d();
                    String s3 = almg.d(s, userHandle0.getIdentifier());
                    LruCache lruCache1 = this.b;
                    ByteString hfsf1 = (ByteString)lruCache1.get(s3);
                    if(hfsf1 == null) {
                        Icon icon0 = statusBarNotification0.getNotification().getSmallIcon();
                        if(icon0 == null) {
                            hfsf1 = null;
                        }
                        else {
                            Drawable drawable1 = icon0.loadDrawable(context0);
                            if(drawable1 == null) {
                                hfsf1 = null;
                            }
                            else {
                                if(hpzm.s() || albt.c()) {
                                    drawable1 = context0.getPackageManager().getUserBadgedIcon(drawable1, userHandle0);
                                }
                                if(hpzm.Q()) {
                                    v = 0x60;
                                }
                                hfsf1 = alni.d(drawable1, v, v);
                                lruCache1.put(s3, hfsf1);
                            }
                        }
                    }
                    if(hfsf1 != null) {
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        alsw alsw2 = (alsw)hftp0.b_message;
                        alsw2.b |= 2;
                        alsw2.i = hfsf1;
                        Notification notification0 = ((StatusBarNotification)gfsx0.d()).getNotification();
                        if(notification0.color != 0) {
                            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)alth.a).v_newBuilder();
                            int v3 = Color.red(notification0.color);
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            ((alth)hftp1.b_message).b = v3;
                            int v4 = Color.green(notification0.color);
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            ((alth)hftp1.b_message).c = v4;
                            int v5 = Color.blue(notification0.color);
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            ((alth)hftp1.b_message).d = v5;
                            alth alth0 = (alth)hftp1.N_build();
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            alsw alsw3 = (alsw)hftp0.b_message;
                            alth0.getClass();
                            alsw3.g = alth0;
                            alsw3.b |= 1;
                        }
                    }
                }
                return (alsw)hftp0.N_build();
            }
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)alsw.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            alsw alsw4 = (alsw)hftp2.b_message;
            s.getClass();
            alsw4.c = s;
            String s4 = packageManager0.getApplicationLabel(applicationInfo0).toString();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            alsw alsw5 = (alsw)hftp2.b_message;
            s4.getClass();
            alsw5.d = s4;
            if(hpzm.Q()) {
                v = 0x60;
            }
            String s5 = almg.d(s, userHandle0.getIdentifier());
            LruCache lruCache2 = this.a;
            ByteString hfsf2 = (ByteString)lruCache2.get(s5);
            if(hfsf2 == null) {
                Drawable drawable2 = packageManager0.getDrawable(applicationInfo0.packageName, applicationInfo0.icon, applicationInfo0);
                if(drawable2 == null) {
                    drawable2 = packageManager0.getApplicationIcon(applicationInfo0);
                }
                Resources resources0 = AppContextProvider.a().getResources();
                BitmapDrawable bitmapDrawable0 = (drawable2 instanceof BitmapDrawable) ? new BitmapDrawable(resources0, alni.b(((BitmapDrawable)drawable2).getBitmap(), v, v)) : new BitmapDrawable(resources0, alni.a(drawable2, v, v));
                int v6 = bitmapDrawable0.getIntrinsicHeight();
                double f = (double)bitmapDrawable0.getIntrinsicWidth();
                ByteString hfsf3 = alni.d(packageManager0.getUserBadgedDrawableForDensity(bitmapDrawable0, userHandle0, new Rect(((int)(f * 0.67)), ((int)(((double)v6) * 0.67)), ((int)(f * 0.95)), ((int)(((double)v6) * 0.95))), 480), v, v);
                lruCache2.put(s5, hfsf3);
                hftp3 = hftp2;
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ((alsw)hftp3.b_message).e = hfsf3;
            }
            else {
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ((alsw)hftp2.b_message).e = hfsf2;
                hftp3 = hftp2;
            }
            long v7 = (long)userHandle0.getIdentifier();
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ((alsw)hftp3.b_message).f = v7;
            return (alsw)hftp3.N_build();
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            almg.c.n("Cannot find package " + s, packageManager$NameNotFoundException0, new Object[0]);
            return null;
        }
    }

    private static final String d(String s, int v) {
        return hpzm.s() || albt.c() ? a.g(v, s, ":") : s;
    }
}

