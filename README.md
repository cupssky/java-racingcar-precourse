# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.
---
## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)
---
## 기능 명세 리스트
1. 자동차 이름 입력 기능 (쉼표로 구분 해야함) 
   - 자동차이름은 5자리 이하 (넘어갈 경우 재입력)
   - 참가자는 무조건 2대이상 입력을 해야함 (1대만 입력한 경우는 재입력)
2. 이동 시도횟수 입력 기능 (숫자로만 입려기 가능해야함)
   - 숫자가 아닌경우 재입력 
3. 전진 기능 구현 (Random 값이 4이상일 경우 전진, 3이하 값이면 정지)
   - 0에서 9사이에서 Random 값으로 구성
4. 자동차 경주게임 완료 결과 출력 (누가 우승했는지) 
   - 실행결과 과정을 출력해야함 
   - 1대인경우 1대출력 / 2대이상부터 쉼표로 조합하여 이름 구분하여 마지막 우승자 출력
5. 정상적으로 입력하지 않았을 경우 입력이 다시 진행
   - 사용자가 커맨드를 정상적으로 입력하지 않은경우 재입력해야함 (자동차, 시도횟수)
   - 정상적으로 입력하지 않은경우 [ERROR] 메세지를 출력
---
## 출력결과   
경주할 자동차 이름을 입력하세요.(이름은쉼표(,)기준으로구분) 

pobi,crong,honux  

시도할 회수는 몇회인가요?  
5  

실행 결과  
pobi : -  
crong :  
honux : -  
  
pobi : --  
crong : -  
honux : -  
  
pobi : --  
crong : --  
honux : -  

pobi : ---  
crong : --  
honux : --  
  
pobi : ----  
crong : ---  
honux : --  
  
최종 우승자는 pobi 입니다.  

---
## 구성패키지
1. command : 커맨드 입력 기능 수행 (자동차이름입력, 시도횟수) 패키지
   - CommandType.java : 커맨드입력 타입 정의
   - GameCommand.java : 사용자 커맨드 입력 기능 수행
2. core : 게임 init 패키지
   - Game.java : 자동차게임 시작 종료 init
3. domain : 도메인 패키지
   - Car.java : 자동차 단위 기능 수행 정의
   - Cars.java : 자동차를 모은 일급컬렉션 기능 
   - CarName.java : 자동차 이름 필드
4. error : 에러 예외처리 핸들링 패키지
   - BaseException.java : 자동차게임 커스텀 Exception 
   - ErrorType.java : 에러타입 정의했으며, BaseException에서 해당 타입을 통하여 메세지  
5. utils : util 패키지
   - BaseException.java : 자동차게임 커스텀 Exception
   - ErrorType.java : 에러타입 정의했으며, BaseException에서 해당 타입을 통하여 메세지 프린트
6. view : 사용자 화면 패키지
   - GameView.java : 사용자 화면 제공 기능
---
## 추가된 제약 사항
1. 일급컬렉션 활용 구현 -> Cars 클래스
2. 모든 원시값과 문자열을 포장 -> CarName 클래스