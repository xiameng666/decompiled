import android.app.AppOpsManager;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;

public final class aikd {
    public final Context a;
    private final aiig b;
    private final aikf c;
    private final aikc d;
    private static final baun e;

    static {
        aikd.e = new baun(new String[]{"AuthzenGcmDeviceInfoBuilder"});
    }

    public aikd(Context context0) {
        aiig aiig0 = new aiig(context0);
        aikf aikf0 = new aikf(context0);
        aikc aikc0 = new aikc(context0);
        super();
        this.a = context0;
        this.b = aiig0;
        this.c = aikf0;
        this.d = aikc0;
    }

    public final hhpu a() {
        aike aike0 = this.c.a();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hhpu.a).v_newBuilder();
        String s = Build.VERSION.CODENAME;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hhpu hhpu0 = (hhpu)hftp0.b_message;
        s.getClass();
        hhpu0.b |= 16;
        hhpu0.g = s;
        String s1 = Build.VERSION.RELEASE;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hhpu hhpu1 = (hhpu)hftp0.b_message;
        s1.getClass();
        hhpu1.b |= 8;
        hhpu1.f = s1;
        String s2 = Build.DISPLAY;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hhpu hhpu2 = (hhpu)hftp0.b_message;
        s2.getClass();
        hhpu2.b |= 2;
        hhpu2.d = s2;
        long v = (long)Build.VERSION.SDK_INT;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hhpu)hftv0).b |= 4;
        ((hhpu)hftv0).e = v;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((hhpu)hftv1).b |= 0x20;
        ((hhpu)hftv1).h = "25.34.34 (190400-{{cl}})";
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        hhpu hhpu3 = (hhpu)hftp0.b_message;
        hhpu3.b |= 0x40;
        hhpu3.i = 0xF1B18ADL;
        boolean z = this.b.b();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hhpu hhpu4 = (hhpu)hftp0.b_message;
        hhpu4.b |= 0x100;
        hhpu4.k = z;
        Context context0 = this.a;
        boolean z1 = false;
        boolean z2 = bahu.a(context0) != null;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hhpu hhpu5 = (hhpu)hftp0.b_message;
        hhpu5.b |= 0x800;
        hhpu5.n = z2;
        BluetoothAdapter bluetoothAdapter0 = bahu.a(context0);
        boolean z3 = bluetoothAdapter0 == null ? false : bluetoothAdapter0.isEnabled();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hhpu hhpu6 = (hhpu)hftp0.b_message;
        hhpu6.b |= 0x1000;
        hhpu6.o = z3;
        boolean z4 = context0.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hhpu hhpu7 = (hhpu)hftp0.b_message;
        hhpu7.b |= 0x8000;
        hhpu7.r = z4;
        Context context1 = this.d.a;
        boolean z5 = aihs.a(context1);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hhpu hhpu8 = (hhpu)hftp0.b_message;
        hhpu8.b |= 0x2000;
        hhpu8.p = z5;
        if(hvbk.f() && aihs.b(context1)) {
            z1 = true;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hhpu hhpu9 = (hhpu)hftp0.b_message;
        hhpu9.b |= 0x4000;
        hhpu9.q = z1;
        boolean z6 = bbnp.m(context0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hhpu hhpu10 = (hhpu)hftp0.b_message;
        hhpu10.b |= 0x10000;
        hhpu10.s = z6;
        boolean z7 = context0.getPackageManager().hasSystemFeature("org.chromium.arc");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((hhpu)hftv2).b |= 0x20000;
        ((hhpu)hftv2).t = z7;
        boolean z8 = aike0.a;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        ((hhpu)hftv3).b |= 0x200;
        ((hhpu)hftv3).l = z8;
        boolean z9 = aike0.b;
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        hhpu hhpu11 = (hhpu)hftp0.b_message;
        hhpu11.b |= 0x400;
        hhpu11.m = z9;
        String s3 = Locale.getDefault().toLanguageTag();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hhpu hhpu12 = (hhpu)hftp0.b_message;
        s3.getClass();
        hhpu12.b |= 1;
        hhpu12.c = s3;
        Boolean boolean0 = this.b();
        if(boolean0 != null) {
            boolean z10 = boolean0.booleanValue();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hhpu hhpu13 = (hhpu)hftp0.b_message;
            hhpu13.b |= 0x80;
            hhpu13.j = z10;
        }
        return (hhpu)hftp0.N_build();
    }

    public final Boolean b() {
        AppOpsManager appOpsManager0 = (AppOpsManager)this.a.getSystemService("appops");
        int v = this.a.getApplicationInfo().uid;
        try {
            Class class0 = Class.forName(AppOpsManager.class.getName());
            return ((int)(((Integer)class0.getMethod("checkOpNoThrow", Integer.TYPE, Integer.TYPE, String.class).invoke(appOpsManager0, ((Integer)class0.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)), v, "com.google.android.gms")))) == 0 ? Boolean.valueOf(true) : Boolean.valueOf(false);
        }
        catch(ClassNotFoundException | NoSuchMethodException | NoSuchFieldException | InvocationTargetException | IllegalAccessException | RuntimeException exception0) {
            aikd.e.n("Exception while finding whether notifications are enabled for GmsCore", exception0, new Object[0]);
            return null;
        }
    }
}

