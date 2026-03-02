package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bquq;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j..util.DesugarCollections;
import java.util.Arrays;
import java.util.List;

public final class DataType extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final DataType A;
    public static final DataType B;
    public static final DataType C;
    public static final Parcelable.Creator CREATOR;
    public static final DataType D;
    public static final DataType E;
    public static final DataType F;
    public static final DataType G;
    public static final DataType H;
    public static final DataType I;
    public static final DataType J;
    public static final DataType K;
    public static final DataType L;
    public static final DataType M;
    public static final DataType N;
    public static final DataType O;
    public static final DataType P;
    public static final DataType Q;
    public static final DataType R;
    public static final DataType S;
    public static final DataType T;
    public static final DataType U;
    public static final DataType V;
    public static final DataType W;
    public static final DataType X;
    public static final DataType Y;
    @Deprecated
    public static final DataType Z;
    public static final DataType a;
    @Deprecated
    public static final DataType aA;
    @Deprecated
    public static final DataType aB;
    @Deprecated
    public static final DataType aC;
    @Deprecated
    public static final DataType aD;
    @Deprecated
    public static final DataType aE;
    @Deprecated
    public static final DataType aF;
    @Deprecated
    public static final DataType aG;
    @Deprecated
    public static final DataType aH;
    public final String aI;
    public final List aJ;
    public final String aK;
    public final String aL;
    @Deprecated
    public static final DataType aa;
    public static final DataType ab;
    public static final DataType ac;
    public static final DataType ad;
    @Deprecated
    public static final DataType ae;
    @Deprecated
    public static final DataType af;
    @Deprecated
    public static final DataType ag;
    public static final DataType ah;
    @Deprecated
    public static final DataType ai;
    @Deprecated
    public static final DataType aj;
    @Deprecated
    public static final DataType ak;
    @Deprecated
    public static final DataType al;
    @Deprecated
    public static final DataType am;
    @Deprecated
    public static final DataType an;
    @Deprecated
    public static final DataType ao;
    @Deprecated
    public static final DataType ap;
    @Deprecated
    public static final DataType aq;
    @Deprecated
    public static final DataType ar;
    @Deprecated
    public static final DataType as;
    @Deprecated
    public static final DataType at;
    public static final DataType au;
    @Deprecated
    public static final DataType av;
    @Deprecated
    public static final DataType aw;
    @Deprecated
    public static final DataType ax;
    @Deprecated
    public static final DataType ay;
    @Deprecated
    public static final DataType az;
    public static final DataType b;
    public static final DataType c;
    public static final DataType d;
    public static final DataType e;
    @Deprecated
    public static final DataType f;
    public static final DataType g;
    @Deprecated
    public static final DataType h;
    public static final DataType i;
    public static final DataType j;
    public static final DataType k;
    public static final DataType l;
    public static final DataType m;
    public static final DataType n;
    public static final DataType o;
    @Deprecated
    public static final DataType p;
    public static final DataType q;
    public static final DataType r;
    public static final DataType s;
    public static final DataType t;
    public static final DataType u;
    public static final DataType v;
    public static final DataType w;
    public static final DataType x;
    public static final DataType y;
    public static final DataType z;

    static {
        DataType.CREATOR = new bquq();
        DataType dataType0 = new DataType("com.google.step_count.delta", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", new Field[]{Field.d});
        DataType.a = dataType0;
        DataType.b = new DataType("com.google.step_count.cumulative", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", new Field[]{Field.d});
        DataType.c = new DataType("com.google.step_count.cadence", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", new Field[]{Field.u});
        DataType.d = new DataType("com.google.internal.goal", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", new Field[]{Field.v});
        DataType.e = new DataType("com.google.activity.segment", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", new Field[]{Field.a});
        DataType.f = new DataType("com.google.internal.sleep_disordered_breathing_features", "https://www.googleapis.com/auth/fitness.sleep.read", "https://www.googleapis.com/auth/fitness.sleep.write", new Field[]{Field.Y});
        DataType.g = new DataType("com.google.sleep.segment", "https://www.googleapis.com/auth/fitness.sleep.read", "https://www.googleapis.com/auth/fitness.sleep.write", new Field[]{Field.b});
        DataType.h = new DataType("com.google.internal.sleep_soundscape", "https://www.googleapis.com/auth/fitness.sleep.read", "https://www.googleapis.com/auth/fitness.sleep.write", new Field[]{Field.aa});
        DataType dataType1 = new DataType("com.google.calories.expended", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", new Field[]{Field.y});
        DataType.i = dataType1;
        DataType.j = new DataType("com.google.calories.bmr", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", new Field[]{Field.y});
        DataType.k = new DataType("com.google.power.sample", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", new Field[]{Field.z});
        DataType.l = new DataType("com.google.sensor.events", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", new Field[]{Field.R, Field.S, Field.T});
        DataType.m = new DataType("com.google.heart_rate.bpm", "https://www.googleapis.com/auth/fitness.heart_rate.read", "https://www.googleapis.com/auth/fitness.heart_rate.write", new Field[]{Field.j});
        DataType.n = new DataType("com.google.respiratory_rate", "https://www.googleapis.com/auth/fitness.respiratory_rate.read", "https://www.googleapis.com/auth/fitness.respiratory_rate.write", new Field[]{Field.k});
        DataType.o = new DataType("com.google.location.sample", "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", new Field[]{Field.l, Field.m, Field.n, Field.o});
        DataType.p = new DataType("com.google.location.track", "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", new Field[]{Field.l, Field.m, Field.n, Field.o});
        DataType dataType2 = new DataType("com.google.distance.delta", "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", new Field[]{Field.p});
        DataType.q = dataType2;
        DataType.r = new DataType("com.google.speed", "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", new Field[]{Field.t});
        DataType.s = new DataType("com.google.cycling.wheel_revolution.cumulative", "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", new Field[]{Field.x});
        DataType.t = new DataType("com.google.cycling.wheel_revolution.rpm", "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", new Field[]{Field.u});
        DataType.u = new DataType("com.google.cycling.pedaling.cumulative", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", new Field[]{Field.x});
        DataType.v = new DataType("com.google.cycling.pedaling.cadence", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", new Field[]{Field.u});
        DataType.w = new DataType("com.google.height", "https://www.googleapis.com/auth/fitness.body.read", "https://www.googleapis.com/auth/fitness.body.write", new Field[]{Field.q});
        DataType.x = new DataType("com.google.weight", "https://www.googleapis.com/auth/fitness.body.read", "https://www.googleapis.com/auth/fitness.body.write", new Field[]{Field.r});
        DataType.y = new DataType("com.google.body.fat.percentage", "https://www.googleapis.com/auth/fitness.body.read", "https://www.googleapis.com/auth/fitness.body.write", new Field[]{Field.s});
        DataType.z = new DataType("com.google.nutrition", "https://www.googleapis.com/auth/fitness.nutrition.read", "https://www.googleapis.com/auth/fitness.nutrition.write", new Field[]{Field.D, Field.B, Field.C});
        DataType dataType3 = new DataType("com.google.hydration", "https://www.googleapis.com/auth/fitness.nutrition.read", "https://www.googleapis.com/auth/fitness.nutrition.write", new Field[]{Field.A});
        DataType.A = dataType3;
        DataType.B = new DataType("com.google.activity.exercise", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", new Field[]{Field.E, Field.F, Field.g, Field.H, Field.G});
        DataType dataType4 = new DataType("com.google.active_minutes", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", new Field[]{Field.f});
        DataType.C = dataType4;
        DataType.D = dataType4;
        DataType.E = new DataType("com.google.device_on_body", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", new Field[]{Field.W});
        DataType.F = new DataType("com.google.activity.summary", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", new Field[]{Field.a, Field.f, Field.I});
        DataType.G = new DataType("com.google.calories.bmr.summary", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", new Field[]{Field.J, Field.K, Field.L});
        DataType.H = dataType0;
        DataType.I = dataType2;
        DataType.J = dataType1;
        DataType.K = new DataType("com.google.heart_minutes", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", new Field[]{Field.U});
        DataType.L = new DataType("com.google.heart_minutes.summary", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", new Field[]{Field.U, Field.f});
        DataType.M = new DataType("com.google.heart_rate.summary", "https://www.googleapis.com/auth/fitness.heart_rate.read", "https://www.googleapis.com/auth/fitness.heart_rate.write", new Field[]{Field.J, Field.K, Field.L});
        DataType.N = new DataType("com.google.location.bounding_box", "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", new Field[]{Field.M, Field.N, Field.O, Field.P});
        DataType.O = new DataType("com.google.power.summary", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", new Field[]{Field.J, Field.K, Field.L});
        DataType.P = new DataType("com.google.speed.summary", "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", new Field[]{Field.J, Field.K, Field.L});
        DataType.Q = new DataType("com.google.body.fat.percentage.summary", "https://www.googleapis.com/auth/fitness.body.read", "https://www.googleapis.com/auth/fitness.body.write", new Field[]{Field.J, Field.K, Field.L});
        DataType.R = new DataType("com.google.weight.summary", "https://www.googleapis.com/auth/fitness.body.read", "https://www.googleapis.com/auth/fitness.body.write", new Field[]{Field.J, Field.K, Field.L});
        DataType.S = new DataType("com.google.height.summary", "https://www.googleapis.com/auth/fitness.body.read", "https://www.googleapis.com/auth/fitness.body.write", new Field[]{Field.J, Field.K, Field.L});
        DataType.T = new DataType("com.google.nutrition.summary", "https://www.googleapis.com/auth/fitness.nutrition.read", "https://www.googleapis.com/auth/fitness.nutrition.write", new Field[]{Field.D, Field.B});
        DataType.U = dataType3;
        DataType.V = new DataType("com.google.activity.samples", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", new Field[]{Field.V});
        DataType.W = new DataType("com.google.internal.sleep_attributes", "https://www.googleapis.com/auth/fitness.sleep.read", "https://www.googleapis.com/auth/fitness.sleep.write", new Field[]{Field.X});
        DataType.X = new DataType("com.google.internal.sleep_schedule", "https://www.googleapis.com/auth/fitness.sleep.read", "https://www.googleapis.com/auth/fitness.sleep.write", new Field[]{Field.Z});
        DataType.Y = new DataType("com.google.internal.paced_walking_attributes", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", new Field[]{Field.ac});
        DataType.Z = new DataType("com.google.time_zone_change", "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", new Field[]{Field.ad});
        DataType.aa = new DataType("com.google.internal.met", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", new Field[]{Field.ae});
        DataType.ab = new DataType("com.google.internal.internal_device_temperature", "https://www.googleapis.com/auth/fitness.body_temperature.read", "https://www.googleapis.com/auth/fitness.body_temperature.write", new Field[]{Field.af});
        DataType.ac = new DataType("com.google.internal.skin_temperature", "https://www.googleapis.com/auth/fitness.body_temperature.read", "https://www.googleapis.com/auth/fitness.body_temperature.write", new Field[]{Field.ag});
        DataType.ad = new DataType("com.google.internal.custom_heart_rate_zone", "https://www.googleapis.com/auth/fitness.heart_rate.read", "https://www.googleapis.com/auth/fitness.heart_rate.write", new Field[]{Field.ah, Field.ai, Field.aj});
        DataType.ae = new DataType("com.google.internal.active_minutes_combined", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", new Field[]{Field.ak, Field.al, Field.am});
        DataType.af = new DataType("com.google.internal.sedentary_time", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", new Field[]{Field.an});
        DataType.ag = new DataType("com.google.internal.live_pace", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", new Field[]{Field.ao});
        DataType.ah = new DataType("com.google.internal.custom_max_heart_rate", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", new Field[]{Field.aj});
        DataType.ai = new DataType("com.google.internal.momentary_stress_algorithm", "https://www.googleapis.com/auth/fitness.heart_rate.read", "https://www.googleapis.com/auth/fitness.heart_rate.write", new Field[]{Field.ap});
        DataType.aj = new DataType("com.google.internal.magnetic_field_presence", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", new Field[]{Field.aq});
        DataType.ak = new DataType("com.google.internal.momentary_stress_windows", "https://www.googleapis.com/auth/fitness.heart_rate.read", "https://www.googleapis.com/auth/fitness.heart_rate.write", new Field[]{Field.ar});
        DataType.al = new DataType("com.google.internal.exercise_detection_thresholds", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", new Field[]{Field.as});
        DataType.am = new DataType("com.google.internal.recovery_heart_rate", "https://www.googleapis.com/auth/fitness.heart_rate.read", "https://www.googleapis.com/auth/fitness.heart_rate.write", new Field[]{Field.at});
        DataType.an = new DataType("com.google.internal.heart_rate_variability", "https://www.googleapis.com/auth/fitness.heart_rate.read", "https://www.googleapis.com/auth/fitness.heart_rate.write", new Field[]{Field.au});
        DataType.ao = new DataType("com.google.internal.heart_rate_variability_summary", "https://www.googleapis.com/auth/fitness.heart_rate.read", "https://www.googleapis.com/auth/fitness.heart_rate.write", new Field[]{Field.av});
        DataType.ap = new DataType("com.google.internal.continuous_eda", "https://www.googleapis.com/auth/fitness.heart_rate.read", "https://www.googleapis.com/auth/fitness.heart_rate.write", new Field[]{Field.aw});
        DataType.aq = new DataType("com.google.internal.altitude_sample", "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", new Field[]{Field.o});
        DataType.ar = new DataType("com.google.internal.time_in_sleep_stages", "https://www.googleapis.com/auth/fitness.sleep.read", "https://www.googleapis.com/auth/fitness.sleep.write", new Field[]{Field.ax});
        DataType.as = new DataType("com.google.internal.grok_data", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", new Field[]{Field.ay});
        DataType.at = new DataType("com.google.internal.wake_magnitude", "https://www.googleapis.com/auth/fitness.sleep.read", "https://www.googleapis.com/auth/fitness.sleep.write", new Field[]{Field.az});
        DataType.au = new DataType("com.google.internal.active_zone_minutes_summary", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", new Field[]{Field.aA, Field.aB, Field.aC, Field.aD});
        DataType.av = new DataType("com.google.internal.sleep_coefficient", "https://www.googleapis.com/auth/fitness.sleep.read", "https://www.googleapis.com/auth/fitness.sleep.write", new Field[]{Field.aE});
        DataType.aw = new DataType("com.google.internal.run_vo2_max", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", new Field[]{Field.aF});
        DataType.ax = new DataType("com.google.internal.demographic_vo2_max", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", new Field[]{Field.aI});
        DataType.ay = new DataType("com.google.internal.sleep_setting", "https://www.googleapis.com/auth/fitness.sleep.read", "https://www.googleapis.com/auth/fitness.sleep.write", new Field[]{Field.aJ});
        DataType.az = new DataType("com.google.internal.values_in_heart_rate_zones", "https://www.googleapis.com/auth/fitness.heart_rate.read", "https://www.googleapis.com/auth/fitness.heart_rate.write", new Field[]{Field.aK});
        DataType.aA = new DataType("com.google.internal.heart_histogram", "https://www.googleapis.com/auth/fitness.sleep.read", "https://www.googleapis.com/auth/fitness.sleep.write", new Field[]{Field.aL});
        DataType.aB = new DataType("com.google.internal.respiratory_rate_summary", "https://www.googleapis.com/auth/fitness.sleep.read", "https://www.googleapis.com/auth/fitness.sleep.write", new Field[]{Field.aN});
        DataType.aC = new DataType("com.google.internal.stress_score", "https://www.googleapis.com/auth/fitness.heart_rate.read", "https://www.googleapis.com/auth/fitness.heart_rate.write", new Field[]{Field.aM});
        DataType.aD = new DataType("com.google.internal.device_location", "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", new Field[]{Field.l, Field.m, Field.n, Field.aG, Field.aH});
        DataType.aE = new DataType("com.google.internal.daily_skin_sleep_temperature_derivations", "https://www.googleapis.com/auth/fitness.body_temperature.read", "https://www.googleapis.com/auth/fitness.body_temperature.write", new Field[]{Field.aO});
        DataType.aF = new DataType("com.google.internal.swim_lengths_data", "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", new Field[]{Field.aP});
        DataType.aG = new DataType("com.google.internal.daily_sleep", "https://www.googleapis.com/auth/fitness.sleep.read", "https://www.googleapis.com/auth/fitness.sleep.write", new Field[]{Field.aQ});
        DataType.aH = new DataType("com.google.internal.daily_internal_device_temperature_sleep_temperature_derivations", "https://www.googleapis.com/auth/fitness.body_temperature.read", "https://www.googleapis.com/auth/fitness.body_temperature.write", new Field[]{Field.aR});
    }

    public DataType(String s, String s1, String s2, Field[] arr_field) {
        this.aI = s;
        this.aJ = DesugarCollections.unmodifiableList(Arrays.asList(arr_field));
        this.aK = s1;
        this.aL = s2;
    }

    public DataType(String s, List list0, String s1, String s2) {
        this.aI = s;
        this.aJ = DesugarCollections.unmodifiableList(list0);
        this.aK = s1;
        this.aL = s2;
    }

    public final String a() {
        return this.aI.startsWith("com.google.") ? this.aI.substring(11) : this.aI;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof DataType) ? this.aI.equals(((DataType)object0).aI) && this.aJ.equals(((DataType)object0).aJ) : false;
    }

    @Override
    public final int hashCode() {
        return this.aI.hashCode();
    }

    @Override
    public final String toString() {
        return String.format("DataType{%s%s}", this.aI, this.aJ);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.aI, false);
        baub.y(parcel0, 2, this.aJ, false);
        baub.v(parcel0, 3, this.aK, false);
        baub.v(parcel0, 4, this.aL, false);
        baub.c(parcel0, v1);
    }
}

