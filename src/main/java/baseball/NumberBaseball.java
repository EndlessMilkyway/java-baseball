package baseball;

import camp.nextstep.edu.missionutils.Console;

public class NumberBaseball {
    private User user;
    private ValidInput validInput;

    public void start() {
        System.out.println("숫자 야구 게임을 시작합니다");
        System.out.print("숫자를 입력해주세요 : ");
        try {
            user = new User(inputNumber());
        } catch (IllegalArgumentException exception) {
            exception.printStackTrace();
        }

    }

    private Integer inputNumber() throws IllegalArgumentException {
        String userInput = Console.readLine();
        validInput = new ValidInput(userInput);

        validInput.inspectInputLength();
        validInput.inspectAlphabetOrSpecialCharacter();
        validInput.inspectDuplicatedNumber();

        return Integer.parseInt(userInput);
    }
}