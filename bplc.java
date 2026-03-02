import android.content.ComponentName;
import android.content.Intent;

public final class bplc implements gfsi {
    public final bplf a;
    public final bpjm b;

    public bplc(bplf bplf0, bpjm bpjm0) {
        this.a = bplf0;
        this.b = bpjm0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        gfsx gfsx3;
        gfsx gfsx2;
        gfsx gfsx1;
        if(!((gtbf)object0).e && ((gtbf)object0).h) {
            gfsx gfsx0 = gfqx.a;
            String s = ((gtbf)object0).g;
            if(s == null) {
                throw new NullPointerException("Null deviceManufacturer");
            }
            String s1 = ((gtbf)object0).i;
            if(s1 == null) {
                throw new NullPointerException("Null deviceModel");
            }
            String s2 = frai.h(this.b.a);
            if(s2 == null) {
                throw new NullPointerException("Null eid");
            }
            gsze gsze0 = ((gtbf)object0).d;
            if(gsze0 == null) {
                gsze0 = gsze.a;
            }
            if(gsze0.c.isEmpty()) {
                gfsx1 = gfsx0;
            }
            else {
                gsze gsze1 = ((gtbf)object0).d;
                if(gsze1 == null) {
                    gsze1 = gsze.a;
                }
                gfsx1 = gfsx.m(gsze1.c);
            }
            gsze gsze2 = ((gtbf)object0).d;
            if(gsze2 == null) {
                gsze2 = gsze.a;
            }
            if(gsze2.b.isEmpty()) {
                gfsx2 = gfsx0;
            }
            else {
                gsze gsze3 = ((gtbf)object0).d;
                if(gsze3 == null) {
                    gsze3 = gsze.a;
                }
                gfsx2 = gfsx.m(gsze3.b);
            }
            gsze gsze4 = ((gtbf)object0).d;
            if(gsze4 == null) {
                gsze4 = gsze.a;
            }
            if(gsze4.d.isEmpty()) {
                gfsx3 = gfsx0;
            }
            else {
                gsze gsze5 = ((gtbf)object0).d;
                if(gsze5 == null) {
                    gsze5 = gsze.a;
                }
                gfsx3 = gfsx.m(gsze5.d);
            }
            int v = ((gtbf)object0).b;
            gfsx gfsx4 = gtbe.a(v) == 7 ? gfsx.m((v == 6 ? ((gszz)((gtbf)object0).c) : gszz.a).b) : gfsx0;
            int v1 = ((gtbf)object0).b;
            if(gtbe.a(v1) == 8) {
                gfsx0 = gfsx.m((v1 == 7 ? ((ByteString)((gtbf)object0).c) : ByteString.b).toByteArray());
            }
            bplf bplf0 = this.a;
            bpla bpla0 = new bpla(s, s1, s2, gfsx1, gfsx2, gfsx3, gfsx4, gfsx0);
            gfsx gfsx5 = bpla0.g;
            gftb.r(!gfsx5.i() || !bpla0.h.i(), "At most one image can be specified.");
            Intent intent0 = new Intent("com.google.android.gms.findmydevice.spot.locationreporting.taptoid.TAP_TO_ID");
            intent0.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.findmydevice.spot.locationreporting.taptoid.TapToIdHalfSheetActivity"));
            intent0.setFlags(0x30040000);
            intent0.putExtra("DEVICE_MANUFACTURER", bpla0.a);
            intent0.putExtra("DEVICE_MODEL", bpla0.b);
            intent0.putExtra("EID", bpla0.c);
            gfsx gfsx6 = bpla0.d;
            if(gfsx6.i()) {
                intent0.putExtra("OWNER_MESSAGE", ((String)gfsx6.d()));
            }
            gfsx gfsx7 = bpla0.e;
            if(gfsx7.i()) {
                intent0.putExtra("PHONE_NUMBER", ((String)gfsx7.d()));
            }
            gfsx gfsx8 = bpla0.f;
            if(gfsx8.i()) {
                intent0.putExtra("EMAIL_ADDRESS", ((String)gfsx8.d()));
            }
            if(gfsx5.i()) {
                intent0.putExtra("DEVICE_ICON_URL", ((String)gfsx5.d()));
            }
            gfsx gfsx9 = bpla0.h;
            if(gfsx9.i()) {
                intent0.putExtra("DEVICE_ICON_BYTES", ((byte[])gfsx9.d()));
            }
            bplf0.f.startActivity(intent0);
            bple bple0 = new bple();
            bplf0.h.a(bple0);
            return null;
        }
        return null;
    }
}

