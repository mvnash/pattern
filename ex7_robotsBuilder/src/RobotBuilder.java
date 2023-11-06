public static class RobotBuilder {
    private int canon;
    private int shield;
    private int freq;
    private String name;

    public RobotBuilder() {
    }

    public RobotBuilder canon(int canon){
        this.canon = canon;
        return this;
    }

    public RobotBuilder shield(int shield){
        this.shield = shield;
        return this;
    }

    public RobotBuilder freq(int freq){
        this.freq = freq;
        return this;
    }

    public RobotBuilder name(String name){
        this.name = name;
        return this;
    }

    public Robot build(){
        return new Robot(this);
    }
}
