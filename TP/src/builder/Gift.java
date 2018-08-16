package builder;

public abstract class Gift implements Item {

    /**
     * @return
     */
    public Packaging packaging() {
        // TODO implement here
        return new Wrapper();
    }
}