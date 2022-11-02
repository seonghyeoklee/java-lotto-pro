# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

### 1단계 - 학습 테스트 실습

#### String 클래스에 대한 학습 테스트

- 요구사항 1
  - [X] "1,2"을 ,로 split 했을 때 1과 2로 잘 분리되는지 확인하는 학습 테스트를 구현한다.
  - [X] "1"을 ,로 split 했을 때 1만을 포함하는 배열이 반환되는지에 대한 학습 테스트를 구현한다.

- 요구사항 2
  - [X] "(1,2)" 값이 주어졌을 때 String의 substring() 메소드를 활용해 ()을 제거하고 "1,2"를 반환하도록 구현한다.

- 요구사항 3
  - [X] "abc" 값이 주어졌을 때 String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져오는 학습 테스트를 구현한다.
  - [X] String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져올 때 위치 값을 벗어나면 StringIndexOutOfBoundsException이 발생하는 부분에 대한 학습 테스트를 구현한다.
  - [X] JUnit의 @DisplayName을 활용해 테스트 메소드의 의도를 드러낸다.

#### Set Collection에 대한 학습 테스트

- 요구사항 1
  - [X] Set의 size() 메소드를 활용해 Set의 크기를 확인하는 학습테스트를 구현한다.

- 요구사항 2
  - [X] Set의 contains() 메소드를 활용해 1, 2, 3의 값이 존재하는지를 확인하는 학습테스트를 구현하려한다.

- 요구사항 3
  - [X] 1, 2, 3 값은 contains 메소드 실행결과 true, 4, 5 값을 넣으면 false 가 반환된다. 

### 2단계 - 문자열 덧셈 계산기

#### 문자열 덧셈 계산기를 통한 TDD/리팩토링 실습

- 기능 요구사항
  - 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리한 각 숫자의 합을 반환 (예: “” => 0, "1,2" => 3, "1,2,3" => 6, “1,2:3” => 6)
  - 앞의 기본 구분자(쉼표, 콜론)외에 커스텀 구분자를 지정할 수 있다. 커스텀 구분자는 문자열 앞부분의 “//”와 “\n” 사이에 위치하는 문자를 커스텀 구분자로 사용한다. 예를 들어 “//;\n1;2;3”과 같이 값을 입력할 경우 커스텀 구분자는 세미콜론(;)이며, 결과 값은 6이 반환되어야 한다.
  - 문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외를 throw한다.

- 프로그래밍 요구사항
  - indent(들여쓰기) depth를 2단계에서 1단계로 줄여라.
    - depth의 경우 if문을 사용하는 경우 1단계의 depth가 증가한다. if문 안에 while문을 사용한다면 depth가 2단계가 된다.
  - 메소드의 크기가 최대 10라인을 넘지 않도록 구현한다.
    - method가 한 가지 일만 하도록 최대한 작게 만들어라.
  - else를 사용하지 마라.

- 기능 목록
  - [X] 빈 문자열 또는 null 값을 입력할 경우 0을 반환해야 한다.
  - [X] 숫자 하나를 문자열로 입력할 경우 해당 숫자를 반환한다.
  - [X] 숫자 두개를 컴마(,) 구분자로 입력할 경우 두 숫자의 합을 반환한다.
  - [X] 구분자를 컴마(,) 이외에 콜론(:)을 사용할 수 있다.
  - [X] “//”와 “\n” 문자 사이에 커스텀 구분자를 지정할 수 있다.
  - [X] 음수를 전달할 경우 RuntimeException 예외가 발생해야 한다.

### 3단계 - 로또(자동)

#### 로또(자동) 미션을 통한 TDD/리팩토링 실습

- 기능 요구사항
  - 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.
  - 로또 1장의 가격은 1000원이다.

- 프로그래밍 요구사항
  - 모든 기능을 TDD로 구현해 단위 테스트가 존재해야 한다. 단, UI(System.out, System.in) 로직은 제외
    - 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 구분한다.
    - UI 로직을 InputView, ResultView와 같은 클래스를 추가해 분리한다.
  - indent(인덴트, 들여쓰기) depth를 2를 넘지 않도록 구현한다. 1까지만 허용한다.
    - 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다.
    - 힌트: indent(인덴트, 들여쓰기) depth를 줄이는 좋은 방법은 함수(또는 메소드)를 분리하면 된다.
  - 함수(또는 메소드)의 길이가 15라인을 넘어가지 않도록 구현한다.
    - 함수(또는 메소드)가 한 가지 일만 잘 하도록 구현한다.
  - 모든 로직에 단위 테스트를 구현한다. 단, UI(System.out, System.in) 로직은 제외
    - 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 구분한다.
    - UI 로직을 InputView, ResultView와 같은 클래스를 추가해 분리한다.
  - 자바 코드 컨벤션을 지키면서 프로그래밍한다.
    - 참고문서: https://google.github.io/styleguide/javaguide.html 또는 https://myeonguni.tistory.com/1596
  - else 예약어를 쓰지 않는다.
    - 힌트: if 조건절에서 값을 return하는 방식으로 구현하면 else를 사용하지 않아도 된다.
    - else를 쓰지 말라고 하니 switch/case로 구현하는 경우가 있는데 switch/case도 허용하지 않는다.

- 기능 목록
  - [X] 구입금액을 입력받아 유효성 검증을 진행한다.
  - [X] 1 ~ 45 범위의 숫자로 구성된 로또를 생성한다.
  - [X] 로또 구입 금액을 입력하면 구입 가능 갯수를 확인한다.
  - [X] 구입 금액에 해당하는 로또 번호를 발급한다.
  - [X] 지난 주 당첨 번호를 입력받아 빈 값이거나 잘못된 값이 입력되었는지 검증을 진행한다. 
  - [X] 당첨 번호와 로또 번호를 비교하여 당첨 통계를 생성한다.
  - [X] 당첨 통계를 이용하여 수익률을 계산한다.
  - [X] 당첨 번호는 6자리이고 중복이 불가능하다.

### 4단계 - 로또(2등)

#### 로또(자동) 미션을 통한 TDD/리팩토링 실습

- 기능 요구사항
  - 2등을 위해 추가 번호를 하나 더 추첨한다.
  - 당첨 통계에 2등도 추가해야 한다.

- 기능 목록
  - [X] 보너스 볼을 입력받아 유효성 검증을 진행한다.
  - [X] 보너스 당첨 통계를 추가한다.
  - [X] 보너스 볼은 당첨번호와 중복이 불가능하다.

### 5단계 - 로또(수동)

#### 로또(자동) 미션을 통한 TDD/리팩토링 실습

- 기능 요구사항
  - 현재 로또 생성기는 자동 생성 기능만 제공한다. 사용자가 수동으로 추첨 번호를 입력할 수 있도록 해야 한다.
  - 입력한 금액, 자동 생성 숫자, 수동 생성 번호를 입력하도록 해야 한다.

- 기능 목록
  - [ ] 로또 번호를 자동, 수동으로 생성하는 전략을 생성한다.
  - [ ] 수동으로 생성되는 경우 사용자의 입력을 받는다.
