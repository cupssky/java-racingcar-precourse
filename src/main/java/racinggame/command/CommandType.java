package racinggame.command;

public enum CommandType {
    CARNAME("경주할 자동차 이름을 입력하세요.(이름은쉼표(,)기준으로구분)"),
    MOVECOUNT("시도할 회수는 몇회인가요?"),
    RESULT("실행 결과");

    private String guide;

    CommandType(String guide) {
        this.guide = guide;
    }

    public String getGuide() {
        return guide;
    }
}
