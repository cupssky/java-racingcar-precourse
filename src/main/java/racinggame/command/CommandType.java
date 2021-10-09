package racinggame.command;

public enum CommandType {
    CARNAME("경주할자동차이름을입력하세요.(이름은쉼표(,)기준으로구분)"),
    MOVECOUNT("시도할회수는몇회인가요?");

    private String guide;

    CommandType(String guide) {
        this.guide = guide;
    }

    public String getGuide() {
        return guide;
    }
}
