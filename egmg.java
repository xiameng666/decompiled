public final class egmg implements gftc {
    public final egqs a;

    public egmg(egqs egqs0) {
        this.a = egqs0;
    }

    @Override  // gftc
    public final boolean a(Object object0) {
        egpg egpg0 = ((egpd)object0).d;
        if(egpg0 == null) {
            egpg0 = egpg.a;
        }
        egqp egqp0 = egqp.b(this.a.d) == null ? egqp.a : egqp.b(this.a.d);
        return (egpf.b(egpg0.c) == null ? egpf.a : egpf.b(egpg0.c)) == egmj.a.getOrDefault(egqp0, egpf.a);
    }
}

