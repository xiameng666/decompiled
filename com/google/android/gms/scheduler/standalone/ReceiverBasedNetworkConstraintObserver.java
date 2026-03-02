package com.google.android.gms.scheduler.standalone;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import ekrs;
import ekuq;
import ekur;
import ekvb;
import ekvc;
import gmcg;
import hrvh;
import j..util.Objects;
import java.io.PrintWriter;
import jwe;

public class ReceiverBasedNetworkConstraintObserver extends TracingBroadcastReceiver implements ekur {
    private int a;
    private int b;
    private boolean c;
    private final gmcg d;

    public ReceiverBasedNetworkConstraintObserver(gmcg gmcg0) {
        super("scheduler");
        this.c = false;
        this.d = gmcg0;
    }

    @Override  // ekur
    public final void b(PrintWriter printWriter0) {
        synchronized(this) {
            ekuq.a(printWriter0, this.a);
        }
    }

    @Override  // ekur
    public final void c(Context context0, int v) {
        synchronized(this) {
            if(v == 7) {
                this.a |= 1;
            }
            else if(v == 3) {
                this.a |= 2;
            }
            if(!this.c) {
                this.f(context0);
            }
        }
    }

    // Detected as a lambda impl.
    public final void d(Context context0, Intent intent0) {
        synchronized(this) {
            if(Objects.equals(intent0.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
                if(intent0.getBooleanExtra("noConnectivity", false)) {
                    int v1 = this.b;
                    this.b = 0;
                    ReceiverBasedNetworkConstraintObserver.g(v1, 0);
                    return;
                }
                ConnectivityManager connectivityManager0 = (ConnectivityManager)context0.getSystemService("connectivity");
                if(connectivityManager0 != null) {
                    Network network0 = connectivityManager0.getActiveNetwork();
                    if(network0 != null) {
                        NetworkCapabilities networkCapabilities0 = connectivityManager0.getNetworkCapabilities(network0);
                        if(networkCapabilities0 != null) {
                            int v2 = this.b;
                            this.b = 0;
                            if(networkCapabilities0.hasCapability(12) && networkCapabilities0.hasCapability(16)) {
                                this.b |= 2;
                                if(networkCapabilities0.hasCapability(11)) {
                                    this.b |= 1;
                                }
                            }
                            ReceiverBasedNetworkConstraintObserver.g(v2, this.b);
                            int v3 = this.a;
                            if(this.i(2) && networkCapabilities0.hasCapability(12) && networkCapabilities0.hasCapability(16)) {
                                this.a &= -3;
                            }
                            if(this.i(1) && networkCapabilities0.hasCapability(12) && networkCapabilities0.hasCapability(16) && networkCapabilities0.hasCapability(11)) {
                                this.a &= -2;
                            }
                            if(v3 != this.a) {
                                ekrs.b().f.d();
                            }
                        }
                    }
                }
            }
        }
    }

    // Detected as a lambda impl.
    public final void e(Context context0, Intent intent0) {
        synchronized(this) {
            if(Objects.equals(intent0.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
                if(intent0.getBooleanExtra("noConnectivity", false)) {
                    int v1 = this.b;
                    this.b = 0;
                    ReceiverBasedNetworkConstraintObserver.g(v1, 0);
                    return;
                }
                ConnectivityManager connectivityManager0 = (ConnectivityManager)context0.getSystemService("connectivity");
                if(connectivityManager0 != null) {
                    NetworkInfo networkInfo0 = connectivityManager0.getActiveNetworkInfo();
                    if(networkInfo0 != null && intent0.getIntExtra("networkType", 8) == networkInfo0.getType()) {
                        int v2 = this.b;
                        this.b = 0;
                        if(networkInfo0.isConnected()) {
                            this.b |= 2;
                            if(!connectivityManager0.isActiveNetworkMetered()) {
                                this.b |= 1;
                            }
                        }
                        ReceiverBasedNetworkConstraintObserver.g(v2, this.b);
                        int v3 = this.a;
                        if(this.i(2) && networkInfo0.isConnected()) {
                            this.a &= -3;
                        }
                        if(this.i(1) && !connectivityManager0.isActiveNetworkMetered()) {
                            this.a &= -2;
                        }
                        if(v3 != this.a) {
                            ekrs.b().f.d();
                        }
                    }
                }
            }
        }
    }

    public final void f(Context context0) {
        synchronized(this) {
            jwe.b(context0.getApplicationContext(), this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), 2);
            this.c = true;
            this.b = 0;
        }
    }

    private static void g(int v, int v1) {
        if(ReceiverBasedNetworkConstraintObserver.h(v, 1) && !ReceiverBasedNetworkConstraintObserver.h(v1, 1)) {
            ekrs.b().f.a(10);
        }
        if(!ReceiverBasedNetworkConstraintObserver.h(v, 1) && ReceiverBasedNetworkConstraintObserver.h(v1, 1)) {
            ekrs.b().f.a(9);
        }
    }

    private static boolean h(int v, int v1) {
        return (v & v1) == v1;
    }

    private final boolean i(int v) {
        return ReceiverBasedNetworkConstraintObserver.h(this.a, v);
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        synchronized(this) {
            if(hrvh.a.i().U()) {
                ekvb ekvb0 = () -> synchronized(this) {
                    if(Objects.equals(intent0.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
                        if(intent0.getBooleanExtra("noConnectivity", false)) {
                            int v1 = this.b;
                            this.b = 0;
                            ReceiverBasedNetworkConstraintObserver.g(v1, 0);
                            return;
                        }
                        ConnectivityManager connectivityManager0 = (ConnectivityManager)context0.getSystemService("connectivity");
                        if(connectivityManager0 != null) {
                            Network network0 = connectivityManager0.getActiveNetwork();
                            if(network0 != null) {
                                NetworkCapabilities networkCapabilities0 = connectivityManager0.getNetworkCapabilities(network0);
                                if(networkCapabilities0 != null) {
                                    int v2 = this.b;
                                    this.b = 0;
                                    if(networkCapabilities0.hasCapability(12) && networkCapabilities0.hasCapability(16)) {
                                        this.b |= 2;
                                        if(networkCapabilities0.hasCapability(11)) {
                                            this.b |= 1;
                                        }
                                    }
                                    ReceiverBasedNetworkConstraintObserver.g(v2, this.b);
                                    int v3 = this.a;
                                    if(this.i(2) && networkCapabilities0.hasCapability(12) && networkCapabilities0.hasCapability(16)) {
                                        this.a &= -3;
                                    }
                                    if(this.i(1) && networkCapabilities0.hasCapability(12) && networkCapabilities0.hasCapability(16) && networkCapabilities0.hasCapability(11)) {
                                        this.a &= -2;
                                    }
                                    if(v3 != this.a) {
                                        ekrs.b().f.d();
                                    }
                                }
                            }
                        }
                    }
                };
                this.d.execute(ekvb0);
                return;
            }
            ekvc ekvc0 = () -> synchronized(this) {
                if(Objects.equals(intent0.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
                    if(intent0.getBooleanExtra("noConnectivity", false)) {
                        int v1 = this.b;
                        this.b = 0;
                        ReceiverBasedNetworkConstraintObserver.g(v1, 0);
                        return;
                    }
                    ConnectivityManager connectivityManager0 = (ConnectivityManager)context0.getSystemService("connectivity");
                    if(connectivityManager0 != null) {
                        NetworkInfo networkInfo0 = connectivityManager0.getActiveNetworkInfo();
                        if(networkInfo0 != null && intent0.getIntExtra("networkType", 8) == networkInfo0.getType()) {
                            int v2 = this.b;
                            this.b = 0;
                            if(networkInfo0.isConnected()) {
                                this.b |= 2;
                                if(!connectivityManager0.isActiveNetworkMetered()) {
                                    this.b |= 1;
                                }
                            }
                            ReceiverBasedNetworkConstraintObserver.g(v2, this.b);
                            int v3 = this.a;
                            if(this.i(2) && networkInfo0.isConnected()) {
                                this.a &= -3;
                            }
                            if(this.i(1) && !connectivityManager0.isActiveNetworkMetered()) {
                                this.a &= -2;
                            }
                            if(v3 != this.a) {
                                ekrs.b().f.d();
                            }
                        }
                    }
                }
            };
            this.d.execute(ekvc0);
        }
    }
}

