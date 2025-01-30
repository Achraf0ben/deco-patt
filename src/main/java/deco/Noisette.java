package deco;

import boissons.Boisson;

public class Noisette extends DecorateurBoisson{

    public Noisette(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescrciption() {
        return boisson.getDescrciption()+" Au Noisette";
    }

    @Override
    public double cout() {
        return 1.5 + boisson.cout();
    }
}
