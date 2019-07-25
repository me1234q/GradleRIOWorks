package frc.team972.robot.statemachines;

public enum ExampleState {
    IDLE,
    READY,
    DOING,
    FINISHED;

    public ExampleState next(ExampleState state) {
        switch (state) {
            case IDLE:
                return READY;
                break;
            case IDLE:
                return READY;
                break;
                
        }
    }
}