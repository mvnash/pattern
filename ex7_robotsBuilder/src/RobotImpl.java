public class RobotImpl extends Object implements Robot {
    private final int canon;
    private final int shield;
    private final int freq;
    private final String name;
    private int hp;

    public RobotImpl(RobotBuilder robotBuilder){
        this.canon= robotBuilder.canon;
        this.shield = robotBuilder.shield;
        this.freq = robotBuilder.freq;
        this.name = robotBuilder.name;
        this.hp= robotBuilder.hp;
    }

    @Override
    public Robot clone() {
        try {
            return (Robot) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public int getCanon() {
        return canon;
    }

    public int getShield() {
        return shield;
    }

    public int getFreq() {
        return freq;
    }

    public String getName() {
        return name;
    }

    @Override
    public int diffLife(int i) {
        return this.hp+=i;
    }

    public int getHp() {
        return hp;
    }

    public static class RobotBuilder {
        private int canon = 1;
        private int shield = 1;
        private int freq = 100;
        private final String name;
        private int hp = 100;

        public RobotBuilder(String name) {
            this.name = name;
        }

        public RobotBuilder canon(int canon) {
            this.canon = canon;
            return this;
        }

        public RobotBuilder hp(int hp) {
            this.hp = hp;
            return this;
        }

        public RobotBuilder shield(int shield) {
            this.shield = shield;
            return this;
        }

        public RobotBuilder freq(int freq) {
            this.freq = freq;
            return this;
        }

        public Robot build() {
            return new RobotImpl(this);
        }
    }
}
