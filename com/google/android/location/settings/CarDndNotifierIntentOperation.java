package com.google.android.location.settings;

import android.app.AutomaticZenRule;
import android.content.ComponentName;
import android.content.Intent;
import android.service.notification.Condition;
import android.util.Log;
import android.util.Pair;
import bayn;
import bhip;
import bhit;
import com.google.android.chimera.ConditionProviderService;
import com.google.android.chimera.IntentOperation;
import fuyt;
import fxzr;
import gwkr;
import hupo;
import huue;
import jys;

public class CarDndNotifierIntentOperation extends IntentOperation {
    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        gwkr gwkr0;
        if(hupo.c() && intent0 != null) {
            try {
                if(intent0.getAction().equalsIgnoreCase("com.google.android.location.internal.CAR_DND_ACTION") && intent0.hasExtra("car_dnd_key")) {
                    int v = 0;
                    boolean z = intent0.getBooleanExtra("car_dnd_key", false);
                    bayn bayn0 = bayn.f(this);
                    if(bayn0 != null) {
                        if(!jys.d() || !fxzr.h(this)) {
                            ComponentName componentName0 = new ComponentName("com.google.android.gms", "com.google.android.location.settings.DrivingConditionProvider");
                            Pair pair0 = bhit.a(bayn0, componentName0);
                            AutomaticZenRule automaticZenRule0 = null;
                            String s = pair0 == null ? null : ((String)pair0.first);
                            if(pair0 != null) {
                                automaticZenRule0 = (AutomaticZenRule)pair0.second;
                            }
                            if(s != null && automaticZenRule0 != null) {
                                Log.i("CAR.DRIVINGMODE", "rule already exist");
                                automaticZenRule0.setConditionId(fxzr.a(this, z));
                                if(!z && huue.a.f().B()) {
                                    bayn0.E(s);
                                    Log.i("CAR.DRIVINGMODE", "Removing dnd rule upon driving mode turned off.");
                                    fxzr.f(this, bhip.l);
                                }
                                else {
                                    if(!automaticZenRule0.isEnabled()) {
                                        automaticZenRule0.setEnabled(true);
                                    }
                                    fxzr.f(this, bhip.k);
                                    bayn0.F(s, automaticZenRule0);
                                }
                            }
                            else if(z) {
                                fxzr.e(this, bayn0, true);
                                fxzr.f(this, bhip.j);
                            }
                            else {
                                fxzr.f(this, bhip.m);
                            }
                            ConditionProviderService.requestRebind(componentName0);
                            return;
                        }
                        Pair pair1 = fxzr.b(this);
                        if(pair1 != null) {
                            AutomaticZenRule automaticZenRule1 = (AutomaticZenRule)pair1.second;
                            String s1 = (String)pair1.first;
                            fuyt fuyt0 = fuyt.a(this.getApplicationContext());
                            if(z) {
                                gwkr0 = gwkr.W;
                                v = 1;
                            }
                            else {
                                gwkr0 = gwkr.X;
                            }
                            fuyt0.f(gwkr0);
                            fxzr.f(this, (v == 0 ? bhip.r : bhip.q));
                            Condition condition0 = new Condition(automaticZenRule1.getConditionId(), "Driving State", v, 3);
                            bayn0.a.y(s1, condition0);
                        }
                    }
                }
            }
            catch(Exception exception0) {
                Log.e("###DBCarDndNotifIntOpr", "Exception in OnHandleIntent in CarDndNotifierIntentOperation", exception0);
            }
        }
    }
}

