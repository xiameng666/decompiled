package com.google.android.gms.wearable.backup.wear.lockscreenbc25.pin;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.gms.wearable.backup.wear.KeyRecoveryChimeraActivity;
import fcot;
import fcpx;
import fcvk;
import fcvl;
import fcvm;
import fcvw;
import fcwa;
import fcwd;
import ggeo;
import j..util.DesugarCollections;
import j..util.Objects;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;

public class PinPadViewV2 extends LinearLayout {
    public final ArrayList a;
    public final int[] b;
    public static final int c;
    private static final int[] d;
    private Consumer e;
    private final NumberFormat f;
    private Function g;
    private final Rect h;

    static {
        PinPadViewV2.d = new int[]{0x7F0B1EB2, 0x7F0B1EB3, 0x7F0B1EB4, 0x7F0B1EB5};  // id:row_1
    }

    public PinPadViewV2(Context context0) {
        this(context0, null);
    }

    public PinPadViewV2(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public PinPadViewV2(Context context0, AttributeSet attributeSet0, int v) {
        this(context0, attributeSet0, v, new fcwa());
    }

    private PinPadViewV2(Context context0, AttributeSet attributeSet0, int v, Function function0) {
        super(context0, attributeSet0, v);
        this.h = new Rect();
        this.b = new int[]{7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 66, 67};
        this.f = DecimalFormat.getInstance(this.getResources().getConfiguration().getLocales().get(0));
        this.g = function0;
        this.setLayoutDirection(0);
        PinPadViewV2.inflate(context0, 0x7F0E07CD, this);  // layout:pin_pad_m3
        DisplayMetrics displayMetrics0 = context0.getResources().getDisplayMetrics();
        int v1 = Math.round(PinPadViewV2.b(context0, 0x7F0A001B, displayMetrics0.widthPixels));  // fraction:pin_pad_m3_horizontal_padding_percent
        this.setPadding(v1, Math.round(PinPadViewV2.b(context0, 0x7F0A001C, displayMetrics0.heightPixels)), v1, Math.round(PinPadViewV2.b(context0, 0x7F0A001A, displayMetrics0.heightPixels)));  // fraction:pin_pad_m3_top_padding_percent
        this.a = new ArrayList();
        for(int v2 = 0; v2 < 3; ++v2) {
            ComposeView composeView0 = (ComposeView)this.findViewById(PinPadViewV2.d[v2]);
            fcvm[] arr_fcvm = new fcvm[3];
            for(int v3 = 0; v3 < 3; ++v3) {
                arr_fcvm[v3] = this.c(v2 * 3 + v3 + 1);
            }
            ((fcvw)this.g.apply(arr_fcvm)).a(composeView0);
        }
        fcvl fcvl0 = new fcvl("Delete", 0x7F0806BD, () -> {
            ArrayList arrayList0 = this.a;
            int v1 = arrayList0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                fcot fcot0 = (fcot)arrayList0.get(v2);
                KeyRecoveryChimeraActivity keyRecoveryChimeraActivity0 = fcot0.a;
                PinPadEditView pinPadEditView0 = fcot0.b;
                if(keyRecoveryChimeraActivity0.n) {
                    if(67 == 67) {
                        StringBuilder stringBuilder0 = keyRecoveryChimeraActivity0.o;
                        if(stringBuilder0.length() > 0) {
                            String s = stringBuilder0.toString();
                            String s1 = s.substring(0, s.length() - 1);
                            int v3 = s1.length();
                            if(v3 >= 0 && v3 < 4) {
                                --pinPadEditView0.c;
                                pinPadEditView0.a[v3].b(0);
                                pinPadEditView0.a(s1, s, s.length() - 1, 1, 0);
                            }
                            else {
                                Log.e("PinPadEditView", "Mis-use of the API, the UI operates between 0 and PIN_LENGTH-1 index.");
                            }
                            stringBuilder0.setLength(stringBuilder0.length() - 1);
                        }
                    }
                    else {
                        ggeo ggeo0 = KeyRecoveryChimeraActivity.k;
                        Integer integer0 = 67;
                        if(ggeo0.containsKey(integer0)) {
                            StringBuilder stringBuilder1 = keyRecoveryChimeraActivity0.o;
                            stringBuilder1.append(ggeo0.get(integer0));
                            String s2 = stringBuilder1.toString();
                            String s3 = s2.substring(0, s2.length() - 1);
                            int v4 = s2.length() - 1;
                            if(v4 >= 0 && v4 < 4) {
                                ++pinPadEditView0.c;
                                PinPadDot pinPadDot0 = pinPadEditView0.a[v4];
                                pinPadDot0.a();
                                pinPadDot0.a.start();
                                pinPadEditView0.a(s2, s3, s3.length(), 0, 1);
                            }
                            else {
                                Log.e("PinPadEditView", "Mis-use of the API, the UI operates between 0 and PIN_LENGTH-1 index.");
                            }
                            if(stringBuilder1.length() == 4) {
                                keyRecoveryChimeraActivity0.a();
                                keyRecoveryChimeraActivity0.l.d(fcpx.a(stringBuilder1.toString()));
                                stringBuilder1.setLength(0);
                            }
                        }
                        else {
                            KeyRecoveryChimeraActivity.j.f("Ignoring unexpected keyCode: " + 67, new Object[0]);
                        }
                    }
                }
            }
        });
        fcvl fcvl1 = new fcvl("Enter", 0x7F0806DB, () -> {
            ArrayList arrayList0 = this.a;
            int v1 = arrayList0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                fcot fcot0 = (fcot)arrayList0.get(v2);
                KeyRecoveryChimeraActivity keyRecoveryChimeraActivity0 = fcot0.a;
                PinPadEditView pinPadEditView0 = fcot0.b;
                if(keyRecoveryChimeraActivity0.n) {
                    if(66 == 67) {
                        StringBuilder stringBuilder0 = keyRecoveryChimeraActivity0.o;
                        if(stringBuilder0.length() > 0) {
                            String s = stringBuilder0.toString();
                            String s1 = s.substring(0, s.length() - 1);
                            int v3 = s1.length();
                            if(v3 >= 0 && v3 < 4) {
                                --pinPadEditView0.c;
                                pinPadEditView0.a[v3].b(0);
                                pinPadEditView0.a(s1, s, s.length() - 1, 1, 0);
                            }
                            else {
                                Log.e("PinPadEditView", "Mis-use of the API, the UI operates between 0 and PIN_LENGTH-1 index.");
                            }
                            stringBuilder0.setLength(stringBuilder0.length() - 1);
                        }
                    }
                    else {
                        ggeo ggeo0 = KeyRecoveryChimeraActivity.k;
                        Integer integer0 = 66;
                        if(ggeo0.containsKey(integer0)) {
                            StringBuilder stringBuilder1 = keyRecoveryChimeraActivity0.o;
                            stringBuilder1.append(ggeo0.get(integer0));
                            String s2 = stringBuilder1.toString();
                            String s3 = s2.substring(0, s2.length() - 1);
                            int v4 = s2.length() - 1;
                            if(v4 >= 0 && v4 < 4) {
                                ++pinPadEditView0.c;
                                PinPadDot pinPadDot0 = pinPadEditView0.a[v4];
                                pinPadDot0.a();
                                pinPadDot0.a.start();
                                pinPadEditView0.a(s2, s3, s3.length(), 0, 1);
                            }
                            else {
                                Log.e("PinPadEditView", "Mis-use of the API, the UI operates between 0 and PIN_LENGTH-1 index.");
                            }
                            if(stringBuilder1.length() == 4) {
                                keyRecoveryChimeraActivity0.a();
                                keyRecoveryChimeraActivity0.l.d(fcpx.a(stringBuilder1.toString()));
                                stringBuilder1.setLength(0);
                            }
                        }
                        else {
                            KeyRecoveryChimeraActivity.j.f("Ignoring unexpected keyCode: " + 66, new Object[0]);
                        }
                    }
                }
            }
        });
        fcvm[] arr_fcvm1 = {fcvl0, this.c(0), fcvl1};
        ComposeView composeView1 = (ComposeView)this.findViewById(PinPadViewV2.d[3]);
        fcvw fcvw0 = (fcvw)this.g.apply(arr_fcvm1);
        fcvw0.a(composeView1);
        fcwd fcwd0 = new fcwd(fcvw0);
        this.e = fcwd0;
        fcwd0.accept(Boolean.valueOf(false));
    }

    // Detected as a lambda impl.
    public final void a(int v) {
        ArrayList arrayList0 = this.a;
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            fcot fcot0 = (fcot)arrayList0.get(v2);
            KeyRecoveryChimeraActivity keyRecoveryChimeraActivity0 = fcot0.a;
            PinPadEditView pinPadEditView0 = fcot0.b;
            if(keyRecoveryChimeraActivity0.n) {
                if(v == 67) {
                    StringBuilder stringBuilder0 = keyRecoveryChimeraActivity0.o;
                    if(stringBuilder0.length() > 0) {
                        String s = stringBuilder0.toString();
                        String s1 = s.substring(0, s.length() - 1);
                        int v3 = s1.length();
                        if(v3 >= 0 && v3 < 4) {
                            --pinPadEditView0.c;
                            pinPadEditView0.a[v3].b(0);
                            pinPadEditView0.a(s1, s, s.length() - 1, 1, 0);
                        }
                        else {
                            Log.e("PinPadEditView", "Mis-use of the API, the UI operates between 0 and PIN_LENGTH-1 index.");
                        }
                        stringBuilder0.setLength(stringBuilder0.length() - 1);
                    }
                }
                else {
                    ggeo ggeo0 = KeyRecoveryChimeraActivity.k;
                    Integer integer0 = v;
                    if(ggeo0.containsKey(integer0)) {
                        StringBuilder stringBuilder1 = keyRecoveryChimeraActivity0.o;
                        stringBuilder1.append(ggeo0.get(integer0));
                        String s2 = stringBuilder1.toString();
                        String s3 = s2.substring(0, s2.length() - 1);
                        int v4 = s2.length() - 1;
                        if(v4 >= 0 && v4 < 4) {
                            ++pinPadEditView0.c;
                            PinPadDot pinPadDot0 = pinPadEditView0.a[v4];
                            pinPadDot0.a();
                            pinPadDot0.a.start();
                            pinPadEditView0.a(s2, s3, s3.length(), 0, 1);
                        }
                        else {
                            Log.e("PinPadEditView", "Mis-use of the API, the UI operates between 0 and PIN_LENGTH-1 index.");
                        }
                        if(stringBuilder1.length() == 4) {
                            keyRecoveryChimeraActivity0.a();
                            keyRecoveryChimeraActivity0.l.d(fcpx.a(stringBuilder1.toString()));
                            stringBuilder1.setLength(0);
                        }
                    }
                    else {
                        KeyRecoveryChimeraActivity.j.f("Ignoring unexpected keyCode: " + v, new Object[0]);
                    }
                }
            }
        }
    }

    private static float b(Context context0, int v, int v1) {
        return context0.getResources().getFraction(v, v1, v1);
    }

    private final fcvm c(int v) {
        return new fcvk(this.f.format(((long)v)), () -> {
            ArrayList arrayList0 = this.a;
            int v1 = arrayList0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                fcot fcot0 = (fcot)arrayList0.get(v2);
                KeyRecoveryChimeraActivity keyRecoveryChimeraActivity0 = fcot0.a;
                PinPadEditView pinPadEditView0 = fcot0.b;
                if(keyRecoveryChimeraActivity0.n) {
                    if(this.a.b[this.b] == 67) {
                        StringBuilder stringBuilder0 = keyRecoveryChimeraActivity0.o;
                        if(stringBuilder0.length() > 0) {
                            String s = stringBuilder0.toString();
                            String s1 = s.substring(0, s.length() - 1);
                            int v3 = s1.length();
                            if(v3 >= 0 && v3 < 4) {
                                --pinPadEditView0.c;
                                pinPadEditView0.a[v3].b(0);
                                pinPadEditView0.a(s1, s, s.length() - 1, 1, 0);
                            }
                            else {
                                Log.e("PinPadEditView", "Mis-use of the API, the UI operates between 0 and PIN_LENGTH-1 index.");
                            }
                            stringBuilder0.setLength(stringBuilder0.length() - 1);
                        }
                    }
                    else {
                        ggeo ggeo0 = KeyRecoveryChimeraActivity.k;
                        Integer integer0 = this.a.b[this.b];
                        if(ggeo0.containsKey(integer0)) {
                            StringBuilder stringBuilder1 = keyRecoveryChimeraActivity0.o;
                            stringBuilder1.append(ggeo0.get(integer0));
                            String s2 = stringBuilder1.toString();
                            String s3 = s2.substring(0, s2.length() - 1);
                            int v4 = s2.length() - 1;
                            if(v4 >= 0 && v4 < 4) {
                                ++pinPadEditView0.c;
                                PinPadDot pinPadDot0 = pinPadEditView0.a[v4];
                                pinPadDot0.a();
                                pinPadDot0.a.start();
                                pinPadEditView0.a(s2, s3, s3.length(), 0, 1);
                            }
                            else {
                                Log.e("PinPadEditView", "Mis-use of the API, the UI operates between 0 and PIN_LENGTH-1 index.");
                            }
                            if(stringBuilder1.length() == 4) {
                                keyRecoveryChimeraActivity0.a();
                                keyRecoveryChimeraActivity0.l.d(fcpx.a(stringBuilder1.toString()));
                                stringBuilder1.setLength(0);
                            }
                        }
                        else {
                            KeyRecoveryChimeraActivity.j.f("Ignoring unexpected keyCode: " + this.a.b[this.b], new Object[0]);
                        }
                    }
                }
            }
        });
    }

    @Override  // android.widget.LinearLayout
    protected final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        this.h.set(v, v1, v2, v3);
        ArrayList arrayList0 = new ArrayList(1);
        arrayList0.add(Objects.requireNonNull(this.h));
        this.setSystemGestureExclusionRects(DesugarCollections.unmodifiableList(arrayList0));
    }
}

