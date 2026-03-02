import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public final class avf {
    private final att A;
    private final aui B;
    private final bes C;
    public final awp a;
    bmq b;
    List c;
    private final List d;
    private final List e;
    private final List f;
    private final List g;
    private final List h;
    private final List i;
    private final Map j;
    private final List k;
    private final List l;
    private final List m;
    private final String n;
    private final aod o;
    private final aya p;
    private final int q;
    private boolean r;
    private boolean s;
    private final boolean t;
    private final boolean u;
    private boolean v;
    private boolean w;
    private final boolean x;
    private final ats y;
    private final ayn z;

    public avf(Context context0, String s, awt awt0, aod aod0, bes bes0) {
        boolean z3;
        List list2;
        awp awp0;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new HashMap();
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.r = false;
        this.s = false;
        this.v = false;
        this.w = false;
        this.c = new ArrayList();
        this.z = new ayn();
        kay.i(s);
        this.n = s;
        this.o = aod0;
        this.p = new aya();
        this.y = ats.d(context0);
        try {
            awp0 = awt0.b(s);
            this.a = awp0;
            Integer integer0 = (Integer)awp0.c(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            this.q = integer0 == null ? 2 : ((int)integer0);
        }
        catch(awl awl0) {
            throw new baf(awl0);
        }
        int[] arr_v = (int[])awp0.c(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if(arr_v != null) {
            for(int v = 0; v < arr_v.length; ++v) {
                int v1 = arr_v[v];
                if(v1 == 3) {
                    this.r = true;
                }
                else {
                    switch(v1) {
                        case 1: {
                            this.w = true;
                            break;
                        }
                        case 6: {
                            this.s = true;
                            break;
                        }
                        case 16: {
                            this.v = true;
                        }
                    }
                }
            }
        }
        att att0 = new att(this.a);
        this.A = att0;
        this.B = new aui(this.a);
        List list0 = this.d;
        int v2 = this.q;
        boolean z = this.r;
        boolean z1 = this.s;
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        bmk bmk0 = new bmk();
        bmo bmo0 = bmo.a;
        bmm bmm0 = bmm.k;
        bmk0.b(bmp.a(bmo0, bmm0));
        arrayList1.add(bmk0);
        bmk bmk1 = new bmk();
        bmo bmo1 = bmo.c;
        bmk1.b(bmp.a(bmo1, bmm0));
        arrayList1.add(bmk1);
        bmk bmk2 = new bmk();
        bmo bmo2 = bmo.b;
        bmk2.b(bmp.a(bmo2, bmm0));
        arrayList1.add(bmk2);
        bmk bmk3 = new bmk();
        bmm bmm1 = bmm.d;
        bmk3.b(bmp.a(bmo0, bmm1));
        bmk3.b(bmp.a(bmo1, bmm0));
        arrayList1.add(bmk3);
        bmk bmk4 = new bmk();
        bmk4.b(bmp.a(bmo2, bmm1));
        bmk4.b(bmp.a(bmo1, bmm0));
        arrayList1.add(bmk4);
        bmk bmk5 = new bmk();
        bmk5.b(bmp.a(bmo0, bmm1));
        bmk5.b(bmp.a(bmo0, bmm1));
        arrayList1.add(bmk5);
        bmk bmk6 = new bmk();
        bmk6.b(bmp.a(bmo0, bmm1));
        bmk6.b(bmp.a(bmo2, bmm1));
        arrayList1.add(bmk6);
        bmk bmk7 = new bmk();
        bmk7.b(bmp.a(bmo0, bmm1));
        bmk7.b(bmp.a(bmo2, bmm1));
        bmk7.b(bmp.a(bmo1, bmm0));
        arrayList1.add(bmk7);
        arrayList0.addAll(arrayList1);
        if(v2 == 0 || (v2 == 1 || v2 == 4)) {
        label_94:
            ArrayList arrayList2 = new ArrayList();
            bmk bmk8 = new bmk();
            bmk8.b(bmp.a(bmo0, bmm1));
            bmk8.b(bmp.a(bmo0, bmm.j));
            arrayList2.add(bmk8);
            bmk bmk9 = new bmk();
            bmk9.b(bmp.a(bmo0, bmm1));
            bmk9.b(bmp.a(bmo2, bmm.j));
            arrayList2.add(bmk9);
            bmk bmk10 = new bmk();
            bmk10.b(bmp.a(bmo2, bmm1));
            bmk10.b(bmp.a(bmo2, bmm.j));
            arrayList2.add(bmk10);
            bmk bmk11 = new bmk();
            bmk11.b(bmp.a(bmo0, bmm1));
            bmk11.b(bmp.a(bmo0, bmm.j));
            bmk11.b(bmp.a(bmo1, bmm.j));
            arrayList2.add(bmk11);
            bmk bmk12 = new bmk();
            bmk12.b(bmp.a(bmo0, bmm1));
            bmk12.b(bmp.a(bmo2, bmm.j));
            bmk12.b(bmp.a(bmo1, bmm.j));
            arrayList2.add(bmk12);
            bmk bmk13 = new bmk();
            bmk13.b(bmp.a(bmo2, bmm1));
            bmk13.b(bmp.a(bmo2, bmm1));
            bmk13.b(bmp.a(bmo1, bmm0));
            arrayList2.add(bmk13);
            arrayList0.addAll(arrayList2);
        }
        else if(v2 == 3) {
            v2 = 3;
            goto label_94;
        }
        switch(v2) {
            case 1: {
            label_126:
                ArrayList arrayList3 = new ArrayList();
                bmk bmk14 = new bmk();
                bmk14.b(bmp.a(bmo0, bmm1));
                bmk14.b(bmp.a(bmo0, bmm0));
                arrayList3.add(bmk14);
                bmk bmk15 = new bmk();
                bmk15.b(bmp.a(bmo0, bmm1));
                bmk15.b(bmp.a(bmo2, bmm0));
                arrayList3.add(bmk15);
                bmk bmk16 = new bmk();
                bmk16.b(bmp.a(bmo2, bmm1));
                bmk16.b(bmp.a(bmo2, bmm0));
                arrayList3.add(bmk16);
                bmk bmk17 = new bmk();
                bmk17.b(bmp.a(bmo0, bmm1));
                bmk17.b(bmp.a(bmo0, bmm1));
                bmk17.b(bmp.a(bmo1, bmm0));
                arrayList3.add(bmk17);
                bmk bmk18 = new bmk();
                bmk18.b(bmp.a(bmo2, bmm.a));
                bmk18.b(bmp.a(bmo0, bmm1));
                bmk18.b(bmp.a(bmo2, bmm0));
                arrayList3.add(bmk18);
                bmk bmk19 = new bmk();
                bmk19.b(bmp.a(bmo2, bmm.a));
                bmk19.b(bmp.a(bmo2, bmm1));
                bmk19.b(bmp.a(bmo2, bmm0));
                arrayList3.add(bmk19);
                arrayList0.addAll(arrayList3);
                break;
            }
            case 3: {
                v2 = 3;
                goto label_126;
            }
        }
        if(z) {
            ArrayList arrayList4 = new ArrayList();
            bmk bmk20 = new bmk();
            bmk20.b(bmp.a(bmo.e, bmm0));
            arrayList4.add(bmk20);
            bmk bmk21 = new bmk();
            bmk21.b(bmp.a(bmo0, bmm1));
            bmk21.b(bmp.a(bmo.e, bmm0));
            arrayList4.add(bmk21);
            bmk bmk22 = new bmk();
            bmk22.b(bmp.a(bmo2, bmm1));
            bmk22.b(bmp.a(bmo.e, bmm0));
            arrayList4.add(bmk22);
            bmk bmk23 = new bmk();
            bmk23.b(bmp.a(bmo0, bmm1));
            bmk23.b(bmp.a(bmo0, bmm1));
            bmk23.b(bmp.a(bmo.e, bmm0));
            arrayList4.add(bmk23);
            bmk bmk24 = new bmk();
            bmk24.b(bmp.a(bmo0, bmm1));
            bmk24.b(bmp.a(bmo2, bmm1));
            bmk24.b(bmp.a(bmo.e, bmm0));
            arrayList4.add(bmk24);
            bmk bmk25 = new bmk();
            bmk25.b(bmp.a(bmo2, bmm1));
            bmk25.b(bmp.a(bmo2, bmm1));
            bmk25.b(bmp.a(bmo.e, bmm0));
            arrayList4.add(bmk25);
            bmk bmk26 = new bmk();
            bmk26.b(bmp.a(bmo0, bmm1));
            bmk26.b(bmp.a(bmo1, bmm0));
            bmk26.b(bmp.a(bmo.e, bmm0));
            arrayList4.add(bmk26);
            bmk bmk27 = new bmk();
            bmk27.b(bmp.a(bmo2, bmm1));
            bmk27.b(bmp.a(bmo1, bmm0));
            bmk27.b(bmp.a(bmo.e, bmm0));
            arrayList4.add(bmk27);
            arrayList0.addAll(arrayList4);
        }
        if(z1 && v2 == 0) {
            ArrayList arrayList5 = new ArrayList();
            bmk bmk28 = new bmk();
            bmk28.b(bmp.a(bmo0, bmm1));
            bmk28.b(bmp.a(bmo0, bmm0));
            arrayList5.add(bmk28);
            bmk bmk29 = new bmk();
            bmk29.b(bmp.a(bmo0, bmm1));
            bmk29.b(bmp.a(bmo2, bmm0));
            arrayList5.add(bmk29);
            bmk bmk30 = new bmk();
            bmk30.b(bmp.a(bmo2, bmm1));
            bmk30.b(bmp.a(bmo2, bmm0));
            arrayList5.add(bmk30);
            arrayList0.addAll(arrayList5);
        }
        if(v2 == 3) {
            ArrayList arrayList6 = new ArrayList();
            bmk bmk31 = new bmk();
            bmk31.b(bmp.a(bmo0, bmm1));
            bmk31.b(bmp.a(bmo0, bmm.a));
            bmk31.b(bmp.a(bmo2, bmm0));
            bmk31.b(bmp.a(bmo.e, bmm0));
            arrayList6.add(bmk31);
            bmk bmk32 = new bmk();
            bmk32.b(bmp.a(bmo0, bmm1));
            bmk32.b(bmp.a(bmo0, bmm.a));
            bmk32.b(bmp.a(bmo1, bmm0));
            bmk32.b(bmp.a(bmo.e, bmm0));
            arrayList6.add(bmk32);
            arrayList0.addAll(arrayList6);
        }
        list0.addAll(arrayList0);
        List list1 = this.d;
        String s1 = this.n;
        if(this.p.a == null) {
            list2 = new ArrayList();
        }
        else if(ExtraSupportedSurfaceCombinationsQuirk.a()) {
            list2 = new ArrayList();
            if(s1.equals("1")) {
                list2.add(ExtraSupportedSurfaceCombinationsQuirk.a);
            }
        }
        else {
            list2 = ExtraSupportedSurfaceCombinationsQuirk.b() || ExtraSupportedSurfaceCombinationsQuirk.c() ? Collections.singletonList(ExtraSupportedSurfaceCombinationsQuirk.b) : Collections.EMPTY_LIST;
        }
        list1.addAll(list2);
        if(this.v) {
            ArrayList arrayList7 = new ArrayList();
            bmk bmk33 = new bmk();
            bmk33.b(bmp.a(bmo2, bmm.n));
            bmk33.b(bmp.a(bmo0, bmm1));
            bmk33.b(bmp.a(bmo0, bmm.j));
            arrayList7.add(bmk33);
            bmk bmk34 = new bmk();
            bmk34.b(bmp.a(bmo1, bmm.n));
            bmk34.b(bmp.a(bmo0, bmm1));
            bmk34.b(bmp.a(bmo0, bmm.j));
            arrayList7.add(bmk34);
            bmk bmk35 = new bmk();
            bmk35.b(bmp.a(bmo.e, bmm.n));
            bmk35.b(bmp.a(bmo0, bmm1));
            bmk35.b(bmp.a(bmo0, bmm.j));
            arrayList7.add(bmk35);
            bmk bmk36 = new bmk();
            bmk36.b(bmp.a(bmo2, bmm.n));
            bmk36.b(bmp.a(bmo0, bmm1));
            bmk36.b(bmp.a(bmo1, bmm0));
            arrayList7.add(bmk36);
            bmk bmk37 = new bmk();
            bmk37.b(bmp.a(bmo1, bmm.n));
            bmk37.b(bmp.a(bmo0, bmm1));
            bmk37.b(bmp.a(bmo1, bmm0));
            arrayList7.add(bmk37);
            bmk bmk38 = new bmk();
            bmk38.b(bmp.a(bmo.e, bmm.n));
            bmk38.b(bmp.a(bmo0, bmm1));
            bmk38.b(bmp.a(bmo1, bmm0));
            arrayList7.add(bmk38);
            bmk bmk39 = new bmk();
            bmk39.b(bmp.a(bmo2, bmm.n));
            bmk39.b(bmp.a(bmo0, bmm1));
            bmk39.b(bmp.a(bmo2, bmm0));
            arrayList7.add(bmk39);
            bmk bmk40 = new bmk();
            bmk40.b(bmp.a(bmo1, bmm.n));
            bmk40.b(bmp.a(bmo0, bmm1));
            bmk40.b(bmp.a(bmo2, bmm0));
            arrayList7.add(bmk40);
            bmk bmk41 = new bmk();
            bmk41.b(bmp.a(bmo.e, bmm.n));
            bmk41.b(bmp.a(bmo0, bmm1));
            bmk41.b(bmp.a(bmo2, bmm0));
            arrayList7.add(bmk41);
            bmk bmk42 = new bmk();
            bmk42.b(bmp.a(bmo2, bmm.n));
            bmk42.b(bmp.a(bmo0, bmm1));
            bmk42.b(bmp.a(bmo.e, bmm0));
            arrayList7.add(bmk42);
            bmk bmk43 = new bmk();
            bmk43.b(bmp.a(bmo1, bmm.n));
            bmk43.b(bmp.a(bmo0, bmm1));
            bmk43.b(bmp.a(bmo.e, bmm0));
            arrayList7.add(bmk43);
            bmk bmk44 = new bmk();
            bmk44.b(bmp.a(bmo.e, bmm.n));
            bmk44.b(bmp.a(bmo0, bmm1));
            bmk44.b(bmp.a(bmo.e, bmm0));
            arrayList7.add(bmk44);
            this.e.addAll(arrayList7);
        }
        boolean z2 = context0.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
        this.t = z2;
        if(z2) {
            ArrayList arrayList8 = new ArrayList();
            bmk bmk45 = new bmk();
            bmk45.b(bmp.a(bmo2, bmm.g));
            arrayList8.add(bmk45);
            bmk bmk46 = new bmk();
            bmk46.b(bmp.a(bmo0, bmm.g));
            arrayList8.add(bmk46);
            bmk bmk47 = new bmk();
            bmk47.b(bmp.a(bmo1, bmm.g));
            arrayList8.add(bmk47);
            bmk bmk48 = new bmk();
            bmk48.b(bmp.a(bmo2, bmm.c));
            bmk48.b(bmp.a(bmo1, bmm.g));
            arrayList8.add(bmk48);
            bmk bmk49 = new bmk();
            bmk49.b(bmp.a(bmo0, bmm.c));
            bmk49.b(bmp.a(bmo1, bmm.g));
            arrayList8.add(bmk49);
            bmk bmk50 = new bmk();
            bmk50.b(bmp.a(bmo2, bmm.c));
            bmk50.b(bmp.a(bmo2, bmm.g));
            arrayList8.add(bmk50);
            bmk bmk51 = new bmk();
            bmk51.b(bmp.a(bmo2, bmm.c));
            bmk51.b(bmp.a(bmo0, bmm.g));
            arrayList8.add(bmk51);
            bmk bmk52 = new bmk();
            bmk52.b(bmp.a(bmo0, bmm.c));
            bmk52.b(bmp.a(bmo2, bmm.g));
            arrayList8.add(bmk52);
            bmk bmk53 = new bmk();
            bmk53.b(bmp.a(bmo0, bmm.c));
            bmk53.b(bmp.a(bmo0, bmm.g));
            arrayList8.add(bmk53);
            this.f.addAll(arrayList8);
        }
        if(att0.c) {
            ArrayList arrayList9 = new ArrayList();
            bmk bmk54 = new bmk();
            bmk54.b(bmp.a(bmo0, bmm0));
            arrayList9.add(bmk54);
            bmk bmk55 = new bmk();
            bmk55.b(bmp.a(bmo2, bmm0));
            arrayList9.add(bmk55);
            bmk bmk56 = new bmk();
            bmk56.b(bmp.a(bmo0, bmm1));
            bmk56.b(bmp.a(bmo1, bmm0));
            arrayList9.add(bmk56);
            bmk bmk57 = new bmk();
            bmk57.b(bmp.a(bmo0, bmm1));
            bmk57.b(bmp.a(bmo2, bmm0));
            arrayList9.add(bmk57);
            bmk bmk58 = new bmk();
            bmk58.b(bmp.a(bmo2, bmm1));
            bmk58.b(bmp.a(bmo2, bmm0));
            arrayList9.add(bmk58);
            bmk bmk59 = new bmk();
            bmk59.b(bmp.a(bmo0, bmm1));
            bmk59.b(bmp.a(bmo0, bmm.j));
            arrayList9.add(bmk59);
            bmk bmk60 = new bmk();
            bmk60.b(bmp.a(bmo0, bmm1));
            bmk60.b(bmp.a(bmo0, bmm.j));
            bmk60.b(bmp.a(bmo2, bmm.j));
            arrayList9.add(bmk60);
            bmk bmk61 = new bmk();
            bmk61.b(bmp.a(bmo0, bmm1));
            bmk61.b(bmp.a(bmo0, bmm.j));
            bmk61.b(bmp.a(bmo1, bmm.j));
            arrayList9.add(bmk61);
            this.k.addAll(arrayList9);
        }
        awp awp1 = this.a;
        if(Build.VERSION.SDK_INT >= 33) {
            long[] arr_v1 = (long[])awp1.c(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES);
            z3 = arr_v1 != null && arr_v1.length != 0;
        }
        else {
            z3 = false;
        }
        this.u = z3;
        if(z3 && Build.VERSION.SDK_INT >= 33) {
            ArrayList arrayList10 = new ArrayList();
            bmk bmk62 = new bmk();
            bmk62.b(bml.a(bmo0, bmm.g, bmj.f));
            arrayList10.add(bmk62);
            bmk bmk63 = new bmk();
            bmk63.b(bml.a(bmo2, bmm.g, bmj.f));
            arrayList10.add(bmk63);
            bmk bmk64 = new bmk();
            bmk64.b(bml.a(bmo0, bmm.j, bmj.c));
            arrayList10.add(bmk64);
            bmk bmk65 = new bmk();
            bmk65.b(bml.a(bmo2, bmm.j, bmj.c));
            arrayList10.add(bmk65);
            bmk bmk66 = new bmk();
            bmk66.b(bml.a(bmo1, bmm0, bmj.d));
            arrayList10.add(bmk66);
            bmk bmk67 = new bmk();
            bmk67.b(bml.a(bmo2, bmm0, bmj.d));
            arrayList10.add(bmk67);
            bmk bmk68 = new bmk();
            bmk68.b(bml.a(bmo0, bmm1, bmj.b));
            bmk68.b(bml.a(bmo1, bmm0, bmj.d));
            arrayList10.add(bmk68);
            bmk bmk69 = new bmk();
            bmk69.b(bml.a(bmo0, bmm1, bmj.b));
            bmk69.b(bml.a(bmo2, bmm0, bmj.d));
            arrayList10.add(bmk69);
            bmk bmk70 = new bmk();
            bmk70.b(bml.a(bmo0, bmm1, bmj.b));
            bmk70.b(bml.a(bmo0, bmm.j, bmj.c));
            arrayList10.add(bmk70);
            bmk bmk71 = new bmk();
            bmk71.b(bml.a(bmo0, bmm1, bmj.b));
            bmk71.b(bml.a(bmo2, bmm.j, bmj.c));
            arrayList10.add(bmk71);
            bmk bmk72 = new bmk();
            bmk72.b(bml.a(bmo0, bmm1, bmj.b));
            bmk72.b(bml.a(bmo2, bmm1, bmj.b));
            arrayList10.add(bmk72);
            bmk bmk73 = new bmk();
            bmk73.b(bml.a(bmo0, bmm1, bmj.b));
            bmk73.b(bml.a(bmo0, bmm.j, bmj.c));
            bmk73.b(bml.a(bmo1, bmm.j, bmj.d));
            arrayList10.add(bmk73);
            bmk bmk74 = new bmk();
            bmk74.b(bml.a(bmo0, bmm1, bmj.b));
            bmk74.b(bml.a(bmo2, bmm.j, bmj.c));
            bmk74.b(bml.a(bmo1, bmm.j, bmj.d));
            arrayList10.add(bmk74);
            bmk bmk75 = new bmk();
            bmk75.b(bml.a(bmo0, bmm1, bmj.b));
            bmk75.b(bml.a(bmo2, bmm1, bmj.b));
            bmk75.b(bml.a(bmo1, bmm0, bmj.d));
            arrayList10.add(bmk75);
            this.m.addAll(arrayList10);
        }
        boolean z4 = false;
        awp awp2 = this.a;
        if(Build.VERSION.SDK_INT >= 33) {
            int[] arr_v2 = (int[])awp2.c(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
            if(arr_v2 != null && arr_v2.length != 0) {
                for(int v3 = 0; v3 < arr_v2.length; ++v3) {
                    if(arr_v2[v3] == 2) {
                        z4 = true;
                        break;
                    }
                }
            }
        }
        this.x = z4;
        if(z4 && Build.VERSION.SDK_INT >= 33) {
            ArrayList arrayList11 = new ArrayList();
            bmk bmk76 = new bmk();
            bmk76.b(bmp.a(bmo0, bmm.g));
            arrayList11.add(bmk76);
            bmk bmk77 = new bmk();
            bmk77.b(bmp.a(bmo2, bmm.g));
            arrayList11.add(bmk77);
            bmk bmk78 = new bmk();
            bmk78.b(bmp.a(bmo0, bmm.g));
            bmk78.b(bmp.a(bmo1, bmm0));
            arrayList11.add(bmk78);
            bmk bmk79 = new bmk();
            bmk79.b(bmp.a(bmo2, bmm.g));
            bmk79.b(bmp.a(bmo1, bmm0));
            arrayList11.add(bmk79);
            bmk bmk80 = new bmk();
            bmk80.b(bmp.a(bmo0, bmm.g));
            bmk80.b(bmp.a(bmo2, bmm0));
            arrayList11.add(bmk80);
            bmk bmk81 = new bmk();
            bmk81.b(bmp.a(bmo2, bmm.g));
            bmk81.b(bmp.a(bmo2, bmm0));
            arrayList11.add(bmk81);
            bmk bmk82 = new bmk();
            bmk82.b(bmp.a(bmo0, bmm1));
            bmk82.b(bmp.a(bmo0, bmm.g));
            arrayList11.add(bmk82);
            bmk bmk83 = new bmk();
            bmk83.b(bmp.a(bmo2, bmm1));
            bmk83.b(bmp.a(bmo0, bmm.g));
            arrayList11.add(bmk83);
            bmk bmk84 = new bmk();
            bmk84.b(bmp.a(bmo0, bmm1));
            bmk84.b(bmp.a(bmo2, bmm.g));
            arrayList11.add(bmk84);
            bmk bmk85 = new bmk();
            bmk85.b(bmp.a(bmo2, bmm1));
            bmk85.b(bmp.a(bmo2, bmm.g));
            arrayList11.add(bmk85);
            this.g.addAll(arrayList11);
        }
        this.k();
        this.C = bes0;
    }

    final bmq a(int v) {
        Integer integer0 = v;
        if(!this.c.contains(integer0)) {
            this.m(this.b.b, bri.d, v);
            this.m(this.b.d, bri.f, v);
            this.l(this.b.f, v, null);
            this.l(this.b.g, v, bni.a);
            this.l(this.b.h, v, bni.c);
            Map map0 = this.b.i;
            if(this.v) {
                StreamConfigurationMap streamConfigurationMap0 = (StreamConfigurationMap)this.a.c(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION);
                if(streamConfigurationMap0 != null) {
                    map0.put(integer0, avf.p(streamConfigurationMap0, v, true, null));
                }
            }
            this.c.add(integer0);
        }
        return this.b;
    }

    final List b(ave ave0, List list0, Map map0, Map map1) {
        List list2;
        if(ave0.c == 8 && !ave0.f) {
            for(Object object0: this.m) {
                List list1 = ((bmk)object0).a(list0);
                if(list1 != null) {
                    int v = list1.size();
                    boolean z = false;
                    int v1 = 0;
                    while(v1 < v) {
                        long v2 = ((bmp)list1.get(v1)).f.h;
                        Integer integer0 = v1;
                        if(map0.containsKey(integer0)) {
                            bhk bhk0 = (bhk)map0.get(integer0);
                            ibuq.c(bhk0);
                            bne bne0 = bhk0.e.size() == 1 ? ((bne)bhk0.e.get(0)) : bne.e;
                            ibuq.c(bne0);
                            if(ava.b(bne0, v2, bhk0.e)) {
                                ++v1;
                                continue;
                            }
                            else {
                                goto label_35;
                            }
                        }
                        if(!map1.containsKey(integer0)) {
                            throw new AssertionError("SurfaceConfig does not map to any use case");
                        }
                        Object object1 = map1.get(integer0);
                        ibuq.c(object1);
                        bnc bnc0 = (bnc)object1;
                        bne bne1 = bnc0.k();
                        ibuq.e(bne1, "getCaptureType(...)");
                        if(bnc0.k() == bne.e) {
                            list2 = (List)blq.b(((buf)bnc0), buf.a);
                            ibuq.e(list2, "getCaptureTypes(...)");
                        }
                        else {
                            list2 = ibps.a;
                        }
                        if(!ava.b(bne1, v2, list2)) {
                            goto label_35;
                        }
                        ++v1;
                        continue;
                    }
                    z = true;
                label_35:
                    if(z && ((Boolean)new ibon(new avb(this, list1)).a()).booleanValue()) {
                        return list1;
                    }
                }
            }
        }
        return null;
    }

    final boolean c(ave ave0, List list0, Map map0, List list1, List list2) {
        bet bet0;
        Size size1;
        List list3;
        Map map1 = this.j;
        if(map1.containsKey(ave0)) {
            list3 = (List)map1.get(ave0);
        }
        else {
            ArrayList arrayList0 = new ArrayList();
            if(ave0.h) {
                List list4 = this.i;
                if(list4.isEmpty()) {
                    ArrayList arrayList1 = new ArrayList();
                    arrayList1.add(new bmk(new bmp[]{bmp.a(bmo.a, bmm.f)}));
                    arrayList1.add(new bmk(new bmp[]{bmp.a(bmo.a, bmm.c)}));
                    arrayList1.addAll(aue.a(bmm.f, bmm.m));
                    arrayList1.addAll(aue.a(bmm.f, bmm.i));
                    arrayList1.addAll(aue.a(bmm.f, bmm.h));
                    arrayList1.addAll(aue.a(bmm.f, bmm.f));
                    arrayList1.addAll(aue.a(bmm.c, bmm.m));
                    arrayList1.addAll(aue.a(bmm.c, bmm.i));
                    arrayList1.addAll(aue.a(bmm.c, bmm.f));
                    arrayList1.addAll(aue.a(bmm.b, bmm.l));
                    arrayList1.addAll(aue.a(bmm.e, bmm.l));
                    list4.addAll(arrayList1);
                }
                arrayList0.addAll(list4);
            }
            else if(ave0.e) {
                List list5 = this.l;
                if(list5.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    bmk bmk0 = new bmk();
                    bmk0.b(bmp.a(bmo.d, bmm.k));
                    arrayList2.add(bmk0);
                    bmk bmk1 = new bmk();
                    bmk1.b(bmp.a(bmo.a, bmm.d));
                    bmk1.b(bmp.a(bmo.d, bmm.k));
                    arrayList2.add(bmk1);
                    list5.addAll(arrayList2);
                }
                arrayList0.addAll(list5);
            }
            else if(ave0.f) {
                List list6 = this.h;
                if(list6.isEmpty()) {
                    aui aui0 = this.B;
                    if(aui0.c()) {
                        list6.clear();
                        Size size0 = (Size)aui0.c.a();
                        if(size0 != null) {
                            bmq bmq0 = this.a(34);
                            ArrayList arrayList3 = new ArrayList();
                            ibuq.f(bmq0, "surfaceSizeDefinition");
                            bmp bmp0 = bml.c(34, size0, bmq0, bmn.b, bmp.a);
                            bmk bmk2 = new bmk();
                            bmk2.b(bmp0);
                            arrayList3.add(bmk2);
                            bmk bmk3 = new bmk();
                            bmk3.b(bmp0);
                            bmk3.b(bmp0);
                            arrayList3.add(bmk3);
                            list6.addAll(arrayList3);
                        }
                    }
                }
                arrayList0.addAll(list6);
            }
            else {
                int v1 = ave0.c;
                if(v1 == 8) {
                    arrayList0.addAll((ave0.d ? this.g : this.d));
                }
                else if(v1 == 10) {
                    arrayList0.addAll(this.k);
                }
            }
            map1.put(ave0, arrayList0);
            list3 = arrayList0;
        }
        boolean z = false;
        for(Object object0: list3) {
            z = ((bmk)object0).a(list0) != null;
            if(z) {
                break;
            }
        }
        if(z && ave0.h) {
            Range range0 = ave0.i;
            bma bma0 = new bma();
            for(int v = 0; v < list0.size(); ++v) {
                bmp bmp1 = (bmp)list0.get(v);
                int v2 = bmp1.g;
                bmq bmq1 = this.a(v2);
                ibuq.f(bmq1, "definition");
                bmm bmm0 = bmp1.e;
                int v3 = bmm0.ordinal();
                if(v3 == 3) {
                    size1 = bmq1.c;
                }
                else {
                    switch(v3) {
                        case 9: {
                            size1 = bmq1.e;
                            break;
                        }
                        case 10: {
                            size1 = bmq1.a(v2);
                            break;
                        }
                        case 11: {
                            size1 = (Size)bmq1.f.get(Integer.valueOf(v2));
                            break;
                        }
                        case 12: {
                            size1 = (Size)bmq1.f.get(Integer.valueOf(v2));
                            break;
                        }
                        case 13: {
                            size1 = bmq1.b(v2);
                            break;
                        }
                        case 14: {
                            throw new IllegalStateException("Not supported config size");
                        }
                        default: {
                            size1 = bmm0.q;
                        }
                    }
                }
                ibuq.c(size1);
                bnc bnc0 = (bnc)list1.get(((Integer)list2.get(v)).intValue());
                bat bat0 = (bat)Objects.requireNonNull(((bat)map0.get(bmp1)));
                ibuq.f(bnc0, "<this>");
                ibuq.f(size1, "resolution");
                ibuq.f(bat0, "dynamicRange");
                ber ber0 = new ber(size1, bnc0.a());
                ibuq.f(bnc0, "<this>");
                switch(bnc0.k().ordinal()) {
                    case 0: {
                        bet0 = bet.b;
                        break;
                    }
                    case 1: {
                        bet0 = bet.a;
                        break;
                    }
                    case 3: {
                        bet0 = bet.c;
                        break;
                    }
                    case 4: {
                        bet0 = bet.d;
                        break;
                    }
                    default: {
                        bet0 = bet.e;
                    }
                }
                Class class0 = bet0.f;
                if(class0 != null) {
                    ber0.n = class0;
                }
                blt blt0 = blt.b(bnc0, size1);
                blt0.r(ber0, bat0);
                blt0.n((bmi.a.equals(range0) ? bew.a : range0));
                if(ave0.d) {
                    blt0.p(2);
                }
                bma0.s(blt0.a());
                kay.d(bma0.t(), "Cannot create a combined SessionConfig for feature combo after adding " + bnc0 + " with " + bmp1 + " due to [" + (bma0.k ? bma0.j.toString() : "Template is not set") + "]; surfaceConfigList = " + list0 + ", featureSettings = " + ave0 + ", newUseCaseConfigs = " + list1);
            }
            bmb bmb0 = bma0.a();
            boolean z1 = this.C.a(bmb0);
            for(Object object1: bmb0.g()) {
                ((bka)object1).d();
            }
            return z1;
        }
        return z;
    }

    public final bmr d(List list0, Map map0, boolean z, boolean z1, boolean z2) {
        int v11;
        bat bat5;
        bat bat4;
        Map map2;
        bat bat2;
        ArrayList arrayList11;
        int v8;
        int v7;
        att att1;
        Map map1;
        synchronized(ats.a) {
            this.y.b = this.y.a();
        }
        if(this.b == null) {
            this.k();
        }
        else {
            Size size0 = this.y.b();
            this.b = new bmq(this.b.a, this.b.b, size0, this.b.d, this.b.e, this.b.f, this.b.g, this.b.h, this.b.i);
        }
        Set set0 = map0.keySet();
        ibuq.f(set0, "newUseCaseConfigs");
        ArrayList arrayList0 = new ArrayList(ibpo.q(list0, 10));
        for(Object object0: list0) {
            arrayList0.add(Integer.valueOf(((bhk)object0).g));
        }
        ArrayList arrayList1 = new ArrayList(ibpo.q(set0, 10));
        for(Object object1: set0) {
            arrayList1.add(Integer.valueOf(((bnc)object1).y()));
        }
        boolean z3 = false;
        List list1 = ibpo.ak(arrayList0, arrayList1);
        if(!list1.isEmpty()) {
            for(Object object2: list1) {
                if(((Number)object2).intValue() == 1) {
                    z3 = true;
                    break;
                }
            }
        }
        if(z3 && !list1.isEmpty()) {
            for(Object object3: list1) {
                if(((Number)object3).intValue() != 1) {
                    throw new IllegalArgumentException("All sessionTypes should be high-speed when any of them is high-speed");
                }
            }
        }
        if(z3) {
            aui aui0 = this.B;
            List list2 = aui.e(ibpo.ar(map0.values()));
            ArrayList arrayList2 = new ArrayList();
            for(Object object4: list2) {
                if(aui0.b().contains(((Size)object4))) {
                    arrayList2.add(object4);
                }
            }
            LinkedHashMap linkedHashMap0 = new LinkedHashMap(ibpz.a(map0.size()));
            for(Object object5: map0.entrySet()) {
                Object object6 = ((Map.Entry)object5).getKey();
                List list3 = (List)((Map.Entry)object5).getValue();
                ArrayList arrayList3 = new ArrayList();
                for(Object object7: list3) {
                    if(arrayList2.contains(((Size)object7))) {
                        arrayList3.add(object7);
                    }
                }
                linkedHashMap0.put(object6, arrayList3);
            }
            map1 = linkedHashMap0;
        }
        else {
            map1 = map0;
        }
        ArrayList arrayList4 = new ArrayList(map1.keySet());
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        for(Object object8: arrayList4) {
            Integer integer0 = ((bnc)object8).z();
            if(!arrayList6.contains(integer0)) {
                arrayList6.add(integer0);
            }
        }
        Collections.sort(arrayList6);
        Collections.reverse(arrayList6);
        int v1 = arrayList6.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            int v3 = (int)(((Integer)arrayList6.get(v2)));
            for(Object object9: arrayList4) {
                bnc bnc0 = (bnc)object9;
                if(v3 == bnc0.z()) {
                    arrayList5.add(Integer.valueOf(arrayList4.indexOf(bnc0)));
                }
            }
        }
        att att0 = this.A;
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        for(Object object10: list0) {
            linkedHashSet0.add(((bhk)object10).d);
        }
        axc axc0 = att0.b;
        Set set1 = axc0.a.c();
        HashSet hashSet0 = new HashSet(set1);
        for(Object object11: linkedHashSet0) {
            att.b(hashSet0, ((bat)object11), axc0);
        }
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        for(Object object12: arrayList5) {
            bnc bnc1 = (bnc)arrayList4.get(((Integer)object12).intValue());
            bat bat0 = bnc1.e();
            if(Objects.equals(bat0, bat.a)) {
                arrayList9.add(bnc1);
            }
            else {
                int v4 = bat0.h;
                switch(v4) {
                    case 0: {
                    label_125:
                        if(bat0.i == 0) {
                            arrayList7.add(bnc1);
                            goto label_129;
                        }
                        break;
                    }
                    case 2: {
                        break;
                    }
                    default: {
                        if(bat0.i != 0) {
                            if(v4 != 0) {
                                arrayList7.add(bnc1);
                                goto label_129;
                            }
                            goto label_125;
                        }
                    }
                }
                arrayList8.add(bnc1);
            }
        label_129:
            z3 = z3;
        }
        HashMap hashMap0 = new HashMap();
        LinkedHashSet linkedHashSet1 = new LinkedHashSet();
        ArrayList arrayList10 = new ArrayList();
        arrayList10.addAll(arrayList7);
        arrayList10.addAll(arrayList8);
        arrayList10.addAll(arrayList9);
        int v5 = arrayList10.size();
        int v6 = 0;
        while(v6 < v5) {
            bnc bnc2 = (bnc)arrayList10.get(v6);
            bat bat1 = bnc2.e();
            bnc2.o();
            if(bat1.b()) {
                if(hashSet0.contains(bat1)) {
                    att1 = att0;
                    v7 = v5;
                    v8 = v6;
                    arrayList11 = arrayList10;
                    bat2 = bat1;
                    map2 = map1;
                    goto label_224;
                }
                else {
                    att1 = att0;
                    v7 = v5;
                    v8 = v6;
                    arrayList11 = arrayList10;
                    map2 = map1;
                    goto label_223;
                }
                goto label_158;
            }
            else {
            label_158:
                v7 = v5;
                int v9 = bat1.h;
                v8 = v6;
                int v10 = bat1.i;
                arrayList11 = arrayList10;
                if(v9 == 1) {
                    if(v10 == 0) {
                        bat bat3 = bat.b;
                        att1 = att0;
                        if(hashSet0.contains(bat3)) {
                            bat2 = bat3;
                            map2 = map1;
                            goto label_224;
                        }
                        else {
                            map2 = map1;
                            goto label_223;
                        }
                        goto label_173;
                    }
                    else {
                    label_173:
                        v9 = 1;
                    }
                }
                bat2 = att.a(bat1, linkedHashSet0, hashSet0);
                if(bat2 == null) {
                    bat2 = att.a(bat1, linkedHashSet1, hashSet0);
                    if(bat2 == null) {
                        bat2 = bat.b;
                        if(att.d(bat1, bat2, hashSet0)) {
                            bcs.h("DynamicRangeResolver");
                            att1 = att0;
                            map2 = map1;
                            goto label_224;
                        }
                        else {
                            map2 = map1;
                            if(v9 == 2 && (v10 == 0 || v10 == 10)) {
                                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                if(Build.VERSION.SDK_INT >= 33) {
                                    Long long0 = (Long)att0.a.c(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
                                    bat4 = long0 == null ? null : axa.a(long0.longValue());
                                    if(bat4 != null) {
                                        linkedHashSet2.add(bat4);
                                    }
                                }
                                else {
                                    bat4 = null;
                                }
                                linkedHashSet2.add(bat.c);
                                bat5 = att.a(bat1, linkedHashSet2, hashSet0);
                                if(bat5 != null) {
                                    Objects.equals(bat5, bat4);
                                    bcs.h("DynamicRangeResolver");
                                    att1 = att0;
                                    bat2 = bat5;
                                    goto label_224;
                                }
                            }
                            for(Object object13: hashSet0) {
                                bat5 = (bat)object13;
                                att1 = att0;
                                kay.d(bat5.b(), "Candidate dynamic range must be fully specified.");
                                if(!bat5.equals(bat2) && att.c(bat1, bat5)) {
                                    bcs.h("DynamicRangeResolver");
                                    bat2 = bat5;
                                    goto label_224;
                                }
                                att0 = att1;
                            }
                            att1 = att0;
                        }
                    }
                    else {
                        bcs.h("DynamicRangeResolver");
                        att1 = att0;
                        map2 = map1;
                        goto label_224;
                    }
                }
                else {
                    bcs.h("DynamicRangeResolver");
                    att1 = att0;
                    map2 = map1;
                    goto label_224;
                }
            }
        label_223:
            bat2 = null;
        label_224:
            if(bat2 == null) {
                throw new IllegalArgumentException(String.format("Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  %s\nRequested dynamic range:\n  %s\nSupported dynamic ranges:\n  %s\nConstrained set of concurrent dynamic ranges:\n  %s", bnc2.o(), bat1, TextUtils.join("\n  ", set1), TextUtils.join("\n  ", hashSet0)));
            }
            att.b(hashSet0, bat2, axc0);
            hashMap0.put(bnc2, bat2);
            if(!linkedHashSet0.contains(bat2)) {
                linkedHashSet1.add(bat2);
            }
            v6 = v8 + 1;
            v5 = v7;
            arrayList10 = arrayList11;
            map1 = map2;
            att0 = att1;
            continue;
        }
        bcs.h("SupportedSurfaceCombination");
        for(Object object14: list0) {
            if(((bhk)object14).b != 0x1005) {
                continue;
            }
            goto label_247;
        }
        boolean z4 = false;
        for(Object object15: map1.keySet()) {
            if(((bnc)object15).a() == 0x1005) {
            label_247:
                z4 = true;
                break;
            }
        }
        Boolean boolean0 = null;
        for(Object object16: list0) {
            avf.n(((bhk)object16).i, boolean0);
            boolean0 = Boolean.valueOf(((bhk)object16).i);
        }
        for(Object object17: arrayList4) {
            boolean z5 = ((bnc)object17).u();
            avf.n(z5, boolean0);
            boolean0 = Boolean.valueOf(z5);
        }
        boolean z6 = boolean0 == null ? false : boolean0.booleanValue();
        Range range0 = bmi.a;
        Range range1 = range0;
        for(Object object18: list0) {
            range1 = avf.q(((bhk)object18).h, range1, z6);
        }
        Range range2 = range1;
        for(Object object19: arrayList5) {
            range2 = avf.q(((Range)Objects.requireNonNull(((bnc)arrayList4.get(((Integer)object19).intValue())).d(range0))), range2, z6);
        }
        if(z && !this.x && z2) {
            throw new IllegalArgumentException("Preview stabilization is not supported by the camera.");
        }
        ave ave0 = this.s(z1, hashMap0, z, z4, z3, z2, false, range2, z6);
        Collection collection0 = hashMap0.values();
        if(z2) {
            int v12 = collection0.contains(bat.c);
            if(range2 != null && ((int)(((Integer)range2.getUpper()))) == 60) {
                ++v12;
            }
            if(z) {
                ++v12;
            }
            if(z4) {
                ++v12;
            }
            if(v12 > 1) {
                v11 = 2;
            }
            else {
                v11 = v12 == 1 ? 3 : 1;
            }
        }
        else {
            v11 = 1;
        }
        bcs.h("SupportedSurfaceCombination");
        switch(v11 - 1) {
            case 1: {
                return this.r(this.s(ave0.b, hashMap0, ave0.d, ave0.e, ave0.f, ave0.g, true, ave0.i, ave0.j), list0, map1, arrayList4, arrayList5, hashMap0);
            }
            case 2: {
                try {
                    return this.r(ave0, list0, map1, arrayList4, arrayList5, hashMap0);
                }
                catch(IllegalArgumentException unused_ex) {
                    bcs.i("SupportedSurfaceCombination");
                    return this.r(this.s(ave0.b, hashMap0, ave0.d, ave0.e, ave0.f, ave0.g, true, ave0.i, ave0.j), list0, map1, arrayList4, arrayList5, hashMap0);
                }
            }
            default: {
                return this.r(ave0, list0, map1, arrayList4, arrayList5, hashMap0);
            }
        }
    }

    public final bmp e(int v, Size size0, bmj bmj0) {
        return bmp.b(v, size0, this.a(v), bmn.b, bmj0);
    }

    private final int f(int v, Size size0, boolean z) {
        long v1;
        boolean z1;
        if(!z) {
            z1 = true;
        }
        else if(v == 34) {
            v = 34;
            z1 = true;
        }
        else {
            z1 = false;
        }
        kay.c(z1);
        if(z) {
            ibuq.f(size0, "size");
            List list0 = this.B.a(size0);
            if(list0.isEmpty()) {
                list0 = null;
            }
            if(list0 == null) {
                java.util.Objects.toString(size0);
                bcs.d("HighSpeedResolver", "No supported high speed  fps for " + size0);
                return 0;
            }
            Iterator iterator0 = list0.iterator();
            if(!iterator0.hasNext()) {
                throw new NoSuchElementException();
            }
            Object object0 = iterator0.next();
            Integer integer0 = (Integer)((Range)object0).getUpper();
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                Integer integer1 = (Integer)((Range)object1).getUpper();
                if(integer0.compareTo(integer1) < 0) {
                    integer0 = integer1;
                }
            }
            ibuq.e(integer0, "maxOf(...)");
            return integer0.intValue();
        }
        awy awy0 = (awy)Objects.requireNonNull(this.a.b());
        try {
            v1 = awy0.b.a.getOutputMinFrameDuration(v, size0);
        }
        catch(RuntimeException runtimeException0) {
            bcs.e("StreamConfigurationMapCompat", a.t(size0, v, "Failed to get min frame duration for format = ", " and size = "), runtimeException0);
            v1 = 0L;
        }
        if(v1 <= 0L) {
            if(!this.w) {
                return 0x7FFFFFFF;
            }
            bcs.d("SupportedSurfaceCombination", "minFrameDuration: " + v1 + " is invalid for imageFormat = " + v + ", size = " + size0);
            return 0;
        }
        return (int)(1000000000.0 / ((double)v1));
    }

    private static int g(Range range0, Range range1) {
        kay.d(!range0.contains(((Integer)range1.getUpper())) && !range0.contains(((Integer)range1.getLower())), "Ranges must not intersect");
        return ((int)(((Integer)range0.getLower()))) <= ((int)(((Integer)range1.getUpper()))) ? ((int)(((Integer)range1.getLower()))) - ((int)(((Integer)range0.getUpper()))) : ((int)(((Integer)range0.getLower()))) - ((int)(((Integer)range1.getUpper())));
    }

    private static int h(Range range0) {
        return ((int)(((Integer)range0.getUpper()))) - ((int)(((Integer)range0.getLower()))) + 1;
    }

    private final int i(int v, int v1, Size size0, boolean z) {
        return Math.min(v, this.f(v1, size0, z));
    }

    private final Pair j(ave ave0, List list0, List list1, List list2, List list3, int v, Map map0, Map map1) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            arrayList0.add(((bhk)object0).a);
            map0.put(Integer.valueOf(arrayList0.size() - 1), ((bhk)object0));
        }
        for(int v1 = 0; v1 < list1.size(); ++v1) {
            Size size0 = (Size)list1.get(v1);
            bnc bnc0 = (bnc)list2.get(((Integer)list3.get(v1)).intValue());
            int v2 = bnc0.a();
            bmj bmj0 = bnc0.j();
            arrayList0.add(bmp.b(v2, size0, this.a(v2), (ave0.h ? bmn.a : bmn.b), bmj0));
            map1.put(Integer.valueOf(arrayList0.size() - 1), bnc0);
            v = this.i(v, bnc0.a(), size0, ave0.f);
        }
        return new Pair(arrayList0, v);
    }

    private final void k() {
        Size size4;
        Size[] arr_size;
        Size size2;
        Size size0 = this.y.b();
        Size size1 = null;
        try {
            size2 = null;
            int v1 = Integer.parseInt(this.n);
            int v2 = 0;
            while(v2 < 8) {
                int v3 = new int[]{1, 13, 10, 8, 12, 6, 5, 4}[v2];
                aod aod0 = this.o;
                if(aod0.b(v1, v3)) {
                    CamcorderProfile camcorderProfile0 = aod0.a(v1, v3);
                    if(camcorderProfile0 != null) {
                        size2 = new Size(camcorderProfile0.videoFrameWidth, camcorderProfile0.videoFrameHeight);
                        break;
                    }
                }
                ++v2;
                continue;
            }
            if(size2 == null) {
                goto label_17;
            }
            else {
                goto label_34;
            }
            goto label_35;
        }
        catch(NumberFormatException unused_ex) {
        }
    label_17:
        awy awy0 = this.a.b();
        try {
            arr_size = null;
            arr_size = awy0.a().getOutputSizes(MediaRecorder.class);
        }
        catch(Throwable unused_ex) {
        }
        if(arr_size != null) {
            Arrays.sort(arr_size, new bnl(true));
            for(int v = 0; v < arr_size.length; ++v) {
                Size size3 = arr_size[v];
                if(size3.getWidth() <= bri.e.getWidth() && size3.getHeight() <= bri.e.getHeight()) {
                    size1 = size3;
                    break;
                }
            }
        }
        if(size1 == null) {
            size4 = bri.c;
        }
        else {
            size4 = size1;
            goto label_35;
        label_34:
            size4 = size2;
        }
    label_35:
        HashMap hashMap0 = new HashMap();
        HashMap hashMap1 = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        HashMap hashMap5 = new HashMap();
        this.b = new bmq(bri.b, hashMap0, size0, hashMap1, size4, hashMap2, hashMap3, hashMap4, hashMap5);
    }

    private final void l(Map map0, int v, Rational rational0) {
        Size size0 = avf.p(this.a.b().a(), v, true, rational0);
        if(size0 != null) {
            map0.put(Integer.valueOf(v), size0);
        }
    }

    private final void m(Map map0, Size size0, int v) {
        if(!this.t) {
            return;
        }
        Size size1 = avf.p(this.a.b().a(), v, false, null);
        Integer integer0 = v;
        if(size1 != null) {
            size0 = (Size)Collections.min(Arrays.asList(new Size[]{size0, size1}), new bnl());
        }
        map0.put(integer0, size0);
    }

    private static final void n(boolean z, Boolean boolean0) {
        if(boolean0 != null && boolean0.booleanValue() != z) {
            throw new IllegalStateException("All isStrictFpsRequired should be the same");
        }
    }

    private static final Range o(Range range0, int v, Range[] arr_range) {
        Range range1 = bmi.a;
        if(range1.equals(range0) || arr_range == null) {
            return range1;
        }
        Range range2 = new Range(Math.min(((Integer)range0.getLower()).intValue(), v), Math.min(((Integer)range0.getUpper()).intValue(), v));
        int v2 = 0;
        Range range3 = range1;
        for(int v1 = 0; v1 < arr_range.length; ++v1) {
            Range range4 = arr_range[v1];
            if(v >= ((int)(((Integer)((Range)Objects.requireNonNull(range4)).getLower())))) {
                if(range3.equals(range1)) {
                    range3 = range4;
                }
                if(range4.equals(range2)) {
                    return range4;
                }
                try {
                    int v3 = avf.h(range4.intersect(range2));
                    if(v2 == 0) {
                        range3 = range4;
                        v2 = v3;
                    }
                    else if(v3 >= v2) {
                        double f = (double)avf.h(range3.intersect(range2));
                        double f1 = (double)avf.h(range4.intersect(range2));
                        double f2 = f1 / ((double)avf.h(range4));
                        double f3 = f / ((double)avf.h(range3));
                        int v4 = Double.compare(f1, f);
                        if(v4 <= 0) {
                            if(v4 == 0) {
                                int v5 = Double.compare(f2, f3);
                                if(v5 > 0 || v5 == 0 && ((int)(((Integer)range4.getLower()))) > ((int)(((Integer)range3.getLower())))) {
                                    range3 = range4;
                                }
                            }
                            else if((f3 < 0.5) && (f2 > f3)) {
                                range3 = range4;
                            }
                        }
                        else if((f2 >= 0.5) || (f2 >= f3)) {
                            range3 = range4;
                        }
                        v2 = avf.h(range2.intersect(range3));
                    }
                }
                catch(IllegalArgumentException unused_ex) {
                    if(v2 == 0 && (avf.g(range4, range2) < avf.g(range3, range2) || avf.g(range4, range2) == avf.g(range3, range2) && (((int)(((Integer)range4.getLower()))) > ((int)(((Integer)range3.getUpper()))) || avf.h(range4) < avf.h(range3)))) {
                        range3 = range4;
                    }
                }
            }
        }
        return range3;
    }

    private static final Size p(StreamConfigurationMap streamConfigurationMap0, int v, boolean z, Rational rational0) {
        Size[] arr_size;
        try {
            arr_size = v == 34 ? streamConfigurationMap0.getOutputSizes(SurfaceTexture.class) : streamConfigurationMap0.getOutputSizes(v);
        }
        catch(Throwable unused_ex) {
            arr_size = null;
        }
        if(arr_size == null || arr_size.length == 0) {
            arr_size = null;
        }
        else if(rational0 != null) {
            ArrayList arrayList0 = new ArrayList();
            for(int v1 = 0; v1 < arr_size.length; ++v1) {
                Size size0 = arr_size[v1];
                if(bni.a(size0, rational0)) {
                    arrayList0.add(size0);
                }
            }
            arr_size = arrayList0.isEmpty() ? null : ((Size[])arrayList0.toArray(new Size[0]));
        }
        if(arr_size != null && arr_size.length != 0) {
            bnl bnl0 = new bnl();
            Size size1 = (Size)Collections.max(Arrays.asList(arr_size), bnl0);
            Size size2 = bri.a;
            if(z) {
                Size[] arr_size1 = streamConfigurationMap0.getHighResolutionOutputSizes(v);
                if(arr_size1 != null && arr_size1.length > 0) {
                    size2 = (Size)Collections.max(Arrays.asList(arr_size1), bnl0);
                }
            }
            return (Size)Collections.max(Arrays.asList(new Size[]{size1, size2}), bnl0);
        }
        return null;
    }

    private static final Range q(Range range0, Range range1, boolean z) {
        Range range2 = bmi.a;
        if(range2.equals(range1) && range2.equals(range0)) {
            return bmi.a;
        }
        if(range2.equals(range1)) {
            return range0;
        }
        if(range2.equals(range0)) {
            return range1;
        }
        if(z) {
            kay.d(range0 == range1, "All targetFrameRate should be the same if strict fps is required");
            return range0;
        }
        try {
            return range1.intersect(range0);
        }
        catch(IllegalArgumentException unused_ex) {
            return range1;
        }
    }

    private final bmr r(ave ave0, List list0, Map map0, List list1, List list2, Map map1) {
        HashMap hashMap18;
        HashMap hashMap17;
        boolean z8;
        boolean z7;
        Range range3;
        List list14;
        List list13;
        List list12;
        ave ave3;
        HashMap hashMap16;
        bat bat1;
        HashMap hashMap12;
        Range range1;
        HashMap hashMap11;
        HashMap hashMap10;
        List list10;
        HashMap hashMap7;
        HashMap hashMap6;
        ave ave2;
        List list7;
        ibps ibps1;
        ibps ibps0;
        Rational rational0;
        avf avf0 = this;
        ave ave1 = ave0;
        Map map2 = map0;
        java.util.Objects.toString(ave1);
        bcs.h("SupportedSurfaceCombination");
        boolean z = ave1.h;
        if(!z) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: list0) {
                arrayList0.add(((bhk)object0).a);
            }
            bnl bnl0 = new bnl();
            for(Object object1: map2.keySet()) {
                List list3 = (List)map2.get(((bnc)object1));
                kay.b(list3 != null && !list3.isEmpty(), a.i(((bnc)object1), "No available output size is found for ", "."));
                Size size0 = (Size)Collections.min(list3, bnl0);
                int v = ((bnc)object1).a();
                bmq bmq0 = avf0.a(v);
                bmj bmj0 = ((bnc)object1).j();
                arrayList0.add(bmp.b(v, size0, bmq0, bmn.b, bmj0));
            }
            ave1 = ave0;
            if(!avf0.c(ave1, arrayList0, Collections.EMPTY_MAP, Collections.EMPTY_LIST, Collections.EMPTY_LIST)) {
                throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + avf0.n + ".  May be attempting to bind too many use cases. Existing surfaces: " + list0 + ". New configs: " + list1 + ". GroupableFeature settings: " + ave1);
            }
        }
        HashMap hashMap0 = new HashMap();
        Iterator iterator2 = map2.keySet().iterator();
        while(iterator2.hasNext()) {
            Object object2 = iterator2.next();
            bnc bnc0 = (bnc)object2;
            ArrayList arrayList1 = new ArrayList();
            HashMap hashMap1 = new HashMap();
            for(Object object3: ((List)Objects.requireNonNull(((List)map2.get(bnc0))))) {
                Size size1 = (Size)object3;
                int v1 = bnc0.a();
                bmj bmj1 = bnc0.j();
                bmm bmm0 = bmp.b(v1, size1, avf0.a(v1), (z ? bmn.a : bmn.b), bmj1).e;
                int v2 = bmi.a.equals(ave1.i) ? 0x7FFFFFFF : avf0.f(v1, size1, ave1.f);
                if(!ave1.g || bmm0 != bmm.o && (bmi.a.equals(ave1.i) || v2 >= ((int)(((Integer)ave1.i.getUpper()))))) {
                    Set set0 = (Set)hashMap1.get(bmm0);
                    if(set0 == null) {
                        set0 = new HashSet();
                        hashMap1.put(bmm0, set0);
                    }
                    Integer integer0 = v2;
                    if(!set0.contains(integer0)) {
                        arrayList1.add(size1);
                        set0.add(integer0);
                    }
                }
                iterator2 = iterator2;
                z = z;
            }
            hashMap0.put(bnc0, arrayList1);
            map2 = map0;
        }
        ArrayList arrayList2 = new ArrayList();
        for(Object object4: list2) {
            bnc bnc1 = (bnc)list1.get(((Integer)object4).intValue());
            List list4 = (List)hashMap0.get(bnc1);
            if(list4 == null) {
                list4 = Collections.EMPTY_LIST;
            }
            int v3 = bnc1.a();
            if(((Nexus4AndroidLTargetAspectRatioQuirk)axv.a(Nexus4AndroidLTargetAspectRatioQuirk.class)) != null || ((AspectRatioLegacyApi21Quirk)axs.a(avf0.a).a(AspectRatioLegacyApi21Quirk.class)) != null) {
                Size size2 = avf0.a(0x100).a(0x100);
                if(size2 != null) {
                    rational0 = new Rational(size2.getWidth(), size2.getHeight());
                    goto label_73;
                }
            }
            rational0 = null;
        label_73:
            if(rational0 != null) {
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for(Object object5: list4) {
                    Size size3 = (Size)object5;
                    if(bni.a(size3, rational0)) {
                        arrayList3.add(size3);
                    }
                    else {
                        arrayList4.add(size3);
                    }
                }
                arrayList4.addAll(0, arrayList3);
                list4 = arrayList4;
            }
            bmo bmo0 = bml.b(v3);
            if(avf0.z.a != null) {
                Size size4 = ExtraCroppingQuirk.b(bmo0);
                if(size4 != null) {
                    ArrayList arrayList5 = new ArrayList();
                    arrayList5.add(size4);
                    for(Object object6: list4) {
                        Size size5 = (Size)object6;
                        if(!size5.equals(size4)) {
                            arrayList5.add(size5);
                        }
                    }
                    list4 = arrayList5;
                }
            }
            arrayList2.add(list4);
        }
        boolean z1 = ave1.f;
        if(z1) {
            if(arrayList2.isEmpty()) {
                ibps0 = ibps.a;
                goto label_153;
            }
            List list5 = aui.e(arrayList2);
            ArrayList arrayList6 = new ArrayList(ibpo.q(list5, 10));
            for(Object object7: list5) {
                Size size6 = (Size)object7;
                int v4 = arrayList2.size();
                ArrayList arrayList7 = new ArrayList(v4);
                for(int v5 = 0; v5 < v4; ++v5) {
                    arrayList7.add(size6);
                }
                arrayList6.add(arrayList7);
            }
            ibps1 = arrayList6;
        }
        else {
            int v6 = 1;
            for(Object object8: arrayList2) {
                v6 *= ((List)object8).size();
            }
            if(v6 == 0) {
                throw new IllegalArgumentException("Failed to find supported resolutions.");
            }
            ibps0 = new ArrayList();
            for(int v7 = 0; v7 < v6; ++v7) {
                ibps0.add(new ArrayList());
            }
            int v8 = v6 / ((List)arrayList2.get(0)).size();
            int v9 = v6;
            for(int v10 = 0; v10 < arrayList2.size(); ++v10) {
                List list6 = (List)arrayList2.get(v10);
                for(int v11 = 0; v11 < v6; ++v11) {
                    ((List)ibps0.get(v11)).add(((Size)list6.get(v11 % v9 / v8)));
                }
                if(v10 < arrayList2.size() - 1) {
                    v9 = v8;
                    v8 /= ((List)arrayList2.get(v10 + 1)).size();
                }
            }
        label_153:
            ibps1 = ibps0;
        }
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        HashMap hashMap5 = new HashMap();
        for(Object object9: list0) {
            bne bne0 = (bne)((bhk)object9).e.get(0);
            ibuq.c(((bhk)object9).f);
            ibuq.c(bne0);
            if(!ava.c(((bhk)object9).f, bne0)) {
                continue;
            }
            goto label_173;
        }
        boolean z2 = false;
        for(Object object10: list1) {
            bne bne1 = ((bnc)object10).k();
            ibuq.e(bne1, "getCaptureType(...)");
            if(ava.c(((bnc)object10), bne1)) {
            label_173:
                z2 = true;
                break;
            }
        }
        int v12 = 0x7FFFFFFF;
        for(Object object11: list0) {
            v12 = avf0.i(v12, ((bhk)object11).b, ((bhk)object11).c, z1);
        }
        if(avf0.u && !z2) {
            list7 = null;
            Iterator iterator12 = ibps1.iterator();
            while(true) {
                if(!iterator12.hasNext()) {
                    ave2 = ave0;
                    hashMap6 = hashMap4;
                    hashMap7 = hashMap5;
                    break;
                }
                Object object12 = iterator12.next();
                ave2 = ave0;
                hashMap6 = hashMap4;
                hashMap7 = hashMap5;
                list7 = avf0.b(ave2, ((List)avf0.j(ave0, list0, ((List)object12), list1, list2, v12, hashMap4, hashMap5).first), hashMap6, hashMap7);
                if(list7 != null) {
                    break;
                }
                hashMap6.clear();
                hashMap7.clear();
                hashMap4 = hashMap6;
                hashMap5 = hashMap7;
            }
            java.util.Objects.toString(list7);
            bcs.h("SupportedSurfaceCombination");
        }
        else {
            ave2 = ave0;
            hashMap6 = hashMap4;
            hashMap7 = hashMap5;
            list7 = null;
        }
        Range range0 = ave2.i;
        boolean z3 = false;
        boolean z4 = false;
        int v13 = 0x7FFFFFFF;
        int v14 = 0x7FFFFFFF;
        List list8 = null;
        List list9 = null;
        Iterator iterator13 = ibps1.iterator();
        while(true) {
            if(!iterator13.hasNext()) {
                goto label_308;
            }
            Object object13 = iterator13.next();
            HashMap hashMap8 = new HashMap();
            HashMap hashMap9 = new HashMap();
            list10 = list7;
            hashMap10 = hashMap7;
            hashMap11 = hashMap2;
            int v15 = v13;
            range1 = range0;
            hashMap12 = hashMap6;
            Pair pair0 = avf0.j(ave2, list0, ((List)object13), list1, list2, v12, hashMap8, hashMap9);
            int v16 = v12;
            HashMap hashMap13 = hashMap8;
            HashMap hashMap14 = hashMap9;
            List list11 = (List)pair0.first;
            int v17 = (int)(((Integer)pair0.second));
            boolean z5 = bmi.a.equals(range1) || v17 >= v16 || v17 >= ((int)(((Integer)range1.getUpper())));
            HashMap hashMap15 = new HashMap();
            int v18 = 0;
            while(v18 < list11.size()) {
                bmp bmp0 = (bmp)list11.get(v18);
                bat bat0 = bat.a;
                Integer integer1 = v18;
                if(hashMap13.containsKey(integer1)) {
                    bat1 = ((bhk)Objects.requireNonNull(((bhk)hashMap13.get(integer1)))).d;
                }
                else {
                    if(hashMap14.containsKey(integer1)) {
                        bat0 = (bat)map1.get(Objects.requireNonNull(((bnc)hashMap14.get(integer1))));
                    }
                    bat1 = bat0;
                }
                hashMap15.put(bmp0, bat1);
                ++v18;
                v16 = v16;
            }
            hashMap16 = hashMap3;
            ave3 = ave0;
            list12 = list1;
            ibon ibon0 = new ibon(new avc(this, ave0, list11, hashMap15, list1, list2));
            avf0 = ibon0;
            if(!z3 && ((Boolean)ibon0.a()).booleanValue()) {
                if(v15 == 0x7FFFFFFF || v15 < v17) {
                    v15 = v17;
                    list8 = (List)object13;
                }
                if(!z5) {
                    goto label_267;
                }
                else if(z4) {
                    v14 = v14;
                    v13 = v17;
                    list13 = list9;
                    list14 = (List)object13;
                    break;
                }
                else {
                    v15 = v17;
                    list8 = (List)object13;
                    z3 = true;
                    z4 = false;
                    goto label_267;
                }
            }
            else {
            label_267:
                if(list10 != null && !z4 && avf0.b(ave3, list11, hashMap13, hashMap14) != null) {
                    if(v14 == 0x7FFFFFFF || v14 < v17) {
                        v14 = v17;
                        list9 = (List)object13;
                    }
                    else {
                        v14 = v14;
                    }
                    if(!z5) {
                        ave2 = ave3;
                        goto label_298;
                    }
                    else if(z3) {
                        v14 = v17;
                        v13 = v15;
                        list14 = list8;
                        list13 = (List)object13;
                        break;
                    }
                    else {
                        ave2 = ave3;
                        range0 = range1;
                        v14 = v17;
                        v13 = v15;
                        iterator13 = iterator13;
                        hashMap6 = hashMap12;
                        hashMap7 = hashMap10;
                        hashMap2 = hashMap11;
                        list7 = list10;
                        list9 = (List)object13;
                        v12 = v16;
                        hashMap3 = hashMap16;
                        z4 = true;
                        continue;
                    }
                }
                else {
                    ave2 = ave3;
                    v14 = v14;
                label_298:
                    range0 = range1;
                    v13 = v15;
                    iterator13 = iterator13;
                    hashMap6 = hashMap12;
                    hashMap7 = hashMap10;
                    hashMap2 = hashMap11;
                    list7 = list10;
                    v12 = v16;
                    hashMap3 = hashMap16;
                    continue;
                label_308:
                    list10 = list7;
                    ave3 = ave2;
                    hashMap12 = hashMap6;
                    hashMap10 = hashMap7;
                    hashMap11 = hashMap2;
                    hashMap16 = hashMap3;
                    list12 = list1;
                    range1 = range0;
                    list14 = list8;
                    list13 = list9;
                    break;
                }
            }
            throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + avf0.n + " and Hardware level: " + avf0.q + ". May be the specified resolution is too large and not supported. Existing surfaces: " + list0 + " New configs: " + list12);
        }
        boolean z6 = ave3.g;
        avd avd0 = !z6 || bmi.a.equals(range1) || v13 != 0x7FFFFFFF && v13 >= ((int)(((Integer)range1.getUpper()))) ? new avd(list14, list13, v13, v14) : new avd(null, null, 0x7FFFFFFF, 0x7FFFFFFF);
        bcs.h("SupportedSurfaceCombination");
        List list15 = avd0.a;
        if(list15 == null) {
            throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + avf0.n + " and Hardware level: " + avf0.q + ". May be the specified resolution is too large and not supported. Existing surfaces: " + list0 + " New configs: " + list12);
        }
        int v19 = avd0.c;
        Range range2 = bmi.a;
        if(!range2.equals(range1)) {
            Range[] arr_range = z1 ? avf0.B.d(list15) : ((Range[])avf0.a.c(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
            range3 = avf.o(range1, v19, arr_range);
            if(z6 || ave3.j) {
                kay.b(range3.equals(range1), "Target FPS range " + range1 + " is not supported. Max FPS supported by the calculated best combination: " + v19 + ". Calculated best FPS range for device: " + range3 + ". Device supported FPS ranges: " + Arrays.toString(arr_range));
            }
        }
        else if(z1) {
            Range[] arr_range1 = avf0.B.d(list15);
            range3 = avf.o(aui.a, v19, arr_range1);
        }
        else {
            range3 = range2;
        }
        for(Iterator iterator14 = list12.iterator(); iterator14.hasNext(); iterator14 = iterator14) {
            Object object14 = iterator14.next();
            bnc bnc2 = (bnc)object14;
            bmh bmh0 = bmi.a(((Size)list15.get(list2.indexOf(Integer.valueOf(list12.indexOf(bnc2))))));
            bmh0.e(((int)z1));
            bat bat2 = (bat)map1.get(bnc2);
            kay.i(bat2);
            bmh0.a = bat2;
            ibuq.f(bnc2, "useCaseConfig");
            blb blb0 = blb.a();
            bjr bjr0 = ant.b;
            if(bnc2.s(bjr0)) {
                blb0.c(bjr0, bnc2.l(bjr0));
            }
            bjr bjr1 = bnc.w;
            if(bnc2.s(bjr1)) {
                blb0.c(bjr1, bnc2.l(bjr1));
            }
            bjr bjr2 = bkk.a;
            if(bnc2.s(bjr2)) {
                blb0.c(bjr2, bnc2.l(bjr2));
            }
            bjr bjr3 = bnc.l;
            if(bnc2.s(bjr3)) {
                blb0.c(bjr3, bnc2.l(bjr3));
            }
            bmh0.b = new ant(blb0);
            bmh0.f(ave3.b);
            if(!range2.equals(range3)) {
                bmh0.b(range3);
            }
            hashMap16.put(bnc2, bmh0.a());
        }
        if(list10 != null && v19 == avd0.d) {
            List list16 = avd0.b;
            if(list15.size() == list16.size()) {
                for(int v20 = 0; v20 < list15.size(); ++v20) {
                    if(!((Size)list15.get(v20)).equals(list16.get(v20))) {
                        hashMap17 = hashMap11;
                        return new bmr(hashMap16, hashMap17, avd0.e);
                    }
                }
                awp awp0 = avf0.a;
                if(Build.VERSION.SDK_INT >= 33) {
                    ArrayList arrayList8 = new ArrayList(hashMap16.keySet());
                    for(Object object15: list0) {
                        kay.i(((bhk)object15).f);
                    }
                    for(Object object16: arrayList8) {
                        Object object17 = hashMap16.get(((bnc)object16));
                        kay.i(object17);
                        kay.i(((bmi)object17).g);
                    }
                    long[] arr_v = (long[])awp0.c(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES);
                    if(arr_v != null && arr_v.length != 0) {
                        HashSet hashSet0 = new HashSet();
                        for(int v21 = 0; v21 < arr_v.length; ++v21) {
                            hashSet0.add(Long.valueOf(arr_v[v21]));
                        }
                        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
                        Iterator iterator17 = list0.iterator();
                        if(iterator17.hasNext()) {
                            Object object18 = iterator17.next();
                            bjt bjt0 = ((bhk)object18).f;
                            ibuq.c(bjt0);
                            bjr bjr4 = ant.b;
                            if(blq.g(((blr)bjt0), bjr4)) {
                                ibuq.c(bjt0);
                                Object object19 = blq.b(((blr)bjt0), bjr4);
                                ibuq.c(object19);
                                if(((Number)object19).longValue() == 0L) {
                                    z7 = false;
                                    z8 = true;
                                }
                                else {
                                    z7 = true;
                                    z8 = false;
                                }
                            }
                            else {
                                z7 = false;
                                z8 = true;
                            }
                        }
                        else {
                            z7 = false;
                            z8 = false;
                        }
                        for(Object object20: arrayList8) {
                            bnc bnc3 = (bnc)object20;
                            bjr bjr5 = ant.b;
                            if(bnc3.s(bjr5)) {
                                Object object21 = bnc3.l(bjr5);
                                ibuq.c(object21);
                                long v22 = ((Number)object21).longValue();
                                if(v22 == 0L) {
                                    if(z7) {
                                        ava.d();
                                    }
                                    z8 = true;
                                }
                                else {
                                    if(z8) {
                                        ava.d();
                                    }
                                    linkedHashSet0.add(Long.valueOf(v22));
                                    z7 = true;
                                }
                            }
                            else {
                                if(z7) {
                                    ava.d();
                                }
                                z8 = true;
                            }
                        }
                        if(!z8) {
                            for(Object object22: linkedHashSet0) {
                                if(hashSet0.contains(Long.valueOf(((Number)object22).longValue()))) {
                                    continue;
                                }
                                goto label_475;
                            }
                            for(Object object23: list0) {
                                bhk bhk0 = (bhk)object23;
                                ibuq.c(bhk0.f);
                                Long long0 = (Long)blq.b(((blr)bhk0.f), ant.b);
                                bjt bjt1 = ava.a(bhk0.f, long0);
                                if(bjt1 != null) {
                                    hashMap11.put(bhk0, bhk0.a(bjt1));
                                }
                            }
                            for(Object object24: arrayList8) {
                                bnc bnc4 = (bnc)object24;
                                bmi bmi0 = (bmi)hashMap16.get(bnc4);
                                ibuq.c(bmi0);
                                ibuq.c(bmi0.g);
                                Long long1 = (Long)blq.b(((blr)bmi0.g), ant.b);
                                bjt bjt2 = ava.a(bmi0.g, long1);
                                if(bjt2 != null) {
                                    bmh bmh1 = new bmh(bmi0);
                                    bmh1.b = bjt2;
                                    hashMap16.put(bnc4, bmh1.a());
                                }
                            }
                            return new bmr(hashMap16, hashMap11, avd0.e);
                        }
                    }
                }
            label_475:
                hashMap17 = hashMap11;
                int v23 = list10.size();
                int v24 = 0;
                while(true) {
                    if(v24 >= v23) {
                        return new bmr(hashMap16, hashMap17, avd0.e);
                    }
                    long v25 = ((bmp)list10.get(v24)).f.h;
                    Integer integer2 = v24;
                    if(hashMap12.containsKey(integer2)) {
                        bhk bhk1 = (bhk)hashMap12.get(integer2);
                        ibuq.c(bhk1);
                        ibuq.c(bhk1.f);
                        bjt bjt3 = ava.a(bhk1.f, Long.valueOf(v25));
                        if(bjt3 != null) {
                            hashMap17.put(bhk1, bhk1.a(bjt3));
                        }
                        hashMap18 = hashMap10;
                    }
                    else {
                        hashMap18 = hashMap10;
                        if(!hashMap18.containsKey(integer2)) {
                            throw new AssertionError("SurfaceConfig does not map to any use case");
                        }
                        Object object25 = hashMap18.get(integer2);
                        ibuq.c(object25);
                        bnc bnc5 = (bnc)object25;
                        bmi bmi1 = (bmi)hashMap16.get(bnc5);
                        ibuq.c(bmi1);
                        ibuq.c(bmi1.g);
                        bjt bjt4 = ava.a(bmi1.g, Long.valueOf(v25));
                        if(bjt4 != null) {
                            bmh bmh2 = new bmh(bmi1);
                            bmh2.b = bjt4;
                            hashMap16.put(bnc5, bmh2.a());
                        }
                    }
                    ++v24;
                    list10 = list10;
                    hashMap12 = hashMap12;
                    hashMap10 = hashMap18;
                    continue;
                }
            }
        }
        hashMap17 = hashMap11;
        return new bmr(hashMap16, hashMap17, avd0.e);
    }

    private final ave s(boolean z, Map map0, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5, Range range0, boolean z6) {
        int v;
        for(Object object0: map0.values()) {
            v = 10;
            if(((bat)object0).i != 10) {
                continue;
            }
            goto label_7;
        }
        v = 8;
    label_7:
        if(z3 && z4) {
            throw new IllegalArgumentException("High-speed session is not supported with feature combination");
        }
        if(z3 && !this.B.c()) {
            throw new IllegalArgumentException("High-speed session is not supported on this device.");
        }
        if(z4 && range0 == bmi.a && z5) {
            range0 = bew.a;
        }
        return new ave(z, v, z1, z2, z3, z4, z5, range0, z6);
    }
}

