package boissons;

public abstract class Boisson {

    protected String descrciption;

    public String getDescrciption() {
        return descrciption;
    }

    public abstract double cout();
}
