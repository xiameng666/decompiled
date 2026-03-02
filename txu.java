import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Trace;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.List;

final class txu implements uqi {
    final txc a;
    final List b;
    private boolean c;

    public txu(txc txc0, List list0) {
        this.a = txc0;
        this.b = list0;
        super();
    }

    @Override  // uqi
    public final Object a() {
        uik uik0;
        Context context1;
        ContentResolver contentResolver0;
        umz umz0;
        umw umw0;
        ujl ujl0;
        umf umf0;
        uky uky0;
        ujq ujq0;
        ukj ukj0;
        List list2;
        List list1;
        ulu ulu0;
        umj umj0;
        List list0;
        Resources resources0;
        Object object0;
        txl txl0;
        Context context0;
        ues ues0;
        uek uek0;
        txu txu0 = this;
        Class class0 = byte[].class;
        if(txu0.c) {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you\'re using the provided Registry rather calling glide.getRegistry()!");
        }
        oyn.a("Glide registry");
        txu0.c = true;
        try {
            uek0 = txu0.a.b;
            ues0 = txu0.a.f;
            context0 = txu0.a.c.getApplicationContext();
            txl0 = txu0.a.c.f;
            object0 = new txt();
            ((txt)object0).i(new ujz());
            ((txt)object0).i(new ukn());
            resources0 = context0.getResources();
            list0 = ((txt)object0).b();
            umj0 = new umj(context0, list0, uek0, ues0);
            ulu0 = new ulu(uek0, new uls());
            list1 = txu0.b;
            list2 = ((txt)object0).b();
        }
        catch(Throwable throwable0) {
            txu0.c = false;
            Trace.endSection();
            throw throwable0;
        }
        try {
            ukj0 = new ukj(list2, resources0.getDisplayMetrics(), uek0, ues0);
            if(!txl0.a(txe.class)) {
                ujq0 = new ujp(ukj0);
                uky0 = new ulg(ukj0, ues0);
                goto label_28;
            }
        }
        catch(Throwable throwable0) {
            txu0 = this;
            txu0.c = false;
            Trace.endSection();
            throw throwable0;
        }
        try {
            uky0 = new uky();
            ujq0 = new ujq();
        }
        catch(Throwable throwable0) {
            txu0 = this;
            txu0.c = false;
            Trace.endSection();
            throw throwable0;
        }
        try {
        label_28:
            uma uma0 = new uma(new umb(list0, ues0));
            ((txt)object0).h("Animation", InputStream.class, Drawable.class, uma0);
            ulz ulz0 = new ulz(new umb(list0, ues0));
            ((txt)object0).h("Animation", ByteBuffer.class, Drawable.class, ulz0);
            umf0 = new umf(context0);
            ujl0 = new ujl(ues0);
            umw0 = new umw();
            umz0 = new umz();
            contentResolver0 = context0.getContentResolver();
            ugh ugh0 = new ugh();
            ((txt)object0).d(ByteBuffer.class, ugh0);
            uif uif0 = new uif(ues0);
            ((txt)object0).d(InputStream.class, uif0);
            ((txt)object0).h("Bitmap", ByteBuffer.class, Bitmap.class, ujq0);
            ((txt)object0).h("Bitmap", InputStream.class, Bitmap.class, uky0);
            if(ubz.d()) {
                goto label_44;
            }
            else {
                goto label_48;
            }
            goto label_49;
        }
        catch(Throwable throwable0) {
            txu0 = this;
            txu0.c = false;
            Trace.endSection();
            throw throwable0;
        }
        try {
        label_44:
            context1 = context0;
            ula ula0 = new ula(ukj0);
            ((txt)object0).h("Bitmap", ParcelFileDescriptor.class, Bitmap.class, ula0);
            goto label_49;
        }
        catch(Throwable throwable0) {
            txu0 = this;
            txu0.c = false;
            Trace.endSection();
            throw throwable0;
        }
    label_48:
        context1 = context0;
        try {
        label_49:
            ulu ulu1 = new ulu(uek0, new ulo());
            ((txt)object0).h("Bitmap", AssetFileDescriptor.class, Bitmap.class, ulu1);
            ((txt)object0).h("Bitmap", ParcelFileDescriptor.class, Bitmap.class, ulu0);
            uik0 = uik.a;
            ((txt)object0).g(Bitmap.class, Bitmap.class, uik0);
            ulk ulk0 = new ulk();
            ((txt)object0).h("Bitmap", Bitmap.class, Bitmap.class, ulk0);
            ((txt)object0).e(Bitmap.class, ujl0);
            ujj ujj0 = new ujj(resources0, ujq0);
            ((txt)object0).h("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, ujj0);
            ujj ujj1 = new ujj(resources0, uky0);
            ((txt)object0).h("BitmapDrawable", InputStream.class, BitmapDrawable.class, ujj1);
            ujj ujj2 = new ujj(resources0, ulu0);
            ((txt)object0).h("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, ujj2);
            ujk ujk0 = new ujk(uek0, ujl0);
            ((txt)object0).e(BitmapDrawable.class, ujk0);
            umv umv0 = new umv(list0, umj0, ues0);
            ((txt)object0).h("Animation", InputStream.class, umm.class, umv0);
            ((txt)object0).h("Animation", ByteBuffer.class, umm.class, umj0);
            umn umn0 = new umn();
            ((txt)object0).e(umm.class, umn0);
            ((txt)object0).g(tym.class, tym.class, uik0);
            umt umt0 = new umt(uek0);
            ((txt)object0).h("Bitmap", tym.class, Bitmap.class, umt0);
            ((txt)object0).f(Uri.class, Drawable.class, umf0);
            uld uld0 = new uld(umf0, uek0);
            ((txt)object0).f(Uri.class, Bitmap.class, uld0);
            ((txt)object0).j(new ulv());
            ugj ugj0 = new ugj();
            ((txt)object0).g(File.class, ByteBuffer.class, ugj0);
            ugv ugv0 = new ugv(new ugz());
            ((txt)object0).g(File.class, InputStream.class, ugv0);
            umh umh0 = new umh();
            ((txt)object0).f(File.class, File.class, umh0);
            ugv ugv1 = new ugv(new ugw());
            ((txt)object0).g(File.class, ParcelFileDescriptor.class, ugv1);
            ((txt)object0).g(File.class, File.class, uik0);
            ((txt)object0).j(new ubv(ues0));
            if(ubz.d()) {
                goto label_88;
            }
            goto label_93;
        }
        catch(Throwable throwable0) {
            txu0 = this;
            txu0.c = false;
            Trace.endSection();
            throw throwable0;
        }
        try {
        label_88:
            ((txt)object0).j(new uby());
        }
        catch(Throwable throwable0) {
            txu0 = this;
            txu0.c = false;
            Trace.endSection();
            throw throwable0;
        }
        try {
        label_93:
            ugr ugr0 = new ugr(context1);
            ugp ugp0 = new ugp(context1);
            ugq ugq0 = new ugq(context1);
            ((txt)object0).g(Integer.TYPE, InputStream.class, ugr0);
            ((txt)object0).g(Integer.class, InputStream.class, ugr0);
            ((txt)object0).g(Integer.TYPE, AssetFileDescriptor.class, ugp0);
            ((txt)object0).g(Integer.class, AssetFileDescriptor.class, ugp0);
            ((txt)object0).g(Integer.TYPE, Drawable.class, ugq0);
            ((txt)object0).g(Integer.class, Drawable.class, ugq0);
            uid uid0 = new uid(context1);
            ((txt)object0).g(Uri.class, InputStream.class, uid0);
            uic uic0 = new uic(context1);
            ((txt)object0).g(Uri.class, AssetFileDescriptor.class, uic0);
            uia uia0 = new uia(resources0);
            uhy uhy0 = new uhy(resources0);
            uhz uhz0 = new uhz(resources0);
            ((txt)object0).g(Integer.class, Uri.class, uia0);
            ((txt)object0).g(Integer.TYPE, Uri.class, uia0);
            ((txt)object0).g(Integer.class, AssetFileDescriptor.class, uhy0);
            ((txt)object0).g(Integer.TYPE, AssetFileDescriptor.class, uhy0);
            ((txt)object0).g(Integer.class, InputStream.class, uhz0);
            ((txt)object0).g(Integer.TYPE, InputStream.class, uhz0);
            ugn ugn0 = new ugn();
            ((txt)object0).g(String.class, InputStream.class, ugn0);
            ugn ugn1 = new ugn();
            ((txt)object0).g(Uri.class, InputStream.class, ugn1);
            uii uii0 = new uii();
            ((txt)object0).g(String.class, InputStream.class, uii0);
            uih uih0 = new uih();
            ((txt)object0).g(String.class, ParcelFileDescriptor.class, uih0);
            uig uig0 = new uig();
            ((txt)object0).g(String.class, AssetFileDescriptor.class, uig0);
            ufy ufy0 = new ufy(context1.getAssets());
            ((txt)object0).g(Uri.class, InputStream.class, ufy0);
            ufx ufx0 = new ufx(context1.getAssets());
            ((txt)object0).g(Uri.class, AssetFileDescriptor.class, ufx0);
            uiw uiw0 = new uiw(context1);
            ((txt)object0).g(Uri.class, InputStream.class, uiw0);
            uiy uiy0 = new uiy(context1);
            ((txt)object0).g(Uri.class, InputStream.class, uiy0);
            uja uja0 = new uja(context1, InputStream.class);
            ((txt)object0).g(Uri.class, InputStream.class, uja0);
            uja uja1 = new uja(context1, ParcelFileDescriptor.class);
            ((txt)object0).g(Uri.class, ParcelFileDescriptor.class, uja1);
            boolean z = txl0.a(txh.class);
            uiq uiq0 = new uiq(contentResolver0, z);
            ((txt)object0).g(Uri.class, InputStream.class, uiq0);
            uio uio0 = new uio(contentResolver0, z);
            ((txt)object0).g(Uri.class, ParcelFileDescriptor.class, uio0);
            uin uin0 = new uin(contentResolver0, z);
            ((txt)object0).g(Uri.class, AssetFileDescriptor.class, uin0);
            uis uis0 = new uis();
            ((txt)object0).g(Uri.class, InputStream.class, uis0);
            ujd ujd0 = new ujd();
            ((txt)object0).g(URL.class, InputStream.class, ujd0);
            uhg uhg0 = new uhg(context1);
            ((txt)object0).g(Uri.class, File.class, uhg0);
            uiu uiu0 = new uiu();
            ((txt)object0).g(uhb.class, InputStream.class, uiu0);
            ugb ugb0 = new ugb();
            ((txt)object0).g(class0, ByteBuffer.class, ugb0);
            ugf ugf0 = new ugf();
            ((txt)object0).g(class0, InputStream.class, ugf0);
            ((txt)object0).g(Uri.class, Uri.class, uik0);
            ((txt)object0).g(Drawable.class, Drawable.class, uik0);
            umg umg0 = new umg();
            ((txt)object0).f(Drawable.class, Drawable.class, umg0);
            umx umx0 = new umx(resources0);
            ((txt)object0).k(Bitmap.class, BitmapDrawable.class, umx0);
            ((txt)object0).k(Bitmap.class, class0, umw0);
            umy umy0 = new umy(uek0, umw0, umz0);
            ((txt)object0).k(Drawable.class, class0, umy0);
            ((txt)object0).k(umm.class, class0, umz0);
            ulu ulu2 = new ulu(uek0, new ulq());
            ((txt)object0).f(ByteBuffer.class, Bitmap.class, ulu2);
            ujj ujj3 = new ujj(resources0, ulu2);
            ((txt)object0).f(ByteBuffer.class, BitmapDrawable.class, ujj3);
            txv.a(list1);
        }
        catch(Throwable throwable0) {
            txu0 = this;
            txu0.c = false;
            Trace.endSection();
            throw throwable0;
        }
        this.c = false;
        Trace.endSection();
        return object0;
    }
}

